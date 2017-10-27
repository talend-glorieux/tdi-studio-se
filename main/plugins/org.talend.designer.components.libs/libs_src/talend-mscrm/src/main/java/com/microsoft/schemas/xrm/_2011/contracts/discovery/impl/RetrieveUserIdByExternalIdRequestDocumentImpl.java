/*
 * An XML document type.
 * Localname: RetrieveUserIdByExternalIdRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one RetrieveUserIdByExternalIdRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class RetrieveUserIdByExternalIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveUserIdByExternalIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEUSERIDBYEXTERNALIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "RetrieveUserIdByExternalIdRequest");
    
    
    /**
     * Gets the "RetrieveUserIdByExternalIdRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest getRetrieveUserIdByExternalIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest)get_store().find_element_user(RETRIEVEUSERIDBYEXTERNALIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RetrieveUserIdByExternalIdRequest" element
     */
    public boolean isNilRetrieveUserIdByExternalIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest)get_store().find_element_user(RETRIEVEUSERIDBYEXTERNALIDREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RetrieveUserIdByExternalIdRequest" element
     */
    public void setRetrieveUserIdByExternalIdRequest(com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest retrieveUserIdByExternalIdRequest)
    {
        generatedSetterHelperImpl(retrieveUserIdByExternalIdRequest, RETRIEVEUSERIDBYEXTERNALIDREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveUserIdByExternalIdRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest addNewRetrieveUserIdByExternalIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest)get_store().add_element_user(RETRIEVEUSERIDBYEXTERNALIDREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "RetrieveUserIdByExternalIdRequest" element
     */
    public void setNilRetrieveUserIdByExternalIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest)get_store().find_element_user(RETRIEVEUSERIDBYEXTERNALIDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest)get_store().add_element_user(RETRIEVEUSERIDBYEXTERNALIDREQUEST$0);
            }
            target.setNil();
        }
    }
}
