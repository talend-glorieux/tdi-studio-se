/*
 * XML Type:  QuickFindResult
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QuickFindResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML QuickFindResult(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class QuickFindResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.QuickFindResult
{
    private static final long serialVersionUID = 1L;
    
    public QuickFindResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Data");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ErrorCode");
    private static final javax.xml.namespace.QName QUERYCOLUMNSET$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QueryColumnSet");
    
    
    /**
     * Gets the "Data" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityCollection getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Data" element
     */
    public boolean isNilData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(DATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$0) != 0;
        }
    }
    
    /**
     * Sets the "Data" element
     */
    public void setData(com.microsoft.schemas.xrm._2011.contracts.EntityCollection data)
    {
        generatedSetterHelperImpl(data, DATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Data" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityCollection addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(DATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "Data" element
     */
    public void setNilData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(DATA$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$0, 0);
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public int getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(int errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$2);
            }
            target.setIntValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRORCODE$2);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$2, 0);
        }
    }
    
    /**
     * Gets the "QueryColumnSet" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getQueryColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(QUERYCOLUMNSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QueryColumnSet" element
     */
    public boolean isNilQueryColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(QUERYCOLUMNSET$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "QueryColumnSet" element
     */
    public boolean isSetQueryColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYCOLUMNSET$4) != 0;
        }
    }
    
    /**
     * Sets the "QueryColumnSet" element
     */
    public void setQueryColumnSet(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring queryColumnSet)
    {
        generatedSetterHelperImpl(queryColumnSet, QUERYCOLUMNSET$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryColumnSet" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewQueryColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(QUERYCOLUMNSET$4);
            return target;
        }
    }
    
    /**
     * Nils the "QueryColumnSet" element
     */
    public void setNilQueryColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(QUERYCOLUMNSET$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(QUERYCOLUMNSET$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "QueryColumnSet" element
     */
    public void unsetQueryColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYCOLUMNSET$4, 0);
        }
    }
}
