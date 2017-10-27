/*
 * An XML document type.
 * Localname: ArrayOfAttributeTypeCode
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfAttributeTypeCode(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfAttributeTypeCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFATTRIBUTETYPECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfAttributeTypeCode");
    
    
    /**
     * Gets the "ArrayOfAttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode getArrayOfAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode)get_store().find_element_user(ARRAYOFATTRIBUTETYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAttributeTypeCode" element
     */
    public boolean isNilArrayOfAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode)get_store().find_element_user(ARRAYOFATTRIBUTETYPECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAttributeTypeCode" element
     */
    public void setArrayOfAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode arrayOfAttributeTypeCode)
    {
        generatedSetterHelperImpl(arrayOfAttributeTypeCode, ARRAYOFATTRIBUTETYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode addNewArrayOfAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode)get_store().add_element_user(ARRAYOFATTRIBUTETYPECODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAttributeTypeCode" element
     */
    public void setNilArrayOfAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode)get_store().find_element_user(ARRAYOFATTRIBUTETYPECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode)get_store().add_element_user(ARRAYOFATTRIBUTETYPECODE$0);
            }
            target.setNil();
        }
    }
}
