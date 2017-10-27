/*
 * An XML document type.
 * Localname: RetrieveUserIdByExternalIdResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one RetrieveUserIdByExternalIdResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class RetrieveUserIdByExternalIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveUserIdByExternalIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEUSERIDBYEXTERNALIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "RetrieveUserIdByExternalIdResponse");
    
    
    /**
     * Gets the "RetrieveUserIdByExternalIdResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse getRetrieveUserIdByExternalIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse)get_store().find_element_user(RETRIEVEUSERIDBYEXTERNALIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RetrieveUserIdByExternalIdResponse" element
     */
    public boolean isNilRetrieveUserIdByExternalIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse)get_store().find_element_user(RETRIEVEUSERIDBYEXTERNALIDRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RetrieveUserIdByExternalIdResponse" element
     */
    public void setRetrieveUserIdByExternalIdResponse(com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse retrieveUserIdByExternalIdResponse)
    {
        generatedSetterHelperImpl(retrieveUserIdByExternalIdResponse, RETRIEVEUSERIDBYEXTERNALIDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveUserIdByExternalIdResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse addNewRetrieveUserIdByExternalIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse)get_store().add_element_user(RETRIEVEUSERIDBYEXTERNALIDRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RetrieveUserIdByExternalIdResponse" element
     */
    public void setNilRetrieveUserIdByExternalIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse)get_store().find_element_user(RETRIEVEUSERIDBYEXTERNALIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse)get_store().add_element_user(RETRIEVEUSERIDBYEXTERNALIDRESPONSE$0);
            }
            target.setNil();
        }
    }
}
