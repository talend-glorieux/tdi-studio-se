/*
 * XML Type:  LocalizedLabelCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML LocalizedLabelCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class LocalizedLabelCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection
{
    private static final long serialVersionUID = 1L;
    
    public LocalizedLabelCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALIZEDLABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LocalizedLabel");
    
    
    /**
     * Gets array of all "LocalizedLabel" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel[] getLocalizedLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCALIZEDLABEL$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel[] result = new com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel getLocalizedLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(LOCALIZEDLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocalizedLabel" element
     */
    public boolean isNilLocalizedLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(LOCALIZEDLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocalizedLabel" element
     */
    public int sizeOfLocalizedLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALIZEDLABEL$0);
        }
    }
    
    /**
     * Sets array of all "LocalizedLabel" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocalizedLabelArray(com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel[] localizedLabelArray)
    {
        check_orphaned();
        arraySetterHelper(localizedLabelArray, LOCALIZEDLABEL$0);
    }
    
    /**
     * Sets ith "LocalizedLabel" element
     */
    public void setLocalizedLabelArray(int i, com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel localizedLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(LOCALIZEDLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(localizedLabel);
        }
    }
    
    /**
     * Nils the ith "LocalizedLabel" element
     */
    public void setNilLocalizedLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().find_element_user(LOCALIZEDLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel insertNewLocalizedLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().insert_element_user(LOCALIZEDLABEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocalizedLabel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel addNewLocalizedLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel)get_store().add_element_user(LOCALIZEDLABEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocalizedLabel" element
     */
    public void removeLocalizedLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALIZEDLABEL$0, i);
        }
    }
}
