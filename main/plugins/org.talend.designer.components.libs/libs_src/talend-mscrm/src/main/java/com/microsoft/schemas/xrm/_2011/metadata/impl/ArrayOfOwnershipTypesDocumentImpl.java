/*
 * An XML document type.
 * Localname: ArrayOfOwnershipTypes
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfOwnershipTypes(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfOwnershipTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOwnershipTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOWNERSHIPTYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOwnershipTypes");
    
    
    /**
     * Gets the "ArrayOfOwnershipTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes getArrayOfOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes)get_store().find_element_user(ARRAYOFOWNERSHIPTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOwnershipTypes" element
     */
    public boolean isNilArrayOfOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes)get_store().find_element_user(ARRAYOFOWNERSHIPTYPES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOwnershipTypes" element
     */
    public void setArrayOfOwnershipTypes(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes arrayOfOwnershipTypes)
    {
        generatedSetterHelperImpl(arrayOfOwnershipTypes, ARRAYOFOWNERSHIPTYPES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOwnershipTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes addNewArrayOfOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes)get_store().add_element_user(ARRAYOFOWNERSHIPTYPES$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOwnershipTypes" element
     */
    public void setNilArrayOfOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes)get_store().find_element_user(ARRAYOFOWNERSHIPTYPES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes)get_store().add_element_user(ARRAYOFOWNERSHIPTYPES$0);
            }
            target.setNil();
        }
    }
}
