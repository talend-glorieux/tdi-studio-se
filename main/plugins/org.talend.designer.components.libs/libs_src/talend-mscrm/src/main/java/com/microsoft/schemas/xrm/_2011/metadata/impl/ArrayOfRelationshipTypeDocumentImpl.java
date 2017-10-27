/*
 * An XML document type.
 * Localname: ArrayOfRelationshipType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfRelationshipType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfRelationshipTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelationshipTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRELATIONSHIPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfRelationshipType");
    
    
    /**
     * Gets the "ArrayOfRelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType getArrayOfRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType)get_store().find_element_user(ARRAYOFRELATIONSHIPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRelationshipType" element
     */
    public boolean isNilArrayOfRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType)get_store().find_element_user(ARRAYOFRELATIONSHIPTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRelationshipType" element
     */
    public void setArrayOfRelationshipType(com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType arrayOfRelationshipType)
    {
        generatedSetterHelperImpl(arrayOfRelationshipType, ARRAYOFRELATIONSHIPTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType addNewArrayOfRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType)get_store().add_element_user(ARRAYOFRELATIONSHIPTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRelationshipType" element
     */
    public void setNilArrayOfRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType)get_store().find_element_user(ARRAYOFRELATIONSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType)get_store().add_element_user(ARRAYOFRELATIONSHIPTYPE$0);
            }
            target.setNil();
        }
    }
}
