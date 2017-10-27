/*
 * XML Type:  ConstraintRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ConstraintRelation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ConstraintRelation(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ConstraintRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ConstraintRelation
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ConstraintType");
    private static final javax.xml.namespace.QName CONSTRAINTS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Constraints");
    private static final javax.xml.namespace.QName OBJECTID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ObjectId");
    
    
    /**
     * Gets the "ConstraintType" element
     */
    public java.lang.String getConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConstraintType" element
     */
    public org.apache.xmlbeans.XmlString xgetConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ConstraintType" element
     */
    public boolean isNilConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ConstraintType" element
     */
    public boolean isSetConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "ConstraintType" element
     */
    public void setConstraintType(java.lang.String constraintType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSTRAINTTYPE$0);
            }
            target.setStringValue(constraintType);
        }
    }
    
    /**
     * Sets (as xml) the "ConstraintType" element
     */
    public void xsetConstraintType(org.apache.xmlbeans.XmlString constraintType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSTRAINTTYPE$0);
            }
            target.set(constraintType);
        }
    }
    
    /**
     * Nils the "ConstraintType" element
     */
    public void setNilConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSTRAINTTYPE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ConstraintType" element
     */
    public void unsetConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Constraints" element
     */
    public java.lang.String getConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Constraints" element
     */
    public org.apache.xmlbeans.XmlString xgetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTS$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Constraints" element
     */
    public boolean isNilConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Constraints" element
     */
    public boolean isSetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTS$2) != 0;
        }
    }
    
    /**
     * Sets the "Constraints" element
     */
    public void setConstraints(java.lang.String constraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSTRAINTS$2);
            }
            target.setStringValue(constraints);
        }
    }
    
    /**
     * Sets (as xml) the "Constraints" element
     */
    public void xsetConstraints(org.apache.xmlbeans.XmlString constraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSTRAINTS$2);
            }
            target.set(constraints);
        }
    }
    
    /**
     * Nils the "Constraints" element
     */
    public void setNilConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRAINTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSTRAINTS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Constraints" element
     */
    public void unsetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTS$2, 0);
        }
    }
    
    /**
     * Gets the "ObjectId" element
     */
    public java.lang.String getObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(OBJECTID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ObjectId" element
     */
    public boolean isSetObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTID$4) != 0;
        }
    }
    
    /**
     * Sets the "ObjectId" element
     */
    public void setObjectId(java.lang.String objectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTID$4);
            }
            target.setStringValue(objectId);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectId" element
     */
    public void xsetObjectId(com.microsoft.schemas._2003._10.serialization.Guid objectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(OBJECTID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(OBJECTID$4);
            }
            target.set(objectId);
        }
    }
    
    /**
     * Unsets the "ObjectId" element
     */
    public void unsetObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTID$4, 0);
        }
    }
}
