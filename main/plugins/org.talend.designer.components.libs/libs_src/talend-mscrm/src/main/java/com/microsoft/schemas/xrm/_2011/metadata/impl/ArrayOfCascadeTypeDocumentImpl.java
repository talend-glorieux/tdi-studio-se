/*
 * An XML document type.
 * Localname: ArrayOfCascadeType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfCascadeType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfCascadeTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCascadeTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCASCADETYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfCascadeType");
    
    
    /**
     * Gets the "ArrayOfCascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType getArrayOfCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType)get_store().find_element_user(ARRAYOFCASCADETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfCascadeType" element
     */
    public boolean isNilArrayOfCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType)get_store().find_element_user(ARRAYOFCASCADETYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfCascadeType" element
     */
    public void setArrayOfCascadeType(com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType arrayOfCascadeType)
    {
        generatedSetterHelperImpl(arrayOfCascadeType, ARRAYOFCASCADETYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfCascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType addNewArrayOfCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType)get_store().add_element_user(ARRAYOFCASCADETYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfCascadeType" element
     */
    public void setNilArrayOfCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType)get_store().find_element_user(ARRAYOFCASCADETYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType)get_store().add_element_user(ARRAYOFCASCADETYPE$0);
            }
            target.setNil();
        }
    }
}
