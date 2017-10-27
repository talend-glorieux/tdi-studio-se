/*
 * An XML document type.
 * Localname: ArrayOfAccessRights
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRightsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAccessRights(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAccessRightsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRightsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAccessRightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAccessRights");
    
    
    /**
     * Gets the "ArrayOfAccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights getArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().find_element_user(ARRAYOFACCESSRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAccessRights" element
     */
    public boolean isNilArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().find_element_user(ARRAYOFACCESSRIGHTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAccessRights" element
     */
    public void setArrayOfAccessRights(com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights arrayOfAccessRights)
    {
        generatedSetterHelperImpl(arrayOfAccessRights, ARRAYOFACCESSRIGHTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights addNewArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().add_element_user(ARRAYOFACCESSRIGHTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAccessRights" element
     */
    public void setNilArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().find_element_user(ARRAYOFACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().add_element_user(ARRAYOFACCESSRIGHTS$0);
            }
            target.setNil();
        }
    }
}
