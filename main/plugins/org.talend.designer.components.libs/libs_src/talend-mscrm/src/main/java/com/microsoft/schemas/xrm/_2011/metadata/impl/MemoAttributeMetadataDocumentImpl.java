/*
 * An XML document type.
 * Localname: MemoAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one MemoAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class MemoAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemoAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMOATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MemoAttributeMetadata");
    
    
    /**
     * Gets the "MemoAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata getMemoAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata)get_store().find_element_user(MEMOATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MemoAttributeMetadata" element
     */
    public boolean isNilMemoAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata)get_store().find_element_user(MEMOATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MemoAttributeMetadata" element
     */
    public void setMemoAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata memoAttributeMetadata)
    {
        generatedSetterHelperImpl(memoAttributeMetadata, MEMOATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MemoAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata addNewMemoAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata)get_store().add_element_user(MEMOATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "MemoAttributeMetadata" element
     */
    public void setNilMemoAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata)get_store().find_element_user(MEMOATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata)get_store().add_element_user(MEMOATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
