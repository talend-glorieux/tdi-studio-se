/*
 * An XML document type.
 * Localname: ArrayOfKeyValuePairOfstringanyType
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one ArrayOfKeyValuePairOfstringanyType(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class ArrayOfKeyValuePairOfstringanyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValuePairOfstringanyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFKEYVALUEPAIROFSTRINGANYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringanyType");
    
    
    /**
     * Gets the "ArrayOfKeyValuePairOfstringanyType" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType getArrayOfKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().find_element_user(ARRAYOFKEYVALUEPAIROFSTRINGANYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfKeyValuePairOfstringanyType" element
     */
    public boolean isNilArrayOfKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().find_element_user(ARRAYOFKEYVALUEPAIROFSTRINGANYTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfKeyValuePairOfstringanyType" element
     */
    public void setArrayOfKeyValuePairOfstringanyType(org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType arrayOfKeyValuePairOfstringanyType)
    {
        generatedSetterHelperImpl(arrayOfKeyValuePairOfstringanyType, ARRAYOFKEYVALUEPAIROFSTRINGANYTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfKeyValuePairOfstringanyType" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType addNewArrayOfKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().add_element_user(ARRAYOFKEYVALUEPAIROFSTRINGANYTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfKeyValuePairOfstringanyType" element
     */
    public void setNilArrayOfKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().find_element_user(ARRAYOFKEYVALUEPAIROFSTRINGANYTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().add_element_user(ARRAYOFKEYVALUEPAIROFSTRINGANYTYPE$0);
            }
            target.setNil();
        }
    }
}
