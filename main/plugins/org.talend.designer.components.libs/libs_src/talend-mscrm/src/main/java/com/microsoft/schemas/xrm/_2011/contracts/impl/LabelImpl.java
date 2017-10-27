/*
 * XML Type:  Label
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.Label
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML Label(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class LabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.Label
{
    private static final long serialVersionUID = 1L;
    
    public LabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALIZEDLABELS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LocalizedLabels");
    private static final javax.xml.namespace.QName USERLOCALIZEDLABEL$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "UserLocalizedLabel");
    
    
    /**
     * Gets the "LocalizedLabels" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection getLocalizedLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().find_element_user(LOCALIZEDLABELS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocalizedLabels" element
     */
    public boolean isNilLocalizedLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().find_element_user(LOCALIZEDLABELS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LocalizedLabels" element
     */
    public boolean isSetLocalizedLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALIZEDLABELS$0) != 0;
        }
    }
    
    /**
     * Sets the "LocalizedLabels" element
     */
    public void setLocalizedLabels(com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection localizedLabels)
    {
        generatedSetterHelperImpl(localizedLabels, LOCALIZEDLABELS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocalizedLabels" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection addNewLocalizedLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().add_element_user(LOCALIZEDLABELS$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocalizedLabels" element
     */
    public void setNilLocalizedLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().find_element_user(LOCALIZEDLABELS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().add_element_user(LOCALIZEDLABELS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LocalizedLabels" element
     */
    public void unsetLocalizedLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALIZEDLABELS$0, 0);
        }
    }
    
    /**
     * Gets the "UserLocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel getUserLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(USERLOCALIZEDLABEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "UserLocalizedLabel" element
     */
    public boolean isNilUserLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(USERLOCALIZEDLABEL$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "UserLocalizedLabel" element
     */
    public boolean isSetUserLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERLOCALIZEDLABEL$2) != 0;
        }
    }
    
    /**
     * Sets the "UserLocalizedLabel" element
     */
    public void setUserLocalizedLabel(com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel userLocalizedLabel)
    {
        generatedSetterHelperImpl(userLocalizedLabel, USERLOCALIZEDLABEL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UserLocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel addNewUserLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().add_element_user(USERLOCALIZEDLABEL$2);
            return target;
        }
    }
    
    /**
     * Nils the "UserLocalizedLabel" element
     */
    public void setNilUserLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(USERLOCALIZEDLABEL$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().add_element_user(USERLOCALIZEDLABEL$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "UserLocalizedLabel" element
     */
    public void unsetUserLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERLOCALIZEDLABEL$2, 0);
        }
    }
}
