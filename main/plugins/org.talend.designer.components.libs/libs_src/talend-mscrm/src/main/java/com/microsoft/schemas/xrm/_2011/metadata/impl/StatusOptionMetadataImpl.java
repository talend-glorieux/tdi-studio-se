/*
 * XML Type:  StatusOptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML StatusOptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class StatusOptionMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.OptionMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata
{
    private static final long serialVersionUID = 1L;
    
    public StatusOptionMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "State");
    private static final javax.xml.namespace.QName TRANSITIONDATA$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "TransitionData");
    
    
    /**
     * Gets the "State" element
     */
    public int getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public org.apache.xmlbeans.XmlInt xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "State" element
     */
    public boolean isNilState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "State" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$0) != 0;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(int state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$0);
            }
            target.setIntValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(org.apache.xmlbeans.XmlInt state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STATE$0);
            }
            target.set(state);
        }
    }
    
    /**
     * Nils the "State" element
     */
    public void setNilState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "State" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$0, 0);
        }
    }
    
    /**
     * Gets the "TransitionData" element
     */
    public java.lang.String getTransitionData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSITIONDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransitionData" element
     */
    public org.apache.xmlbeans.XmlString xgetTransitionData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSITIONDATA$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TransitionData" element
     */
    public boolean isNilTransitionData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSITIONDATA$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TransitionData" element
     */
    public boolean isSetTransitionData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSITIONDATA$2) != 0;
        }
    }
    
    /**
     * Sets the "TransitionData" element
     */
    public void setTransitionData(java.lang.String transitionData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSITIONDATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSITIONDATA$2);
            }
            target.setStringValue(transitionData);
        }
    }
    
    /**
     * Sets (as xml) the "TransitionData" element
     */
    public void xsetTransitionData(org.apache.xmlbeans.XmlString transitionData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSITIONDATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSITIONDATA$2);
            }
            target.set(transitionData);
        }
    }
    
    /**
     * Nils the "TransitionData" element
     */
    public void setNilTransitionData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSITIONDATA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSITIONDATA$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TransitionData" element
     */
    public void unsetTransitionData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSITIONDATA$2, 0);
        }
    }
}
