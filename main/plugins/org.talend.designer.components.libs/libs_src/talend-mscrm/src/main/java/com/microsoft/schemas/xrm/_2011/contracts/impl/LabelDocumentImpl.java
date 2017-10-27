/*
 * An XML document type.
 * Localname: Label
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one Label(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class LabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.LabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Label");
    
    
    /**
     * Gets the "Label" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Label" element
     */
    public boolean isNilLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(com.microsoft.schemas.xrm._2011.contracts.Label label)
    {
        generatedSetterHelperImpl(label, LABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Label" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(LABEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "Label" element
     */
    public void setNilLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(LABEL$0);
            }
            target.setNil();
        }
    }
}
