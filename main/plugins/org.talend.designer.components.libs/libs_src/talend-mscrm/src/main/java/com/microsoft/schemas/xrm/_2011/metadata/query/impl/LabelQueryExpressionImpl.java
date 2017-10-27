/*
 * XML Type:  LabelQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML LabelQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class LabelQueryExpressionImpl extends com.microsoft.schemas.xrm._2011.metadata.query.impl.MetadataQueryBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression
{
    private static final long serialVersionUID = 1L;
    
    public LabelQueryExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERLANGUAGES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "FilterLanguages");
    private static final javax.xml.namespace.QName MISSINGLABELBEHAVIOR$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MissingLabelBehavior");
    
    
    /**
     * Gets the "FilterLanguages" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint getFilterLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(FILTERLANGUAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FilterLanguages" element
     */
    public boolean isNilFilterLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(FILTERLANGUAGES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FilterLanguages" element
     */
    public boolean isSetFilterLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERLANGUAGES$0) != 0;
        }
    }
    
    /**
     * Sets the "FilterLanguages" element
     */
    public void setFilterLanguages(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint filterLanguages)
    {
        generatedSetterHelperImpl(filterLanguages, FILTERLANGUAGES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FilterLanguages" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint addNewFilterLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().add_element_user(FILTERLANGUAGES$0);
            return target;
        }
    }
    
    /**
     * Nils the "FilterLanguages" element
     */
    public void setNilFilterLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(FILTERLANGUAGES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().add_element_user(FILTERLANGUAGES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FilterLanguages" element
     */
    public void unsetFilterLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERLANGUAGES$0, 0);
        }
    }
    
    /**
     * Gets the "MissingLabelBehavior" element
     */
    public int getMissingLabelBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGLABELBEHAVIOR$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MissingLabelBehavior" element
     */
    public org.apache.xmlbeans.XmlInt xgetMissingLabelBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGLABELBEHAVIOR$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MissingLabelBehavior" element
     */
    public boolean isNilMissingLabelBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGLABELBEHAVIOR$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MissingLabelBehavior" element
     */
    public boolean isSetMissingLabelBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MISSINGLABELBEHAVIOR$2) != 0;
        }
    }
    
    /**
     * Sets the "MissingLabelBehavior" element
     */
    public void setMissingLabelBehavior(int missingLabelBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGLABELBEHAVIOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISSINGLABELBEHAVIOR$2);
            }
            target.setIntValue(missingLabelBehavior);
        }
    }
    
    /**
     * Sets (as xml) the "MissingLabelBehavior" element
     */
    public void xsetMissingLabelBehavior(org.apache.xmlbeans.XmlInt missingLabelBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGLABELBEHAVIOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MISSINGLABELBEHAVIOR$2);
            }
            target.set(missingLabelBehavior);
        }
    }
    
    /**
     * Nils the "MissingLabelBehavior" element
     */
    public void setNilMissingLabelBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGLABELBEHAVIOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MISSINGLABELBEHAVIOR$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MissingLabelBehavior" element
     */
    public void unsetMissingLabelBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MISSINGLABELBEHAVIOR$2, 0);
        }
    }
}
