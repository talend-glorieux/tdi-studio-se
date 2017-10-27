/*
 * An XML document type.
 * Localname: Update
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one Update(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class UpdateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "Update");
    
    
    /**
     * Gets the "Update" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update getUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update)get_store().find_element_user(UPDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Update" element
     */
    public void setUpdate(com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update update)
    {
        generatedSetterHelperImpl(update, UPDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Update" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update addNewUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update)get_store().add_element_user(UPDATE$0);
            return target;
        }
    }
    /**
     * An XML Update(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class UpdateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITY$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "entity");
        
        
        /**
         * Gets the "entity" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.Entity getEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "entity" element
         */
        public boolean isNilEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "entity" element
         */
        public boolean isSetEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITY$0) != 0;
            }
        }
        
        /**
         * Sets the "entity" element
         */
        public void setEntity(com.microsoft.schemas.xrm._2011.contracts.Entity entity)
        {
            generatedSetterHelperImpl(entity, ENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "entity" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.Entity addNewEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(ENTITY$0);
                return target;
            }
        }
        
        /**
         * Nils the "entity" element
         */
        public void setNilEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(ENTITY$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "entity" element
         */
        public void unsetEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITY$0, 0);
            }
        }
    }
}
