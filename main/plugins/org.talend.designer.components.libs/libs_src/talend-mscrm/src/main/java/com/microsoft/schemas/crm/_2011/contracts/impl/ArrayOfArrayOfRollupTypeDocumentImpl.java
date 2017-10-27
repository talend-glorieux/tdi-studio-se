/*
 * An XML document type.
 * Localname: ArrayOfArrayOfRollupType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfRollupType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRollupTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRollupTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFROLLUPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRollupType");
    
    
    /**
     * Gets the "ArrayOfArrayOfRollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType getArrayOfArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType)get_store().find_element_user(ARRAYOFARRAYOFROLLUPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfRollupType" element
     */
    public boolean isNilArrayOfArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType)get_store().find_element_user(ARRAYOFARRAYOFROLLUPTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfRollupType" element
     */
    public void setArrayOfArrayOfRollupType(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType arrayOfArrayOfRollupType)
    {
        generatedSetterHelperImpl(arrayOfArrayOfRollupType, ARRAYOFARRAYOFROLLUPTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfRollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType addNewArrayOfArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType)get_store().add_element_user(ARRAYOFARRAYOFROLLUPTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfRollupType" element
     */
    public void setNilArrayOfArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType)get_store().find_element_user(ARRAYOFARRAYOFROLLUPTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType)get_store().add_element_user(ARRAYOFARRAYOFROLLUPTYPE$0);
            }
            target.setNil();
        }
    }
}
