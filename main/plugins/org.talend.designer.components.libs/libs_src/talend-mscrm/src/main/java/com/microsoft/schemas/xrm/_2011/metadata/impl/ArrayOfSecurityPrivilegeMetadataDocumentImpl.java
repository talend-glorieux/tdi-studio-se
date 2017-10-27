/*
 * An XML document type.
 * Localname: ArrayOfSecurityPrivilegeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfSecurityPrivilegeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfSecurityPrivilegeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSecurityPrivilegeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSECURITYPRIVILEGEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfSecurityPrivilegeMetadata");
    
    
    /**
     * Gets the "ArrayOfSecurityPrivilegeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata getArrayOfSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().find_element_user(ARRAYOFSECURITYPRIVILEGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSecurityPrivilegeMetadata" element
     */
    public boolean isNilArrayOfSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().find_element_user(ARRAYOFSECURITYPRIVILEGEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSecurityPrivilegeMetadata" element
     */
    public void setArrayOfSecurityPrivilegeMetadata(com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata arrayOfSecurityPrivilegeMetadata)
    {
        generatedSetterHelperImpl(arrayOfSecurityPrivilegeMetadata, ARRAYOFSECURITYPRIVILEGEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSecurityPrivilegeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata addNewArrayOfSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().add_element_user(ARRAYOFSECURITYPRIVILEGEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSecurityPrivilegeMetadata" element
     */
    public void setNilArrayOfSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().find_element_user(ARRAYOFSECURITYPRIVILEGEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().add_element_user(ARRAYOFSECURITYPRIVILEGEMETADATA$0);
            }
            target.setNil();
        }
    }
}
