/*
 * An XML document type.
 * Localname: ArrayOfTimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfTimeInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfTimeInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfTimeInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTIMEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTimeInfo");
    
    
    /**
     * Gets the "ArrayOfTimeInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo getArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo)get_store().find_element_user(ARRAYOFTIMEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfTimeInfo" element
     */
    public boolean isNilArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo)get_store().find_element_user(ARRAYOFTIMEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfTimeInfo" element
     */
    public void setArrayOfTimeInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo arrayOfTimeInfo)
    {
        generatedSetterHelperImpl(arrayOfTimeInfo, ARRAYOFTIMEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfTimeInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo addNewArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo)get_store().add_element_user(ARRAYOFTIMEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfTimeInfo" element
     */
    public void setNilArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo)get_store().find_element_user(ARRAYOFTIMEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeInfo)get_store().add_element_user(ARRAYOFTIMEINFO$0);
            }
            target.setNil();
        }
    }
}
