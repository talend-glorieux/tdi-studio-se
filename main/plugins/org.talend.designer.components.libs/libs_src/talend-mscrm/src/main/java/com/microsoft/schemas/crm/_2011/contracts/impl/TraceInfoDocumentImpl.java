/*
 * An XML document type.
 * Localname: TraceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.TraceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one TraceInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class TraceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.TraceInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public TraceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TraceInfo");
    
    
    /**
     * Gets the "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo getTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TraceInfo" element
     */
    public boolean isNilTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TraceInfo" element
     */
    public void setTraceInfo(com.microsoft.schemas.crm._2011.contracts.TraceInfo traceInfo)
    {
        generatedSetterHelperImpl(traceInfo, TRACEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo addNewTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().add_element_user(TRACEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "TraceInfo" element
     */
    public void setNilTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().add_element_user(TRACEINFO$0);
            }
            target.setNil();
        }
    }
}
