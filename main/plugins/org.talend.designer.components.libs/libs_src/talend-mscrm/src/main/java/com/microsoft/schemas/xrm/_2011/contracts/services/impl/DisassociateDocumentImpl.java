/*
 * An XML document type.
 * Localname: Disassociate
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one Disassociate(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class DisassociateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisassociateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISASSOCIATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "Disassociate");
    
    
    /**
     * Gets the "Disassociate" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate getDisassociate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate)get_store().find_element_user(DISASSOCIATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Disassociate" element
     */
    public void setDisassociate(com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate disassociate)
    {
        generatedSetterHelperImpl(disassociate, DISASSOCIATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Disassociate" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate addNewDisassociate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate)get_store().add_element_user(DISASSOCIATE$0);
            return target;
        }
    }
    /**
     * An XML Disassociate(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class DisassociateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate
    {
        private static final long serialVersionUID = 1L;
        
        public DisassociateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "entityName");
        private static final javax.xml.namespace.QName ENTITYID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "entityId");
        private static final javax.xml.namespace.QName RELATIONSHIP$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "relationship");
        private static final javax.xml.namespace.QName RELATEDENTITIES$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "relatedEntities");
        
        
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
         * Gets the "entityId" element
         */
        public java.lang.String getEntityId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entityId" element
         */
        public com.microsoft.schemas._2003._10.serialization.Guid xgetEntityId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.Guid target = null;
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ENTITYID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "entityId" element
         */
        public boolean isSetEntityId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYID$2) != 0;
            }
        }
        
        /**
         * Sets the "entityId" element
         */
        public void setEntityId(java.lang.String entityId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$2);
                }
                target.setStringValue(entityId);
            }
        }
        
        /**
         * Sets (as xml) the "entityId" element
         */
        public void xsetEntityId(com.microsoft.schemas._2003._10.serialization.Guid entityId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.Guid target = null;
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ENTITYID$2, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ENTITYID$2);
                }
                target.set(entityId);
            }
        }
        
        /**
         * Unsets the "entityId" element
         */
        public void unsetEntityId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYID$2, 0);
            }
        }
        
        /**
         * Gets the "relationship" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.Relationship getRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(RELATIONSHIP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "relationship" element
         */
        public boolean isNilRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(RELATIONSHIP$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "relationship" element
         */
        public boolean isSetRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATIONSHIP$4) != 0;
            }
        }
        
        /**
         * Sets the "relationship" element
         */
        public void setRelationship(com.microsoft.schemas.xrm._2011.contracts.Relationship relationship)
        {
            generatedSetterHelperImpl(relationship, RELATIONSHIP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relationship" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.Relationship addNewRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().add_element_user(RELATIONSHIP$4);
                return target;
            }
        }
        
        /**
         * Nils the "relationship" element
         */
        public void setNilRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(RELATIONSHIP$4, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().add_element_user(RELATIONSHIP$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "relationship" element
         */
        public void unsetRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATIONSHIP$4, 0);
            }
        }
        
        /**
         * Gets the "relatedEntities" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection getRelatedEntities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().find_element_user(RELATEDENTITIES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "relatedEntities" element
         */
        public boolean isNilRelatedEntities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().find_element_user(RELATEDENTITIES$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "relatedEntities" element
         */
        public boolean isSetRelatedEntities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDENTITIES$6) != 0;
            }
        }
        
        /**
         * Sets the "relatedEntities" element
         */
        public void setRelatedEntities(com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection relatedEntities)
        {
            generatedSetterHelperImpl(relatedEntities, RELATEDENTITIES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relatedEntities" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection addNewRelatedEntities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().add_element_user(RELATEDENTITIES$6);
                return target;
            }
        }
        
        /**
         * Nils the "relatedEntities" element
         */
        public void setNilRelatedEntities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().find_element_user(RELATEDENTITIES$6, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().add_element_user(RELATEDENTITIES$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "relatedEntities" element
         */
        public void unsetRelatedEntities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDENTITIES$6, 0);
            }
        }
    }
}
