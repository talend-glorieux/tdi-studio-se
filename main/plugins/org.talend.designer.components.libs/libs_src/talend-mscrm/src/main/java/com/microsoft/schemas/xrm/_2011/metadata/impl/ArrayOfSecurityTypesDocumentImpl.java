/*
 * An XML document type.
 * Localname: ArrayOfSecurityTypes
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfSecurityTypes(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfSecurityTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSecurityTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSECURITYTYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfSecurityTypes");
    
    
    /**
     * Gets the "ArrayOfSecurityTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes getArrayOfSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes)get_store().find_element_user(ARRAYOFSECURITYTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSecurityTypes" element
     */
    public boolean isNilArrayOfSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes)get_store().find_element_user(ARRAYOFSECURITYTYPES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSecurityTypes" element
     */
    public void setArrayOfSecurityTypes(com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes arrayOfSecurityTypes)
    {
        generatedSetterHelperImpl(arrayOfSecurityTypes, ARRAYOFSECURITYTYPES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSecurityTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes addNewArrayOfSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes)get_store().add_element_user(ARRAYOFSECURITYTYPES$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSecurityTypes" element
     */
    public void setNilArrayOfSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes)get_store().find_element_user(ARRAYOFSECURITYTYPES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityTypes)get_store().add_element_user(ARRAYOFSECURITYTYPES$0);
            }
            target.setNil();
        }
    }
}
