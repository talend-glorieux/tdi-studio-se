/*
 * An XML document type.
 * Localname: ArrayOfArrayOfTargetFieldType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfTargetFieldType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTargetFieldTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfTargetFieldTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFTARGETFIELDTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTargetFieldType");
    
    
    /**
     * Gets the "ArrayOfArrayOfTargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType getArrayOfArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFARRAYOFTARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfTargetFieldType" element
     */
    public boolean isNilArrayOfArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFARRAYOFTARGETFIELDTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfTargetFieldType" element
     */
    public void setArrayOfArrayOfTargetFieldType(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType arrayOfArrayOfTargetFieldType)
    {
        generatedSetterHelperImpl(arrayOfArrayOfTargetFieldType, ARRAYOFARRAYOFTARGETFIELDTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfTargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType addNewArrayOfArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType)get_store().add_element_user(ARRAYOFARRAYOFTARGETFIELDTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfTargetFieldType" element
     */
    public void setNilArrayOfArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFARRAYOFTARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType)get_store().add_element_user(ARRAYOFARRAYOFTARGETFIELDTYPE$0);
            }
            target.setNil();
        }
    }
}
