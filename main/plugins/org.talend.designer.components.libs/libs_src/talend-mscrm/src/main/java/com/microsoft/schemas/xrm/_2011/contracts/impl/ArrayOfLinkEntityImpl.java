/*
 * XML Type:  ArrayOfLinkEntity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfLinkEntity(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfLinkEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfLinkEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkEntity");
    
    
    /**
     * Gets array of all "LinkEntity" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.LinkEntity[] getLinkEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKENTITY$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity[] result = new com.microsoft.schemas.xrm._2011.contracts.LinkEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LinkEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LinkEntity getLinkEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().find_element_user(LINKENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LinkEntity" element
     */
    public boolean isNilLinkEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().find_element_user(LINKENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LinkEntity" element
     */
    public int sizeOfLinkEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKENTITY$0);
        }
    }
    
    /**
     * Sets array of all "LinkEntity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkEntityArray(com.microsoft.schemas.xrm._2011.contracts.LinkEntity[] linkEntityArray)
    {
        check_orphaned();
        arraySetterHelper(linkEntityArray, LINKENTITY$0);
    }
    
    /**
     * Sets ith "LinkEntity" element
     */
    public void setLinkEntityArray(int i, com.microsoft.schemas.xrm._2011.contracts.LinkEntity linkEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().find_element_user(LINKENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkEntity);
        }
    }
    
    /**
     * Nils the ith "LinkEntity" element
     */
    public void setNilLinkEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().find_element_user(LINKENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LinkEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LinkEntity insertNewLinkEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().insert_element_user(LINKENTITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LinkEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LinkEntity addNewLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().add_element_user(LINKENTITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LinkEntity" element
     */
    public void removeLinkEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKENTITY$0, i);
        }
    }
}
