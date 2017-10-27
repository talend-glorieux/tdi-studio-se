/*
 * An XML document type.
 * Localname: BooleanManagedProperty
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.BooleanManagedPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one BooleanManagedProperty(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class BooleanManagedPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.BooleanManagedPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanManagedPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANMANAGEDPROPERTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "BooleanManagedProperty");
    
    
    /**
     * Gets the "BooleanManagedProperty" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getBooleanManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(BOOLEANMANAGEDPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BooleanManagedProperty" element
     */
    public boolean isNilBooleanManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(BOOLEANMANAGEDPROPERTY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BooleanManagedProperty" element
     */
    public void setBooleanManagedProperty(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty booleanManagedProperty)
    {
        generatedSetterHelperImpl(booleanManagedProperty, BOOLEANMANAGEDPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BooleanManagedProperty" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewBooleanManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(BOOLEANMANAGEDPROPERTY$0);
            return target;
        }
    }
    
    /**
     * Nils the "BooleanManagedProperty" element
     */
    public void setNilBooleanManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(BOOLEANMANAGEDPROPERTY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(BOOLEANMANAGEDPROPERTY$0);
            }
            target.setNil();
        }
    }
}
