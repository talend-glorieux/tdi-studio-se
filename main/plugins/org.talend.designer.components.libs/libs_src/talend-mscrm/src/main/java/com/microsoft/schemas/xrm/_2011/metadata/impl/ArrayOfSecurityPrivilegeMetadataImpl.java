/*
 * XML Type:  ArrayOfSecurityPrivilegeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfSecurityPrivilegeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfSecurityPrivilegeMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSecurityPrivilegeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYPRIVILEGEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SecurityPrivilegeMetadata");
    
    
    /**
     * Gets array of all "SecurityPrivilegeMetadata" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata[] getSecurityPrivilegeMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECURITYPRIVILEGEMETADATA$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata[] result = new com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecurityPrivilegeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata getSecurityPrivilegeMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().find_element_user(SECURITYPRIVILEGEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SecurityPrivilegeMetadata" element
     */
    public boolean isNilSecurityPrivilegeMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().find_element_user(SECURITYPRIVILEGEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SecurityPrivilegeMetadata" element
     */
    public int sizeOfSecurityPrivilegeMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYPRIVILEGEMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "SecurityPrivilegeMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecurityPrivilegeMetadataArray(com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata[] securityPrivilegeMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(securityPrivilegeMetadataArray, SECURITYPRIVILEGEMETADATA$0);
    }
    
    /**
     * Sets ith "SecurityPrivilegeMetadata" element
     */
    public void setSecurityPrivilegeMetadataArray(int i, com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata securityPrivilegeMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().find_element_user(SECURITYPRIVILEGEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityPrivilegeMetadata);
        }
    }
    
    /**
     * Nils the ith "SecurityPrivilegeMetadata" element
     */
    public void setNilSecurityPrivilegeMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().find_element_user(SECURITYPRIVILEGEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecurityPrivilegeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata insertNewSecurityPrivilegeMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().insert_element_user(SECURITYPRIVILEGEMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecurityPrivilegeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata addNewSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().add_element_user(SECURITYPRIVILEGEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecurityPrivilegeMetadata" element
     */
    public void removeSecurityPrivilegeMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYPRIVILEGEMETADATA$0, i);
        }
    }
}
