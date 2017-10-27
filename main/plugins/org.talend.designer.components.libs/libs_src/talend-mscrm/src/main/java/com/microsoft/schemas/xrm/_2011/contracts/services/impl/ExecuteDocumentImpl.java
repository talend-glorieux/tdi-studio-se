/*
 * An XML document type.
 * Localname: Execute
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one Execute(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class ExecuteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExecuteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "Execute");
    
    
    /**
     * Gets the "Execute" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute getExecute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute)get_store().find_element_user(EXECUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Execute" element
     */
    public void setExecute(com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute execute)
    {
        generatedSetterHelperImpl(execute, EXECUTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Execute" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute addNewExecute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute)get_store().add_element_user(EXECUTE$0);
            return target;
        }
    }
    /**
     * An XML Execute(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class ExecuteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Execute
    {
        private static final long serialVersionUID = 1L;
        
        public ExecuteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "request");
        
        
        /**
         * Gets the "request" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "request" element
         */
        public boolean isNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        
        /**
         * Nils the "request" element
         */
        public void setNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().add_element_user(REQUEST$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$0, 0);
            }
        }
    }
}
