/*
 * An XML document type.
 * Localname: ArrayOfArrayOfObjectiveRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfObjectiveRelation(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfObjectiveRelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfObjectiveRelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFOBJECTIVERELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfObjectiveRelation");
    
    
    /**
     * Gets the "ArrayOfArrayOfObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation getArrayOfArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFARRAYOFOBJECTIVERELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfObjectiveRelation" element
     */
    public boolean isNilArrayOfArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFARRAYOFOBJECTIVERELATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfObjectiveRelation" element
     */
    public void setArrayOfArrayOfObjectiveRelation(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation arrayOfArrayOfObjectiveRelation)
    {
        generatedSetterHelperImpl(arrayOfArrayOfObjectiveRelation, ARRAYOFARRAYOFOBJECTIVERELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation addNewArrayOfArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation)get_store().add_element_user(ARRAYOFARRAYOFOBJECTIVERELATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfObjectiveRelation" element
     */
    public void setNilArrayOfArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFARRAYOFOBJECTIVERELATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation)get_store().add_element_user(ARRAYOFARRAYOFOBJECTIVERELATION$0);
            }
            target.setNil();
        }
    }
}
