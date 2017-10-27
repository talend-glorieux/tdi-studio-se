/*
 * XML Type:  AttributeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AttributeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AttributeAuditDetailImpl extends com.microsoft.schemas.crm._2011.contracts.impl.AuditDetailImpl implements com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public AttributeAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDNEWVALUEATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "InvalidNewValueAttributes");
    private static final javax.xml.namespace.QName NEWVALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "NewValue");
    private static final javax.xml.namespace.QName OLDVALUE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "OldValue");
    private static final javax.xml.namespace.QName DELETEDATTRIBUTES$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "DeletedAttributes");
    private static final javax.xml.namespace.QName LOCLABELLANGUAGECODE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "LocLabelLanguageCode");
    
    
    /**
     * Gets the "InvalidNewValueAttributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getInvalidNewValueAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(INVALIDNEWVALUEATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InvalidNewValueAttributes" element
     */
    public boolean isNilInvalidNewValueAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(INVALIDNEWVALUEATTRIBUTES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "InvalidNewValueAttributes" element
     */
    public boolean isSetInvalidNewValueAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVALIDNEWVALUEATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "InvalidNewValueAttributes" element
     */
    public void setInvalidNewValueAttributes(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring invalidNewValueAttributes)
    {
        generatedSetterHelperImpl(invalidNewValueAttributes, INVALIDNEWVALUEATTRIBUTES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InvalidNewValueAttributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewInvalidNewValueAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(INVALIDNEWVALUEATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Nils the "InvalidNewValueAttributes" element
     */
    public void setNilInvalidNewValueAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(INVALIDNEWVALUEATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(INVALIDNEWVALUEATTRIBUTES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "InvalidNewValueAttributes" element
     */
    public void unsetInvalidNewValueAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVALIDNEWVALUEATTRIBUTES$0, 0);
        }
    }
    
    /**
     * Gets the "NewValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity getNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(NEWVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "NewValue" element
     */
    public boolean isNilNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(NEWVALUE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NewValue" element
     */
    public boolean isSetNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "NewValue" element
     */
    public void setNewValue(com.microsoft.schemas.xrm._2011.contracts.Entity newValue)
    {
        generatedSetterHelperImpl(newValue, NEWVALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "NewValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity addNewNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(NEWVALUE$2);
            return target;
        }
    }
    
    /**
     * Nils the "NewValue" element
     */
    public void setNilNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(NEWVALUE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(NEWVALUE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NewValue" element
     */
    public void unsetNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "OldValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity getOldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(OLDVALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OldValue" element
     */
    public boolean isNilOldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(OLDVALUE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OldValue" element
     */
    public boolean isSetOldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDVALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "OldValue" element
     */
    public void setOldValue(com.microsoft.schemas.xrm._2011.contracts.Entity oldValue)
    {
        generatedSetterHelperImpl(oldValue, OLDVALUE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OldValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity addNewOldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(OLDVALUE$4);
            return target;
        }
    }
    
    /**
     * Nils the "OldValue" element
     */
    public void setNilOldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(OLDVALUE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(OLDVALUE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OldValue" element
     */
    public void unsetOldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDVALUE$4, 0);
        }
    }
    
    /**
     * Gets the "DeletedAttributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring getDeletedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(DELETEDATTRIBUTES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DeletedAttributes" element
     */
    public boolean isNilDeletedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(DELETEDATTRIBUTES$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DeletedAttributes" element
     */
    public boolean isSetDeletedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEDATTRIBUTES$6) != 0;
        }
    }
    
    /**
     * Sets the "DeletedAttributes" element
     */
    public void setDeletedAttributes(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring deletedAttributes)
    {
        generatedSetterHelperImpl(deletedAttributes, DELETEDATTRIBUTES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeletedAttributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring addNewDeletedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().add_element_user(DELETEDATTRIBUTES$6);
            return target;
        }
    }
    
    /**
     * Nils the "DeletedAttributes" element
     */
    public void setNilDeletedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(DELETEDATTRIBUTES$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().add_element_user(DELETEDATTRIBUTES$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DeletedAttributes" element
     */
    public void unsetDeletedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEDATTRIBUTES$6, 0);
        }
    }
    
    /**
     * Gets the "LocLabelLanguageCode" element
     */
    public int getLocLabelLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCLABELLANGUAGECODE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocLabelLanguageCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetLocLabelLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LOCLABELLANGUAGECODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "LocLabelLanguageCode" element
     */
    public boolean isSetLocLabelLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCLABELLANGUAGECODE$8) != 0;
        }
    }
    
    /**
     * Sets the "LocLabelLanguageCode" element
     */
    public void setLocLabelLanguageCode(int locLabelLanguageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCLABELLANGUAGECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCLABELLANGUAGECODE$8);
            }
            target.setIntValue(locLabelLanguageCode);
        }
    }
    
    /**
     * Sets (as xml) the "LocLabelLanguageCode" element
     */
    public void xsetLocLabelLanguageCode(org.apache.xmlbeans.XmlInt locLabelLanguageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LOCLABELLANGUAGECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LOCLABELLANGUAGECODE$8);
            }
            target.set(locLabelLanguageCode);
        }
    }
    
    /**
     * Unsets the "LocLabelLanguageCode" element
     */
    public void unsetLocLabelLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCLABELLANGUAGECODE$8, 0);
        }
    }
}
