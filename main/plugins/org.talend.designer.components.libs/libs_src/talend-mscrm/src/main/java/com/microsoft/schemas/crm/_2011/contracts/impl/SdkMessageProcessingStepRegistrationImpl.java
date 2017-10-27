/*
 * XML Type:  SdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML SdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class SdkMessageProcessingStepRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration
{
    private static final long serialVersionUID = 1L;
    
    public SdkMessageProcessingStepRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CustomConfiguration");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Description");
    private static final javax.xml.namespace.QName FILTERINGATTRIBUTES$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "FilteringAttributes");
    private static final javax.xml.namespace.QName IMAGES$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Images");
    private static final javax.xml.namespace.QName IMPERSONATINGUSERID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ImpersonatingUserId");
    private static final javax.xml.namespace.QName INVOCATIONSOURCE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "InvocationSource");
    private static final javax.xml.namespace.QName MESSAGENAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MessageName");
    private static final javax.xml.namespace.QName MODE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Mode");
    private static final javax.xml.namespace.QName PLUGINTYPEFRIENDLYNAME$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PluginTypeFriendlyName");
    private static final javax.xml.namespace.QName PLUGINTYPENAME$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PluginTypeName");
    private static final javax.xml.namespace.QName PRIMARYENTITYNAME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PrimaryEntityName");
    private static final javax.xml.namespace.QName SECONDARYENTITYNAME$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SecondaryEntityName");
    private static final javax.xml.namespace.QName STAGE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Stage");
    private static final javax.xml.namespace.QName SUPPORTEDDEPLOYMENT$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SupportedDeployment");
    
    
    /**
     * Gets the "CustomConfiguration" element
     */
    public java.lang.String getCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomConfiguration" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMCONFIGURATION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomConfiguration" element
     */
    public boolean isNilCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMCONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CustomConfiguration" element
     */
    public boolean isSetCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMCONFIGURATION$0) != 0;
        }
    }
    
    /**
     * Sets the "CustomConfiguration" element
     */
    public void setCustomConfiguration(java.lang.String customConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMCONFIGURATION$0);
            }
            target.setStringValue(customConfiguration);
        }
    }
    
    /**
     * Sets (as xml) the "CustomConfiguration" element
     */
    public void xsetCustomConfiguration(org.apache.xmlbeans.XmlString customConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMCONFIGURATION$0);
            }
            target.set(customConfiguration);
        }
    }
    
    /**
     * Nils the "CustomConfiguration" element
     */
    public void setNilCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMCONFIGURATION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomConfiguration" element
     */
    public void unsetCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMCONFIGURATION$0, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Description" element
     */
    public boolean isNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Nils the "Description" element
     */
    public void setNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "FilteringAttributes" element
     */
    public java.lang.String getFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTERINGATTRIBUTES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FilteringAttributes" element
     */
    public org.apache.xmlbeans.XmlString xgetFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTERINGATTRIBUTES$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FilteringAttributes" element
     */
    public boolean isNilFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTERINGATTRIBUTES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FilteringAttributes" element
     */
    public boolean isSetFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERINGATTRIBUTES$4) != 0;
        }
    }
    
    /**
     * Sets the "FilteringAttributes" element
     */
    public void setFilteringAttributes(java.lang.String filteringAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTERINGATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTERINGATTRIBUTES$4);
            }
            target.setStringValue(filteringAttributes);
        }
    }
    
    /**
     * Sets (as xml) the "FilteringAttributes" element
     */
    public void xsetFilteringAttributes(org.apache.xmlbeans.XmlString filteringAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTERINGATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILTERINGATTRIBUTES$4);
            }
            target.set(filteringAttributes);
        }
    }
    
    /**
     * Nils the "FilteringAttributes" element
     */
    public void setNilFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTERINGATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILTERINGATTRIBUTES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FilteringAttributes" element
     */
    public void unsetFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERINGATTRIBUTES$4, 0);
        }
    }
    
    /**
     * Gets the "Images" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration getImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(IMAGES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Images" element
     */
    public boolean isNilImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(IMAGES$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Images" element
     */
    public boolean isSetImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGES$6) != 0;
        }
    }
    
    /**
     * Sets the "Images" element
     */
    public void setImages(com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration images)
    {
        generatedSetterHelperImpl(images, IMAGES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Images" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration addNewImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(IMAGES$6);
            return target;
        }
    }
    
    /**
     * Nils the "Images" element
     */
    public void setNilImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(IMAGES$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(IMAGES$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Images" element
     */
    public void unsetImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGES$6, 0);
        }
    }
    
    /**
     * Gets the "ImpersonatingUserId" element
     */
    public java.lang.String getImpersonatingUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPERSONATINGUSERID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImpersonatingUserId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetImpersonatingUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(IMPERSONATINGUSERID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ImpersonatingUserId" element
     */
    public boolean isSetImpersonatingUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPERSONATINGUSERID$8) != 0;
        }
    }
    
    /**
     * Sets the "ImpersonatingUserId" element
     */
    public void setImpersonatingUserId(java.lang.String impersonatingUserId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPERSONATINGUSERID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPERSONATINGUSERID$8);
            }
            target.setStringValue(impersonatingUserId);
        }
    }
    
    /**
     * Sets (as xml) the "ImpersonatingUserId" element
     */
    public void xsetImpersonatingUserId(com.microsoft.schemas._2003._10.serialization.Guid impersonatingUserId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(IMPERSONATINGUSERID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(IMPERSONATINGUSERID$8);
            }
            target.set(impersonatingUserId);
        }
    }
    
    /**
     * Unsets the "ImpersonatingUserId" element
     */
    public void unsetImpersonatingUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPERSONATINGUSERID$8, 0);
        }
    }
    
    /**
     * Gets the "InvocationSource" element
     */
    public int getInvocationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOCATIONSOURCE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvocationSource" element
     */
    public org.apache.xmlbeans.XmlInt xgetInvocationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVOCATIONSOURCE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "InvocationSource" element
     */
    public boolean isSetInvocationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVOCATIONSOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "InvocationSource" element
     */
    public void setInvocationSource(int invocationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOCATIONSOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOCATIONSOURCE$10);
            }
            target.setIntValue(invocationSource);
        }
    }
    
    /**
     * Sets (as xml) the "InvocationSource" element
     */
    public void xsetInvocationSource(org.apache.xmlbeans.XmlInt invocationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVOCATIONSOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INVOCATIONSOURCE$10);
            }
            target.set(invocationSource);
        }
    }
    
    /**
     * Unsets the "InvocationSource" element
     */
    public void unsetInvocationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVOCATIONSOURCE$10, 0);
        }
    }
    
    /**
     * Gets the "MessageName" element
     */
    public java.lang.String getMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGENAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageName" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGENAME$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MessageName" element
     */
    public boolean isNilMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGENAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MessageName" element
     */
    public boolean isSetMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGENAME$12) != 0;
        }
    }
    
    /**
     * Sets the "MessageName" element
     */
    public void setMessageName(java.lang.String messageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGENAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGENAME$12);
            }
            target.setStringValue(messageName);
        }
    }
    
    /**
     * Sets (as xml) the "MessageName" element
     */
    public void xsetMessageName(org.apache.xmlbeans.XmlString messageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGENAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGENAME$12);
            }
            target.set(messageName);
        }
    }
    
    /**
     * Nils the "MessageName" element
     */
    public void setNilMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGENAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGENAME$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MessageName" element
     */
    public void unsetMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGENAME$12, 0);
        }
    }
    
    /**
     * Gets the "Mode" element
     */
    public int getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Mode" element
     */
    public org.apache.xmlbeans.XmlInt xgetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Mode" element
     */
    public boolean isSetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODE$14) != 0;
        }
    }
    
    /**
     * Sets the "Mode" element
     */
    public void setMode(int mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODE$14);
            }
            target.setIntValue(mode);
        }
    }
    
    /**
     * Sets (as xml) the "Mode" element
     */
    public void xsetMode(org.apache.xmlbeans.XmlInt mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MODE$14);
            }
            target.set(mode);
        }
    }
    
    /**
     * Unsets the "Mode" element
     */
    public void unsetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODE$14, 0);
        }
    }
    
    /**
     * Gets the "PluginTypeFriendlyName" element
     */
    public java.lang.String getPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PluginTypeFriendlyName" element
     */
    public org.apache.xmlbeans.XmlString xgetPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PluginTypeFriendlyName" element
     */
    public boolean isNilPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PluginTypeFriendlyName" element
     */
    public boolean isSetPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINTYPEFRIENDLYNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "PluginTypeFriendlyName" element
     */
    public void setPluginTypeFriendlyName(java.lang.String pluginTypeFriendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLUGINTYPEFRIENDLYNAME$16);
            }
            target.setStringValue(pluginTypeFriendlyName);
        }
    }
    
    /**
     * Sets (as xml) the "PluginTypeFriendlyName" element
     */
    public void xsetPluginTypeFriendlyName(org.apache.xmlbeans.XmlString pluginTypeFriendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINTYPEFRIENDLYNAME$16);
            }
            target.set(pluginTypeFriendlyName);
        }
    }
    
    /**
     * Nils the "PluginTypeFriendlyName" element
     */
    public void setNilPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINTYPEFRIENDLYNAME$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PluginTypeFriendlyName" element
     */
    public void unsetPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINTYPEFRIENDLYNAME$16, 0);
        }
    }
    
    /**
     * Gets the "PluginTypeName" element
     */
    public java.lang.String getPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPENAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PluginTypeName" element
     */
    public org.apache.xmlbeans.XmlString xgetPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPENAME$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PluginTypeName" element
     */
    public boolean isNilPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPENAME$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PluginTypeName" element
     */
    public boolean isSetPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINTYPENAME$18) != 0;
        }
    }
    
    /**
     * Sets the "PluginTypeName" element
     */
    public void setPluginTypeName(java.lang.String pluginTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPENAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLUGINTYPENAME$18);
            }
            target.setStringValue(pluginTypeName);
        }
    }
    
    /**
     * Sets (as xml) the "PluginTypeName" element
     */
    public void xsetPluginTypeName(org.apache.xmlbeans.XmlString pluginTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPENAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINTYPENAME$18);
            }
            target.set(pluginTypeName);
        }
    }
    
    /**
     * Nils the "PluginTypeName" element
     */
    public void setNilPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPENAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINTYPENAME$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PluginTypeName" element
     */
    public void unsetPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINTYPENAME$18, 0);
        }
    }
    
    /**
     * Gets the "PrimaryEntityName" element
     */
    public java.lang.String getPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYENTITYNAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrimaryEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYENTITYNAME$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrimaryEntityName" element
     */
    public boolean isNilPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYENTITYNAME$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PrimaryEntityName" element
     */
    public boolean isSetPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYENTITYNAME$20) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryEntityName" element
     */
    public void setPrimaryEntityName(java.lang.String primaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYENTITYNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYENTITYNAME$20);
            }
            target.setStringValue(primaryEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "PrimaryEntityName" element
     */
    public void xsetPrimaryEntityName(org.apache.xmlbeans.XmlString primaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYENTITYNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYENTITYNAME$20);
            }
            target.set(primaryEntityName);
        }
    }
    
    /**
     * Nils the "PrimaryEntityName" element
     */
    public void setNilPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYENTITYNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYENTITYNAME$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PrimaryEntityName" element
     */
    public void unsetPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYENTITYNAME$20, 0);
        }
    }
    
    /**
     * Gets the "SecondaryEntityName" element
     */
    public java.lang.String getSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYENTITYNAME$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecondaryEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDARYENTITYNAME$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SecondaryEntityName" element
     */
    public boolean isNilSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDARYENTITYNAME$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SecondaryEntityName" element
     */
    public boolean isSetSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYENTITYNAME$22) != 0;
        }
    }
    
    /**
     * Sets the "SecondaryEntityName" element
     */
    public void setSecondaryEntityName(java.lang.String secondaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYENTITYNAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYENTITYNAME$22);
            }
            target.setStringValue(secondaryEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "SecondaryEntityName" element
     */
    public void xsetSecondaryEntityName(org.apache.xmlbeans.XmlString secondaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDARYENTITYNAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECONDARYENTITYNAME$22);
            }
            target.set(secondaryEntityName);
        }
    }
    
    /**
     * Nils the "SecondaryEntityName" element
     */
    public void setNilSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDARYENTITYNAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECONDARYENTITYNAME$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SecondaryEntityName" element
     */
    public void unsetSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYENTITYNAME$22, 0);
        }
    }
    
    /**
     * Gets the "Stage" element
     */
    public int getStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGE$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Stage" element
     */
    public org.apache.xmlbeans.XmlInt xgetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STAGE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "Stage" element
     */
    public boolean isSetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STAGE$24) != 0;
        }
    }
    
    /**
     * Sets the "Stage" element
     */
    public void setStage(int stage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STAGE$24);
            }
            target.setIntValue(stage);
        }
    }
    
    /**
     * Sets (as xml) the "Stage" element
     */
    public void xsetStage(org.apache.xmlbeans.XmlInt stage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STAGE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STAGE$24);
            }
            target.set(stage);
        }
    }
    
    /**
     * Unsets the "Stage" element
     */
    public void unsetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STAGE$24, 0);
        }
    }
    
    /**
     * Gets the "SupportedDeployment" element
     */
    public int getSupportedDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDDEPLOYMENT$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportedDeployment" element
     */
    public org.apache.xmlbeans.XmlInt xgetSupportedDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUPPORTEDDEPLOYMENT$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportedDeployment" element
     */
    public boolean isSetSupportedDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTEDDEPLOYMENT$26) != 0;
        }
    }
    
    /**
     * Sets the "SupportedDeployment" element
     */
    public void setSupportedDeployment(int supportedDeployment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDDEPLOYMENT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTEDDEPLOYMENT$26);
            }
            target.setIntValue(supportedDeployment);
        }
    }
    
    /**
     * Sets (as xml) the "SupportedDeployment" element
     */
    public void xsetSupportedDeployment(org.apache.xmlbeans.XmlInt supportedDeployment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUPPORTEDDEPLOYMENT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SUPPORTEDDEPLOYMENT$26);
            }
            target.set(supportedDeployment);
        }
    }
    
    /**
     * Unsets the "SupportedDeployment" element
     */
    public void unsetSupportedDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTEDDEPLOYMENT$26, 0);
        }
    }
}
