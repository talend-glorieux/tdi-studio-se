/*
 * An XML document type.
 * Localname: ArrayOfPrivilegeDepth
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepthDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfPrivilegeDepth(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfPrivilegeDepthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepthDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfPrivilegeDepthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRIVILEGEDEPTH$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPrivilegeDepth");
    
    
    /**
     * Gets the "ArrayOfPrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth getArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFPRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfPrivilegeDepth" element
     */
    public boolean isNilArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFPRIVILEGEDEPTH$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfPrivilegeDepth" element
     */
    public void setArrayOfPrivilegeDepth(com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth arrayOfPrivilegeDepth)
    {
        generatedSetterHelperImpl(arrayOfPrivilegeDepth, ARRAYOFPRIVILEGEDEPTH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfPrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth addNewArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().add_element_user(ARRAYOFPRIVILEGEDEPTH$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfPrivilegeDepth" element
     */
    public void setNilArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFPRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().add_element_user(ARRAYOFPRIVILEGEDEPTH$0);
            }
            target.setNil();
        }
    }
}
