/*
 * An XML document type.
 * Localname: ArrayOfAttributeTypeDisplayName
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata.impl;
/**
 * A document containing one ArrayOfAttributeTypeDisplayName(@http://schemas.microsoft.com/xrm/2013/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfAttributeTypeDisplayNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeTypeDisplayNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFATTRIBUTETYPEDISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "ArrayOfAttributeTypeDisplayName");
    
    
    /**
     * Gets the "ArrayOfAttributeTypeDisplayName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName getArrayOfAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName)get_store().find_element_user(ARRAYOFATTRIBUTETYPEDISPLAYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAttributeTypeDisplayName" element
     */
    public boolean isNilArrayOfAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName)get_store().find_element_user(ARRAYOFATTRIBUTETYPEDISPLAYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAttributeTypeDisplayName" element
     */
    public void setArrayOfAttributeTypeDisplayName(com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName arrayOfAttributeTypeDisplayName)
    {
        generatedSetterHelperImpl(arrayOfAttributeTypeDisplayName, ARRAYOFATTRIBUTETYPEDISPLAYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAttributeTypeDisplayName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName addNewArrayOfAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName)get_store().add_element_user(ARRAYOFATTRIBUTETYPEDISPLAYNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAttributeTypeDisplayName" element
     */
    public void setNilArrayOfAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName)get_store().find_element_user(ARRAYOFATTRIBUTETYPEDISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName)get_store().add_element_user(ARRAYOFATTRIBUTETYPEDISPLAYNAME$0);
            }
            target.setNil();
        }
    }
}
