/*
 * XML Type:  ColumnSet
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ColumnSet
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ColumnSet(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ColumnSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ColumnSet
{
    private static final long serialVersionUID = 1L;
    
    public ColumnSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLCOLUMNS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AllColumns");
    private static final javax.xml.namespace.QName COLUMNS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Columns");
    
    
    /**
     * Gets the "AllColumns" element
     */
    public boolean getAllColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLCOLUMNS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllColumns" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLCOLUMNS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AllColumns" element
     */
    public boolean isSetAllColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLCOLUMNS$0) != 0;
        }
    }
    
    /**
     * Sets the "AllColumns" element
     */
    public void setAllColumns(boolean allColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLCOLUMNS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLCOLUMNS$0);
            }
            target.setBooleanValue(allColumns);
        }
    }
    
    /**
     * Sets (as xml) the "AllColumns" element
     */
    public void xsetAllColumns(org.apache.xmlbeans.XmlBoolean allColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLCOLUMNS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ALLCOLUMNS$0);
            }
            target.set(allColumns);
        }
    }
    
    /**
     * Unsets the "AllColumns" element
     */
    public void unsetAllColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLCOLUMNS$0, 0);
        }
    }
    
    /**
     * Gets the "Columns" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(COLUMNS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Columns" element
     */
    public boolean isNilColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(COLUMNS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Columns" element
     */
    public boolean isSetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNS$2) != 0;
        }
    }
    
    /**
     * Sets the "Columns" element
     */
    public void setColumns(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring columns)
    {
        generatedSetterHelperImpl(columns, COLUMNS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Columns" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(COLUMNS$2);
            return target;
        }
    }
    
    /**
     * Nils the "Columns" element
     */
    public void setNilColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(COLUMNS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(COLUMNS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Columns" element
     */
    public void unsetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNS$2, 0);
        }
    }
}
