/*
 * XML Type:  MissingComponent
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.MissingComponent
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML MissingComponent(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class MissingComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.MissingComponent
{
    private static final long serialVersionUID = 1L;
    
    public MissingComponentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPENDENTCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "DependentComponent");
    private static final javax.xml.namespace.QName REQUIREDCOMPONENT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RequiredComponent");
    
    
    /**
     * Gets the "DependentComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail getDependentComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(DEPENDENTCOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DependentComponent" element
     */
    public boolean isNilDependentComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(DEPENDENTCOMPONENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DependentComponent" element
     */
    public boolean isSetDependentComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENTCOMPONENT$0) != 0;
        }
    }
    
    /**
     * Sets the "DependentComponent" element
     */
    public void setDependentComponent(com.microsoft.schemas.crm._2011.contracts.ComponentDetail dependentComponent)
    {
        generatedSetterHelperImpl(dependentComponent, DEPENDENTCOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DependentComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail addNewDependentComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().add_element_user(DEPENDENTCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Nils the "DependentComponent" element
     */
    public void setNilDependentComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(DEPENDENTCOMPONENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().add_element_user(DEPENDENTCOMPONENT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DependentComponent" element
     */
    public void unsetDependentComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENTCOMPONENT$0, 0);
        }
    }
    
    /**
     * Gets the "RequiredComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail getRequiredComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(REQUIREDCOMPONENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RequiredComponent" element
     */
    public boolean isNilRequiredComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(REQUIREDCOMPONENT$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RequiredComponent" element
     */
    public boolean isSetRequiredComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREDCOMPONENT$2) != 0;
        }
    }
    
    /**
     * Sets the "RequiredComponent" element
     */
    public void setRequiredComponent(com.microsoft.schemas.crm._2011.contracts.ComponentDetail requiredComponent)
    {
        generatedSetterHelperImpl(requiredComponent, REQUIREDCOMPONENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RequiredComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail addNewRequiredComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().add_element_user(REQUIREDCOMPONENT$2);
            return target;
        }
    }
    
    /**
     * Nils the "RequiredComponent" element
     */
    public void setNilRequiredComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(REQUIREDCOMPONENT$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().add_element_user(REQUIREDCOMPONENT$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RequiredComponent" element
     */
    public void unsetRequiredComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREDCOMPONENT$2, 0);
        }
    }
}
