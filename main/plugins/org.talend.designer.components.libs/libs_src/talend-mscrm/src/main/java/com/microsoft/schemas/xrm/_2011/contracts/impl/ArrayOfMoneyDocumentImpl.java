/*
 * An XML document type.
 * Localname: ArrayOfMoney
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoneyDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfMoney(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfMoneyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoneyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMoneyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMONEY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfMoney");
    
    
    /**
     * Gets the "ArrayOfMoney" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney getArrayOfMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney)get_store().find_element_user(ARRAYOFMONEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfMoney" element
     */
    public boolean isNilArrayOfMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney)get_store().find_element_user(ARRAYOFMONEY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfMoney" element
     */
    public void setArrayOfMoney(com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney arrayOfMoney)
    {
        generatedSetterHelperImpl(arrayOfMoney, ARRAYOFMONEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfMoney" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney addNewArrayOfMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney)get_store().add_element_user(ARRAYOFMONEY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfMoney" element
     */
    public void setNilArrayOfMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney)get_store().find_element_user(ARRAYOFMONEY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney)get_store().add_element_user(ARRAYOFMONEY$0);
            }
            target.setNil();
        }
    }
}
