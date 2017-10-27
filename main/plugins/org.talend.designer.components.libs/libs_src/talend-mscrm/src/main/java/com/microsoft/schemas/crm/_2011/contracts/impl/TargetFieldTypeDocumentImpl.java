/*
 * An XML document type.
 * Localname: TargetFieldType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.TargetFieldTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one TargetFieldType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class TargetFieldTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.TargetFieldTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetFieldTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETFIELDTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TargetFieldType");
    
    
    /**
     * Gets the "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum getTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType xgetTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TargetFieldType" element
     */
    public boolean isNilTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TargetFieldType" element
     */
    public void setTargetFieldType(com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETFIELDTYPE$0);
            }
            target.setEnumValue(targetFieldType);
        }
    }
    
    /**
     * Sets (as xml) the "TargetFieldType" element
     */
    public void xsetTargetFieldType(com.microsoft.schemas.crm._2011.contracts.TargetFieldType targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().add_element_user(TARGETFIELDTYPE$0);
            }
            target.set(targetFieldType);
        }
    }
    
    /**
     * Nils the "TargetFieldType" element
     */
    public void setNilTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().add_element_user(TARGETFIELDTYPE$0);
            }
            target.setNil();
        }
    }
}
