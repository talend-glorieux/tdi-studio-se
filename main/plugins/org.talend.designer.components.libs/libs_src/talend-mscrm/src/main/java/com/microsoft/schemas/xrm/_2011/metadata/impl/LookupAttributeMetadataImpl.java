/*
 * XML Type:  LookupAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML LookupAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class LookupAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public LookupAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Targets");
    
    
    /**
     * Gets the "Targets" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getTargets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(TARGETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Targets" element
     */
    public boolean isNilTargets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(TARGETS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Targets" element
     */
    public boolean isSetTargets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETS$0) != 0;
        }
    }
    
    /**
     * Sets the "Targets" element
     */
    public void setTargets(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring targets)
    {
        generatedSetterHelperImpl(targets, TARGETS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Targets" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewTargets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(TARGETS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Targets" element
     */
    public void setNilTargets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(TARGETS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(TARGETS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Targets" element
     */
    public void unsetTargets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETS$0, 0);
        }
    }
}
