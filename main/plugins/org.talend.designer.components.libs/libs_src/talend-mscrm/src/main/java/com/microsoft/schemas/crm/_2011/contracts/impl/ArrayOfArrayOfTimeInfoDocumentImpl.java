/*
 * An XML document type.
 * Localname: ArrayOfArrayOfTimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfTimeInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTimeInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfTimeInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFTIMEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTimeInfo");
    
    
    /**
     * Gets the "ArrayOfArrayOfTimeInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo getArrayOfArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo)get_store().find_element_user(ARRAYOFARRAYOFTIMEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfTimeInfo" element
     */
    public boolean isNilArrayOfArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo)get_store().find_element_user(ARRAYOFARRAYOFTIMEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfTimeInfo" element
     */
    public void setArrayOfArrayOfTimeInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo arrayOfArrayOfTimeInfo)
    {
        generatedSetterHelperImpl(arrayOfArrayOfTimeInfo, ARRAYOFARRAYOFTIMEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfTimeInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo addNewArrayOfArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo)get_store().add_element_user(ARRAYOFARRAYOFTIMEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfTimeInfo" element
     */
    public void setNilArrayOfArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo)get_store().find_element_user(ARRAYOFARRAYOFTIMEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeInfo)get_store().add_element_user(ARRAYOFARRAYOFTIMEINFO$0);
            }
            target.setNil();
        }
    }
}
