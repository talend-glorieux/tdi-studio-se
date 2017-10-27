/*
 * XML Type:  ArrayOfKeyValueOfintstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfKeyValueOfintstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfKeyValueOfintstringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValueOfintstringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEOFINTSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfintstring");
    
    
    /**
     * Gets array of all "KeyValueOfintstring" elements
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring[] getKeyValueOfintstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEOFINTSTRING$0, targetList);
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring[] result = new com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValueOfintstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring getKeyValueOfintstringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring)get_store().find_element_user(KEYVALUEOFINTSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValueOfintstring" element
     */
    public int sizeOfKeyValueOfintstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEOFINTSTRING$0);
        }
    }
    
    /**
     * Sets array of all "KeyValueOfintstring" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValueOfintstringArray(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring[] keyValueOfintstringArray)
    {
        check_orphaned();
        arraySetterHelper(keyValueOfintstringArray, KEYVALUEOFINTSTRING$0);
    }
    
    /**
     * Sets ith "KeyValueOfintstring" element
     */
    public void setKeyValueOfintstringArray(int i, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring keyValueOfintstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring)get_store().find_element_user(KEYVALUEOFINTSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValueOfintstring);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueOfintstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring insertNewKeyValueOfintstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring)get_store().insert_element_user(KEYVALUEOFINTSTRING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueOfintstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring addNewKeyValueOfintstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring)get_store().add_element_user(KEYVALUEOFINTSTRING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValueOfintstring" element
     */
    public void removeKeyValueOfintstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEOFINTSTRING$0, i);
        }
    }
    /**
     * An XML KeyValueOfintstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
     *
     * This is a complex type.
     */
    public static class KeyValueOfintstringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring
    {
        private static final long serialVersionUID = 1L;
        
        public KeyValueOfintstringImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Key");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Value");
        
        
        /**
         * Gets the "Key" element
         */
        public int getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Key" element
         */
        public org.apache.xmlbeans.XmlInt xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(KEY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Key" element
         */
        public void setKey(int key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$0);
                }
                target.setIntValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "Key" element
         */
        public void xsetKey(org.apache.xmlbeans.XmlInt key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Gets the "Value" element
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Value" element
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Value" element
         */
        public boolean isNilValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Value" element
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "Value" element
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Nils the "Value" element
         */
        public void setNilValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                }
                target.setNil();
            }
        }
    }
}
