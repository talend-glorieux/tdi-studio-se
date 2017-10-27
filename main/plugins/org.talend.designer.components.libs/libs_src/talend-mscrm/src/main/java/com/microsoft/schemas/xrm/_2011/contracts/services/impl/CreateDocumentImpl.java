/*
 * An XML document type.
 * Localname: Create
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one Create(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class CreateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "Create");
    
    
    /**
     * Gets the "Create" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create getCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create)get_store().find_element_user(CREATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Create" element
     */
    public void setCreate(com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create create)
    {
        generatedSetterHelperImpl(create, CREATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Create" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create addNewCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create)get_store().add_element_user(CREATE$0);
            return target;
        }
    }
    /**
     * An XML Create(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class CreateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create
    {
        private static final long serialVersionUID = 1L;
        
        public CreateImpl(org.apache.xmlbeans.SchemaType sType)
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
