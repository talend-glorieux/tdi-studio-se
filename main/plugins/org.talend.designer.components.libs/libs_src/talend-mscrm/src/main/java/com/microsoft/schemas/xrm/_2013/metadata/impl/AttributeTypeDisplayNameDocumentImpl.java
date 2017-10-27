/*
 * An XML document type.
 * Localname: AttributeTypeDisplayName
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata.impl;
/**
 * A document containing one AttributeTypeDisplayName(@http://schemas.microsoft.com/xrm/2013/Metadata) element.
 *
 * This is a complex type.
 */
public class AttributeTypeDisplayNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeTypeDisplayNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTETYPEDISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "AttributeTypeDisplayName");
    
    
    /**
     * Gets the "AttributeTypeDisplayName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName getAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPEDISPLAYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeTypeDisplayName" element
     */
    public boolean isNilAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPEDISPLAYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeTypeDisplayName" element
     */
    public void setAttributeTypeDisplayName(com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName attributeTypeDisplayName)
    {
        generatedSetterHelperImpl(attributeTypeDisplayName, ATTRIBUTETYPEDISPLAYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeTypeDisplayName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName addNewAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().add_element_user(ATTRIBUTETYPEDISPLAYNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeTypeDisplayName" element
     */
    public void setNilAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPEDISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().add_element_user(ATTRIBUTETYPEDISPLAYNAME$0);
            }
            target.setNil();
        }
    }
}
