/*
 * An XML document type.
 * Localname: Relationship
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.RelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one Relationship(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.RelationshipDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Relationship");
    
    
    /**
     * Gets the "Relationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Relationship getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Relationship" element
     */
    public boolean isNilRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Relationship" element
     */
    public void setRelationship(com.microsoft.schemas.xrm._2011.contracts.Relationship relationship)
    {
        generatedSetterHelperImpl(relationship, RELATIONSHIP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Relationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Relationship addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().add_element_user(RELATIONSHIP$0);
            return target;
        }
    }
    
    /**
     * Nils the "Relationship" element
     */
    public void setNilRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().add_element_user(RELATIONSHIP$0);
            }
            target.setNil();
        }
    }
}
