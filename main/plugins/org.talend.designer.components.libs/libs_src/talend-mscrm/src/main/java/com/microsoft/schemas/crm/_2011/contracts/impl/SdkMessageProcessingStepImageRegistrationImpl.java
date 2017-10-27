/*
 * XML Type:  SdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML SdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class SdkMessageProcessingStepImageRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration
{
    private static final long serialVersionUID = 1L;
    
    public SdkMessageProcessingStepImageRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Attributes");
    private static final javax.xml.namespace.QName ENTITYALIAS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "EntityAlias");
    private static final javax.xml.namespace.QName IMAGETYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ImageType");
    private static final javax.xml.namespace.QName MESSAGEPROPERTYNAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MessagePropertyName");
    
    
    /**
     * Gets the "Attributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Attributes" element
     */
    public boolean isNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring attributes)
    {
        generatedSetterHelperImpl(attributes, ATTRIBUTES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Attributes" element
     */
    public void setNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, 0);
        }
    }
    
    /**
     * Gets the "EntityAlias" element
     */
    public java.lang.String getEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityAlias" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityAlias" element
     */
    public boolean isNilEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityAlias" element
     */
    public boolean isSetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYALIAS$2) != 0;
        }
    }
    
    /**
     * Sets the "EntityAlias" element
     */
    public void setEntityAlias(java.lang.String entityAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYALIAS$2);
            }
            target.setStringValue(entityAlias);
        }
    }
    
    /**
     * Sets (as xml) the "EntityAlias" element
     */
    public void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYALIAS$2);
            }
            target.set(entityAlias);
        }
    }
    
    /**
     * Nils the "EntityAlias" element
     */
    public void setNilEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYALIAS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityAlias" element
     */
    public void unsetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYALIAS$2, 0);
        }
    }
    
    /**
     * Gets the "ImageType" element
     */
    public int getImageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGETYPE$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImageType" element
     */
    public org.apache.xmlbeans.XmlInt xgetImageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IMAGETYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ImageType" element
     */
    public boolean isSetImageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGETYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "ImageType" element
     */
    public void setImageType(int imageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGETYPE$4);
            }
            target.setIntValue(imageType);
        }
    }
    
    /**
     * Sets (as xml) the "ImageType" element
     */
    public void xsetImageType(org.apache.xmlbeans.XmlInt imageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IMAGETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IMAGETYPE$4);
            }
            target.set(imageType);
        }
    }
    
    /**
     * Unsets the "ImageType" element
     */
    public void unsetImageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGETYPE$4, 0);
        }
    }
    
    /**
     * Gets the "MessagePropertyName" element
     */
    public java.lang.String getMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEPROPERTYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessagePropertyName" element
     */
    public org.apache.xmlbeans.XmlString xgetMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MessagePropertyName" element
     */
    public boolean isNilMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MessagePropertyName" element
     */
    public boolean isSetMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEPROPERTYNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "MessagePropertyName" element
     */
    public void setMessagePropertyName(java.lang.String messagePropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEPROPERTYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEPROPERTYNAME$6);
            }
            target.setStringValue(messagePropertyName);
        }
    }
    
    /**
     * Sets (as xml) the "MessagePropertyName" element
     */
    public void xsetMessagePropertyName(org.apache.xmlbeans.XmlString messagePropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEPROPERTYNAME$6);
            }
            target.set(messagePropertyName);
        }
    }
    
    /**
     * Nils the "MessagePropertyName" element
     */
    public void setNilMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEPROPERTYNAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MessagePropertyName" element
     */
    public void unsetMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEPROPERTYNAME$6, 0);
        }
    }
}
