/*
 * An XML document type.
 * Localname: Delete
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one Delete(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class DeleteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "Delete");
    
    
    /**
     * Gets the "Delete" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete)get_store().find_element_user(DELETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Delete" element
     */
    public void setDelete(com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete delete)
    {
        generatedSetterHelperImpl(delete, DELETE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Delete" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete addNewDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete)get_store().add_element_user(DELETE$0);
            return target;
        }
    }
    /**
     * An XML Delete(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class DeleteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "entityName");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "id");
        
        
        /**
         * Gets the "entityName" element
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entityName" element
         */
        public org.apache.xmlbeans.XmlString xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "entityName" element
         */
        public boolean isNilEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "entityName" element
         */
        public boolean isSetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "entityName" element
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$0);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entityName" element
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$0);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Nils the "entityName" element
         */
        public void setNilEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "entityName" element
         */
        public void unsetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYNAME$0, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public com.microsoft.schemas._2003._10.serialization.Guid xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.Guid target = null;
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$2) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(com.microsoft.schemas._2003._10.serialization.Guid id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.Guid target = null;
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$2, 0);
            }
        }
    }
}
