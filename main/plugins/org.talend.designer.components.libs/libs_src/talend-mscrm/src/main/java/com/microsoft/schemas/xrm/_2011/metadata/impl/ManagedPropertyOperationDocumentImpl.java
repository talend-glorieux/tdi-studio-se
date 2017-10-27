/*
 * An XML document type.
 * Localname: ManagedPropertyOperation
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ManagedPropertyOperation(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ManagedPropertyOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYOPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyOperation");
    
    
    /**
     * Gets the "ManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum getManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation xgetManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyOperation" element
     */
    public boolean isNilManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManagedPropertyOperation" element
     */
    public void setManagedPropertyOperation(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum managedPropertyOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYOPERATION$0);
            }
            target.setEnumValue(managedPropertyOperation);
        }
    }
    
    /**
     * Sets (as xml) the "ManagedPropertyOperation" element
     */
    public void xsetManagedPropertyOperation(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation managedPropertyOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().add_element_user(MANAGEDPROPERTYOPERATION$0);
            }
            target.set(managedPropertyOperation);
        }
    }
    
    /**
     * Nils the "ManagedPropertyOperation" element
     */
    public void setNilManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().add_element_user(MANAGEDPROPERTYOPERATION$0);
            }
            target.setNil();
        }
    }
}
