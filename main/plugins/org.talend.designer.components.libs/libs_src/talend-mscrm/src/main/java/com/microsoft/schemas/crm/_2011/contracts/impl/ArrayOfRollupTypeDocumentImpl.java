/*
 * An XML document type.
 * Localname: ArrayOfRollupType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfRollupType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfRollupTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRollupTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFROLLUPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRollupType");
    
    
    /**
     * Gets the "ArrayOfRollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType getArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().find_element_user(ARRAYOFROLLUPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRollupType" element
     */
    public boolean isNilArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().find_element_user(ARRAYOFROLLUPTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRollupType" element
     */
    public void setArrayOfRollupType(com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType arrayOfRollupType)
    {
        generatedSetterHelperImpl(arrayOfRollupType, ARRAYOFROLLUPTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType addNewArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().add_element_user(ARRAYOFROLLUPTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRollupType" element
     */
    public void setNilArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().find_element_user(ARRAYOFROLLUPTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().add_element_user(ARRAYOFROLLUPTYPE$0);
            }
            target.setNil();
        }
    }
}
