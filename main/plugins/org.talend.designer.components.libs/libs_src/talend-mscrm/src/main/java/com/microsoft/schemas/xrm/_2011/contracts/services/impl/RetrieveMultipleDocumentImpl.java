/*
 * An XML document type.
 * Localname: RetrieveMultiple
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one RetrieveMultiple(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class RetrieveMultipleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveMultipleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEMULTIPLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "RetrieveMultiple");
    
    
    /**
     * Gets the "RetrieveMultiple" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple getRetrieveMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple)get_store().find_element_user(RETRIEVEMULTIPLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveMultiple" element
     */
    public void setRetrieveMultiple(com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple retrieveMultiple)
    {
        generatedSetterHelperImpl(retrieveMultiple, RETRIEVEMULTIPLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveMultiple" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple addNewRetrieveMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple)get_store().add_element_user(RETRIEVEMULTIPLE$0);
            return target;
        }
    }
    /**
     * An XML RetrieveMultiple(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class RetrieveMultipleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.RetrieveMultiple
    {
        private static final long serialVersionUID = 1L;
        
        public RetrieveMultipleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERY$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "query");
        
        
        /**
         * Gets the "query" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.QueryBase getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().find_element_user(QUERY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "query" element
         */
        public boolean isNilQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().find_element_user(QUERY$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "query" element
         */
        public boolean isSetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERY$0) != 0;
            }
        }
        
        /**
         * Sets the "query" element
         */
        public void setQuery(com.microsoft.schemas.xrm._2011.contracts.QueryBase query)
        {
            generatedSetterHelperImpl(query, QUERY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "query" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.QueryBase addNewQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().add_element_user(QUERY$0);
                return target;
            }
        }
        
        /**
         * Nils the "query" element
         */
        public void setNilQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().find_element_user(QUERY$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().add_element_user(QUERY$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "query" element
         */
        public void unsetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERY$0, 0);
            }
        }
    }
}
