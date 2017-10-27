/*
 * An XML document type.
 * Localname: AttributeTypeCode
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one AttributeTypeCode(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class AttributeTypeCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTETYPECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeTypeCode");
    
    
    /**
     * Gets the "AttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum getAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode xgetAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeTypeCode" element
     */
    public boolean isNilAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeTypeCode" element
     */
    public void setAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum attributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTETYPECODE$0);
            }
            target.setEnumValue(attributeTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeTypeCode" element
     */
    public void xsetAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode attributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().add_element_user(ATTRIBUTETYPECODE$0);
            }
            target.set(attributeTypeCode);
        }
    }
    
    /**
     * Nils the "AttributeTypeCode" element
     */
    public void setNilAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().add_element_user(ATTRIBUTETYPECODE$0);
            }
            target.setNil();
        }
    }
}
