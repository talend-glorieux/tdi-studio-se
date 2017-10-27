/*
 * XML Type:  MetadataPropertiesExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML MetadataPropertiesExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class MetadataPropertiesExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression
{
    private static final long serialVersionUID = 1L;
    
    public MetadataPropertiesExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "AllProperties");
    private static final javax.xml.namespace.QName PROPERTYNAMES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "PropertyNames");
    
    
    /**
     * Gets the "AllProperties" element
     */
    public boolean getAllProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLPROPERTIES$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllProperties" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLPROPERTIES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AllProperties" element
     */
    public boolean isSetAllProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLPROPERTIES$0) != 0;
        }
    }
    
    /**
     * Sets the "AllProperties" element
     */
    public void setAllProperties(boolean allProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLPROPERTIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLPROPERTIES$0);
            }
            target.setBooleanValue(allProperties);
        }
    }
    
    /**
     * Sets (as xml) the "AllProperties" element
     */
    public void xsetAllProperties(org.apache.xmlbeans.XmlBoolean allProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLPROPERTIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ALLPROPERTIES$0);
            }
            target.set(allProperties);
        }
    }
    
    /**
     * Unsets the "AllProperties" element
     */
    public void unsetAllProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLPROPERTIES$0, 0);
        }
    }
    
    /**
     * Gets the "PropertyNames" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getPropertyNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PROPERTYNAMES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PropertyNames" element
     */
    public boolean isNilPropertyNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PROPERTYNAMES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PropertyNames" element
     */
    public boolean isSetPropertyNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYNAMES$2) != 0;
        }
    }
    
    /**
     * Sets the "PropertyNames" element
     */
    public void setPropertyNames(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring propertyNames)
    {
        generatedSetterHelperImpl(propertyNames, PROPERTYNAMES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PropertyNames" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewPropertyNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(PROPERTYNAMES$2);
            return target;
        }
    }
    
    /**
     * Nils the "PropertyNames" element
     */
    public void setNilPropertyNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PROPERTYNAMES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(PROPERTYNAMES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PropertyNames" element
     */
    public void unsetPropertyNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYNAMES$2, 0);
        }
    }
}
