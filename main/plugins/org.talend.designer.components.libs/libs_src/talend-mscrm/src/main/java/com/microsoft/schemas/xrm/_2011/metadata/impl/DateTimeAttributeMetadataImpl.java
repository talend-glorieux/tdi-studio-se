/*
 * XML Type:  DateTimeAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML DateTimeAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class DateTimeAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public DateTimeAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Format");
    private static final javax.xml.namespace.QName IMEMODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ImeMode");
    private static final javax.xml.namespace.QName FORMULADEFINITION$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "FormulaDefinition");
    private static final javax.xml.namespace.QName SOURCETYPEMASK$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SourceTypeMask");
    private static final javax.xml.namespace.QName CANCHANGEDATETIMEBEHAVIOR$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanChangeDateTimeBehavior");
    
    
    /**
     * Gets the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(FORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Format" element
     */
    public boolean isNilFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Format" element
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$0) != 0;
        }
    }
    
    /**
     * Sets the "Format" element
     */
    public void setFormat(com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$0);
            }
            target.setEnumValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "Format" element
     */
    public void xsetFormat(com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Nils the "Format" element
     */
    public void setNilFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().add_element_user(FORMAT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Format" element
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$0, 0);
        }
    }
    
    /**
     * Gets the "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum getImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode xgetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ImeMode" element
     */
    public boolean isNilImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ImeMode" element
     */
    public boolean isSetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMEMODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ImeMode" element
     */
    public void setImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMEMODE$2);
            }
            target.setEnumValue(imeMode);
        }
    }
    
    /**
     * Sets (as xml) the "ImeMode" element
     */
    public void xsetImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$2);
            }
            target.set(imeMode);
        }
    }
    
    /**
     * Nils the "ImeMode" element
     */
    public void setNilImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ImeMode" element
     */
    public void unsetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMEMODE$2, 0);
        }
    }
    
    /**
     * Gets the "FormulaDefinition" element
     */
    public java.lang.String getFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormulaDefinition" element
     */
    public org.apache.xmlbeans.XmlString xgetFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FormulaDefinition" element
     */
    public boolean isNilFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FormulaDefinition" element
     */
    public boolean isSetFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULADEFINITION$4) != 0;
        }
    }
    
    /**
     * Sets the "FormulaDefinition" element
     */
    public void setFormulaDefinition(java.lang.String formulaDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULADEFINITION$4);
            }
            target.setStringValue(formulaDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "FormulaDefinition" element
     */
    public void xsetFormulaDefinition(org.apache.xmlbeans.XmlString formulaDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$4);
            }
            target.set(formulaDefinition);
        }
    }
    
    /**
     * Nils the "FormulaDefinition" element
     */
    public void setNilFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FormulaDefinition" element
     */
    public void unsetFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULADEFINITION$4, 0);
        }
    }
    
    /**
     * Gets the "SourceTypeMask" element
     */
    public int getSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceTypeMask" element
     */
    public org.apache.xmlbeans.XmlInt xgetSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SourceTypeMask" element
     */
    public boolean isNilSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SourceTypeMask" element
     */
    public boolean isSetSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCETYPEMASK$6) != 0;
        }
    }
    
    /**
     * Sets the "SourceTypeMask" element
     */
    public void setSourceTypeMask(int sourceTypeMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPEMASK$6);
            }
            target.setIntValue(sourceTypeMask);
        }
    }
    
    /**
     * Sets (as xml) the "SourceTypeMask" element
     */
    public void xsetSourceTypeMask(org.apache.xmlbeans.XmlInt sourceTypeMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$6);
            }
            target.set(sourceTypeMask);
        }
    }
    
    /**
     * Nils the "SourceTypeMask" element
     */
    public void setNilSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SourceTypeMask" element
     */
    public void unsetSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCETYPEMASK$6, 0);
        }
    }
    
    /**
     * Gets the "CanChangeDateTimeBehavior" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanChangeDateTimeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCHANGEDATETIMEBEHAVIOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanChangeDateTimeBehavior" element
     */
    public boolean isNilCanChangeDateTimeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCHANGEDATETIMEBEHAVIOR$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanChangeDateTimeBehavior" element
     */
    public boolean isSetCanChangeDateTimeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCHANGEDATETIMEBEHAVIOR$8) != 0;
        }
    }
    
    /**
     * Sets the "CanChangeDateTimeBehavior" element
     */
    public void setCanChangeDateTimeBehavior(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canChangeDateTimeBehavior)
    {
        generatedSetterHelperImpl(canChangeDateTimeBehavior, CANCHANGEDATETIMEBEHAVIOR$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanChangeDateTimeBehavior" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanChangeDateTimeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCHANGEDATETIMEBEHAVIOR$8);
            return target;
        }
    }
    
    /**
     * Nils the "CanChangeDateTimeBehavior" element
     */
    public void setNilCanChangeDateTimeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCHANGEDATETIMEBEHAVIOR$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCHANGEDATETIMEBEHAVIOR$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanChangeDateTimeBehavior" element
     */
    public void unsetCanChangeDateTimeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCHANGEDATETIMEBEHAVIOR$8, 0);
        }
    }
}
