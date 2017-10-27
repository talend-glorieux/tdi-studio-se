/*
 * XML Type:  ArrayOfAttributeRequiredLevel
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfAttributeRequiredLevel(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfAttributeRequiredLevelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeRequiredLevelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEREQUIREDLEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeRequiredLevel");
    
    
    /**
     * Gets array of all "AttributeRequiredLevel" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum[] getAttributeRequiredLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEREQUIREDLEVEL$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum getAttributeRequiredLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AttributeRequiredLevel" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel[] xgetAttributeRequiredLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEREQUIREDLEVEL$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel[] result = new com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel xgetAttributeRequiredLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttributeRequiredLevel" element
     */
    public int sizeOfAttributeRequiredLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEREQUIREDLEVEL$0);
        }
    }
    
    /**
     * Sets array of all "AttributeRequiredLevel" element
     */
    public void setAttributeRequiredLevelArray(com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum[] attributeRequiredLevelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeRequiredLevelArray, ATTRIBUTEREQUIREDLEVEL$0);
        }
    }
    
    /**
     * Sets ith "AttributeRequiredLevel" element
     */
    public void setAttributeRequiredLevelArray(int i, com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum attributeRequiredLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(attributeRequiredLevel);
        }
    }
    
    /**
     * Sets (as xml) array of all "AttributeRequiredLevel" element
     */
    public void xsetAttributeRequiredLevelArray(com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel[]attributeRequiredLevelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeRequiredLevelArray, ATTRIBUTEREQUIREDLEVEL$0);
        }
    }
    
    /**
     * Sets (as xml) ith "AttributeRequiredLevel" element
     */
    public void xsetAttributeRequiredLevelArray(int i, com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel attributeRequiredLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeRequiredLevel);
        }
    }
    
    /**
     * Inserts the value as the ith "AttributeRequiredLevel" element
     */
    public void insertAttributeRequiredLevel(int i, com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum attributeRequiredLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTRIBUTEREQUIREDLEVEL$0, i);
            target.setEnumValue(attributeRequiredLevel);
        }
    }
    
    /**
     * Appends the value as the last "AttributeRequiredLevel" element
     */
    public void addAttributeRequiredLevel(com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum attributeRequiredLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEREQUIREDLEVEL$0);
            target.setEnumValue(attributeRequiredLevel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel insertNewAttributeRequiredLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().insert_element_user(ATTRIBUTEREQUIREDLEVEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel addNewAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().add_element_user(ATTRIBUTEREQUIREDLEVEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeRequiredLevel" element
     */
    public void removeAttributeRequiredLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEREQUIREDLEVEL$0, i);
        }
    }
}
