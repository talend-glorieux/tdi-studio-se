/*
 * An XML document type.
 * Localname: ArrayOfTargetFieldType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfTargetFieldType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfTargetFieldTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfTargetFieldTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTARGETFIELDTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTargetFieldType");
    
    
    /**
     * Gets the "ArrayOfTargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType getArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFTARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfTargetFieldType" element
     */
    public boolean isNilArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFTARGETFIELDTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfTargetFieldType" element
     */
    public void setArrayOfTargetFieldType(com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType arrayOfTargetFieldType)
    {
        generatedSetterHelperImpl(arrayOfTargetFieldType, ARRAYOFTARGETFIELDTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfTargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType addNewArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().add_element_user(ARRAYOFTARGETFIELDTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfTargetFieldType" element
     */
    public void setNilArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFTARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().add_element_user(ARRAYOFTARGETFIELDTYPE$0);
            }
            target.setNil();
        }
    }
}
