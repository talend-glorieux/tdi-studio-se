/*
 * An XML document type.
 * Localname: ArrayOfConstraintRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfConstraintRelation(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfConstraintRelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfConstraintRelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCONSTRAINTRELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfConstraintRelation");
    
    
    /**
     * Gets the "ArrayOfConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation getArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFCONSTRAINTRELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfConstraintRelation" element
     */
    public boolean isNilArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFCONSTRAINTRELATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfConstraintRelation" element
     */
    public void setArrayOfConstraintRelation(com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation arrayOfConstraintRelation)
    {
        generatedSetterHelperImpl(arrayOfConstraintRelation, ARRAYOFCONSTRAINTRELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation addNewArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().add_element_user(ARRAYOFCONSTRAINTRELATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfConstraintRelation" element
     */
    public void setNilArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFCONSTRAINTRELATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().add_element_user(ARRAYOFCONSTRAINTRELATION$0);
            }
            target.setNil();
        }
    }
}
