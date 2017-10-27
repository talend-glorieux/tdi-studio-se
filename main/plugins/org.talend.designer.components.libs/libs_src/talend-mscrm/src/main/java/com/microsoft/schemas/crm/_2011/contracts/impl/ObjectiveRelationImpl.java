/*
 * XML Type:  ObjectiveRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ObjectiveRelation(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ObjectiveRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ObjectiveRelation
{
    private static final long serialVersionUID = 1L;
    
    public ObjectiveRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTIVEEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ObjectiveExpression");
    private static final javax.xml.namespace.QName RESOURCESPECID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceSpecId");
    
    
    /**
     * Gets the "ObjectiveExpression" element
     */
    public java.lang.String getObjectiveExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTIVEEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectiveExpression" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectiveExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTIVEEXPRESSION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ObjectiveExpression" element
     */
    public boolean isNilObjectiveExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTIVEEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ObjectiveExpression" element
     */
    public boolean isSetObjectiveExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIVEEXPRESSION$0) != 0;
        }
    }
    
    /**
     * Sets the "ObjectiveExpression" element
     */
    public void setObjectiveExpression(java.lang.String objectiveExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTIVEEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTIVEEXPRESSION$0);
            }
            target.setStringValue(objectiveExpression);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectiveExpression" element
     */
    public void xsetObjectiveExpression(org.apache.xmlbeans.XmlString objectiveExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTIVEEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTIVEEXPRESSION$0);
            }
            target.set(objectiveExpression);
        }
    }
    
    /**
     * Nils the "ObjectiveExpression" element
     */
    public void setNilObjectiveExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTIVEEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTIVEEXPRESSION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ObjectiveExpression" element
     */
    public void unsetObjectiveExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIVEEXPRESSION$0, 0);
        }
    }
    
    /**
     * Gets the "ResourceSpecId" element
     */
    public java.lang.String getResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESPECID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceSpecId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCESPECID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResourceSpecId" element
     */
    public boolean isSetResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCESPECID$2) != 0;
        }
    }
    
    /**
     * Sets the "ResourceSpecId" element
     */
    public void setResourceSpecId(java.lang.String resourceSpecId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESPECID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCESPECID$2);
            }
            target.setStringValue(resourceSpecId);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceSpecId" element
     */
    public void xsetResourceSpecId(com.microsoft.schemas._2003._10.serialization.Guid resourceSpecId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCESPECID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(RESOURCESPECID$2);
            }
            target.set(resourceSpecId);
        }
    }
    
    /**
     * Unsets the "ResourceSpecId" element
     */
    public void unsetResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCESPECID$2, 0);
        }
    }
}
