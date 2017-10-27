/*
 * XML Type:  LinkEntity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LinkEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML LinkEntity(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class LinkEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.LinkEntity
{
    private static final long serialVersionUID = 1L;
    
    public LinkEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Columns");
    private static final javax.xml.namespace.QName ENTITYALIAS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityAlias");
    private static final javax.xml.namespace.QName JOINOPERATOR$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "JoinOperator");
    private static final javax.xml.namespace.QName LINKCRITERIA$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkCriteria");
    private static final javax.xml.namespace.QName LINKENTITIES$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkEntities");
    private static final javax.xml.namespace.QName LINKFROMATTRIBUTENAME$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkFromAttributeName");
    private static final javax.xml.namespace.QName LINKFROMENTITYNAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkFromEntityName");
    private static final javax.xml.namespace.QName LINKTOATTRIBUTENAME$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkToAttributeName");
    private static final javax.xml.namespace.QName LINKTOENTITYNAME$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkToEntityName");
    
    
    /**
     * Gets the "Columns" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ColumnSet getColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Columns" element
     */
    public boolean isNilColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Columns" element
     */
    public boolean isSetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNS$0) != 0;
        }
    }
    
    /**
     * Sets the "Columns" element
     */
    public void setColumns(com.microsoft.schemas.xrm._2011.contracts.ColumnSet columns)
    {
        generatedSetterHelperImpl(columns, COLUMNS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Columns" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ColumnSet addNewColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Columns" element
     */
    public void setNilColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Columns" element
     */
    public void unsetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNS$0, 0);
        }
    }
    
    /**
     * Gets the "EntityAlias" element
     */
    public java.lang.String getEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityAlias" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityAlias" element
     */
    public boolean isNilEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityAlias" element
     */
    public boolean isSetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYALIAS$2) != 0;
        }
    }
    
    /**
     * Sets the "EntityAlias" element
     */
    public void setEntityAlias(java.lang.String entityAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYALIAS$2);
            }
            target.setStringValue(entityAlias);
        }
    }
    
    /**
     * Sets (as xml) the "EntityAlias" element
     */
    public void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYALIAS$2);
            }
            target.set(entityAlias);
        }
    }
    
    /**
     * Nils the "EntityAlias" element
     */
    public void setNilEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYALIAS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityAlias" element
     */
    public void unsetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYALIAS$2, 0);
        }
    }
    
    /**
     * Gets the "JoinOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum getJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINOPERATOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "JoinOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.JoinOperator xgetJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.JoinOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().find_element_user(JOINOPERATOR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "JoinOperator" element
     */
    public boolean isSetJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOINOPERATOR$4) != 0;
        }
    }
    
    /**
     * Sets the "JoinOperator" element
     */
    public void setJoinOperator(com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum joinOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINOPERATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOINOPERATOR$4);
            }
            target.setEnumValue(joinOperator);
        }
    }
    
    /**
     * Sets (as xml) the "JoinOperator" element
     */
    public void xsetJoinOperator(com.microsoft.schemas.xrm._2011.contracts.JoinOperator joinOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.JoinOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().find_element_user(JOINOPERATOR$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().add_element_user(JOINOPERATOR$4);
            }
            target.set(joinOperator);
        }
    }
    
    /**
     * Unsets the "JoinOperator" element
     */
    public void unsetJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOINOPERATOR$4, 0);
        }
    }
    
    /**
     * Gets the "LinkCriteria" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression getLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(LINKCRITERIA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkCriteria" element
     */
    public boolean isNilLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(LINKCRITERIA$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkCriteria" element
     */
    public boolean isSetLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKCRITERIA$6) != 0;
        }
    }
    
    /**
     * Sets the "LinkCriteria" element
     */
    public void setLinkCriteria(com.microsoft.schemas.xrm._2011.contracts.FilterExpression linkCriteria)
    {
        generatedSetterHelperImpl(linkCriteria, LINKCRITERIA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LinkCriteria" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression addNewLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().add_element_user(LINKCRITERIA$6);
            return target;
        }
    }
    
    /**
     * Nils the "LinkCriteria" element
     */
    public void setNilLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(LINKCRITERIA$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().add_element_user(LINKCRITERIA$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkCriteria" element
     */
    public void unsetLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKCRITERIA$6, 0);
        }
    }
    
    /**
     * Gets the "LinkEntities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity getLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkEntities" element
     */
    public boolean isNilLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkEntities" element
     */
    public boolean isSetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKENTITIES$8) != 0;
        }
    }
    
    /**
     * Sets the "LinkEntities" element
     */
    public void setLinkEntities(com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity linkEntities)
    {
        generatedSetterHelperImpl(linkEntities, LINKENTITIES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LinkEntities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity addNewLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$8);
            return target;
        }
    }
    
    /**
     * Nils the "LinkEntities" element
     */
    public void setNilLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkEntities" element
     */
    public void unsetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKENTITIES$8, 0);
        }
    }
    
    /**
     * Gets the "LinkFromAttributeName" element
     */
    public java.lang.String getLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMATTRIBUTENAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkFromAttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMATTRIBUTENAME$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkFromAttributeName" element
     */
    public boolean isNilLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMATTRIBUTENAME$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkFromAttributeName" element
     */
    public boolean isSetLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKFROMATTRIBUTENAME$10) != 0;
        }
    }
    
    /**
     * Sets the "LinkFromAttributeName" element
     */
    public void setLinkFromAttributeName(java.lang.String linkFromAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMATTRIBUTENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKFROMATTRIBUTENAME$10);
            }
            target.setStringValue(linkFromAttributeName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkFromAttributeName" element
     */
    public void xsetLinkFromAttributeName(org.apache.xmlbeans.XmlString linkFromAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMATTRIBUTENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKFROMATTRIBUTENAME$10);
            }
            target.set(linkFromAttributeName);
        }
    }
    
    /**
     * Nils the "LinkFromAttributeName" element
     */
    public void setNilLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMATTRIBUTENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKFROMATTRIBUTENAME$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkFromAttributeName" element
     */
    public void unsetLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKFROMATTRIBUTENAME$10, 0);
        }
    }
    
    /**
     * Gets the "LinkFromEntityName" element
     */
    public java.lang.String getLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMENTITYNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkFromEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMENTITYNAME$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkFromEntityName" element
     */
    public boolean isNilLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMENTITYNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkFromEntityName" element
     */
    public boolean isSetLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKFROMENTITYNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "LinkFromEntityName" element
     */
    public void setLinkFromEntityName(java.lang.String linkFromEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKFROMENTITYNAME$12);
            }
            target.setStringValue(linkFromEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkFromEntityName" element
     */
    public void xsetLinkFromEntityName(org.apache.xmlbeans.XmlString linkFromEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKFROMENTITYNAME$12);
            }
            target.set(linkFromEntityName);
        }
    }
    
    /**
     * Nils the "LinkFromEntityName" element
     */
    public void setNilLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKFROMENTITYNAME$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkFromEntityName" element
     */
    public void unsetLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKFROMENTITYNAME$12, 0);
        }
    }
    
    /**
     * Gets the "LinkToAttributeName" element
     */
    public java.lang.String getLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOATTRIBUTENAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkToAttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOATTRIBUTENAME$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkToAttributeName" element
     */
    public boolean isNilLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOATTRIBUTENAME$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkToAttributeName" element
     */
    public boolean isSetLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKTOATTRIBUTENAME$14) != 0;
        }
    }
    
    /**
     * Sets the "LinkToAttributeName" element
     */
    public void setLinkToAttributeName(java.lang.String linkToAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOATTRIBUTENAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKTOATTRIBUTENAME$14);
            }
            target.setStringValue(linkToAttributeName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkToAttributeName" element
     */
    public void xsetLinkToAttributeName(org.apache.xmlbeans.XmlString linkToAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOATTRIBUTENAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTOATTRIBUTENAME$14);
            }
            target.set(linkToAttributeName);
        }
    }
    
    /**
     * Nils the "LinkToAttributeName" element
     */
    public void setNilLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOATTRIBUTENAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTOATTRIBUTENAME$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkToAttributeName" element
     */
    public void unsetLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKTOATTRIBUTENAME$14, 0);
        }
    }
    
    /**
     * Gets the "LinkToEntityName" element
     */
    public java.lang.String getLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOENTITYNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkToEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOENTITYNAME$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkToEntityName" element
     */
    public boolean isNilLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOENTITYNAME$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkToEntityName" element
     */
    public boolean isSetLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKTOENTITYNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "LinkToEntityName" element
     */
    public void setLinkToEntityName(java.lang.String linkToEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOENTITYNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKTOENTITYNAME$16);
            }
            target.setStringValue(linkToEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkToEntityName" element
     */
    public void xsetLinkToEntityName(org.apache.xmlbeans.XmlString linkToEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOENTITYNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTOENTITYNAME$16);
            }
            target.set(linkToEntityName);
        }
    }
    
    /**
     * Nils the "LinkToEntityName" element
     */
    public void setNilLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOENTITYNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTOENTITYNAME$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkToEntityName" element
     */
    public void unsetLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKTOENTITYNAME$16, 0);
        }
    }
}
