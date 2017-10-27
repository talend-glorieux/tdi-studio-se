/*
 * An XML document type.
 * Localname: Retrieve
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one Retrieve(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class RetrieveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "Retrieve");
    
    
    /**
     * Gets the "Retrieve" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve getRetrieve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve)get_store().find_element_user(RETRIEVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Retrieve" element
     */
    public void setRetrieve(com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve retrieve)
    {
        generatedSetterHelperImpl(retrieve, RETRIEVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Retrieve" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve addNewRetrieve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve)get_store().add_element_user(RETRIEVE$0);
            return target;
        }
    }
    /**
     * An XML Retrieve(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class RetrieveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve
    {
        private static final long serialVersionUID = 1L;
        
        public RetrieveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "entityName");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "id");
        private static final javax.xml.namespace.QName COLUMNSET$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "columnSet");
        
        
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
        
        /**
         * Gets the "columnSet" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.ColumnSet getColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "columnSet" element
         */
        public boolean isNilColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "columnSet" element
         */
        public boolean isSetColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLUMNSET$4) != 0;
            }
        }
        
        /**
         * Sets the "columnSet" element
         */
        public void setColumnSet(com.microsoft.schemas.xrm._2011.contracts.ColumnSet columnSet)
        {
            generatedSetterHelperImpl(columnSet, COLUMNSET$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "columnSet" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.ColumnSet addNewColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$4);
                return target;
            }
        }
        
        /**
         * Nils the "columnSet" element
         */
        public void setNilColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$4, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "columnSet" element
         */
        public void unsetColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLUMNSET$4, 0);
            }
        }
    }
}
