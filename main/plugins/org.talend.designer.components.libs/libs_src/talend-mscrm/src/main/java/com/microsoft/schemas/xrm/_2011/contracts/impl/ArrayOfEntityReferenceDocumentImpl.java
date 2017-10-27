/*
 * An XML document type.
 * Localname: ArrayOfEntityReference
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfEntityReference(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfEntityReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfEntityReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFENTITYREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfEntityReference");
    
    
    /**
     * Gets the "ArrayOfEntityReference" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference getArrayOfEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().find_element_user(ARRAYOFENTITYREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfEntityReference" element
     */
    public boolean isNilArrayOfEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().find_element_user(ARRAYOFENTITYREFERENCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfEntityReference" element
     */
    public void setArrayOfEntityReference(com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference arrayOfEntityReference)
    {
        generatedSetterHelperImpl(arrayOfEntityReference, ARRAYOFENTITYREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfEntityReference" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference addNewArrayOfEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().add_element_user(ARRAYOFENTITYREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfEntityReference" element
     */
    public void setNilArrayOfEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().find_element_user(ARRAYOFENTITYREFERENCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference)get_store().add_element_user(ARRAYOFENTITYREFERENCE$0);
            }
            target.setNil();
        }
    }
}
