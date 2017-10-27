/*
 * An XML document type.
 * Localname: duration
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.DurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one duration(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class DurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.DurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    
    
    /**
     * Gets the "duration" element
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "duration" element
     */
    public com.microsoft.schemas._2003._10.serialization.Duration xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Duration target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Duration)get_store().find_element_user(DURATION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "duration" element
     */
    public boolean isNilDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Duration target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Duration)get_store().find_element_user(DURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "duration" element
     */
    public void setDuration(org.apache.xmlbeans.GDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$0);
            }
            target.setGDurationValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "duration" element
     */
    public void xsetDuration(com.microsoft.schemas._2003._10.serialization.Duration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Duration target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Duration)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Duration)get_store().add_element_user(DURATION$0);
            }
            target.set(duration);
        }
    }
    
    /**
     * Nils the "duration" element
     */
    public void setNilDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Duration target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Duration)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Duration)get_store().add_element_user(DURATION$0);
            }
            target.setNil();
        }
    }
}
