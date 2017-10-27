/*
 * XML Type:  ArrayOfOwnershipTypes
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfOwnershipTypes(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfOwnershipTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOwnershipTypes
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOwnershipTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNERSHIPTYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OwnershipTypes");
    
    
    /**
     * Gets array of all "OwnershipTypes" elements
     */
    public java.util.List[] getOwnershipTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWNERSHIPTYPES$0, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OwnershipTypes" element
     */
    public java.util.List getOwnershipTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OwnershipTypes" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes[] xgetOwnershipTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWNERSHIPTYPES$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes[] result = new com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OwnershipTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes xgetOwnershipTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OwnershipTypes" element
     */
    public int sizeOfOwnershipTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERSHIPTYPES$0);
        }
    }
    
    /**
     * Sets array of all "OwnershipTypes" element
     */
    public void setOwnershipTypesArray(java.util.List[] ownershipTypesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ownershipTypesArray, OWNERSHIPTYPES$0);
        }
    }
    
    /**
     * Sets ith "OwnershipTypes" element
     */
    public void setOwnershipTypesArray(int i, java.util.List ownershipTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(ownershipTypes);
        }
    }
    
    /**
     * Sets (as xml) array of all "OwnershipTypes" element
     */
    public void xsetOwnershipTypesArray(com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes[]ownershipTypesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ownershipTypesArray, OWNERSHIPTYPES$0);
        }
    }
    
    /**
     * Sets (as xml) ith "OwnershipTypes" element
     */
    public void xsetOwnershipTypesArray(int i, com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes ownershipTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ownershipTypes);
        }
    }
    
    /**
     * Inserts the value as the ith "OwnershipTypes" element
     */
    public void insertOwnershipTypes(int i, java.util.List ownershipTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OWNERSHIPTYPES$0, i);
            target.setListValue(ownershipTypes);
        }
    }
    
    /**
     * Appends the value as the last "OwnershipTypes" element
     */
    public void addOwnershipTypes(java.util.List ownershipTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPTYPES$0);
            target.setListValue(ownershipTypes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OwnershipTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes insertNewOwnershipTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().insert_element_user(OWNERSHIPTYPES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OwnershipTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes addNewOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().add_element_user(OWNERSHIPTYPES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OwnershipTypes" element
     */
    public void removeOwnershipTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERSHIPTYPES$0, i);
        }
    }
}
