/*
 * An XML document type.
 * Localname: ConstantsBase
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.ConstantsBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata.impl;
/**
 * A document containing one ConstantsBase(@http://schemas.microsoft.com/xrm/2013/Metadata) element.
 *
 * This is a complex type.
 */
public class ConstantsBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2013.metadata.ConstantsBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstantsBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTANTSBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "ConstantsBase");
    
    
    /**
     * Gets the "ConstantsBase" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.ConstantsBase getConstantsBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ConstantsBase target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ConstantsBase)get_store().find_element_user(CONSTANTSBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ConstantsBase" element
     */
    public boolean isNilConstantsBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ConstantsBase target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ConstantsBase)get_store().find_element_user(CONSTANTSBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ConstantsBase" element
     */
    public void setConstantsBase(com.microsoft.schemas.xrm._2013.metadata.ConstantsBase constantsBase)
    {
        generatedSetterHelperImpl(constantsBase, CONSTANTSBASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConstantsBase" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.ConstantsBase addNewConstantsBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ConstantsBase target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ConstantsBase)get_store().add_element_user(CONSTANTSBASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ConstantsBase" element
     */
    public void setNilConstantsBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ConstantsBase target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ConstantsBase)get_store().find_element_user(CONSTANTSBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2013.metadata.ConstantsBase)get_store().add_element_user(CONSTANTSBASE$0);
            }
            target.setNil();
        }
    }
}
