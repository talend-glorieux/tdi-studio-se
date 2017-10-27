/*
 * An XML document type.
 * Localname: ArrayOfArrayOfTraceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfTraceInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTraceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfTraceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFTRACEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTraceInfo");
    
    
    /**
     * Gets the "ArrayOfArrayOfTraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo getArrayOfArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo)get_store().find_element_user(ARRAYOFARRAYOFTRACEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfTraceInfo" element
     */
    public boolean isNilArrayOfArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo)get_store().find_element_user(ARRAYOFARRAYOFTRACEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfTraceInfo" element
     */
    public void setArrayOfArrayOfTraceInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo arrayOfArrayOfTraceInfo)
    {
        generatedSetterHelperImpl(arrayOfArrayOfTraceInfo, ARRAYOFARRAYOFTRACEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfTraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo addNewArrayOfArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo)get_store().add_element_user(ARRAYOFARRAYOFTRACEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfTraceInfo" element
     */
    public void setNilArrayOfArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo)get_store().find_element_user(ARRAYOFARRAYOFTRACEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo)get_store().add_element_user(ARRAYOFARRAYOFTRACEINFO$0);
            }
            target.setNil();
        }
    }
}
