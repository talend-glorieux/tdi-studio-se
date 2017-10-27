/*
 * XML Type:  ResetSyncStateInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ResetSyncStateInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ResetSyncStateInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo
{
    private static final long serialVersionUID = 1L;
    
    public ResetSyncStateInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYIDS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "EntityIds");
    private static final javax.xml.namespace.QName OBJECTTYPECODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ObjectTypeCode");
    
    
    /**
     * Gets the "EntityIds" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid getEntityIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(ENTITYIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityIds" element
     */
    public boolean isNilEntityIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(ENTITYIDS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityIds" element
     */
    public boolean isSetEntityIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYIDS$0) != 0;
        }
    }
    
    /**
     * Sets the "EntityIds" element
     */
    public void setEntityIds(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid entityIds)
    {
        generatedSetterHelperImpl(entityIds, ENTITYIDS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityIds" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid addNewEntityIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(ENTITYIDS$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityIds" element
     */
    public void setNilEntityIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(ENTITYIDS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(ENTITYIDS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityIds" element
     */
    public void unsetEntityIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYIDS$0, 0);
        }
    }
    
    /**
     * Gets the "ObjectTypeCode" element
     */
    public int getObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPECODE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectTypeCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OBJECTTYPECODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ObjectTypeCode" element
     */
    public boolean isSetObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTTYPECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ObjectTypeCode" element
     */
    public void setObjectTypeCode(int objectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPECODE$2);
            }
            target.setIntValue(objectTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectTypeCode" element
     */
    public void xsetObjectTypeCode(org.apache.xmlbeans.XmlInt objectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OBJECTTYPECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OBJECTTYPECODE$2);
            }
            target.set(objectTypeCode);
        }
    }
    
    /**
     * Unsets the "ObjectTypeCode" element
     */
    public void unsetObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTTYPECODE$2, 0);
        }
    }
}
