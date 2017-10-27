/*
 * XML Type:  ArrayOfOptionSetMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfOptionSetMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfOptionSetMetadataBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOptionSetMetadataBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONSETMETADATABASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSetMetadataBase");
    
    
    /**
     * Gets array of all "OptionSetMetadataBase" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase[] getOptionSetMetadataBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONSETMETADATABASE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase[] result = new com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OptionSetMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase getOptionSetMetadataBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().find_element_user(OPTIONSETMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OptionSetMetadataBase" element
     */
    public boolean isNilOptionSetMetadataBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().find_element_user(OPTIONSETMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OptionSetMetadataBase" element
     */
    public int sizeOfOptionSetMetadataBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONSETMETADATABASE$0);
        }
    }
    
    /**
     * Sets array of all "OptionSetMetadataBase" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOptionSetMetadataBaseArray(com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase[] optionSetMetadataBaseArray)
    {
        check_orphaned();
        arraySetterHelper(optionSetMetadataBaseArray, OPTIONSETMETADATABASE$0);
    }
    
    /**
     * Sets ith "OptionSetMetadataBase" element
     */
    public void setOptionSetMetadataBaseArray(int i, com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase optionSetMetadataBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().find_element_user(OPTIONSETMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionSetMetadataBase);
        }
    }
    
    /**
     * Nils the ith "OptionSetMetadataBase" element
     */
    public void setNilOptionSetMetadataBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().find_element_user(OPTIONSETMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OptionSetMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase insertNewOptionSetMetadataBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().insert_element_user(OPTIONSETMETADATABASE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OptionSetMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase addNewOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().add_element_user(OPTIONSETMETADATABASE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OptionSetMetadataBase" element
     */
    public void removeOptionSetMetadataBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONSETMETADATABASE$0, i);
        }
    }
}
