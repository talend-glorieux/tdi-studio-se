/*
 * An XML document type.
 * Localname: ConstraintRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ConstraintRelationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ConstraintRelation(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ConstraintRelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ConstraintRelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintRelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTRELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ConstraintRelation");
    
    
    /**
     * Gets the "ConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ConstraintRelation getConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().find_element_user(CONSTRAINTRELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ConstraintRelation" element
     */
    public boolean isNilConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().find_element_user(CONSTRAINTRELATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ConstraintRelation" element
     */
    public void setConstraintRelation(com.microsoft.schemas.crm._2011.contracts.ConstraintRelation constraintRelation)
    {
        generatedSetterHelperImpl(constraintRelation, CONSTRAINTRELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ConstraintRelation addNewConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().add_element_user(CONSTRAINTRELATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ConstraintRelation" element
     */
    public void setNilConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().find_element_user(CONSTRAINTRELATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().add_element_user(CONSTRAINTRELATION$0);
            }
            target.setNil();
        }
    }
}
