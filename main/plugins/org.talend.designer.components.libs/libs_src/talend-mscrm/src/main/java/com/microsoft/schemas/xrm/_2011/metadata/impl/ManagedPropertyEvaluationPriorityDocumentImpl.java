/*
 * An XML document type.
 * Localname: ManagedPropertyEvaluationPriority
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriorityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ManagedPropertyEvaluationPriority(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ManagedPropertyEvaluationPriorityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriorityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyEvaluationPriorityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYEVALUATIONPRIORITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyEvaluationPriority");
    
    
    /**
     * Gets the "ManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum getManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority xgetManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyEvaluationPriority" element
     */
    public boolean isNilManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManagedPropertyEvaluationPriority" element
     */
    public void setManagedPropertyEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum managedPropertyEvaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0);
            }
            target.setEnumValue(managedPropertyEvaluationPriority);
        }
    }
    
    /**
     * Sets (as xml) the "ManagedPropertyEvaluationPriority" element
     */
    public void xsetManagedPropertyEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority managedPropertyEvaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().add_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0);
            }
            target.set(managedPropertyEvaluationPriority);
        }
    }
    
    /**
     * Nils the "ManagedPropertyEvaluationPriority" element
     */
    public void setNilManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().add_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0);
            }
            target.setNil();
        }
    }
}
