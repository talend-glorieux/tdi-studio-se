/*
 * An XML document type.
 * Localname: LocalizedLabel
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one LocalizedLabel(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class LocalizedLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocalizedLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALIZEDLABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LocalizedLabel");
    
    
    /**
     * Gets the "LocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel getLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(LOCALIZEDLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocalizedLabel" element
     */
    public boolean isNilLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(LOCALIZEDLABEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocalizedLabel" element
     */
    public void setLocalizedLabel(com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel localizedLabel)
    {
        generatedSetterHelperImpl(localizedLabel, LOCALIZEDLABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel addNewLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().add_element_user(LOCALIZEDLABEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocalizedLabel" element
     */
    public void setNilLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(LOCALIZEDLABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().add_element_user(LOCALIZEDLABEL$0);
            }
            target.setNil();
        }
    }
}
