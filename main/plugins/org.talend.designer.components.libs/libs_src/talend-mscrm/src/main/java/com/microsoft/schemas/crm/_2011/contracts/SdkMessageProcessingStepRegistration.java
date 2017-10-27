/*
 * XML Type:  SdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML SdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface SdkMessageProcessingStepRegistration extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SdkMessageProcessingStepRegistration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("sdkmessageprocessingstepregistrationdeabtype");
    
    /**
     * Gets the "CustomConfiguration" element
     */
    java.lang.String getCustomConfiguration();
    
    /**
     * Gets (as xml) the "CustomConfiguration" element
     */
    org.apache.xmlbeans.XmlString xgetCustomConfiguration();
    
    /**
     * Tests for nil "CustomConfiguration" element
     */
    boolean isNilCustomConfiguration();
    
    /**
     * True if has "CustomConfiguration" element
     */
    boolean isSetCustomConfiguration();
    
    /**
     * Sets the "CustomConfiguration" element
     */
    void setCustomConfiguration(java.lang.String customConfiguration);
    
    /**
     * Sets (as xml) the "CustomConfiguration" element
     */
    void xsetCustomConfiguration(org.apache.xmlbeans.XmlString customConfiguration);
    
    /**
     * Nils the "CustomConfiguration" element
     */
    void setNilCustomConfiguration();
    
    /**
     * Unsets the "CustomConfiguration" element
     */
    void unsetCustomConfiguration();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Tests for nil "Description" element
     */
    boolean isNilDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Nils the "Description" element
     */
    void setNilDescription();
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "FilteringAttributes" element
     */
    java.lang.String getFilteringAttributes();
    
    /**
     * Gets (as xml) the "FilteringAttributes" element
     */
    org.apache.xmlbeans.XmlString xgetFilteringAttributes();
    
    /**
     * Tests for nil "FilteringAttributes" element
     */
    boolean isNilFilteringAttributes();
    
    /**
     * True if has "FilteringAttributes" element
     */
    boolean isSetFilteringAttributes();
    
    /**
     * Sets the "FilteringAttributes" element
     */
    void setFilteringAttributes(java.lang.String filteringAttributes);
    
    /**
     * Sets (as xml) the "FilteringAttributes" element
     */
    void xsetFilteringAttributes(org.apache.xmlbeans.XmlString filteringAttributes);
    
    /**
     * Nils the "FilteringAttributes" element
     */
    void setNilFilteringAttributes();
    
    /**
     * Unsets the "FilteringAttributes" element
     */
    void unsetFilteringAttributes();
    
    /**
     * Gets the "Images" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration getImages();
    
    /**
     * Tests for nil "Images" element
     */
    boolean isNilImages();
    
    /**
     * True if has "Images" element
     */
    boolean isSetImages();
    
    /**
     * Sets the "Images" element
     */
    void setImages(com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration images);
    
    /**
     * Appends and returns a new empty "Images" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration addNewImages();
    
    /**
     * Nils the "Images" element
     */
    void setNilImages();
    
    /**
     * Unsets the "Images" element
     */
    void unsetImages();
    
    /**
     * Gets the "ImpersonatingUserId" element
     */
    java.lang.String getImpersonatingUserId();
    
    /**
     * Gets (as xml) the "ImpersonatingUserId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetImpersonatingUserId();
    
    /**
     * True if has "ImpersonatingUserId" element
     */
    boolean isSetImpersonatingUserId();
    
    /**
     * Sets the "ImpersonatingUserId" element
     */
    void setImpersonatingUserId(java.lang.String impersonatingUserId);
    
    /**
     * Sets (as xml) the "ImpersonatingUserId" element
     */
    void xsetImpersonatingUserId(com.microsoft.schemas._2003._10.serialization.Guid impersonatingUserId);
    
    /**
     * Unsets the "ImpersonatingUserId" element
     */
    void unsetImpersonatingUserId();
    
    /**
     * Gets the "InvocationSource" element
     */
    int getInvocationSource();
    
    /**
     * Gets (as xml) the "InvocationSource" element
     */
    org.apache.xmlbeans.XmlInt xgetInvocationSource();
    
    /**
     * True if has "InvocationSource" element
     */
    boolean isSetInvocationSource();
    
    /**
     * Sets the "InvocationSource" element
     */
    void setInvocationSource(int invocationSource);
    
    /**
     * Sets (as xml) the "InvocationSource" element
     */
    void xsetInvocationSource(org.apache.xmlbeans.XmlInt invocationSource);
    
    /**
     * Unsets the "InvocationSource" element
     */
    void unsetInvocationSource();
    
    /**
     * Gets the "MessageName" element
     */
    java.lang.String getMessageName();
    
    /**
     * Gets (as xml) the "MessageName" element
     */
    org.apache.xmlbeans.XmlString xgetMessageName();
    
    /**
     * Tests for nil "MessageName" element
     */
    boolean isNilMessageName();
    
    /**
     * True if has "MessageName" element
     */
    boolean isSetMessageName();
    
    /**
     * Sets the "MessageName" element
     */
    void setMessageName(java.lang.String messageName);
    
    /**
     * Sets (as xml) the "MessageName" element
     */
    void xsetMessageName(org.apache.xmlbeans.XmlString messageName);
    
    /**
     * Nils the "MessageName" element
     */
    void setNilMessageName();
    
    /**
     * Unsets the "MessageName" element
     */
    void unsetMessageName();
    
    /**
     * Gets the "Mode" element
     */
    int getMode();
    
    /**
     * Gets (as xml) the "Mode" element
     */
    org.apache.xmlbeans.XmlInt xgetMode();
    
    /**
     * True if has "Mode" element
     */
    boolean isSetMode();
    
    /**
     * Sets the "Mode" element
     */
    void setMode(int mode);
    
    /**
     * Sets (as xml) the "Mode" element
     */
    void xsetMode(org.apache.xmlbeans.XmlInt mode);
    
    /**
     * Unsets the "Mode" element
     */
    void unsetMode();
    
    /**
     * Gets the "PluginTypeFriendlyName" element
     */
    java.lang.String getPluginTypeFriendlyName();
    
    /**
     * Gets (as xml) the "PluginTypeFriendlyName" element
     */
    org.apache.xmlbeans.XmlString xgetPluginTypeFriendlyName();
    
    /**
     * Tests for nil "PluginTypeFriendlyName" element
     */
    boolean isNilPluginTypeFriendlyName();
    
    /**
     * True if has "PluginTypeFriendlyName" element
     */
    boolean isSetPluginTypeFriendlyName();
    
    /**
     * Sets the "PluginTypeFriendlyName" element
     */
    void setPluginTypeFriendlyName(java.lang.String pluginTypeFriendlyName);
    
    /**
     * Sets (as xml) the "PluginTypeFriendlyName" element
     */
    void xsetPluginTypeFriendlyName(org.apache.xmlbeans.XmlString pluginTypeFriendlyName);
    
    /**
     * Nils the "PluginTypeFriendlyName" element
     */
    void setNilPluginTypeFriendlyName();
    
    /**
     * Unsets the "PluginTypeFriendlyName" element
     */
    void unsetPluginTypeFriendlyName();
    
    /**
     * Gets the "PluginTypeName" element
     */
    java.lang.String getPluginTypeName();
    
    /**
     * Gets (as xml) the "PluginTypeName" element
     */
    org.apache.xmlbeans.XmlString xgetPluginTypeName();
    
    /**
     * Tests for nil "PluginTypeName" element
     */
    boolean isNilPluginTypeName();
    
    /**
     * True if has "PluginTypeName" element
     */
    boolean isSetPluginTypeName();
    
    /**
     * Sets the "PluginTypeName" element
     */
    void setPluginTypeName(java.lang.String pluginTypeName);
    
    /**
     * Sets (as xml) the "PluginTypeName" element
     */
    void xsetPluginTypeName(org.apache.xmlbeans.XmlString pluginTypeName);
    
    /**
     * Nils the "PluginTypeName" element
     */
    void setNilPluginTypeName();
    
    /**
     * Unsets the "PluginTypeName" element
     */
    void unsetPluginTypeName();
    
    /**
     * Gets the "PrimaryEntityName" element
     */
    java.lang.String getPrimaryEntityName();
    
    /**
     * Gets (as xml) the "PrimaryEntityName" element
     */
    org.apache.xmlbeans.XmlString xgetPrimaryEntityName();
    
    /**
     * Tests for nil "PrimaryEntityName" element
     */
    boolean isNilPrimaryEntityName();
    
    /**
     * True if has "PrimaryEntityName" element
     */
    boolean isSetPrimaryEntityName();
    
    /**
     * Sets the "PrimaryEntityName" element
     */
    void setPrimaryEntityName(java.lang.String primaryEntityName);
    
    /**
     * Sets (as xml) the "PrimaryEntityName" element
     */
    void xsetPrimaryEntityName(org.apache.xmlbeans.XmlString primaryEntityName);
    
    /**
     * Nils the "PrimaryEntityName" element
     */
    void setNilPrimaryEntityName();
    
    /**
     * Unsets the "PrimaryEntityName" element
     */
    void unsetPrimaryEntityName();
    
    /**
     * Gets the "SecondaryEntityName" element
     */
    java.lang.String getSecondaryEntityName();
    
    /**
     * Gets (as xml) the "SecondaryEntityName" element
     */
    org.apache.xmlbeans.XmlString xgetSecondaryEntityName();
    
    /**
     * Tests for nil "SecondaryEntityName" element
     */
    boolean isNilSecondaryEntityName();
    
    /**
     * True if has "SecondaryEntityName" element
     */
    boolean isSetSecondaryEntityName();
    
    /**
     * Sets the "SecondaryEntityName" element
     */
    void setSecondaryEntityName(java.lang.String secondaryEntityName);
    
    /**
     * Sets (as xml) the "SecondaryEntityName" element
     */
    void xsetSecondaryEntityName(org.apache.xmlbeans.XmlString secondaryEntityName);
    
    /**
     * Nils the "SecondaryEntityName" element
     */
    void setNilSecondaryEntityName();
    
    /**
     * Unsets the "SecondaryEntityName" element
     */
    void unsetSecondaryEntityName();
    
    /**
     * Gets the "Stage" element
     */
    int getStage();
    
    /**
     * Gets (as xml) the "Stage" element
     */
    org.apache.xmlbeans.XmlInt xgetStage();
    
    /**
     * True if has "Stage" element
     */
    boolean isSetStage();
    
    /**
     * Sets the "Stage" element
     */
    void setStage(int stage);
    
    /**
     * Sets (as xml) the "Stage" element
     */
    void xsetStage(org.apache.xmlbeans.XmlInt stage);
    
    /**
     * Unsets the "Stage" element
     */
    void unsetStage();
    
    /**
     * Gets the "SupportedDeployment" element
     */
    int getSupportedDeployment();
    
    /**
     * Gets (as xml) the "SupportedDeployment" element
     */
    org.apache.xmlbeans.XmlInt xgetSupportedDeployment();
    
    /**
     * True if has "SupportedDeployment" element
     */
    boolean isSetSupportedDeployment();
    
    /**
     * Sets the "SupportedDeployment" element
     */
    void setSupportedDeployment(int supportedDeployment);
    
    /**
     * Sets (as xml) the "SupportedDeployment" element
     */
    void xsetSupportedDeployment(org.apache.xmlbeans.XmlInt supportedDeployment);
    
    /**
     * Unsets the "SupportedDeployment" element
     */
    void unsetSupportedDeployment();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
