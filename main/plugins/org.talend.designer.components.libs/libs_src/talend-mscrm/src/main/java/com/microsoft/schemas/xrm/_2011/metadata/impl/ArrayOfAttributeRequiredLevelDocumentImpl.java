/*
 * An XML document type.
 * Localname: ArrayOfAttributeRequiredLevel
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfAttributeRequiredLevel(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfAttributeRequiredLevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeRequiredLevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFATTRIBUTEREQUIREDLEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfAttributeRequiredLevel");
    
    
    /**
     * Gets the "ArrayOfAttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel getArrayOfAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel)get_store().find_element_user(ARRAYOFATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAttributeRequiredLevel" element
     */
    public boolean isNilArrayOfAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel)get_store().find_element_user(ARRAYOFATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAttributeRequiredLevel" element
     */
    public void setArrayOfAttributeRequiredLevel(com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel arrayOfAttributeRequiredLevel)
    {
        generatedSetterHelperImpl(arrayOfAttributeRequiredLevel, ARRAYOFATTRIBUTEREQUIREDLEVEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel addNewArrayOfAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel)get_store().add_element_user(ARRAYOFATTRIBUTEREQUIREDLEVEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAttributeRequiredLevel" element
     */
    public void setNilArrayOfAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel)get_store().find_element_user(ARRAYOFATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeRequiredLevel)get_store().add_element_user(ARRAYOFATTRIBUTEREQUIREDLEVEL$0);
            }
            target.setNil();
        }
    }
}
