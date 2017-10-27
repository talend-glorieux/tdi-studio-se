/*
 * An XML document type.
 * Localname: RelationshipType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.RelationshipTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one RelationshipType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class RelationshipTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.RelationshipTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "RelationshipType");
    
    
    /**
     * Gets the "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum getRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType xgetRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RelationshipType" element
     */
    public boolean isNilRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelationshipType" element
     */
    public void setRelationshipType(com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPTYPE$0);
            }
            target.setEnumValue(relationshipType);
        }
    }
    
    /**
     * Sets (as xml) the "RelationshipType" element
     */
    public void xsetRelationshipType(com.microsoft.schemas.xrm._2011.metadata.RelationshipType relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().add_element_user(RELATIONSHIPTYPE$0);
            }
            target.set(relationshipType);
        }
    }
    
    /**
     * Nils the "RelationshipType" element
     */
    public void setNilRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().add_element_user(RELATIONSHIPTYPE$0);
            }
            target.setNil();
        }
    }
}
