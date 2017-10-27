/*
 * An XML document type.
 * Localname: ArrayOfArrayOfConstraintRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfConstraintRelation(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfConstraintRelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfConstraintRelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFCONSTRAINTRELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfConstraintRelation");
    
    
    /**
     * Gets the "ArrayOfArrayOfConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation getArrayOfArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFARRAYOFCONSTRAINTRELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfConstraintRelation" element
     */
    public boolean isNilArrayOfArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFARRAYOFCONSTRAINTRELATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfConstraintRelation" element
     */
    public void setArrayOfArrayOfConstraintRelation(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation arrayOfArrayOfConstraintRelation)
    {
        generatedSetterHelperImpl(arrayOfArrayOfConstraintRelation, ARRAYOFARRAYOFCONSTRAINTRELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation addNewArrayOfArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation)get_store().add_element_user(ARRAYOFARRAYOFCONSTRAINTRELATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfConstraintRelation" element
     */
    public void setNilArrayOfArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFARRAYOFCONSTRAINTRELATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation)get_store().add_element_user(ARRAYOFARRAYOFCONSTRAINTRELATION$0);
            }
            target.setNil();
        }
    }
}
