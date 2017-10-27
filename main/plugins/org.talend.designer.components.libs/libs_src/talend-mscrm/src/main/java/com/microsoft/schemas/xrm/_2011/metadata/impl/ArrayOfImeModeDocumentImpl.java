/*
 * An XML document type.
 * Localname: ArrayOfImeMode
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeModeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfImeMode(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfImeModeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeModeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfImeModeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFIMEMODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfImeMode");
    
    
    /**
     * Gets the "ArrayOfImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode getArrayOfImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode)get_store().find_element_user(ARRAYOFIMEMODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfImeMode" element
     */
    public boolean isNilArrayOfImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode)get_store().find_element_user(ARRAYOFIMEMODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfImeMode" element
     */
    public void setArrayOfImeMode(com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode arrayOfImeMode)
    {
        generatedSetterHelperImpl(arrayOfImeMode, ARRAYOFIMEMODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode addNewArrayOfImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode)get_store().add_element_user(ARRAYOFIMEMODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfImeMode" element
     */
    public void setNilArrayOfImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode)get_store().find_element_user(ARRAYOFIMEMODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode)get_store().add_element_user(ARRAYOFIMEMODE$0);
            }
            target.setNil();
        }
    }
}
