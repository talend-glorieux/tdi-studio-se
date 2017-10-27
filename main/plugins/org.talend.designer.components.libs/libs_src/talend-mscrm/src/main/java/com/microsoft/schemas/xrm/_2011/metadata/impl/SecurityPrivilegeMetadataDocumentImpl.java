/*
 * An XML document type.
 * Localname: SecurityPrivilegeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one SecurityPrivilegeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class SecurityPrivilegeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityPrivilegeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYPRIVILEGEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SecurityPrivilegeMetadata");
    
    
    /**
     * Gets the "SecurityPrivilegeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata getSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().find_element_user(SECURITYPRIVILEGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SecurityPrivilegeMetadata" element
     */
    public boolean isNilSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().find_element_user(SECURITYPRIVILEGEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SecurityPrivilegeMetadata" element
     */
    public void setSecurityPrivilegeMetadata(com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata securityPrivilegeMetadata)
    {
        generatedSetterHelperImpl(securityPrivilegeMetadata, SECURITYPRIVILEGEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SecurityPrivilegeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata addNewSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().add_element_user(SECURITYPRIVILEGEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "SecurityPrivilegeMetadata" element
     */
    public void setNilSecurityPrivilegeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().find_element_user(SECURITYPRIVILEGEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata)get_store().add_element_user(SECURITYPRIVILEGEMETADATA$0);
            }
            target.setNil();
        }
    }
}
