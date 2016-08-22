// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.codegen.components.model;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.PackageAdmin;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.BusinessException;
import org.talend.commons.runtime.utils.io.SHA1Util;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.language.LanguageManager;
import org.talend.core.model.component_cache.ComponentCachePackage;
import org.talend.core.model.component_cache.ComponentInfo;
import org.talend.core.model.component_cache.ComponentsCache;
import org.talend.core.model.component_cache.util.ComponentCacheResourceFactoryImpl;
import org.talend.core.model.components.AbstractComponentsProvider;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.ComponentManager;
import org.talend.core.model.components.ComponentProviderInfo;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.components.IComponentsFactory;
import org.talend.core.model.components.IComponentsHandler;
import org.talend.core.ui.IJobletProviderService;
import org.talend.core.ui.ISparkJobletProviderService;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.core.ui.images.CoreImageProvider;
import org.talend.core.utils.TalendCacheUtils;
import org.talend.designer.codegen.CodeGeneratorActivator;
import org.talend.designer.codegen.additionaljet.ComponentsFactoryProviderManager;
import org.talend.designer.codegen.i18n.Messages;
import org.talend.designer.core.ITisLocalProviderService;
import org.talend.designer.core.ITisLocalProviderService.ResClassLoader;
import org.talend.designer.core.model.components.ComponentBundleToPath;
import org.talend.designer.core.model.components.ComponentFilesNaming;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.model.process.AbstractProcessProvider;
import org.talend.designer.core.model.process.GenericProcessProvider;

/**
 * Component factory that look for each component and load their information. <br/>
 * 
 * $Id: ComponentsFactory.java 52892 2010-12-20 05:52:17Z nrousseau $
 */
public class ComponentsFactory implements IComponentsFactory {

    /**
     * 
     */
    private static final String TALEND_COMPONENT_CACHE = "ComponentsCache.";

    private static final String TALEND_FILE_NAME = "cache";

    private static final String OLD_COMPONENTS_USER_INNER_FOLDER = "user"; //$NON-NLS-1$

    private static Logger log = Logger.getLogger(ComponentsFactory.class);

    private static HashSet<IComponent> componentList = null;

    private static HashSet<IComponent> customComponentList = null;

    private HashSet<IComponent> userComponentList = null;

    private IProgressMonitor monitor;

    private SubMonitor subMonitor;

    private static Map<String, Map<String, IComponent>> componentsCache = new HashMap<String, Map<String, IComponent>>();

    // keep a list of the current provider for the selected component, to have the family translation
    // only for components that are loaded
    private static Map<IComponent, AbstractComponentsProvider> componentToProviderMap;

    private static Map<String, AbstractComponentsProvider> componentsAndProvider = new HashMap<String, AbstractComponentsProvider>();

    // 1. only the in the directory /components ,not including /resource
    // 2. include the skeleton files and external include files
    private static ArrayList<String> skeletonList = null;

    private static final String SKELETON_SUFFIX = ".skeleton"; //$NON-NLS-1$

    private static final String INCLUDEFILEINJET_SUFFIX = ".inc.javajet"; //$NON-NLS-1$

    private boolean isCreated = false;

    private IComponentsHandler componentsHandler;// Added by Marvin Wang on Jan. 11, 2012 for M/R.

    private static boolean cleanDone = false;

    protected static Map<String, Map<String, Set<IComponent>>> componentNameMap;

    public ComponentsFactory() {
    }

    private void init(boolean duringLogon) {
        removeOldComponentsUserFolder(); // not used anymore
        long startTime = System.currentTimeMillis();

        // TimeMeasure.display = true;
        // TimeMeasure.displaySteps = true;
        // TimeMeasure.measureActive = true;
        // TimeMeasure.begin("initComponents");

        componentList = new HashSet<IComponent>();
        customComponentList = new HashSet<IComponent>();
        skeletonList = new ArrayList<String>();
        userComponentList = new HashSet<IComponent>();
        String installLocation = new Path(Platform.getConfigurationLocation().getURL().getPath()).toFile().getAbsolutePath();
        componentToProviderMap = new HashMap<IComponent, AbstractComponentsProvider>();
        boolean isNeedClean = !cleanDone && TalendCacheUtils.isSetCleanComponentCache();
        cleanDone = true; // only check this parameter one time, or it will reinitialize things all the time...
        isCreated = hasComponentFile(installLocation) && !isNeedClean;
        ComponentsCache cache = ComponentManager.getComponentCache();
        try {
            if (isCreated) {
                // if cache is created and empty, means we never loaded it before.
                // if it was already loaded, then no need to go again, since it's a static variable, it's still in
                // memory.
                // it avoids to reload from disk again even more for commandline at each logon, since it's no use.
                if (cache.getComponentEntryMap().isEmpty()) {
                    ComponentsCache loadCache = loadComponentResource(installLocation);
                    cache.getComponentEntryMap().putAll(loadCache.getComponentEntryMap());
                }
            } else {
                cache.getComponentEntryMap().clear();
            }
        } catch (IOException e) {
            ExceptionHandler.process(e);
            cache.getComponentEntryMap().clear();
            isCreated = false;
        }

        loadComponentsFromComponentsProviderExtension();

        // TimeMeasure.step("initComponents", "loadComponentsFromProvider");
        // 2.Load Component from extension point: component_definition
        loadComponentsFromExtensions();
        // TimeMeasure.step("initComponents", "loadComponentsFromExtension[joblets?]");

        ComponentManager.saveResource(); // will save only if needed.

        // init component name map, used to pick specified component immediately
        initComponentNameMap();

        // TimeMeasure.step("initComponents", "createCache");
        log.debug(componentList.size() + " components loaded in " + (System.currentTimeMillis() - startTime) + " ms"); //$NON-NLS-1$ //$NON-NLS-2$

        // TimeMeasure.end("initComponents");
        // TimeMeasure.display = false;
        // TimeMeasure.displaySteps = false;
        // TimeMeasure.measureActive = false;
    }

    protected void initComponentNameMap() {
        if (componentList == null) {
            return;
        }
        /**
         * component names example: <br>
         * 1. xmlMapComponent <br>
         * 2. xmlmapComponent <br>
         * 3. xmlmapcomponent <br>
         * 4. xmlMapComponent (for DI) <br>
         * 5. xmlMapComponent (for BD) <br>
         */
        componentNameMap = new HashMap<String, Map<String, Set<IComponent>>>();
        Iterator<IComponent> componentIter = componentList.iterator();
        while (componentIter.hasNext()) {
            IComponent component = componentIter.next();
            String componentName = component.getName();
            if (StringUtils.isEmpty(componentName)) {
                continue;
            }
            String componentNameLowerCase = componentName.toLowerCase();
            Map<String, Set<IComponent>> map = componentNameMap.get(componentNameLowerCase);
            if (map == null) {
                map = new HashMap<String, Set<IComponent>>();
                Set<IComponent> componentSet = new HashSet<IComponent>();
                componentSet.add(component);
                map.put(componentName, componentSet);
                componentNameMap.put(componentNameLowerCase, map);
            } else {
                Set<IComponent> componentSet = map.get(componentName);
                if (componentSet == null) {
                    componentSet = new HashSet<IComponent>();
                    map.put(componentName, componentSet);
                }
                componentSet.add(component);
            }
        }
    }

    /**
     * DOC guanglong.du Comment method "loadComponentResource".
     * 
     * @param eclipseProject
     * @return
     * @throws IOException
     */
    private ComponentsCache loadComponentResource(String installLocation) throws IOException {
        String filePath = ComponentsFactory.TALEND_COMPONENT_CACHE
                + LanguageManager.getCurrentLanguage().toString().toLowerCase() + ComponentsFactory.TALEND_FILE_NAME;
        URI uri = URI.createFileURI(installLocation).appendSegment(filePath);
        ComponentCacheResourceFactoryImpl compFact = new ComponentCacheResourceFactoryImpl();
        Resource resource = compFact.createResource(uri);
        Map optionMap = new HashMap();
        optionMap.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        optionMap.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        optionMap.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
        optionMap.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap());
        optionMap.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
        resource.load(optionMap);
        ComponentsCache cache = (ComponentsCache) EcoreUtil.getObjectByType(resource.getContents(),
                ComponentCachePackage.eINSTANCE.getComponentsCache());
        return cache;
    }

    /**
     * DOC guanglong.du Comment method "hasComponentFile".
     * 
     * @param eclipseProject
     * @return
     */
    private boolean hasComponentFile(String installLocation) {
        String filePath = ComponentsFactory.TALEND_COMPONENT_CACHE
                + LanguageManager.getCurrentLanguage().toString().toLowerCase() + ComponentsFactory.TALEND_FILE_NAME;
        File file = new File(new Path(installLocation).append(filePath).toString());
        return file.exists();
    }

    private void loadComponentsFromComponentsProviderExtension() {
        ComponentsProviderManager componentsProviderManager = ComponentsProviderManager.getInstance();
        for (AbstractComponentsProvider componentsProvider : componentsProviderManager.getProviders()) {
            loadComponents(componentsProvider);
        }
    }

    private void loadComponents(AbstractComponentsProvider componentsProvider) {
        if (componentsProvider != null) {
            try {
                componentsProvider.preComponentsLoad();
                File componentFile = componentsProvider.getInstallationFolder();
                if (componentFile == null) {
                    log.warn(Messages
                            .getString(
                                    "ComponentsFactory.loadComponents.missingFolder", componentsProvider.getFolderName(), componentsProvider.getContributer()));//$NON-NLS-1$
                    return;
                }
                if (componentFile != null && componentFile.exists()) {
                    loadComponentsFromFolder(componentsProvider.getComponentsLocation(), componentsProvider);
                }
            } catch (IOException e) {
                ExceptionHandler.process(e);
            }
        }
    }

    @Override
    public void loadUserComponentsFromComponentsProviderExtension() {
        getComponents();
        ComponentsProviderManager.getInstance().getProviders();
        ComponentsProviderManager componentsProviderManager = ComponentsProviderManager.getInstance();
        AbstractComponentsProvider componentsProvider = componentsProviderManager.loadUserComponentsProvidersFromExtension();
        // remove old user components
        if (!this.userComponentList.isEmpty()) {
            ComponentsCache cache = ComponentManager.getComponentCache();
            for (IComponent component : userComponentList) {
                if (componentList != null && componentList.contains(component)) {
                    componentList.remove(component);
                }
                if (customComponentList.contains(component)) {
                    customComponentList.remove(component);
                }
                if (cache.getComponentEntryMap().get(component.getName()) != null) {
                    cache.getComponentEntryMap().remove(component.getName());
                    ComponentManager.setModified(true);
                }
            }
        }
        loadComponents(componentsProvider);
        ComponentManager.saveResource();
    }

    private void removeOldComponentsUserFolder() {
        String userPath = IComponentsFactory.COMPONENTS_INNER_FOLDER + File.separatorChar
                + ComponentUtilities.getExtFolder(OLD_COMPONENTS_USER_INNER_FOLDER);
        File componentsLocation = getComponentsLocation(userPath);
        if (componentsLocation != null && componentsLocation.exists()) {
            FilesUtils.removeFolder(componentsLocation, true);
        }
    }

    /**
     * DOC qzhang Comment method "loadComponentsFromExtensions".
     */
    private void loadComponentsFromExtensions() {
        AbstractProcessProvider.loadComponentsFromProviders();
        GenericProcessProvider.getInstance().loadComponentsFromProviders();
    }

    private void loadComponentsFromFolder(String pathSource, AbstractComponentsProvider provider) {
        boolean isCustom = false;
        if ("org.talend.designer.components.model.UserComponentsProvider".equals(provider.getId())
                || "org.talend.designer.components.exchange.ExchangeComponentsProvider".equals(provider.getId())) {
            isCustom = true;
        }

        File source;
        try {
            source = provider.getInstallationFolder();
        } catch (IOException e1) {
            ExceptionHandler.process(e1);
            return;
        }
        File[] childDirectories;

        FileFilter fileFilter = new FileFilter() {

            @Override
            public boolean accept(final File file) {
                return file.isDirectory() && file.getName().charAt(0) != '.'
                        && !file.getName().equals(IComponentsFactory.EXTERNAL_COMPONENTS_INNER_FOLDER);
            }

        };
        if (source == null) {
            ExceptionHandler.process(new Exception(Messages.getString("ComponentsFactory.componentNotFound") + pathSource)); //$NON-NLS-1$
            return;
        }

        childDirectories = source.listFiles(fileFilter);

        IBrandingService service = (IBrandingService) GlobalServiceRegister.getDefault().getService(IBrandingService.class);

        // String[] availableComponents = service.getBrandingConfiguration().getAvailableComponents();

        FileFilter skeletonFilter = new FileFilter() {

            @Override
            public boolean accept(final File file) {
                String fileName = file.getName();
                return file.isFile() && fileName.charAt(0) != '.'
                        && (fileName.endsWith(SKELETON_SUFFIX) || fileName.endsWith(INCLUDEFILEINJET_SUFFIX));
            }

        };
        // Changed by Marvin Wang on Feb.22 for bug TDI-19166, caz the test ConnectionManagerTest maybe get the null
        // context.
        BundleContext context = null;
        if (Platform.getProduct() != null) {
            final Bundle definingBundle = Platform.getProduct().getDefiningBundle();
            if (definingBundle != null) {
                context = definingBundle.getBundleContext();
            }
        }
        if (context == null) {
            context = CodeGeneratorActivator.getDefault().getBundle().getBundleContext();
        }

        ServiceReference sref = context.getServiceReference(PackageAdmin.class.getName());
        PackageAdmin admin = (PackageAdmin) context.getService(sref);

        String bundleName;
        if (!isCustom) {
            bundleName = admin.getBundle(provider.getClass()).getSymbolicName();
        } else {
            bundleName = IComponentsFactory.COMPONENTS_LOCATION;
        }

        if (childDirectories != null) {
            if (monitor != null) {
                this.subMonitor = SubMonitor.convert(monitor,
                        Messages.getString("ComponentsFactory.load.components"), childDirectories.length); //$NON-NLS-1$
            }
            if (skeletonList != null) {
                skeletonList.ensureCapacity(childDirectories.length);// to optimize the size of the array
                for (File currentFolder : childDirectories) {
                    // get the skeleton files first, then XML config files later.
                    File[] skeletonFiles = currentFolder.listFiles(skeletonFilter);
                    if (skeletonFiles != null) {
                        for (File file : skeletonFiles) {
                            skeletonList.add(file.getAbsolutePath()); // path
                        }
                    }

                    try {
                        File xmlMainFile = new File(currentFolder, ComponentFilesNaming.getInstance().getMainXMLFileName(
                                currentFolder.getName(), getCodeLanguageSuffix()));
                        if (!xmlMainFile.exists()) {
                            // if not a component folder, ignore it.
                            continue;
                        }
                        String currentXmlSha1 = null;
                        try {
                            currentXmlSha1 = SHA1Util.calculateFromTextStream(new FileInputStream(xmlMainFile));
                        } catch (FileNotFoundException e) {
                            // nothing since exceptions are directly in the check bellow
                        }
                        // Need to check if this component is already in the cache or not.
                        // if yes, then we compare the sha1... and if different we reload the component
                        // if component is not in the cache, of course just load it!
                        ComponentsCache cache = ComponentManager.getComponentCache();
                        boolean foundComponentIsSame = false;
                        ComponentInfo existingComponentInfoInCache = null;
                        if (cache.getComponentEntryMap().containsKey(currentFolder.getName())) {
                            EList<ComponentInfo> infos = cache.getComponentEntryMap().get(currentFolder.getName());
                            for (ComponentInfo info : infos) {
                                if (StringUtils.equals(bundleName, info.getSourceBundleName())) {
                                    existingComponentInfoInCache = info;
                                    if (StringUtils.equals(info.getSha1(), currentXmlSha1)) {
                                        foundComponentIsSame = true;
                                    }
                                    break; // found component, no matter changed or not
                                }
                            }
                        }
                        if (foundComponentIsSame) {
                            // check if component is already loaded in memory, if yes it will only reload existing xml
                            // it should go here mainly for commandline or if use like ctrl+shift+f3
                            if (componentsCache.containsKey(xmlMainFile.getAbsolutePath())) {
                                IComponent componentFromThisProvider = null;
                                for (IComponent component : componentsCache.get(xmlMainFile.getAbsolutePath()).values()) {
                                    if (component instanceof EmfComponent) {
                                        if (bundleName.equals(((EmfComponent) component).getSourceBundleName())) {
                                            componentFromThisProvider = component;
                                            break;
                                        }
                                    }
                                }
                                if (componentFromThisProvider != null) {
                                    // In headless mode, we assume the components won't change and we will use a cache
                                    componentList.add(componentFromThisProvider);
                                    if (isCustom) {
                                        customComponentList.add(componentFromThisProvider);
                                    }
                                    continue;
                                }
                            }
                        }
                        if (!foundComponentIsSame) {
                            ComponentFileChecker.checkComponentFolder(currentFolder, getCodeLanguageSuffix());
                        }

                        String pathName = xmlMainFile.getAbsolutePath();

                        String applicationPath = ComponentBundleToPath.getPathFromBundle(bundleName);

                        // pathName = C:\myapp\plugins\myplugin\components\mycomponent\mycomponent.xml
                        pathName = (new Path(pathName)).toPortableString();
                        // pathName = C:/myapp/plugins/myplugin/components/mycomponent/mycomponent.xml
                        pathName = pathName.replace(applicationPath, ""); //$NON-NLS-1$
                        // pathName = /components/mycomponent/mycomponent.xml

                        // if not already in memory, just load the component from cache.
                        // if the component is already existing in cache and if it's the same, it won't reload all (cf
                        // flag: foundComponentIsSame)
                        EmfComponent currentComp = new EmfComponent(pathName, bundleName, xmlMainFile.getParentFile().getName(),
                                pathSource, cache, foundComponentIsSame, provider);
                        if (!foundComponentIsSame) {
                            // force to call some functions to update the cache. (to improve)
                            currentComp.isVisibleInComponentDefinition();
                            currentComp.isTechnical();
                            currentComp.getOriginalFamilyName();
                            currentComp.getTranslatedFamilyName();
                            currentComp.getPluginExtension();
                            currentComp.getVersion();
                            currentComp.getModulesNeeded();
                            currentComp.getPluginDependencies();
                            // end of force cache update.

                            EList<ComponentInfo> componentsInfo = cache.getComponentEntryMap().get(currentFolder.getName());
                            for (ComponentInfo cInfo : componentsInfo) {
                                if (cInfo.getSourceBundleName().equals(bundleName)) {
                                    cInfo.setSha1(currentXmlSha1);
                                    break;
                                }
                            }
                            ComponentManager.setModified(true); // this will force to save the cache later.
                        }

                        boolean hiddenComponent = false;

                        Collection<IComponentFactoryFilter> filters = ComponentsFactoryProviderManager.getInstance()
                                .getProviders();
                        for (IComponentFactoryFilter filter : filters) {
                            if (!filter.isAvailable(currentComp.getName())) {
                                hiddenComponent = true;
                                break;
                            }
                        }

                        // if the component is not needed in the current branding,
                        // and that this one IS NOT a specific component for code generation
                        // just don't load it
                        if (hiddenComponent
                                && !(currentComp.getOriginalFamilyName().contains("Technical") || currentComp.isTechnical())) {
                            continue;
                        }

                        componentToProviderMap.put(currentComp, provider);

                        // if the component is not needed in the current branding,
                        // and that this one IS a specific component for code generation,
                        // hide it
                        if (hiddenComponent
                                && (currentComp.getOriginalFamilyName().contains("Technical") || currentComp.isTechnical())) {
                            currentComp.setVisible(false);
                            currentComp.setTechnical(true);
                        }
                        if (provider.getId().contains("Camel")) {
                            currentComp.setPaletteType(ComponentCategory.CATEGORY_4_CAMEL.getName());
                        } else {
                            currentComp.setPaletteType(currentComp.getType());
                        }

                        if (componentList.contains(currentComp)) {
                            log.warn("Component " + currentComp.getName() + " already exists. Cannot load user version."); //$NON-NLS-1$ //$NON-NLS-2$
                        } else {
                            // currentComp.setResourceBundle(getComponentResourceBundle(currentComp, source.toString(),
                            // null,
                            // provider));
                            currentComp.setProvider(provider);
                            componentList.add(currentComp);
                            if (isCustom) {
                                customComponentList.add(currentComp);
                            }
                            if (pathSource != null) {
                                Path userComponent = new Path(pathSource);
                                Path templatePath = new Path(IComponentsFactory.COMPONENTS_INNER_FOLDER + File.separatorChar
                                        + IComponentsFactory.EXTERNAL_COMPONENTS_INNER_FOLDER + File.separatorChar
                                        + ComponentUtilities.getExtFolder(OLD_COMPONENTS_USER_INNER_FOLDER));
                                if (userComponent.equals(templatePath)) {
                                    userComponentList.add(currentComp);
                                }
                            }
                        }

                        // componentsCache only used bellow in case of headless (commandline) or if use like
                        // ctrl+shift+f3
                        String componentName = xmlMainFile.getAbsolutePath();
                        if (!componentsCache.containsKey(componentName)) {
                            componentsCache.put(componentName, new HashMap<String, IComponent>());
                        }
                        componentsCache.get(xmlMainFile.getAbsolutePath()).put(currentComp.getPaletteType(), currentComp);
                    } catch (MissingMainXMLComponentFileException e) {
                        log.trace(currentFolder.getName() + " is not a " + getCodeLanguageSuffix() + " component", e); //$NON-NLS-1$ //$NON-NLS-2$
                    } catch (BusinessException e) {
                        BusinessException ex = new BusinessException(
                                "Cannot load component \"" + currentFolder.getName() + "\": " //$NON-NLS-1$ //$NON-NLS-2$
                                        + e.getMessage(), e);
                        ExceptionHandler.process(ex, Level.ERROR);
                    }

                    if (this.subMonitor != null) {
                        this.subMonitor.worked(1);
                    }
                    if (this.monitor != null && this.monitor.isCanceled()) {
                        return;
                    }
                }
                skeletonList.trimToSize();// to optimize the size of the array
            }
        }
    }

    /**
     * DOC smallet Comment method "checkComponentFolder".
     * 
     * @param currentFolder
     * @return
     * @throws BusinessException
     */

    private File getComponentsLocation(String folder) {
        String componentsPath = IComponentsFactory.COMPONENTS_LOCATION;
        IBrandingService breaningService = (IBrandingService) GlobalServiceRegister.getDefault().getService(
                IBrandingService.class);
        if (breaningService.isPoweredOnlyCamel()) {
            componentsPath = IComponentsFactory.CAMEL_COMPONENTS_LOCATION;
        }
        Bundle b = Platform.getBundle(componentsPath);

        File file = null;
        try {
            URL url = FileLocator.find(b, new Path(folder), null);
            if (url == null) {
                return null;
            }
            URL fileUrl = FileLocator.toFileURL(url);
            file = new File(fileUrl.getPath());
        } catch (Exception e) {
            // e.printStackTrace();
            ExceptionHandler.process(e);
        }

        return file;
    }

    private File getComponentsLocation(String folder, AbstractComponentsProvider provider) {
        File file = null;
        try {
            if (provider != null) {
                file = provider.getInstallationFolder();
            } else {
                String componentsPath = IComponentsFactory.COMPONENTS_LOCATION;
                Bundle b = Platform.getBundle(componentsPath);
                IBrandingService breaningService = (IBrandingService) GlobalServiceRegister.getDefault().getService(
                        IBrandingService.class);
                if (breaningService.isPoweredOnlyCamel()) {
                    componentsPath = IComponentsFactory.CAMEL_COMPONENTS_LOCATION;
                }
                URL url = FileLocator.find(b, new Path(folder), null);
                if (url == null) {
                    return null;
                }
                URL fileUrl = FileLocator.toFileURL(url);
                file = new File(fileUrl.getPath());

            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return file;
    }

    private ResourceBundle getComponentResourceBundle(IComponent currentComp, String source, String cachedPathSource,
            AbstractComponentsProvider provider) {
        try {
            AbstractComponentsProvider currentProvider = provider;
            if (currentProvider == null) {
                ComponentsProviderManager componentsProviderManager = ComponentsProviderManager.getInstance();
                Collection<AbstractComponentsProvider> providers = componentsProviderManager.getProviders();
                for (AbstractComponentsProvider curProvider : providers) {
                    String path = new Path(curProvider.getInstallationFolder().toString()).toPortableString();
                    if (source.startsWith(path)) {
                        // fix for TDI-19889 and TDI-20507 to get the correct component provider
                        if (cachedPathSource != null) {
                            if (path.contains(cachedPathSource)) {
                                currentProvider = curProvider;
                                break;
                            }
                        } else {
                            currentProvider = curProvider;
                            break;
                        }
                    }
                }
            }
            String installPath = currentProvider.getInstallationFolder().toString();
            String label = ComponentFilesNaming.getInstance().getBundleName(currentComp.getName(),
                    installPath.substring(installPath.lastIndexOf(IComponentsFactory.COMPONENTS_INNER_FOLDER)));

            if (currentProvider.isUseLocalProvider()) {
                // if the component use local provider as storage (for user / ecosystem components)
                // then get the bundle resource from the current main component provider.

                // note: code here to review later, service like this shouldn't be used...
                ResourceBundle bundle = null;
                IBrandingService brandingService = (IBrandingService) GlobalServiceRegister.getDefault().getService(
                        IBrandingService.class);
                if (brandingService.isPoweredOnlyCamel()) {
                    bundle = currentProvider.getResourceBundle(label);
                } else {
                    ITisLocalProviderService service = (ITisLocalProviderService) GlobalServiceRegister.getDefault().getService(
                            ITisLocalProviderService.class);
                    bundle = service.getResourceBundle(label);
                }
                return bundle;
            } else {
                ResourceBundle bundle = ResourceBundle.getBundle(label, Locale.getDefault(), new ResClassLoader(currentProvider
                        .getClass().getClassLoader()));
                return bundle;
            }
        } catch (IOException e) {
            ExceptionHandler.process(e);
        }

        return null;
    }

    private String getCodeLanguageSuffix() {
        return LanguageManager.getCurrentLanguage().getName();
    }

    @Override
    public synchronized int size() {
        if (componentList == null) {
            init(false);
        }
        return componentList.size();
    }

    @Override
    public synchronized IComponent get(String name) {
        if (componentList == null) {
            init(false);
        }

        for (IComponent comp : componentList) {
            if (comp != null && comp.getName().equals(name)
                    && !ComponentCategory.CATEGORY_4_MAPREDUCE.getName().equals(comp.getPaletteType())) {
                return comp;
            }// else keep looking
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.components.IComponentsFactory#get(java.lang.String, java.lang.String)
     */
    @Override
    public synchronized IComponent get(String name, String paletteType) {
        if (componentList == null) {
            init(false);
        }

        for (IComponent comp : componentList) {
            if (comp != null && comp.getName().equals(name) && paletteType.equals(comp.getPaletteType())) {
                return comp;
            }// else keep looking
        }
        return null;
    }

    @Override
    public void initializeComponents(IProgressMonitor monitor) {
        this.monitor = monitor;
        if (componentList == null) {
            init(false);
        }
        this.monitor = null;
        this.subMonitor = null;
    }

    @Override
    public void initializeComponents(IProgressMonitor monitor, boolean duringLogon) {
        this.monitor = monitor;
        if (componentList == null) {
            init(duringLogon);
        }
        this.monitor = null;
        this.subMonitor = null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.components.IComponentsFactory#getComponents()
     */
    @Override
    public synchronized Set<IComponent> getComponents() {
        if (componentList == null) {
            init(false);
        }
        return componentList;
    }

    @Override
    public synchronized Map<String, Map<String, Set<IComponent>>> getComponentNameMap() {
        if (componentNameMap == null) {
            init(false);
        }
        return componentNameMap;
    }

    @Override
    public synchronized List<IComponent> getCustomComponents() {
        if (customComponentList == null) {
            init(false);
        }
        return new ArrayList<IComponent>(customComponentList);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.components.IComponentsFactory#getSkeletons()
     */
    @Override
    public List<String> getSkeletons() {
        if (skeletonList == null) {
            init(false);
        }
        return skeletonList;
    }

    @Override
    public void reset() {
        componentList = null;
        skeletonList = null;
        customComponentList = null;
        Collection<IComponentFactoryFilter> filters = ComponentsFactoryProviderManager.getInstance().getProviders();
        for (IComponentFactoryFilter filter : filters) {
            filter.cleanCache();
        }
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IJobletProviderService.class)) {
            IJobletProviderService jobletService = (IJobletProviderService) GlobalServiceRegister.getDefault().getService(
                    IJobletProviderService.class);
            if (jobletService != null) {
                jobletService.clearJobletComponent();
            }
        }
        
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ISparkJobletProviderService.class)) {
            ISparkJobletProviderService jobletService = (ISparkJobletProviderService) GlobalServiceRegister.getDefault().getService(
                    ISparkJobletProviderService.class);
            if (jobletService != null) {
                jobletService.clearSparkJobletComponent();
            }
        }
    }

    @Override
    public void resetCache() {
        reset();
        if (!CommonsPlugin.isHeadless()) {
            CoreImageProvider.clearComponentIconImages();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.components.IComponentsFactory#getFamilyTranslation(IComponent component,
     * java.lang.String)
     */
    @Override
    public String getFamilyTranslation(Object component, String text) {
        String translated = Messages.getString(text);

        // if text translated is not in local provider, look into other providers.
        if (translated.startsWith("!!")) { //$NON-NLS-1$
            if (component instanceof IComponent) {
                if (componentToProviderMap.containsKey(component)) {
                    String translatedFromProvider = componentToProviderMap.get(component).getFamilyTranslation(text);
                    if (translatedFromProvider != null) {
                        translated = translatedFromProvider;
                    }
                }
            } else if (component instanceof String) {
                if (componentsAndProvider.containsKey(component)) {
                    String translatedFromProvider = componentsAndProvider.get(component).getFamilyTranslation(text);
                    if (translatedFromProvider != null) {
                        translated = translatedFromProvider;
                    }
                }
            }
        }

        return translated;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.components.IComponentsFactory#resetSpecificComponents()
     */
    @Override
    public void resetSpecificComponents() {
        loadComponentsFromExtensions();
    }

    @Override
    public Map<String, File> getComponentsProvidersFolder() {
        Map<String, File> list = new HashMap<String, File>();

        ComponentsProviderManager componentsProviderManager = ComponentsProviderManager.getInstance();
        for (AbstractComponentsProvider componentsProvider : componentsProviderManager.getProviders()) {
            try {
                // list.add(componentsProvider.getInstallationFolder());
                list.put(componentsProvider.getContributer(), componentsProvider.getInstallationFolder());
            } catch (IOException e) {
                ExceptionHandler.process(e);
                continue;
            }
        }
        return list;
    }

    @Override
    public List<ComponentProviderInfo> getComponentsProvidersInfo() {
        List<ComponentProviderInfo> list = new ArrayList<ComponentProviderInfo>();
        ComponentsProviderManager componentsProviderManager = ComponentsProviderManager.getInstance();
        for (AbstractComponentsProvider componentsProvider : componentsProviderManager.getProviders()) {
            try {
                ComponentProviderInfo info = new ComponentProviderInfo();
                info.setId(componentsProvider.getId());
                info.setContributer(componentsProvider.getContributer());
                info.setLocation(componentsProvider.getInstallationFolder().getAbsolutePath());
                list.add(info);
            } catch (IOException e) {
                ExceptionHandler.process(e);
                continue;
            }
        }
        return list;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.components.IComponentsFactory#getComponentsHandler()
     */
    @Override
    public IComponentsHandler getComponentsHandler() {
        return componentsHandler;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.components.IComponentsFactory#setComponentsHandler(org.talend.core.model.components.
     * TComponentsHandler)
     */
    @Override
    public void setComponentsHandler(IComponentsHandler componentsHandler) {
        this.componentsHandler = componentsHandler;
    }

}
