/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAccessRights
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRightsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAccessRights(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAccessRightsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRightsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAccessRightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAccessRights");
    
    
    /**
     * Gets the "ArrayOfArrayOfAccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights getArrayOfArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights)get_store().find_element_user(ARRAYOFARRAYOFACCESSRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAccessRights" element
     */
    public boolean isNilArrayOfArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights)get_store().find_element_user(ARRAYOFARRAYOFACCESSRIGHTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAccessRights" element
     */
    public void setArrayOfArrayOfAccessRights(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights arrayOfArrayOfAccessRights)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAccessRights, ARRAYOFARRAYOFACCESSRIGHTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights addNewArrayOfArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights)get_store().add_element_user(ARRAYOFARRAYOFACCESSRIGHTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAccessRights" element
     */
    public void setNilArrayOfArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights)get_store().find_element_user(ARRAYOFARRAYOFACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights)get_store().add_element_user(ARRAYOFARRAYOFACCESSRIGHTS$0);
            }
            target.setNil();
        }
    }
}
