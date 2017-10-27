/*
 * XML Type:  ArrayOfRelationshipType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfRelationshipType(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfRelationshipTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "RelationshipType");
    
    
    /**
     * Gets array of all "RelationshipType" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum[] getRelationshipTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONSHIPTYPE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum getRelationshipTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "RelationshipType" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType[] xgetRelationshipTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONSHIPTYPE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType[] result = new com.microsoft.schemas.xrm._2011.metadata.RelationshipType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType xgetRelationshipTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RelationshipType" element
     */
    public int sizeOfRelationshipTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPTYPE$0);
        }
    }
    
    /**
     * Sets array of all "RelationshipType" element
     */
    public void setRelationshipTypeArray(com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum[] relationshipTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relationshipTypeArray, RELATIONSHIPTYPE$0);
        }
    }
    
    /**
     * Sets ith "RelationshipType" element
     */
    public void setRelationshipTypeArray(int i, com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(relationshipType);
        }
    }
    
    /**
     * Sets (as xml) array of all "RelationshipType" element
     */
    public void xsetRelationshipTypeArray(com.microsoft.schemas.xrm._2011.metadata.RelationshipType[]relationshipTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relationshipTypeArray, RELATIONSHIPTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "RelationshipType" element
     */
    public void xsetRelationshipTypeArray(int i, com.microsoft.schemas.xrm._2011.metadata.RelationshipType relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationshipType);
        }
    }
    
    /**
     * Inserts the value as the ith "RelationshipType" element
     */
    public void insertRelationshipType(int i, com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RELATIONSHIPTYPE$0, i);
            target.setEnumValue(relationshipType);
        }
    }
    
    /**
     * Appends the value as the last "RelationshipType" element
     */
    public void addRelationshipType(com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPTYPE$0);
            target.setEnumValue(relationshipType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType insertNewRelationshipType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().insert_element_user(RELATIONSHIPTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType addNewRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().add_element_user(RELATIONSHIPTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelationshipType" element
     */
    public void removeRelationshipType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPTYPE$0, i);
        }
    }
}
