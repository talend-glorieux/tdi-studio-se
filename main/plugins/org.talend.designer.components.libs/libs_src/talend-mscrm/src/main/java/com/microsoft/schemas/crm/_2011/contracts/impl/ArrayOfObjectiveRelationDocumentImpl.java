/*
 * An XML document type.
 * Localname: ArrayOfObjectiveRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfObjectiveRelation(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfObjectiveRelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfObjectiveRelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOBJECTIVERELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfObjectiveRelation");
    
    
    /**
     * Gets the "ArrayOfObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation getArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFOBJECTIVERELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfObjectiveRelation" element
     */
    public boolean isNilArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFOBJECTIVERELATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfObjectiveRelation" element
     */
    public void setArrayOfObjectiveRelation(com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation arrayOfObjectiveRelation)
    {
        generatedSetterHelperImpl(arrayOfObjectiveRelation, ARRAYOFOBJECTIVERELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation addNewArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().add_element_user(ARRAYOFOBJECTIVERELATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfObjectiveRelation" element
     */
    public void setNilArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFOBJECTIVERELATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().add_element_user(ARRAYOFOBJECTIVERELATION$0);
            }
            target.setNil();
        }
    }
}
