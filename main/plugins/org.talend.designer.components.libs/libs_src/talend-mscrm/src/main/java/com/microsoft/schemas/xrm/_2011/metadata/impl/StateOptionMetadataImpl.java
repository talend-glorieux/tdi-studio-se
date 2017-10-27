/*
 * XML Type:  StateOptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML StateOptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class StateOptionMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.OptionMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata
{
    private static final long serialVersionUID = 1L;
    
    public StateOptionMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTSTATUS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DefaultStatus");
    private static final javax.xml.namespace.QName INVARIANTNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "InvariantName");
    
    
    /**
     * Gets the "DefaultStatus" element
     */
    public int getDefaultStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSTATUS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetDefaultStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DefaultStatus" element
     */
    public boolean isNilDefaultStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTSTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DefaultStatus" element
     */
    public boolean isSetDefaultStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTSTATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "DefaultStatus" element
     */
    public void setDefaultStatus(int defaultStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTSTATUS$0);
            }
            target.setIntValue(defaultStatus);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultStatus" element
     */
    public void xsetDefaultStatus(org.apache.xmlbeans.XmlInt defaultStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEFAULTSTATUS$0);
            }
            target.set(defaultStatus);
        }
    }
    
    /**
     * Nils the "DefaultStatus" element
     */
    public void setNilDefaultStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEFAULTSTATUS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DefaultStatus" element
     */
    public void unsetDefaultStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTSTATUS$0, 0);
        }
    }
    
    /**
     * Gets the "InvariantName" element
     */
    public java.lang.String getInvariantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVARIANTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvariantName" element
     */
    public org.apache.xmlbeans.XmlString xgetInvariantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVARIANTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "InvariantName" element
     */
    public boolean isNilInvariantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVARIANTNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "InvariantName" element
     */
    public boolean isSetInvariantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVARIANTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "InvariantName" element
     */
    public void setInvariantName(java.lang.String invariantName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVARIANTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVARIANTNAME$2);
            }
            target.setStringValue(invariantName);
        }
    }
    
    /**
     * Sets (as xml) the "InvariantName" element
     */
    public void xsetInvariantName(org.apache.xmlbeans.XmlString invariantName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVARIANTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVARIANTNAME$2);
            }
            target.set(invariantName);
        }
    }
    
    /**
     * Nils the "InvariantName" element
     */
    public void setNilInvariantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVARIANTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVARIANTNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "InvariantName" element
     */
    public void unsetInvariantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVARIANTNAME$2, 0);
        }
    }
}
