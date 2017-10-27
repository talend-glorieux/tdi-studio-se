/*
 * An XML document type.
 * Localname: ArrayOfLinkEntity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfLinkEntity(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfLinkEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfLinkEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFLINKENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfLinkEntity");
    
    
    /**
     * Gets the "ArrayOfLinkEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity getArrayOfLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(ARRAYOFLINKENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfLinkEntity" element
     */
    public boolean isNilArrayOfLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(ARRAYOFLINKENTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfLinkEntity" element
     */
    public void setArrayOfLinkEntity(com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity arrayOfLinkEntity)
    {
        generatedSetterHelperImpl(arrayOfLinkEntity, ARRAYOFLINKENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfLinkEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity addNewArrayOfLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().add_element_user(ARRAYOFLINKENTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfLinkEntity" element
     */
    public void setNilArrayOfLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(ARRAYOFLINKENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().add_element_user(ARRAYOFLINKENTITY$0);
            }
            target.setNil();
        }
    }
}
