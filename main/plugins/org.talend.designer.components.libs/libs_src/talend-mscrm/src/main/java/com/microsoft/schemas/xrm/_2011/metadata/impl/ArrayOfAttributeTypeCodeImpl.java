/*
 * XML Type:  ArrayOfAttributeTypeCode
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfAttributeTypeCode(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfAttributeTypeCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeTypeCode
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeTypeCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTETYPECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeTypeCode");
    
    
    /**
     * Gets array of all "AttributeTypeCode" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum[] getAttributeTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTETYPECODE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum getAttributeTypeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AttributeTypeCode" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode[] xgetAttributeTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTETYPECODE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode[] result = new com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode xgetAttributeTypeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttributeTypeCode" element
     */
    public int sizeOfAttributeTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTETYPECODE$0);
        }
    }
    
    /**
     * Sets array of all "AttributeTypeCode" element
     */
    public void setAttributeTypeCodeArray(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum[] attributeTypeCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeTypeCodeArray, ATTRIBUTETYPECODE$0);
        }
    }
    
    /**
     * Sets ith "AttributeTypeCode" element
     */
    public void setAttributeTypeCodeArray(int i, com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum attributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(attributeTypeCode);
        }
    }
    
    /**
     * Sets (as xml) array of all "AttributeTypeCode" element
     */
    public void xsetAttributeTypeCodeArray(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode[]attributeTypeCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeTypeCodeArray, ATTRIBUTETYPECODE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "AttributeTypeCode" element
     */
    public void xsetAttributeTypeCodeArray(int i, com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode attributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeTypeCode);
        }
    }
    
    /**
     * Inserts the value as the ith "AttributeTypeCode" element
     */
    public void insertAttributeTypeCode(int i, com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum attributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTRIBUTETYPECODE$0, i);
            target.setEnumValue(attributeTypeCode);
        }
    }
    
    /**
     * Appends the value as the last "AttributeTypeCode" element
     */
    public void addAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum attributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTETYPECODE$0);
            target.setEnumValue(attributeTypeCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode insertNewAttributeTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().insert_element_user(ATTRIBUTETYPECODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode addNewAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().add_element_user(ATTRIBUTETYPECODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeTypeCode" element
     */
    public void removeAttributeTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTETYPECODE$0, i);
        }
    }
}
