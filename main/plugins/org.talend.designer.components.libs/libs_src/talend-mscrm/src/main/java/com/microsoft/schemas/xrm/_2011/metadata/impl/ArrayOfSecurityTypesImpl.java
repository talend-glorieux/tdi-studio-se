/*
 * XML Type:  ArrayOfSecurityTypes
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfSecurityTypes(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfSecurityTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSecurityTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYTYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SecurityTypes");
    
    
    /**
     * Gets array of all "SecurityTypes" elements
     */
    public java.util.List[] getSecurityTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECURITYTYPES$0, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SecurityTypes" element
     */
    public java.util.List getSecurityTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SecurityTypes" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityTypes[] xgetSecurityTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECURITYTYPES$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes[] result = new com.microsoft.schemas.xrm._2011.metadata.SecurityTypes[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SecurityTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityTypes xgetSecurityTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecurityTypes" element
     */
    public int sizeOfSecurityTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYTYPES$0);
        }
    }
    
    /**
     * Sets array of all "SecurityTypes" element
     */
    public void setSecurityTypesArray(java.util.List[] securityTypesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityTypesArray, SECURITYTYPES$0);
        }
    }
    
    /**
     * Sets ith "SecurityTypes" element
     */
    public void setSecurityTypesArray(int i, java.util.List securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(securityTypes);
        }
    }
    
    /**
     * Sets (as xml) array of all "SecurityTypes" element
     */
    public void xsetSecurityTypesArray(com.microsoft.schemas.xrm._2011.metadata.SecurityTypes[]securityTypesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityTypesArray, SECURITYTYPES$0);
        }
    }
    
    /**
     * Sets (as xml) ith "SecurityTypes" element
     */
    public void xsetSecurityTypesArray(int i, com.microsoft.schemas.xrm._2011.metadata.SecurityTypes securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityTypes);
        }
    }
    
    /**
     * Inserts the value as the ith "SecurityTypes" element
     */
    public void insertSecurityTypes(int i, java.util.List securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SECURITYTYPES$0, i);
            target.setListValue(securityTypes);
        }
    }
    
    /**
     * Appends the value as the last "SecurityTypes" element
     */
    public void addSecurityTypes(java.util.List securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYTYPES$0);
            target.setListValue(securityTypes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecurityTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityTypes insertNewSecurityTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().insert_element_user(SECURITYTYPES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecurityTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityTypes addNewSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().add_element_user(SECURITYTYPES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecurityTypes" element
     */
    public void removeSecurityTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYTYPES$0, i);
        }
    }
}
