/*
 * XML Type:  ManagedPropertyMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ManagedPropertyMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ManagedPropertyMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.MetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DisplayName");
    private static final javax.xml.namespace.QName ENABLESATTRIBUTENAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EnablesAttributeName");
    private static final javax.xml.namespace.QName ENABLESENTITYNAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EnablesEntityName");
    private static final javax.xml.namespace.QName ERRORCODE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ErrorCode");
    private static final javax.xml.namespace.QName EVALUATIONPRIORITY$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EvaluationPriority");
    private static final javax.xml.namespace.QName ISGLOBALFOROPERATION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsGlobalForOperation");
    private static final javax.xml.namespace.QName ISPRIVATE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsPrivate");
    private static final javax.xml.namespace.QName LOGICALNAME$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "LogicalName");
    private static final javax.xml.namespace.QName MANAGEDPROPERTYTYPE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyType");
    private static final javax.xml.namespace.QName OPERATION$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Operation");
    private static final javax.xml.namespace.QName INTRODUCEDVERSION$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntroducedVersion");
    
    
    /**
     * Gets the "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Description" element
     */
    public boolean isNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.microsoft.schemas.xrm._2011.contracts.Label description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "Description" element
     */
    public void setNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "DisplayName" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DisplayName" element
     */
    public boolean isNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DisplayName" element
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(com.microsoft.schemas.xrm._2011.contracts.Label displayName)
    {
        generatedSetterHelperImpl(displayName, DISPLAYNAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DisplayName" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$2);
            return target;
        }
    }
    
    /**
     * Nils the "DisplayName" element
     */
    public void setNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DisplayName" element
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "EnablesAttributeName" element
     */
    public java.lang.String getEnablesAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLESATTRIBUTENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EnablesAttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetEnablesAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESATTRIBUTENAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EnablesAttributeName" element
     */
    public boolean isNilEnablesAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESATTRIBUTENAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EnablesAttributeName" element
     */
    public boolean isSetEnablesAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLESATTRIBUTENAME$4) != 0;
        }
    }
    
    /**
     * Sets the "EnablesAttributeName" element
     */
    public void setEnablesAttributeName(java.lang.String enablesAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLESATTRIBUTENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENABLESATTRIBUTENAME$4);
            }
            target.setStringValue(enablesAttributeName);
        }
    }
    
    /**
     * Sets (as xml) the "EnablesAttributeName" element
     */
    public void xsetEnablesAttributeName(org.apache.xmlbeans.XmlString enablesAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESATTRIBUTENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENABLESATTRIBUTENAME$4);
            }
            target.set(enablesAttributeName);
        }
    }
    
    /**
     * Nils the "EnablesAttributeName" element
     */
    public void setNilEnablesAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESATTRIBUTENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENABLESATTRIBUTENAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EnablesAttributeName" element
     */
    public void unsetEnablesAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLESATTRIBUTENAME$4, 0);
        }
    }
    
    /**
     * Gets the "EnablesEntityName" element
     */
    public java.lang.String getEnablesEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLESENTITYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EnablesEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetEnablesEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESENTITYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EnablesEntityName" element
     */
    public boolean isNilEnablesEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESENTITYNAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EnablesEntityName" element
     */
    public boolean isSetEnablesEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLESENTITYNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "EnablesEntityName" element
     */
    public void setEnablesEntityName(java.lang.String enablesEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLESENTITYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENABLESENTITYNAME$6);
            }
            target.setStringValue(enablesEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "EnablesEntityName" element
     */
    public void xsetEnablesEntityName(org.apache.xmlbeans.XmlString enablesEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESENTITYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENABLESENTITYNAME$6);
            }
            target.set(enablesEntityName);
        }
    }
    
    /**
     * Nils the "EnablesEntityName" element
     */
    public void setNilEnablesEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLESENTITYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENABLESENTITYNAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EnablesEntityName" element
     */
    public void unsetEnablesEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLESENTITYNAME$6, 0);
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public int getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorCode" element
     */
    public boolean isNilErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(int errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$8);
            }
            target.setIntValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRORCODE$8);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Nils the "ErrorCode" element
     */
    public void setNilErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRORCODE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$8, 0);
        }
    }
    
    /**
     * Gets the "EvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum getEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUATIONPRIORITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority xgetEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(EVALUATIONPRIORITY$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EvaluationPriority" element
     */
    public boolean isNilEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(EVALUATIONPRIORITY$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EvaluationPriority" element
     */
    public boolean isSetEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVALUATIONPRIORITY$10) != 0;
        }
    }
    
    /**
     * Sets the "EvaluationPriority" element
     */
    public void setEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum evaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUATIONPRIORITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVALUATIONPRIORITY$10);
            }
            target.setEnumValue(evaluationPriority);
        }
    }
    
    /**
     * Sets (as xml) the "EvaluationPriority" element
     */
    public void xsetEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority evaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(EVALUATIONPRIORITY$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().add_element_user(EVALUATIONPRIORITY$10);
            }
            target.set(evaluationPriority);
        }
    }
    
    /**
     * Nils the "EvaluationPriority" element
     */
    public void setNilEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(EVALUATIONPRIORITY$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().add_element_user(EVALUATIONPRIORITY$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EvaluationPriority" element
     */
    public void unsetEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVALUATIONPRIORITY$10, 0);
        }
    }
    
    /**
     * Gets the "IsGlobalForOperation" element
     */
    public boolean getIsGlobalForOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGLOBALFOROPERATION$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsGlobalForOperation" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsGlobalForOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBALFOROPERATION$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsGlobalForOperation" element
     */
    public boolean isNilIsGlobalForOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBALFOROPERATION$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsGlobalForOperation" element
     */
    public boolean isSetIsGlobalForOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISGLOBALFOROPERATION$12) != 0;
        }
    }
    
    /**
     * Sets the "IsGlobalForOperation" element
     */
    public void setIsGlobalForOperation(boolean isGlobalForOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGLOBALFOROPERATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISGLOBALFOROPERATION$12);
            }
            target.setBooleanValue(isGlobalForOperation);
        }
    }
    
    /**
     * Sets (as xml) the "IsGlobalForOperation" element
     */
    public void xsetIsGlobalForOperation(org.apache.xmlbeans.XmlBoolean isGlobalForOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBALFOROPERATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISGLOBALFOROPERATION$12);
            }
            target.set(isGlobalForOperation);
        }
    }
    
    /**
     * Nils the "IsGlobalForOperation" element
     */
    public void setNilIsGlobalForOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBALFOROPERATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISGLOBALFOROPERATION$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsGlobalForOperation" element
     */
    public void unsetIsGlobalForOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISGLOBALFOROPERATION$12, 0);
        }
    }
    
    /**
     * Gets the "IsPrivate" element
     */
    public boolean getIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIVATE$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPrivate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIVATE$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsPrivate" element
     */
    public boolean isNilIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIVATE$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsPrivate" element
     */
    public boolean isSetIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIVATE$14) != 0;
        }
    }
    
    /**
     * Sets the "IsPrivate" element
     */
    public void setIsPrivate(boolean isPrivate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIVATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIVATE$14);
            }
            target.setBooleanValue(isPrivate);
        }
    }
    
    /**
     * Sets (as xml) the "IsPrivate" element
     */
    public void xsetIsPrivate(org.apache.xmlbeans.XmlBoolean isPrivate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIVATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIVATE$14);
            }
            target.set(isPrivate);
        }
    }
    
    /**
     * Nils the "IsPrivate" element
     */
    public void setNilIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIVATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIVATE$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsPrivate" element
     */
    public void unsetIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIVATE$14, 0);
        }
    }
    
    /**
     * Gets the "LogicalName" element
     */
    public java.lang.String getLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LogicalName" element
     */
    public boolean isNilLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LogicalName" element
     */
    public boolean isSetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGICALNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "LogicalName" element
     */
    public void setLogicalName(java.lang.String logicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALNAME$16);
            }
            target.setStringValue(logicalName);
        }
    }
    
    /**
     * Sets (as xml) the "LogicalName" element
     */
    public void xsetLogicalName(org.apache.xmlbeans.XmlString logicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$16);
            }
            target.set(logicalName);
        }
    }
    
    /**
     * Nils the "LogicalName" element
     */
    public void setNilLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LogicalName" element
     */
    public void unsetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGICALNAME$16, 0);
        }
    }
    
    /**
     * Gets the "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum getManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYTYPE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType xgetManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyType" element
     */
    public boolean isNilManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ManagedPropertyType" element
     */
    public boolean isSetManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGEDPROPERTYTYPE$18) != 0;
        }
    }
    
    /**
     * Sets the "ManagedPropertyType" element
     */
    public void setManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYTYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYTYPE$18);
            }
            target.setEnumValue(managedPropertyType);
        }
    }
    
    /**
     * Sets (as xml) the "ManagedPropertyType" element
     */
    public void xsetManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().add_element_user(MANAGEDPROPERTYTYPE$18);
            }
            target.set(managedPropertyType);
        }
    }
    
    /**
     * Nils the "ManagedPropertyType" element
     */
    public void setNilManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().add_element_user(MANAGEDPROPERTYTYPE$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ManagedPropertyType" element
     */
    public void unsetManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGEDPROPERTYTYPE$18, 0);
        }
    }
    
    /**
     * Gets the "Operation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$20, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Operation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation xgetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(OPERATION$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Operation" element
     */
    public boolean isNilOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(OPERATION$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Operation" element
     */
    public boolean isSetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$20) != 0;
        }
    }
    
    /**
     * Sets the "Operation" element
     */
    public void setOperation(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$20);
            }
            target.setEnumValue(operation);
        }
    }
    
    /**
     * Sets (as xml) the "Operation" element
     */
    public void xsetOperation(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(OPERATION$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().add_element_user(OPERATION$20);
            }
            target.set(operation);
        }
    }
    
    /**
     * Nils the "Operation" element
     */
    public void setNilOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(OPERATION$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().add_element_user(OPERATION$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Operation" element
     */
    public void unsetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$20, 0);
        }
    }
    
    /**
     * Gets the "IntroducedVersion" element
     */
    public java.lang.String getIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntroducedVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IntroducedVersion" element
     */
    public boolean isNilIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IntroducedVersion" element
     */
    public boolean isSetIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTRODUCEDVERSION$22) != 0;
        }
    }
    
    /**
     * Sets the "IntroducedVersion" element
     */
    public void setIntroducedVersion(java.lang.String introducedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRODUCEDVERSION$22);
            }
            target.setStringValue(introducedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "IntroducedVersion" element
     */
    public void xsetIntroducedVersion(org.apache.xmlbeans.XmlString introducedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$22);
            }
            target.set(introducedVersion);
        }
    }
    
    /**
     * Nils the "IntroducedVersion" element
     */
    public void setNilIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IntroducedVersion" element
     */
    public void unsetIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTRODUCEDVERSION$22, 0);
        }
    }
}
