/*
 * An XML document type.
 * Localname: ArrayOfOptionSetMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfOptionSetMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfOptionSetMetadataBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOptionSetMetadataBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOPTIONSETMETADATABASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOptionSetMetadataBase");
    
    
    /**
     * Gets the "ArrayOfOptionSetMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase getArrayOfOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase)get_store().find_element_user(ARRAYOFOPTIONSETMETADATABASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOptionSetMetadataBase" element
     */
    public boolean isNilArrayOfOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase)get_store().find_element_user(ARRAYOFOPTIONSETMETADATABASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOptionSetMetadataBase" element
     */
    public void setArrayOfOptionSetMetadataBase(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase arrayOfOptionSetMetadataBase)
    {
        generatedSetterHelperImpl(arrayOfOptionSetMetadataBase, ARRAYOFOPTIONSETMETADATABASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOptionSetMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase addNewArrayOfOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase)get_store().add_element_user(ARRAYOFOPTIONSETMETADATABASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOptionSetMetadataBase" element
     */
    public void setNilArrayOfOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase)get_store().find_element_user(ARRAYOFOPTIONSETMETADATABASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionSetMetadataBase)get_store().add_element_user(ARRAYOFOPTIONSETMETADATABASE$0);
            }
            target.setNil();
        }
    }
}
