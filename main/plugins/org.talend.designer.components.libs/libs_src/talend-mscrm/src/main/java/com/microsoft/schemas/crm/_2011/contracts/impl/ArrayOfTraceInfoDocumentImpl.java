/*
 * An XML document type.
 * Localname: ArrayOfTraceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfTraceInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfTraceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfTraceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTRACEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTraceInfo");
    
    
    /**
     * Gets the "ArrayOfTraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo getArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().find_element_user(ARRAYOFTRACEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfTraceInfo" element
     */
    public boolean isNilArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().find_element_user(ARRAYOFTRACEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfTraceInfo" element
     */
    public void setArrayOfTraceInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo arrayOfTraceInfo)
    {
        generatedSetterHelperImpl(arrayOfTraceInfo, ARRAYOFTRACEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfTraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo addNewArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().add_element_user(ARRAYOFTRACEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfTraceInfo" element
     */
    public void setNilArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().find_element_user(ARRAYOFTRACEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().add_element_user(ARRAYOFTRACEINFO$0);
            }
            target.setNil();
        }
    }
}
