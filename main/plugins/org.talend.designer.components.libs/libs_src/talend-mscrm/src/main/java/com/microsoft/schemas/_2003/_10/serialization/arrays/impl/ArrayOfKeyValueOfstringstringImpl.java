/*
 * XML Type:  ArrayOfKeyValueOfstringstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfKeyValueOfstringstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfKeyValueOfstringstringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValueOfstringstringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEOFSTRINGSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfstringstring");
    
    
    /**
     * Gets array of all "KeyValueOfstringstring" elements
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring[] getKeyValueOfstringstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEOFSTRINGSTRING$0, targetList);
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring[] result = new com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValueOfstringstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring getKeyValueOfstringstringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring)get_store().find_element_user(KEYVALUEOFSTRINGSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValueOfstringstring" element
     */
    public int sizeOfKeyValueOfstringstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEOFSTRINGSTRING$0);
        }
    }
    
    /**
     * Sets array of all "KeyValueOfstringstring" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValueOfstringstringArray(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring[] keyValueOfstringstringArray)
    {
        check_orphaned();
        arraySetterHelper(keyValueOfstringstringArray, KEYVALUEOFSTRINGSTRING$0);
    }
    
    /**
     * Sets ith "KeyValueOfstringstring" element
     */
    public void setKeyValueOfstringstringArray(int i, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring keyValueOfstringstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring)get_store().find_element_user(KEYVALUEOFSTRINGSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValueOfstringstring);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueOfstringstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring insertNewKeyValueOfstringstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring)get_store().insert_element_user(KEYVALUEOFSTRINGSTRING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueOfstringstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring addNewKeyValueOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring)get_store().add_element_user(KEYVALUEOFSTRINGSTRING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValueOfstringstring" element
     */
    public void removeKeyValueOfstringstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEOFSTRINGSTRING$0, i);
        }
    }
    /**
     * An XML KeyValueOfstringstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
     *
     * This is a complex type.
     */
    public static class KeyValueOfstringstringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring
    {
        private static final long serialVersionUID = 1L;
        
        public KeyValueOfstringstringImpl(org.apache.xmlbeans.SchemaType sType)
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
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Key" element
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Key" element
         */
        public boolean isNilKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Key" element
         */
        public void setKey(java.lang.String key)
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
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "Key" element
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Nils the "Key" element
         */
        public void setNilKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.setNil();
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
