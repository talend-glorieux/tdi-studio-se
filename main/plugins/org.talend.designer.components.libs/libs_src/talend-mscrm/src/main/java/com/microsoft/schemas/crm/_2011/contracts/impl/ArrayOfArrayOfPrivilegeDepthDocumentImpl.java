/*
 * An XML document type.
 * Localname: ArrayOfArrayOfPrivilegeDepth
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepthDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfPrivilegeDepth(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfPrivilegeDepthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepthDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfPrivilegeDepthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFPRIVILEGEDEPTH$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfPrivilegeDepth");
    
    
    /**
     * Gets the "ArrayOfArrayOfPrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth getArrayOfArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFARRAYOFPRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfPrivilegeDepth" element
     */
    public boolean isNilArrayOfArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFARRAYOFPRIVILEGEDEPTH$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfPrivilegeDepth" element
     */
    public void setArrayOfArrayOfPrivilegeDepth(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth arrayOfArrayOfPrivilegeDepth)
    {
        generatedSetterHelperImpl(arrayOfArrayOfPrivilegeDepth, ARRAYOFARRAYOFPRIVILEGEDEPTH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfPrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth addNewArrayOfArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth)get_store().add_element_user(ARRAYOFARRAYOFPRIVILEGEDEPTH$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfPrivilegeDepth" element
     */
    public void setNilArrayOfArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFARRAYOFPRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth)get_store().add_element_user(ARRAYOFARRAYOFPRIVILEGEDEPTH$0);
            }
            target.setNil();
        }
    }
}
