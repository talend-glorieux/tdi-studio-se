/*
 * An XML document type.
 * Localname: ArrayOfManagedPropertyEvaluationPriority
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriorityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfManagedPropertyEvaluationPriority(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyEvaluationPriorityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriorityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyEvaluationPriorityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMANAGEDPROPERTYEVALUATIONPRIORITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyEvaluationPriority");
    
    
    /**
     * Gets the "ArrayOfManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority getArrayOfManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfManagedPropertyEvaluationPriority" element
     */
    public boolean isNilArrayOfManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfManagedPropertyEvaluationPriority" element
     */
    public void setArrayOfManagedPropertyEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority arrayOfManagedPropertyEvaluationPriority)
    {
        generatedSetterHelperImpl(arrayOfManagedPropertyEvaluationPriority, ARRAYOFMANAGEDPROPERTYEVALUATIONPRIORITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority addNewArrayOfManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYEVALUATIONPRIORITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfManagedPropertyEvaluationPriority" element
     */
    public void setNilArrayOfManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYEVALUATIONPRIORITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYEVALUATIONPRIORITY$0);
            }
            target.setNil();
        }
    }
}
