/*
 * An XML document type.
 * Localname: BooleanOptionSetMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one BooleanOptionSetMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class BooleanOptionSetMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanOptionSetMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANOPTIONSETMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "BooleanOptionSetMetadata");
    
    
    /**
     * Gets the "BooleanOptionSetMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata getBooleanOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().find_element_user(BOOLEANOPTIONSETMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BooleanOptionSetMetadata" element
     */
    public boolean isNilBooleanOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().find_element_user(BOOLEANOPTIONSETMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BooleanOptionSetMetadata" element
     */
    public void setBooleanOptionSetMetadata(com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata booleanOptionSetMetadata)
    {
        generatedSetterHelperImpl(booleanOptionSetMetadata, BOOLEANOPTIONSETMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BooleanOptionSetMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata addNewBooleanOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().add_element_user(BOOLEANOPTIONSETMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "BooleanOptionSetMetadata" element
     */
    public void setNilBooleanOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().find_element_user(BOOLEANOPTIONSETMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().add_element_user(BOOLEANOPTIONSETMETADATA$0);
            }
            target.setNil();
        }
    }
}
