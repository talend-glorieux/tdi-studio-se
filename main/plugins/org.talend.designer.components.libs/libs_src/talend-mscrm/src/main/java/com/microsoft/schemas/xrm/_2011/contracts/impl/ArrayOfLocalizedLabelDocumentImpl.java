/*
 * An XML document type.
 * Localname: ArrayOfLocalizedLabel
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfLocalizedLabel(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfLocalizedLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfLocalizedLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFLOCALIZEDLABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfLocalizedLabel");
    
    
    /**
     * Gets the "ArrayOfLocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel getArrayOfLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel)get_store().find_element_user(ARRAYOFLOCALIZEDLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfLocalizedLabel" element
     */
    public boolean isNilArrayOfLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel)get_store().find_element_user(ARRAYOFLOCALIZEDLABEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfLocalizedLabel" element
     */
    public void setArrayOfLocalizedLabel(com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel arrayOfLocalizedLabel)
    {
        generatedSetterHelperImpl(arrayOfLocalizedLabel, ARRAYOFLOCALIZEDLABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfLocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel addNewArrayOfLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel)get_store().add_element_user(ARRAYOFLOCALIZEDLABEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfLocalizedLabel" element
     */
    public void setNilArrayOfLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel)get_store().find_element_user(ARRAYOFLOCALIZEDLABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLocalizedLabel)get_store().add_element_user(ARRAYOFLOCALIZEDLABEL$0);
            }
            target.setNil();
        }
    }
}
