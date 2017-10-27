/*
 * An XML document type.
 * Localname: StringFormatName
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.StringFormatNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata.impl;
/**
 * A document containing one StringFormatName(@http://schemas.microsoft.com/xrm/2013/Metadata) element.
 *
 * This is a complex type.
 */
public class StringFormatNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2013.metadata.StringFormatNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringFormatNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGFORMATNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "StringFormatName");
    
    
    /**
     * Gets the "StringFormatName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.StringFormatName getStringFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().find_element_user(STRINGFORMATNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StringFormatName" element
     */
    public boolean isNilStringFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().find_element_user(STRINGFORMATNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StringFormatName" element
     */
    public void setStringFormatName(com.microsoft.schemas.xrm._2013.metadata.StringFormatName stringFormatName)
    {
        generatedSetterHelperImpl(stringFormatName, STRINGFORMATNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StringFormatName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.StringFormatName addNewStringFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().add_element_user(STRINGFORMATNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "StringFormatName" element
     */
    public void setNilStringFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().find_element_user(STRINGFORMATNAME$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().add_element_user(STRINGFORMATNAME$0);
            }
            target.setNil();
        }
    }
}
