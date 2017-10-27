/*
 * XML Type:  RelationshipAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML RelationshipAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class RelationshipAuditDetailImpl extends com.microsoft.schemas.crm._2011.contracts.impl.AuditDetailImpl implements com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RelationshipName");
    private static final javax.xml.namespace.QName TARGETRECORDS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TargetRecords");
    
    
    /**
     * Gets the "RelationshipName" element
     */
    public java.lang.String getRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelationshipName" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RelationshipName" element
     */
    public boolean isNilRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RelationshipName" element
     */
    public boolean isSetRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "RelationshipName" element
     */
    public void setRelationshipName(java.lang.String relationshipName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPNAME$0);
            }
            target.setStringValue(relationshipName);
        }
    }
    
    /**
     * Sets (as xml) the "RelationshipName" element
     */
    public void xsetRelationshipName(org.apache.xmlbeans.XmlString relationshipName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONSHIPNAME$0);
            }
            target.set(relationshipName);
        }
    }
    
    /**
     * Nils the "RelationshipName" element
     */
    public void setNilRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONSHIPNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RelationshipName" element
     */
    public void unsetRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPNAME$0, 0);
        }
    }
    
    /**
     * Gets the "TargetRecords" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference getTargetRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().find_element_user(TARGETRECORDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TargetRecords" element
     */
    public boolean isNilTargetRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().find_element_user(TARGETRECORDS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TargetRecords" element
     */
    public boolean isSetTargetRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETRECORDS$2) != 0;
        }
    }
    
    /**
     * Sets the "TargetRecords" element
     */
    public void setTargetRecords(com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference targetRecords)
    {
        generatedSetterHelperImpl(targetRecords, TARGETRECORDS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TargetRecords" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference addNewTargetRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().add_element_user(TARGETRECORDS$2);
            return target;
        }
    }
    
    /**
     * Nils the "TargetRecords" element
     */
    public void setNilTargetRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().find_element_user(TARGETRECORDS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().add_element_user(TARGETRECORDS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TargetRecords" element
     */
    public void unsetTargetRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETRECORDS$2, 0);
        }
    }
}
