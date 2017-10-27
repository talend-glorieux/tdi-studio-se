/*
 * An XML document type.
 * Localname: ObjectiveRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ObjectiveRelationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ObjectiveRelation(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ObjectiveRelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ObjectiveRelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectiveRelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTIVERELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ObjectiveRelation");
    
    
    /**
     * Gets the "ObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation getObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation)get_store().find_element_user(OBJECTIVERELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ObjectiveRelation" element
     */
    public boolean isNilObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation)get_store().find_element_user(OBJECTIVERELATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ObjectiveRelation" element
     */
    public void setObjectiveRelation(com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation objectiveRelation)
    {
        generatedSetterHelperImpl(objectiveRelation, OBJECTIVERELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation addNewObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation)get_store().add_element_user(OBJECTIVERELATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ObjectiveRelation" element
     */
    public void setNilObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation)get_store().find_element_user(OBJECTIVERELATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation)get_store().add_element_user(OBJECTIVERELATION$0);
            }
            target.setNil();
        }
    }
}
