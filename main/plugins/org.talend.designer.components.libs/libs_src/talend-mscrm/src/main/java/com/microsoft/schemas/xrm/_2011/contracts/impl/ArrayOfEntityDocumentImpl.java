/*
 * An XML document type.
 * Localname: ArrayOfEntity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfEntity(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfEntity");
    
    
    /**
     * Gets the "ArrayOfEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity getArrayOfEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().find_element_user(ARRAYOFENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfEntity" element
     */
    public boolean isNilArrayOfEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().find_element_user(ARRAYOFENTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfEntity" element
     */
    public void setArrayOfEntity(com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity arrayOfEntity)
    {
        generatedSetterHelperImpl(arrayOfEntity, ARRAYOFENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity addNewArrayOfEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().add_element_user(ARRAYOFENTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfEntity" element
     */
    public void setNilArrayOfEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().find_element_user(ARRAYOFENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().add_element_user(ARRAYOFENTITY$0);
            }
            target.setNil();
        }
    }
}
