/*
 * XML Type:  EntityMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.EntityMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML EntityMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class EntityMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.MetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.EntityMetadata
{
    private static final long serialVersionUID = 1L;
    
    public EntityMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYTYPEMASK$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ActivityTypeMask");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Attributes");
    private static final javax.xml.namespace.QName AUTOCREATEACCESSTEAMS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AutoCreateAccessTeams");
    private static final javax.xml.namespace.QName AUTOROUTETOOWNERQUEUE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AutoRouteToOwnerQueue");
    private static final javax.xml.namespace.QName CANBEINMANYTOMANY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeInManyToMany");
    private static final javax.xml.namespace.QName CANBEPRIMARYENTITYINRELATIONSHIP$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBePrimaryEntityInRelationship");
    private static final javax.xml.namespace.QName CANBERELATEDENTITYINRELATIONSHIP$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeRelatedEntityInRelationship");
    private static final javax.xml.namespace.QName CANCREATEATTRIBUTES$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanCreateAttributes");
    private static final javax.xml.namespace.QName CANCREATECHARTS$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanCreateCharts");
    private static final javax.xml.namespace.QName CANCREATEFORMS$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanCreateForms");
    private static final javax.xml.namespace.QName CANCREATEVIEWS$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanCreateViews");
    private static final javax.xml.namespace.QName CANMODIFYADDITIONALSETTINGS$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanModifyAdditionalSettings");
    private static final javax.xml.namespace.QName CANTRIGGERWORKFLOW$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanTriggerWorkflow");
    private static final javax.xml.namespace.QName CHANGETRACKINGENABLED$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ChangeTrackingEnabled");
    private static final javax.xml.namespace.QName DESCRIPTION$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Description");
    private static final javax.xml.namespace.QName DISPLAYCOLLECTIONNAME$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DisplayCollectionName");
    private static final javax.xml.namespace.QName DISPLAYNAME$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DisplayName");
    private static final javax.xml.namespace.QName ENFORCESTATETRANSITIONS$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EnforceStateTransitions");
    private static final javax.xml.namespace.QName ICONLARGENAME$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IconLargeName");
    private static final javax.xml.namespace.QName ICONMEDIUMNAME$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IconMediumName");
    private static final javax.xml.namespace.QName ICONSMALLNAME$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IconSmallName");
    private static final javax.xml.namespace.QName ISAIRUPDATED$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsAIRUpdated");
    private static final javax.xml.namespace.QName ISACTIVITY$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsActivity");
    private static final javax.xml.namespace.QName ISACTIVITYPARTY$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsActivityParty");
    private static final javax.xml.namespace.QName ISAUDITENABLED$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsAuditEnabled");
    private static final javax.xml.namespace.QName ISAVAILABLEOFFLINE$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsAvailableOffline");
    private static final javax.xml.namespace.QName ISBUSINESSPROCESSENABLED$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsBusinessProcessEnabled");
    private static final javax.xml.namespace.QName ISCHILDENTITY$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsChildEntity");
    private static final javax.xml.namespace.QName ISCONNECTIONSENABLED$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsConnectionsEnabled");
    private static final javax.xml.namespace.QName ISCUSTOMENTITY$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomEntity");
    private static final javax.xml.namespace.QName ISCUSTOMIZABLE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomizable");
    private static final javax.xml.namespace.QName ISDOCUMENTMANAGEMENTENABLED$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsDocumentManagementEnabled");
    private static final javax.xml.namespace.QName ISDUPLICATEDETECTIONENABLED$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsDuplicateDetectionEnabled");
    private static final javax.xml.namespace.QName ISENABLEDFORCHARTS$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsEnabledForCharts");
    private static final javax.xml.namespace.QName ISENABLEDFORTRACE$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsEnabledForTrace");
    private static final javax.xml.namespace.QName ISIMPORTABLE$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsImportable");
    private static final javax.xml.namespace.QName ISINTERSECT$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsIntersect");
    private static final javax.xml.namespace.QName ISKNOWLEDGEMANAGEMENTENABLED$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsKnowledgeManagementEnabled");
    private static final javax.xml.namespace.QName ISMAILMERGEENABLED$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsMailMergeEnabled");
    private static final javax.xml.namespace.QName ISMANAGED$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsManaged");
    private static final javax.xml.namespace.QName ISMAPPABLE$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsMappable");
    private static final javax.xml.namespace.QName ISONENOTEINTEGRATIONENABLED$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsOneNoteIntegrationEnabled");
    private static final javax.xml.namespace.QName ISQUICKCREATEENABLED$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsQuickCreateEnabled");
    private static final javax.xml.namespace.QName ISREADONLYINMOBILECLIENT$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsReadOnlyInMobileClient");
    private static final javax.xml.namespace.QName ISREADINGPANEENABLED$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsReadingPaneEnabled");
    private static final javax.xml.namespace.QName ISRENAMEABLE$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsRenameable");
    private static final javax.xml.namespace.QName ISSTATEMODELAWARE$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsStateModelAware");
    private static final javax.xml.namespace.QName ISVALIDFORADVANCEDFIND$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsValidForAdvancedFind");
    private static final javax.xml.namespace.QName ISVALIDFORQUEUE$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsValidForQueue");
    private static final javax.xml.namespace.QName ISVISIBLEINMOBILE$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsVisibleInMobile");
    private static final javax.xml.namespace.QName ISVISIBLEINMOBILECLIENT$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsVisibleInMobileClient");
    private static final javax.xml.namespace.QName LOGICALNAME$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "LogicalName");
    private static final javax.xml.namespace.QName MANYTOMANYRELATIONSHIPS$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManyToManyRelationships");
    private static final javax.xml.namespace.QName MANYTOONERELATIONSHIPS$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManyToOneRelationships");
    private static final javax.xml.namespace.QName OBJECTTYPECODE$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ObjectTypeCode");
    private static final javax.xml.namespace.QName ONETOMANYRELATIONSHIPS$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OneToManyRelationships");
    private static final javax.xml.namespace.QName OWNERSHIPTYPE$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OwnershipType");
    private static final javax.xml.namespace.QName PRIMARYIDATTRIBUTE$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PrimaryIdAttribute");
    private static final javax.xml.namespace.QName PRIMARYNAMEATTRIBUTE$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PrimaryNameAttribute");
    private static final javax.xml.namespace.QName PRIVILEGES$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Privileges");
    private static final javax.xml.namespace.QName RECURRENCEBASEENTITYLOGICALNAME$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "RecurrenceBaseEntityLogicalName");
    private static final javax.xml.namespace.QName REPORTVIEWNAME$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ReportViewName");
    private static final javax.xml.namespace.QName SCHEMANAME$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SchemaName");
    private static final javax.xml.namespace.QName INTRODUCEDVERSION$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntroducedVersion");
    private static final javax.xml.namespace.QName PRIMARYIMAGEATTRIBUTE$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PrimaryImageAttribute");
    private static final javax.xml.namespace.QName CANCHANGEHIERARCHICALRELATIONSHIP$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanChangeHierarchicalRelationship");
    private static final javax.xml.namespace.QName ENTITYHELPURL$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EntityHelpUrl");
    private static final javax.xml.namespace.QName ENTITYHELPURLENABLED$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EntityHelpUrlEnabled");
    private static final javax.xml.namespace.QName COLLECTIONSCHEMANAME$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CollectionSchemaName");
    private static final javax.xml.namespace.QName ENTITYCOLOR$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EntityColor");
    private static final javax.xml.namespace.QName ISOPTIMISTICCONCURRENCYENABLED$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsOptimisticConcurrencyEnabled");
    private static final javax.xml.namespace.QName LOGICALCOLLECTIONNAME$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "LogicalCollectionName");
    
    
    /**
     * Gets the "ActivityTypeMask" element
     */
    public int getActivityTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTYPEMASK$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityTypeMask" element
     */
    public org.apache.xmlbeans.XmlInt xgetActivityTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYTYPEMASK$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityTypeMask" element
     */
    public boolean isNilActivityTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYTYPEMASK$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ActivityTypeMask" element
     */
    public boolean isSetActivityTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYTYPEMASK$0) != 0;
        }
    }
    
    /**
     * Sets the "ActivityTypeMask" element
     */
    public void setActivityTypeMask(int activityTypeMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTYPEMASK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYTYPEMASK$0);
            }
            target.setIntValue(activityTypeMask);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityTypeMask" element
     */
    public void xsetActivityTypeMask(org.apache.xmlbeans.XmlInt activityTypeMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYTYPEMASK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTIVITYTYPEMASK$0);
            }
            target.set(activityTypeMask);
        }
    }
    
    /**
     * Nils the "ActivityTypeMask" element
     */
    public void setNilActivityTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYTYPEMASK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTIVITYTYPEMASK$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ActivityTypeMask" element
     */
    public void unsetActivityTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYTYPEMASK$0, 0);
        }
    }
    
    /**
     * Gets the "Attributes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Attributes" element
     */
    public boolean isNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$2) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata attributes)
    {
        generatedSetterHelperImpl(attributes, ATTRIBUTES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().add_element_user(ATTRIBUTES$2);
            return target;
        }
    }
    
    /**
     * Nils the "Attributes" element
     */
    public void setNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().add_element_user(ATTRIBUTES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$2, 0);
        }
    }
    
    /**
     * Gets the "AutoCreateAccessTeams" element
     */
    public boolean getAutoCreateAccessTeams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOCREATEACCESSTEAMS$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoCreateAccessTeams" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoCreateAccessTeams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOCREATEACCESSTEAMS$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AutoCreateAccessTeams" element
     */
    public boolean isNilAutoCreateAccessTeams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOCREATEACCESSTEAMS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AutoCreateAccessTeams" element
     */
    public boolean isSetAutoCreateAccessTeams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOCREATEACCESSTEAMS$4) != 0;
        }
    }
    
    /**
     * Sets the "AutoCreateAccessTeams" element
     */
    public void setAutoCreateAccessTeams(boolean autoCreateAccessTeams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOCREATEACCESSTEAMS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOCREATEACCESSTEAMS$4);
            }
            target.setBooleanValue(autoCreateAccessTeams);
        }
    }
    
    /**
     * Sets (as xml) the "AutoCreateAccessTeams" element
     */
    public void xsetAutoCreateAccessTeams(org.apache.xmlbeans.XmlBoolean autoCreateAccessTeams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOCREATEACCESSTEAMS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOCREATEACCESSTEAMS$4);
            }
            target.set(autoCreateAccessTeams);
        }
    }
    
    /**
     * Nils the "AutoCreateAccessTeams" element
     */
    public void setNilAutoCreateAccessTeams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOCREATEACCESSTEAMS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOCREATEACCESSTEAMS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AutoCreateAccessTeams" element
     */
    public void unsetAutoCreateAccessTeams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOCREATEACCESSTEAMS$4, 0);
        }
    }
    
    /**
     * Gets the "AutoRouteToOwnerQueue" element
     */
    public boolean getAutoRouteToOwnerQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOROUTETOOWNERQUEUE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoRouteToOwnerQueue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoRouteToOwnerQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOROUTETOOWNERQUEUE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AutoRouteToOwnerQueue" element
     */
    public boolean isNilAutoRouteToOwnerQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOROUTETOOWNERQUEUE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AutoRouteToOwnerQueue" element
     */
    public boolean isSetAutoRouteToOwnerQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOROUTETOOWNERQUEUE$6) != 0;
        }
    }
    
    /**
     * Sets the "AutoRouteToOwnerQueue" element
     */
    public void setAutoRouteToOwnerQueue(boolean autoRouteToOwnerQueue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOROUTETOOWNERQUEUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOROUTETOOWNERQUEUE$6);
            }
            target.setBooleanValue(autoRouteToOwnerQueue);
        }
    }
    
    /**
     * Sets (as xml) the "AutoRouteToOwnerQueue" element
     */
    public void xsetAutoRouteToOwnerQueue(org.apache.xmlbeans.XmlBoolean autoRouteToOwnerQueue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOROUTETOOWNERQUEUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOROUTETOOWNERQUEUE$6);
            }
            target.set(autoRouteToOwnerQueue);
        }
    }
    
    /**
     * Nils the "AutoRouteToOwnerQueue" element
     */
    public void setNilAutoRouteToOwnerQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOROUTETOOWNERQUEUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOROUTETOOWNERQUEUE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AutoRouteToOwnerQueue" element
     */
    public void unsetAutoRouteToOwnerQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOROUTETOOWNERQUEUE$6, 0);
        }
    }
    
    /**
     * Gets the "CanBeInManyToMany" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanBeInManyToMany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBEINMANYTOMANY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanBeInManyToMany" element
     */
    public boolean isNilCanBeInManyToMany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBEINMANYTOMANY$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanBeInManyToMany" element
     */
    public boolean isSetCanBeInManyToMany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEINMANYTOMANY$8) != 0;
        }
    }
    
    /**
     * Sets the "CanBeInManyToMany" element
     */
    public void setCanBeInManyToMany(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canBeInManyToMany)
    {
        generatedSetterHelperImpl(canBeInManyToMany, CANBEINMANYTOMANY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanBeInManyToMany" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanBeInManyToMany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANBEINMANYTOMANY$8);
            return target;
        }
    }
    
    /**
     * Nils the "CanBeInManyToMany" element
     */
    public void setNilCanBeInManyToMany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBEINMANYTOMANY$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANBEINMANYTOMANY$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanBeInManyToMany" element
     */
    public void unsetCanBeInManyToMany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEINMANYTOMANY$8, 0);
        }
    }
    
    /**
     * Gets the "CanBePrimaryEntityInRelationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanBePrimaryEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBEPRIMARYENTITYINRELATIONSHIP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanBePrimaryEntityInRelationship" element
     */
    public boolean isNilCanBePrimaryEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBEPRIMARYENTITYINRELATIONSHIP$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanBePrimaryEntityInRelationship" element
     */
    public boolean isSetCanBePrimaryEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEPRIMARYENTITYINRELATIONSHIP$10) != 0;
        }
    }
    
    /**
     * Sets the "CanBePrimaryEntityInRelationship" element
     */
    public void setCanBePrimaryEntityInRelationship(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canBePrimaryEntityInRelationship)
    {
        generatedSetterHelperImpl(canBePrimaryEntityInRelationship, CANBEPRIMARYENTITYINRELATIONSHIP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanBePrimaryEntityInRelationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanBePrimaryEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANBEPRIMARYENTITYINRELATIONSHIP$10);
            return target;
        }
    }
    
    /**
     * Nils the "CanBePrimaryEntityInRelationship" element
     */
    public void setNilCanBePrimaryEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBEPRIMARYENTITYINRELATIONSHIP$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANBEPRIMARYENTITYINRELATIONSHIP$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanBePrimaryEntityInRelationship" element
     */
    public void unsetCanBePrimaryEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEPRIMARYENTITYINRELATIONSHIP$10, 0);
        }
    }
    
    /**
     * Gets the "CanBeRelatedEntityInRelationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanBeRelatedEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBERELATEDENTITYINRELATIONSHIP$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanBeRelatedEntityInRelationship" element
     */
    public boolean isNilCanBeRelatedEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBERELATEDENTITYINRELATIONSHIP$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanBeRelatedEntityInRelationship" element
     */
    public boolean isSetCanBeRelatedEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBERELATEDENTITYINRELATIONSHIP$12) != 0;
        }
    }
    
    /**
     * Sets the "CanBeRelatedEntityInRelationship" element
     */
    public void setCanBeRelatedEntityInRelationship(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canBeRelatedEntityInRelationship)
    {
        generatedSetterHelperImpl(canBeRelatedEntityInRelationship, CANBERELATEDENTITYINRELATIONSHIP$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanBeRelatedEntityInRelationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanBeRelatedEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANBERELATEDENTITYINRELATIONSHIP$12);
            return target;
        }
    }
    
    /**
     * Nils the "CanBeRelatedEntityInRelationship" element
     */
    public void setNilCanBeRelatedEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANBERELATEDENTITYINRELATIONSHIP$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANBERELATEDENTITYINRELATIONSHIP$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanBeRelatedEntityInRelationship" element
     */
    public void unsetCanBeRelatedEntityInRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBERELATEDENTITYINRELATIONSHIP$12, 0);
        }
    }
    
    /**
     * Gets the "CanCreateAttributes" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEATTRIBUTES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanCreateAttributes" element
     */
    public boolean isNilCanCreateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEATTRIBUTES$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanCreateAttributes" element
     */
    public boolean isSetCanCreateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCREATEATTRIBUTES$14) != 0;
        }
    }
    
    /**
     * Sets the "CanCreateAttributes" element
     */
    public void setCanCreateAttributes(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateAttributes)
    {
        generatedSetterHelperImpl(canCreateAttributes, CANCREATEATTRIBUTES$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanCreateAttributes" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATEATTRIBUTES$14);
            return target;
        }
    }
    
    /**
     * Nils the "CanCreateAttributes" element
     */
    public void setNilCanCreateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEATTRIBUTES$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATEATTRIBUTES$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanCreateAttributes" element
     */
    public void unsetCanCreateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCREATEATTRIBUTES$14, 0);
        }
    }
    
    /**
     * Gets the "CanCreateCharts" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATECHARTS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanCreateCharts" element
     */
    public boolean isNilCanCreateCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATECHARTS$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanCreateCharts" element
     */
    public boolean isSetCanCreateCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCREATECHARTS$16) != 0;
        }
    }
    
    /**
     * Sets the "CanCreateCharts" element
     */
    public void setCanCreateCharts(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateCharts)
    {
        generatedSetterHelperImpl(canCreateCharts, CANCREATECHARTS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanCreateCharts" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATECHARTS$16);
            return target;
        }
    }
    
    /**
     * Nils the "CanCreateCharts" element
     */
    public void setNilCanCreateCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATECHARTS$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATECHARTS$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanCreateCharts" element
     */
    public void unsetCanCreateCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCREATECHARTS$16, 0);
        }
    }
    
    /**
     * Gets the "CanCreateForms" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEFORMS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanCreateForms" element
     */
    public boolean isNilCanCreateForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEFORMS$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanCreateForms" element
     */
    public boolean isSetCanCreateForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCREATEFORMS$18) != 0;
        }
    }
    
    /**
     * Sets the "CanCreateForms" element
     */
    public void setCanCreateForms(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateForms)
    {
        generatedSetterHelperImpl(canCreateForms, CANCREATEFORMS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanCreateForms" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATEFORMS$18);
            return target;
        }
    }
    
    /**
     * Nils the "CanCreateForms" element
     */
    public void setNilCanCreateForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEFORMS$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATEFORMS$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanCreateForms" element
     */
    public void unsetCanCreateForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCREATEFORMS$18, 0);
        }
    }
    
    /**
     * Gets the "CanCreateViews" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEVIEWS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanCreateViews" element
     */
    public boolean isNilCanCreateViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEVIEWS$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanCreateViews" element
     */
    public boolean isSetCanCreateViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCREATEVIEWS$20) != 0;
        }
    }
    
    /**
     * Sets the "CanCreateViews" element
     */
    public void setCanCreateViews(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateViews)
    {
        generatedSetterHelperImpl(canCreateViews, CANCREATEVIEWS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanCreateViews" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATEVIEWS$20);
            return target;
        }
    }
    
    /**
     * Nils the "CanCreateViews" element
     */
    public void setNilCanCreateViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCREATEVIEWS$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCREATEVIEWS$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanCreateViews" element
     */
    public void unsetCanCreateViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCREATEVIEWS$20, 0);
        }
    }
    
    /**
     * Gets the "CanModifyAdditionalSettings" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANMODIFYADDITIONALSETTINGS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanModifyAdditionalSettings" element
     */
    public boolean isNilCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANMODIFYADDITIONALSETTINGS$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanModifyAdditionalSettings" element
     */
    public boolean isSetCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANMODIFYADDITIONALSETTINGS$22) != 0;
        }
    }
    
    /**
     * Sets the "CanModifyAdditionalSettings" element
     */
    public void setCanModifyAdditionalSettings(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canModifyAdditionalSettings)
    {
        generatedSetterHelperImpl(canModifyAdditionalSettings, CANMODIFYADDITIONALSETTINGS$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanModifyAdditionalSettings" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANMODIFYADDITIONALSETTINGS$22);
            return target;
        }
    }
    
    /**
     * Nils the "CanModifyAdditionalSettings" element
     */
    public void setNilCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANMODIFYADDITIONALSETTINGS$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANMODIFYADDITIONALSETTINGS$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanModifyAdditionalSettings" element
     */
    public void unsetCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANMODIFYADDITIONALSETTINGS$22, 0);
        }
    }
    
    /**
     * Gets the "CanTriggerWorkflow" element
     */
    public boolean getCanTriggerWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTRIGGERWORKFLOW$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanTriggerWorkflow" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanTriggerWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANTRIGGERWORKFLOW$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CanTriggerWorkflow" element
     */
    public boolean isNilCanTriggerWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANTRIGGERWORKFLOW$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanTriggerWorkflow" element
     */
    public boolean isSetCanTriggerWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANTRIGGERWORKFLOW$24) != 0;
        }
    }
    
    /**
     * Sets the "CanTriggerWorkflow" element
     */
    public void setCanTriggerWorkflow(boolean canTriggerWorkflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTRIGGERWORKFLOW$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANTRIGGERWORKFLOW$24);
            }
            target.setBooleanValue(canTriggerWorkflow);
        }
    }
    
    /**
     * Sets (as xml) the "CanTriggerWorkflow" element
     */
    public void xsetCanTriggerWorkflow(org.apache.xmlbeans.XmlBoolean canTriggerWorkflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANTRIGGERWORKFLOW$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANTRIGGERWORKFLOW$24);
            }
            target.set(canTriggerWorkflow);
        }
    }
    
    /**
     * Nils the "CanTriggerWorkflow" element
     */
    public void setNilCanTriggerWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANTRIGGERWORKFLOW$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANTRIGGERWORKFLOW$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanTriggerWorkflow" element
     */
    public void unsetCanTriggerWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANTRIGGERWORKFLOW$24, 0);
        }
    }
    
    /**
     * Gets the "ChangeTrackingEnabled" element
     */
    public boolean getChangeTrackingEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGETRACKINGENABLED$26, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChangeTrackingEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetChangeTrackingEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGETRACKINGENABLED$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ChangeTrackingEnabled" element
     */
    public boolean isNilChangeTrackingEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGETRACKINGENABLED$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ChangeTrackingEnabled" element
     */
    public boolean isSetChangeTrackingEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGETRACKINGENABLED$26) != 0;
        }
    }
    
    /**
     * Sets the "ChangeTrackingEnabled" element
     */
    public void setChangeTrackingEnabled(boolean changeTrackingEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGETRACKINGENABLED$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGETRACKINGENABLED$26);
            }
            target.setBooleanValue(changeTrackingEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "ChangeTrackingEnabled" element
     */
    public void xsetChangeTrackingEnabled(org.apache.xmlbeans.XmlBoolean changeTrackingEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGETRACKINGENABLED$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CHANGETRACKINGENABLED$26);
            }
            target.set(changeTrackingEnabled);
        }
    }
    
    /**
     * Nils the "ChangeTrackingEnabled" element
     */
    public void setNilChangeTrackingEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGETRACKINGENABLED$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CHANGETRACKINGENABLED$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ChangeTrackingEnabled" element
     */
    public void unsetChangeTrackingEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGETRACKINGENABLED$26, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$28, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$28, 0);
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
            return get_store().count_elements(DESCRIPTION$28) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.microsoft.schemas.xrm._2011.contracts.Label description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$28);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$28);
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
            get_store().remove_element(DESCRIPTION$28, 0);
        }
    }
    
    /**
     * Gets the "DisplayCollectionName" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDisplayCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYCOLLECTIONNAME$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DisplayCollectionName" element
     */
    public boolean isNilDisplayCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYCOLLECTIONNAME$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DisplayCollectionName" element
     */
    public boolean isSetDisplayCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYCOLLECTIONNAME$30) != 0;
        }
    }
    
    /**
     * Sets the "DisplayCollectionName" element
     */
    public void setDisplayCollectionName(com.microsoft.schemas.xrm._2011.contracts.Label displayCollectionName)
    {
        generatedSetterHelperImpl(displayCollectionName, DISPLAYCOLLECTIONNAME$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DisplayCollectionName" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewDisplayCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYCOLLECTIONNAME$30);
            return target;
        }
    }
    
    /**
     * Nils the "DisplayCollectionName" element
     */
    public void setNilDisplayCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYCOLLECTIONNAME$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYCOLLECTIONNAME$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DisplayCollectionName" element
     */
    public void unsetDisplayCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYCOLLECTIONNAME$30, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$32, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$32, 0);
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
            return get_store().count_elements(DISPLAYNAME$32) != 0;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(com.microsoft.schemas.xrm._2011.contracts.Label displayName)
    {
        generatedSetterHelperImpl(displayName, DISPLAYNAME$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$32);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$32);
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
            get_store().remove_element(DISPLAYNAME$32, 0);
        }
    }
    
    /**
     * Gets the "EnforceStateTransitions" element
     */
    public boolean getEnforceStateTransitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCESTATETRANSITIONS$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "EnforceStateTransitions" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnforceStateTransitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCESTATETRANSITIONS$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EnforceStateTransitions" element
     */
    public boolean isNilEnforceStateTransitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCESTATETRANSITIONS$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EnforceStateTransitions" element
     */
    public boolean isSetEnforceStateTransitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENFORCESTATETRANSITIONS$34) != 0;
        }
    }
    
    /**
     * Sets the "EnforceStateTransitions" element
     */
    public void setEnforceStateTransitions(boolean enforceStateTransitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCESTATETRANSITIONS$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENFORCESTATETRANSITIONS$34);
            }
            target.setBooleanValue(enforceStateTransitions);
        }
    }
    
    /**
     * Sets (as xml) the "EnforceStateTransitions" element
     */
    public void xsetEnforceStateTransitions(org.apache.xmlbeans.XmlBoolean enforceStateTransitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCESTATETRANSITIONS$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENFORCESTATETRANSITIONS$34);
            }
            target.set(enforceStateTransitions);
        }
    }
    
    /**
     * Nils the "EnforceStateTransitions" element
     */
    public void setNilEnforceStateTransitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCESTATETRANSITIONS$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENFORCESTATETRANSITIONS$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EnforceStateTransitions" element
     */
    public void unsetEnforceStateTransitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENFORCESTATETRANSITIONS$34, 0);
        }
    }
    
    /**
     * Gets the "IconLargeName" element
     */
    public java.lang.String getIconLargeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONLARGENAME$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IconLargeName" element
     */
    public org.apache.xmlbeans.XmlString xgetIconLargeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONLARGENAME$36, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IconLargeName" element
     */
    public boolean isNilIconLargeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONLARGENAME$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IconLargeName" element
     */
    public boolean isSetIconLargeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICONLARGENAME$36) != 0;
        }
    }
    
    /**
     * Sets the "IconLargeName" element
     */
    public void setIconLargeName(java.lang.String iconLargeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONLARGENAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICONLARGENAME$36);
            }
            target.setStringValue(iconLargeName);
        }
    }
    
    /**
     * Sets (as xml) the "IconLargeName" element
     */
    public void xsetIconLargeName(org.apache.xmlbeans.XmlString iconLargeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONLARGENAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICONLARGENAME$36);
            }
            target.set(iconLargeName);
        }
    }
    
    /**
     * Nils the "IconLargeName" element
     */
    public void setNilIconLargeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONLARGENAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICONLARGENAME$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IconLargeName" element
     */
    public void unsetIconLargeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICONLARGENAME$36, 0);
        }
    }
    
    /**
     * Gets the "IconMediumName" element
     */
    public java.lang.String getIconMediumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONMEDIUMNAME$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IconMediumName" element
     */
    public org.apache.xmlbeans.XmlString xgetIconMediumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONMEDIUMNAME$38, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IconMediumName" element
     */
    public boolean isNilIconMediumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONMEDIUMNAME$38, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IconMediumName" element
     */
    public boolean isSetIconMediumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICONMEDIUMNAME$38) != 0;
        }
    }
    
    /**
     * Sets the "IconMediumName" element
     */
    public void setIconMediumName(java.lang.String iconMediumName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONMEDIUMNAME$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICONMEDIUMNAME$38);
            }
            target.setStringValue(iconMediumName);
        }
    }
    
    /**
     * Sets (as xml) the "IconMediumName" element
     */
    public void xsetIconMediumName(org.apache.xmlbeans.XmlString iconMediumName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONMEDIUMNAME$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICONMEDIUMNAME$38);
            }
            target.set(iconMediumName);
        }
    }
    
    /**
     * Nils the "IconMediumName" element
     */
    public void setNilIconMediumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONMEDIUMNAME$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICONMEDIUMNAME$38);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IconMediumName" element
     */
    public void unsetIconMediumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICONMEDIUMNAME$38, 0);
        }
    }
    
    /**
     * Gets the "IconSmallName" element
     */
    public java.lang.String getIconSmallName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONSMALLNAME$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IconSmallName" element
     */
    public org.apache.xmlbeans.XmlString xgetIconSmallName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONSMALLNAME$40, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IconSmallName" element
     */
    public boolean isNilIconSmallName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONSMALLNAME$40, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IconSmallName" element
     */
    public boolean isSetIconSmallName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICONSMALLNAME$40) != 0;
        }
    }
    
    /**
     * Sets the "IconSmallName" element
     */
    public void setIconSmallName(java.lang.String iconSmallName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONSMALLNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICONSMALLNAME$40);
            }
            target.setStringValue(iconSmallName);
        }
    }
    
    /**
     * Sets (as xml) the "IconSmallName" element
     */
    public void xsetIconSmallName(org.apache.xmlbeans.XmlString iconSmallName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONSMALLNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICONSMALLNAME$40);
            }
            target.set(iconSmallName);
        }
    }
    
    /**
     * Nils the "IconSmallName" element
     */
    public void setNilIconSmallName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICONSMALLNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICONSMALLNAME$40);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IconSmallName" element
     */
    public void unsetIconSmallName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICONSMALLNAME$40, 0);
        }
    }
    
    /**
     * Gets the "IsAIRUpdated" element
     */
    public boolean getIsAIRUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAIRUPDATED$42, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAIRUpdated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAIRUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAIRUPDATED$42, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsAIRUpdated" element
     */
    public boolean isNilIsAIRUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAIRUPDATED$42, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsAIRUpdated" element
     */
    public boolean isSetIsAIRUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISAIRUPDATED$42) != 0;
        }
    }
    
    /**
     * Sets the "IsAIRUpdated" element
     */
    public void setIsAIRUpdated(boolean isAIRUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAIRUPDATED$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISAIRUPDATED$42);
            }
            target.setBooleanValue(isAIRUpdated);
        }
    }
    
    /**
     * Sets (as xml) the "IsAIRUpdated" element
     */
    public void xsetIsAIRUpdated(org.apache.xmlbeans.XmlBoolean isAIRUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAIRUPDATED$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISAIRUPDATED$42);
            }
            target.set(isAIRUpdated);
        }
    }
    
    /**
     * Nils the "IsAIRUpdated" element
     */
    public void setNilIsAIRUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAIRUPDATED$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISAIRUPDATED$42);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsAIRUpdated" element
     */
    public void unsetIsAIRUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISAIRUPDATED$42, 0);
        }
    }
    
    /**
     * Gets the "IsActivity" element
     */
    public boolean getIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITY$44, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActivity" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$44, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsActivity" element
     */
    public boolean isNilIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$44, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsActivity" element
     */
    public boolean isSetIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVITY$44) != 0;
        }
    }
    
    /**
     * Sets the "IsActivity" element
     */
    public void setIsActivity(boolean isActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITY$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVITY$44);
            }
            target.setBooleanValue(isActivity);
        }
    }
    
    /**
     * Sets (as xml) the "IsActivity" element
     */
    public void xsetIsActivity(org.apache.xmlbeans.XmlBoolean isActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVITY$44);
            }
            target.set(isActivity);
        }
    }
    
    /**
     * Nils the "IsActivity" element
     */
    public void setNilIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVITY$44);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsActivity" element
     */
    public void unsetIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVITY$44, 0);
        }
    }
    
    /**
     * Gets the "IsActivityParty" element
     */
    public boolean getIsActivityParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITYPARTY$46, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActivityParty" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActivityParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITYPARTY$46, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsActivityParty" element
     */
    public boolean isNilIsActivityParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITYPARTY$46, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsActivityParty" element
     */
    public boolean isSetIsActivityParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVITYPARTY$46) != 0;
        }
    }
    
    /**
     * Sets the "IsActivityParty" element
     */
    public void setIsActivityParty(boolean isActivityParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITYPARTY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVITYPARTY$46);
            }
            target.setBooleanValue(isActivityParty);
        }
    }
    
    /**
     * Sets (as xml) the "IsActivityParty" element
     */
    public void xsetIsActivityParty(org.apache.xmlbeans.XmlBoolean isActivityParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITYPARTY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVITYPARTY$46);
            }
            target.set(isActivityParty);
        }
    }
    
    /**
     * Nils the "IsActivityParty" element
     */
    public void setNilIsActivityParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITYPARTY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVITYPARTY$46);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsActivityParty" element
     */
    public void unsetIsActivityParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVITYPARTY$46, 0);
        }
    }
    
    /**
     * Gets the "IsAuditEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISAUDITENABLED$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsAuditEnabled" element
     */
    public boolean isNilIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISAUDITENABLED$48, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsAuditEnabled" element
     */
    public boolean isSetIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISAUDITENABLED$48) != 0;
        }
    }
    
    /**
     * Sets the "IsAuditEnabled" element
     */
    public void setIsAuditEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isAuditEnabled)
    {
        generatedSetterHelperImpl(isAuditEnabled, ISAUDITENABLED$48, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsAuditEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISAUDITENABLED$48);
            return target;
        }
    }
    
    /**
     * Nils the "IsAuditEnabled" element
     */
    public void setNilIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISAUDITENABLED$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISAUDITENABLED$48);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsAuditEnabled" element
     */
    public void unsetIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISAUDITENABLED$48, 0);
        }
    }
    
    /**
     * Gets the "IsAvailableOffline" element
     */
    public boolean getIsAvailableOffline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAVAILABLEOFFLINE$50, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAvailableOffline" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAvailableOffline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAVAILABLEOFFLINE$50, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsAvailableOffline" element
     */
    public boolean isNilIsAvailableOffline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAVAILABLEOFFLINE$50, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsAvailableOffline" element
     */
    public boolean isSetIsAvailableOffline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISAVAILABLEOFFLINE$50) != 0;
        }
    }
    
    /**
     * Sets the "IsAvailableOffline" element
     */
    public void setIsAvailableOffline(boolean isAvailableOffline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAVAILABLEOFFLINE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISAVAILABLEOFFLINE$50);
            }
            target.setBooleanValue(isAvailableOffline);
        }
    }
    
    /**
     * Sets (as xml) the "IsAvailableOffline" element
     */
    public void xsetIsAvailableOffline(org.apache.xmlbeans.XmlBoolean isAvailableOffline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAVAILABLEOFFLINE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISAVAILABLEOFFLINE$50);
            }
            target.set(isAvailableOffline);
        }
    }
    
    /**
     * Nils the "IsAvailableOffline" element
     */
    public void setNilIsAvailableOffline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAVAILABLEOFFLINE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISAVAILABLEOFFLINE$50);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsAvailableOffline" element
     */
    public void unsetIsAvailableOffline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISAVAILABLEOFFLINE$50, 0);
        }
    }
    
    /**
     * Gets the "IsBusinessProcessEnabled" element
     */
    public boolean getIsBusinessProcessEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBUSINESSPROCESSENABLED$52, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsBusinessProcessEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsBusinessProcessEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBUSINESSPROCESSENABLED$52, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsBusinessProcessEnabled" element
     */
    public boolean isNilIsBusinessProcessEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBUSINESSPROCESSENABLED$52, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsBusinessProcessEnabled" element
     */
    public boolean isSetIsBusinessProcessEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBUSINESSPROCESSENABLED$52) != 0;
        }
    }
    
    /**
     * Sets the "IsBusinessProcessEnabled" element
     */
    public void setIsBusinessProcessEnabled(boolean isBusinessProcessEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBUSINESSPROCESSENABLED$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBUSINESSPROCESSENABLED$52);
            }
            target.setBooleanValue(isBusinessProcessEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "IsBusinessProcessEnabled" element
     */
    public void xsetIsBusinessProcessEnabled(org.apache.xmlbeans.XmlBoolean isBusinessProcessEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBUSINESSPROCESSENABLED$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISBUSINESSPROCESSENABLED$52);
            }
            target.set(isBusinessProcessEnabled);
        }
    }
    
    /**
     * Nils the "IsBusinessProcessEnabled" element
     */
    public void setNilIsBusinessProcessEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBUSINESSPROCESSENABLED$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISBUSINESSPROCESSENABLED$52);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsBusinessProcessEnabled" element
     */
    public void unsetIsBusinessProcessEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBUSINESSPROCESSENABLED$52, 0);
        }
    }
    
    /**
     * Gets the "IsChildEntity" element
     */
    public boolean getIsChildEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCHILDENTITY$54, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsChildEntity" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsChildEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCHILDENTITY$54, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsChildEntity" element
     */
    public boolean isNilIsChildEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCHILDENTITY$54, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsChildEntity" element
     */
    public boolean isSetIsChildEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCHILDENTITY$54) != 0;
        }
    }
    
    /**
     * Sets the "IsChildEntity" element
     */
    public void setIsChildEntity(boolean isChildEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCHILDENTITY$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCHILDENTITY$54);
            }
            target.setBooleanValue(isChildEntity);
        }
    }
    
    /**
     * Sets (as xml) the "IsChildEntity" element
     */
    public void xsetIsChildEntity(org.apache.xmlbeans.XmlBoolean isChildEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCHILDENTITY$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCHILDENTITY$54);
            }
            target.set(isChildEntity);
        }
    }
    
    /**
     * Nils the "IsChildEntity" element
     */
    public void setNilIsChildEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCHILDENTITY$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCHILDENTITY$54);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsChildEntity" element
     */
    public void unsetIsChildEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCHILDENTITY$54, 0);
        }
    }
    
    /**
     * Gets the "IsConnectionsEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsConnectionsEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCONNECTIONSENABLED$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsConnectionsEnabled" element
     */
    public boolean isNilIsConnectionsEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCONNECTIONSENABLED$56, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsConnectionsEnabled" element
     */
    public boolean isSetIsConnectionsEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCONNECTIONSENABLED$56) != 0;
        }
    }
    
    /**
     * Sets the "IsConnectionsEnabled" element
     */
    public void setIsConnectionsEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isConnectionsEnabled)
    {
        generatedSetterHelperImpl(isConnectionsEnabled, ISCONNECTIONSENABLED$56, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsConnectionsEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsConnectionsEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCONNECTIONSENABLED$56);
            return target;
        }
    }
    
    /**
     * Nils the "IsConnectionsEnabled" element
     */
    public void setNilIsConnectionsEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCONNECTIONSENABLED$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCONNECTIONSENABLED$56);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsConnectionsEnabled" element
     */
    public void unsetIsConnectionsEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCONNECTIONSENABLED$56, 0);
        }
    }
    
    /**
     * Gets the "IsCustomEntity" element
     */
    public boolean getIsCustomEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMENTITY$58, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCustomEntity" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMENTITY$58, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsCustomEntity" element
     */
    public boolean isNilIsCustomEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMENTITY$58, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsCustomEntity" element
     */
    public boolean isSetIsCustomEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMENTITY$58) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomEntity" element
     */
    public void setIsCustomEntity(boolean isCustomEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMENTITY$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCUSTOMENTITY$58);
            }
            target.setBooleanValue(isCustomEntity);
        }
    }
    
    /**
     * Sets (as xml) the "IsCustomEntity" element
     */
    public void xsetIsCustomEntity(org.apache.xmlbeans.XmlBoolean isCustomEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMENTITY$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMENTITY$58);
            }
            target.set(isCustomEntity);
        }
    }
    
    /**
     * Nils the "IsCustomEntity" element
     */
    public void setNilIsCustomEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMENTITY$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMENTITY$58);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsCustomEntity" element
     */
    public void unsetIsCustomEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMENTITY$58, 0);
        }
    }
    
    /**
     * Gets the "IsCustomizable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsCustomizable" element
     */
    public boolean isNilIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$60, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsCustomizable" element
     */
    public boolean isSetIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMIZABLE$60) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomizable" element
     */
    public void setIsCustomizable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isCustomizable)
    {
        generatedSetterHelperImpl(isCustomizable, ISCUSTOMIZABLE$60, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsCustomizable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$60);
            return target;
        }
    }
    
    /**
     * Nils the "IsCustomizable" element
     */
    public void setNilIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$60);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsCustomizable" element
     */
    public void unsetIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMIZABLE$60, 0);
        }
    }
    
    /**
     * Gets the "IsDocumentManagementEnabled" element
     */
    public boolean getIsDocumentManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOCUMENTMANAGEMENTENABLED$62, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDocumentManagementEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDocumentManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOCUMENTMANAGEMENTENABLED$62, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsDocumentManagementEnabled" element
     */
    public boolean isNilIsDocumentManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOCUMENTMANAGEMENTENABLED$62, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsDocumentManagementEnabled" element
     */
    public boolean isSetIsDocumentManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDOCUMENTMANAGEMENTENABLED$62) != 0;
        }
    }
    
    /**
     * Sets the "IsDocumentManagementEnabled" element
     */
    public void setIsDocumentManagementEnabled(boolean isDocumentManagementEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOCUMENTMANAGEMENTENABLED$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDOCUMENTMANAGEMENTENABLED$62);
            }
            target.setBooleanValue(isDocumentManagementEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "IsDocumentManagementEnabled" element
     */
    public void xsetIsDocumentManagementEnabled(org.apache.xmlbeans.XmlBoolean isDocumentManagementEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOCUMENTMANAGEMENTENABLED$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDOCUMENTMANAGEMENTENABLED$62);
            }
            target.set(isDocumentManagementEnabled);
        }
    }
    
    /**
     * Nils the "IsDocumentManagementEnabled" element
     */
    public void setNilIsDocumentManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOCUMENTMANAGEMENTENABLED$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDOCUMENTMANAGEMENTENABLED$62);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsDocumentManagementEnabled" element
     */
    public void unsetIsDocumentManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDOCUMENTMANAGEMENTENABLED$62, 0);
        }
    }
    
    /**
     * Gets the "IsDuplicateDetectionEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsDuplicateDetectionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISDUPLICATEDETECTIONENABLED$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsDuplicateDetectionEnabled" element
     */
    public boolean isNilIsDuplicateDetectionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISDUPLICATEDETECTIONENABLED$64, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsDuplicateDetectionEnabled" element
     */
    public boolean isSetIsDuplicateDetectionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDUPLICATEDETECTIONENABLED$64) != 0;
        }
    }
    
    /**
     * Sets the "IsDuplicateDetectionEnabled" element
     */
    public void setIsDuplicateDetectionEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isDuplicateDetectionEnabled)
    {
        generatedSetterHelperImpl(isDuplicateDetectionEnabled, ISDUPLICATEDETECTIONENABLED$64, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsDuplicateDetectionEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsDuplicateDetectionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISDUPLICATEDETECTIONENABLED$64);
            return target;
        }
    }
    
    /**
     * Nils the "IsDuplicateDetectionEnabled" element
     */
    public void setNilIsDuplicateDetectionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISDUPLICATEDETECTIONENABLED$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISDUPLICATEDETECTIONENABLED$64);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsDuplicateDetectionEnabled" element
     */
    public void unsetIsDuplicateDetectionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDUPLICATEDETECTIONENABLED$64, 0);
        }
    }
    
    /**
     * Gets the "IsEnabledForCharts" element
     */
    public boolean getIsEnabledForCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISENABLEDFORCHARTS$66, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsEnabledForCharts" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsEnabledForCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORCHARTS$66, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsEnabledForCharts" element
     */
    public boolean isNilIsEnabledForCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORCHARTS$66, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsEnabledForCharts" element
     */
    public boolean isSetIsEnabledForCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISENABLEDFORCHARTS$66) != 0;
        }
    }
    
    /**
     * Sets the "IsEnabledForCharts" element
     */
    public void setIsEnabledForCharts(boolean isEnabledForCharts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISENABLEDFORCHARTS$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISENABLEDFORCHARTS$66);
            }
            target.setBooleanValue(isEnabledForCharts);
        }
    }
    
    /**
     * Sets (as xml) the "IsEnabledForCharts" element
     */
    public void xsetIsEnabledForCharts(org.apache.xmlbeans.XmlBoolean isEnabledForCharts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORCHARTS$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISENABLEDFORCHARTS$66);
            }
            target.set(isEnabledForCharts);
        }
    }
    
    /**
     * Nils the "IsEnabledForCharts" element
     */
    public void setNilIsEnabledForCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORCHARTS$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISENABLEDFORCHARTS$66);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsEnabledForCharts" element
     */
    public void unsetIsEnabledForCharts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISENABLEDFORCHARTS$66, 0);
        }
    }
    
    /**
     * Gets the "IsEnabledForTrace" element
     */
    public boolean getIsEnabledForTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISENABLEDFORTRACE$68, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsEnabledForTrace" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsEnabledForTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORTRACE$68, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsEnabledForTrace" element
     */
    public boolean isNilIsEnabledForTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORTRACE$68, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsEnabledForTrace" element
     */
    public boolean isSetIsEnabledForTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISENABLEDFORTRACE$68) != 0;
        }
    }
    
    /**
     * Sets the "IsEnabledForTrace" element
     */
    public void setIsEnabledForTrace(boolean isEnabledForTrace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISENABLEDFORTRACE$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISENABLEDFORTRACE$68);
            }
            target.setBooleanValue(isEnabledForTrace);
        }
    }
    
    /**
     * Sets (as xml) the "IsEnabledForTrace" element
     */
    public void xsetIsEnabledForTrace(org.apache.xmlbeans.XmlBoolean isEnabledForTrace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORTRACE$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISENABLEDFORTRACE$68);
            }
            target.set(isEnabledForTrace);
        }
    }
    
    /**
     * Nils the "IsEnabledForTrace" element
     */
    public void setNilIsEnabledForTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISENABLEDFORTRACE$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISENABLEDFORTRACE$68);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsEnabledForTrace" element
     */
    public void unsetIsEnabledForTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISENABLEDFORTRACE$68, 0);
        }
    }
    
    /**
     * Gets the "IsImportable" element
     */
    public boolean getIsImportable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISIMPORTABLE$70, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsImportable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsImportable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISIMPORTABLE$70, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsImportable" element
     */
    public boolean isNilIsImportable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISIMPORTABLE$70, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsImportable" element
     */
    public boolean isSetIsImportable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISIMPORTABLE$70) != 0;
        }
    }
    
    /**
     * Sets the "IsImportable" element
     */
    public void setIsImportable(boolean isImportable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISIMPORTABLE$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISIMPORTABLE$70);
            }
            target.setBooleanValue(isImportable);
        }
    }
    
    /**
     * Sets (as xml) the "IsImportable" element
     */
    public void xsetIsImportable(org.apache.xmlbeans.XmlBoolean isImportable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISIMPORTABLE$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISIMPORTABLE$70);
            }
            target.set(isImportable);
        }
    }
    
    /**
     * Nils the "IsImportable" element
     */
    public void setNilIsImportable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISIMPORTABLE$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISIMPORTABLE$70);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsImportable" element
     */
    public void unsetIsImportable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISIMPORTABLE$70, 0);
        }
    }
    
    /**
     * Gets the "IsIntersect" element
     */
    public boolean getIsIntersect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINTERSECT$72, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsIntersect" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsIntersect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINTERSECT$72, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsIntersect" element
     */
    public boolean isNilIsIntersect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINTERSECT$72, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsIntersect" element
     */
    public boolean isSetIsIntersect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISINTERSECT$72) != 0;
        }
    }
    
    /**
     * Sets the "IsIntersect" element
     */
    public void setIsIntersect(boolean isIntersect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINTERSECT$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISINTERSECT$72);
            }
            target.setBooleanValue(isIntersect);
        }
    }
    
    /**
     * Sets (as xml) the "IsIntersect" element
     */
    public void xsetIsIntersect(org.apache.xmlbeans.XmlBoolean isIntersect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINTERSECT$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISINTERSECT$72);
            }
            target.set(isIntersect);
        }
    }
    
    /**
     * Nils the "IsIntersect" element
     */
    public void setNilIsIntersect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINTERSECT$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISINTERSECT$72);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsIntersect" element
     */
    public void unsetIsIntersect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISINTERSECT$72, 0);
        }
    }
    
    /**
     * Gets the "IsKnowledgeManagementEnabled" element
     */
    public boolean getIsKnowledgeManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsKnowledgeManagementEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsKnowledgeManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsKnowledgeManagementEnabled" element
     */
    public boolean isNilIsKnowledgeManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsKnowledgeManagementEnabled" element
     */
    public boolean isSetIsKnowledgeManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISKNOWLEDGEMANAGEMENTENABLED$74) != 0;
        }
    }
    
    /**
     * Sets the "IsKnowledgeManagementEnabled" element
     */
    public void setIsKnowledgeManagementEnabled(boolean isKnowledgeManagementEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74);
            }
            target.setBooleanValue(isKnowledgeManagementEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "IsKnowledgeManagementEnabled" element
     */
    public void xsetIsKnowledgeManagementEnabled(org.apache.xmlbeans.XmlBoolean isKnowledgeManagementEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74);
            }
            target.set(isKnowledgeManagementEnabled);
        }
    }
    
    /**
     * Nils the "IsKnowledgeManagementEnabled" element
     */
    public void setNilIsKnowledgeManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISKNOWLEDGEMANAGEMENTENABLED$74);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsKnowledgeManagementEnabled" element
     */
    public void unsetIsKnowledgeManagementEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISKNOWLEDGEMANAGEMENTENABLED$74, 0);
        }
    }
    
    /**
     * Gets the "IsMailMergeEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsMailMergeEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISMAILMERGEENABLED$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsMailMergeEnabled" element
     */
    public boolean isNilIsMailMergeEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISMAILMERGEENABLED$76, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsMailMergeEnabled" element
     */
    public boolean isSetIsMailMergeEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMAILMERGEENABLED$76) != 0;
        }
    }
    
    /**
     * Sets the "IsMailMergeEnabled" element
     */
    public void setIsMailMergeEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isMailMergeEnabled)
    {
        generatedSetterHelperImpl(isMailMergeEnabled, ISMAILMERGEENABLED$76, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsMailMergeEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsMailMergeEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISMAILMERGEENABLED$76);
            return target;
        }
    }
    
    /**
     * Nils the "IsMailMergeEnabled" element
     */
    public void setNilIsMailMergeEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISMAILMERGEENABLED$76, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISMAILMERGEENABLED$76);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsMailMergeEnabled" element
     */
    public void unsetIsMailMergeEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMAILMERGEENABLED$76, 0);
        }
    }
    
    /**
     * Gets the "IsManaged" element
     */
    public boolean getIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$78, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsManaged" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$78, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsManaged" element
     */
    public boolean isNilIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$78, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsManaged" element
     */
    public boolean isSetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMANAGED$78) != 0;
        }
    }
    
    /**
     * Sets the "IsManaged" element
     */
    public void setIsManaged(boolean isManaged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMANAGED$78);
            }
            target.setBooleanValue(isManaged);
        }
    }
    
    /**
     * Sets (as xml) the "IsManaged" element
     */
    public void xsetIsManaged(org.apache.xmlbeans.XmlBoolean isManaged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$78);
            }
            target.set(isManaged);
        }
    }
    
    /**
     * Nils the "IsManaged" element
     */
    public void setNilIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$78);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsManaged" element
     */
    public void unsetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMANAGED$78, 0);
        }
    }
    
    /**
     * Gets the "IsMappable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsMappable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISMAPPABLE$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsMappable" element
     */
    public boolean isNilIsMappable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISMAPPABLE$80, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsMappable" element
     */
    public boolean isSetIsMappable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMAPPABLE$80) != 0;
        }
    }
    
    /**
     * Sets the "IsMappable" element
     */
    public void setIsMappable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isMappable)
    {
        generatedSetterHelperImpl(isMappable, ISMAPPABLE$80, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsMappable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsMappable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISMAPPABLE$80);
            return target;
        }
    }
    
    /**
     * Nils the "IsMappable" element
     */
    public void setNilIsMappable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISMAPPABLE$80, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISMAPPABLE$80);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsMappable" element
     */
    public void unsetIsMappable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMAPPABLE$80, 0);
        }
    }
    
    /**
     * Gets the "IsOneNoteIntegrationEnabled" element
     */
    public boolean getIsOneNoteIntegrationEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISONENOTEINTEGRATIONENABLED$82, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsOneNoteIntegrationEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsOneNoteIntegrationEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISONENOTEINTEGRATIONENABLED$82, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsOneNoteIntegrationEnabled" element
     */
    public boolean isNilIsOneNoteIntegrationEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISONENOTEINTEGRATIONENABLED$82, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsOneNoteIntegrationEnabled" element
     */
    public boolean isSetIsOneNoteIntegrationEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISONENOTEINTEGRATIONENABLED$82) != 0;
        }
    }
    
    /**
     * Sets the "IsOneNoteIntegrationEnabled" element
     */
    public void setIsOneNoteIntegrationEnabled(boolean isOneNoteIntegrationEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISONENOTEINTEGRATIONENABLED$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISONENOTEINTEGRATIONENABLED$82);
            }
            target.setBooleanValue(isOneNoteIntegrationEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "IsOneNoteIntegrationEnabled" element
     */
    public void xsetIsOneNoteIntegrationEnabled(org.apache.xmlbeans.XmlBoolean isOneNoteIntegrationEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISONENOTEINTEGRATIONENABLED$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISONENOTEINTEGRATIONENABLED$82);
            }
            target.set(isOneNoteIntegrationEnabled);
        }
    }
    
    /**
     * Nils the "IsOneNoteIntegrationEnabled" element
     */
    public void setNilIsOneNoteIntegrationEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISONENOTEINTEGRATIONENABLED$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISONENOTEINTEGRATIONENABLED$82);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsOneNoteIntegrationEnabled" element
     */
    public void unsetIsOneNoteIntegrationEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISONENOTEINTEGRATIONENABLED$82, 0);
        }
    }
    
    /**
     * Gets the "IsQuickCreateEnabled" element
     */
    public boolean getIsQuickCreateEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUICKCREATEENABLED$84, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsQuickCreateEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsQuickCreateEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUICKCREATEENABLED$84, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsQuickCreateEnabled" element
     */
    public boolean isNilIsQuickCreateEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUICKCREATEENABLED$84, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsQuickCreateEnabled" element
     */
    public boolean isSetIsQuickCreateEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISQUICKCREATEENABLED$84) != 0;
        }
    }
    
    /**
     * Sets the "IsQuickCreateEnabled" element
     */
    public void setIsQuickCreateEnabled(boolean isQuickCreateEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUICKCREATEENABLED$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISQUICKCREATEENABLED$84);
            }
            target.setBooleanValue(isQuickCreateEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "IsQuickCreateEnabled" element
     */
    public void xsetIsQuickCreateEnabled(org.apache.xmlbeans.XmlBoolean isQuickCreateEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUICKCREATEENABLED$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISQUICKCREATEENABLED$84);
            }
            target.set(isQuickCreateEnabled);
        }
    }
    
    /**
     * Nils the "IsQuickCreateEnabled" element
     */
    public void setNilIsQuickCreateEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUICKCREATEENABLED$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISQUICKCREATEENABLED$84);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsQuickCreateEnabled" element
     */
    public void unsetIsQuickCreateEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISQUICKCREATEENABLED$84, 0);
        }
    }
    
    /**
     * Gets the "IsReadOnlyInMobileClient" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsReadOnlyInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISREADONLYINMOBILECLIENT$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsReadOnlyInMobileClient" element
     */
    public boolean isNilIsReadOnlyInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISREADONLYINMOBILECLIENT$86, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsReadOnlyInMobileClient" element
     */
    public boolean isSetIsReadOnlyInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREADONLYINMOBILECLIENT$86) != 0;
        }
    }
    
    /**
     * Sets the "IsReadOnlyInMobileClient" element
     */
    public void setIsReadOnlyInMobileClient(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isReadOnlyInMobileClient)
    {
        generatedSetterHelperImpl(isReadOnlyInMobileClient, ISREADONLYINMOBILECLIENT$86, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsReadOnlyInMobileClient" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsReadOnlyInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISREADONLYINMOBILECLIENT$86);
            return target;
        }
    }
    
    /**
     * Nils the "IsReadOnlyInMobileClient" element
     */
    public void setNilIsReadOnlyInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISREADONLYINMOBILECLIENT$86, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISREADONLYINMOBILECLIENT$86);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsReadOnlyInMobileClient" element
     */
    public void unsetIsReadOnlyInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREADONLYINMOBILECLIENT$86, 0);
        }
    }
    
    /**
     * Gets the "IsReadingPaneEnabled" element
     */
    public boolean getIsReadingPaneEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREADINGPANEENABLED$88, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsReadingPaneEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsReadingPaneEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREADINGPANEENABLED$88, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsReadingPaneEnabled" element
     */
    public boolean isNilIsReadingPaneEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREADINGPANEENABLED$88, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsReadingPaneEnabled" element
     */
    public boolean isSetIsReadingPaneEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREADINGPANEENABLED$88) != 0;
        }
    }
    
    /**
     * Sets the "IsReadingPaneEnabled" element
     */
    public void setIsReadingPaneEnabled(boolean isReadingPaneEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREADINGPANEENABLED$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREADINGPANEENABLED$88);
            }
            target.setBooleanValue(isReadingPaneEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "IsReadingPaneEnabled" element
     */
    public void xsetIsReadingPaneEnabled(org.apache.xmlbeans.XmlBoolean isReadingPaneEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREADINGPANEENABLED$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREADINGPANEENABLED$88);
            }
            target.set(isReadingPaneEnabled);
        }
    }
    
    /**
     * Nils the "IsReadingPaneEnabled" element
     */
    public void setNilIsReadingPaneEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREADINGPANEENABLED$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREADINGPANEENABLED$88);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsReadingPaneEnabled" element
     */
    public void unsetIsReadingPaneEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREADINGPANEENABLED$88, 0);
        }
    }
    
    /**
     * Gets the "IsRenameable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISRENAMEABLE$90, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsRenameable" element
     */
    public boolean isNilIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISRENAMEABLE$90, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsRenameable" element
     */
    public boolean isSetIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRENAMEABLE$90) != 0;
        }
    }
    
    /**
     * Sets the "IsRenameable" element
     */
    public void setIsRenameable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isRenameable)
    {
        generatedSetterHelperImpl(isRenameable, ISRENAMEABLE$90, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsRenameable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISRENAMEABLE$90);
            return target;
        }
    }
    
    /**
     * Nils the "IsRenameable" element
     */
    public void setNilIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISRENAMEABLE$90, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISRENAMEABLE$90);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsRenameable" element
     */
    public void unsetIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRENAMEABLE$90, 0);
        }
    }
    
    /**
     * Gets the "IsStateModelAware" element
     */
    public boolean getIsStateModelAware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSTATEMODELAWARE$92, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsStateModelAware" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsStateModelAware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTATEMODELAWARE$92, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsStateModelAware" element
     */
    public boolean isNilIsStateModelAware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTATEMODELAWARE$92, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsStateModelAware" element
     */
    public boolean isSetIsStateModelAware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSTATEMODELAWARE$92) != 0;
        }
    }
    
    /**
     * Sets the "IsStateModelAware" element
     */
    public void setIsStateModelAware(boolean isStateModelAware)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSTATEMODELAWARE$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSTATEMODELAWARE$92);
            }
            target.setBooleanValue(isStateModelAware);
        }
    }
    
    /**
     * Sets (as xml) the "IsStateModelAware" element
     */
    public void xsetIsStateModelAware(org.apache.xmlbeans.XmlBoolean isStateModelAware)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTATEMODELAWARE$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSTATEMODELAWARE$92);
            }
            target.set(isStateModelAware);
        }
    }
    
    /**
     * Nils the "IsStateModelAware" element
     */
    public void setNilIsStateModelAware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSTATEMODELAWARE$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSTATEMODELAWARE$92);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsStateModelAware" element
     */
    public void unsetIsStateModelAware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSTATEMODELAWARE$92, 0);
        }
    }
    
    /**
     * Gets the "IsValidForAdvancedFind" element
     */
    public boolean getIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORADVANCEDFIND$94, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsValidForAdvancedFind" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$94, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsValidForAdvancedFind" element
     */
    public boolean isNilIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$94, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsValidForAdvancedFind" element
     */
    public boolean isSetIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVALIDFORADVANCEDFIND$94) != 0;
        }
    }
    
    /**
     * Sets the "IsValidForAdvancedFind" element
     */
    public void setIsValidForAdvancedFind(boolean isValidForAdvancedFind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORADVANCEDFIND$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVALIDFORADVANCEDFIND$94);
            }
            target.setBooleanValue(isValidForAdvancedFind);
        }
    }
    
    /**
     * Sets (as xml) the "IsValidForAdvancedFind" element
     */
    public void xsetIsValidForAdvancedFind(org.apache.xmlbeans.XmlBoolean isValidForAdvancedFind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORADVANCEDFIND$94);
            }
            target.set(isValidForAdvancedFind);
        }
    }
    
    /**
     * Nils the "IsValidForAdvancedFind" element
     */
    public void setNilIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORADVANCEDFIND$94);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsValidForAdvancedFind" element
     */
    public void unsetIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVALIDFORADVANCEDFIND$94, 0);
        }
    }
    
    /**
     * Gets the "IsValidForQueue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsValidForQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVALIDFORQUEUE$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsValidForQueue" element
     */
    public boolean isNilIsValidForQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVALIDFORQUEUE$96, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsValidForQueue" element
     */
    public boolean isSetIsValidForQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVALIDFORQUEUE$96) != 0;
        }
    }
    
    /**
     * Sets the "IsValidForQueue" element
     */
    public void setIsValidForQueue(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isValidForQueue)
    {
        generatedSetterHelperImpl(isValidForQueue, ISVALIDFORQUEUE$96, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsValidForQueue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsValidForQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVALIDFORQUEUE$96);
            return target;
        }
    }
    
    /**
     * Nils the "IsValidForQueue" element
     */
    public void setNilIsValidForQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVALIDFORQUEUE$96, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVALIDFORQUEUE$96);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsValidForQueue" element
     */
    public void unsetIsValidForQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVALIDFORQUEUE$96, 0);
        }
    }
    
    /**
     * Gets the "IsVisibleInMobile" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsVisibleInMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVISIBLEINMOBILE$98, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsVisibleInMobile" element
     */
    public boolean isNilIsVisibleInMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVISIBLEINMOBILE$98, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsVisibleInMobile" element
     */
    public boolean isSetIsVisibleInMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVISIBLEINMOBILE$98) != 0;
        }
    }
    
    /**
     * Sets the "IsVisibleInMobile" element
     */
    public void setIsVisibleInMobile(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isVisibleInMobile)
    {
        generatedSetterHelperImpl(isVisibleInMobile, ISVISIBLEINMOBILE$98, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsVisibleInMobile" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsVisibleInMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVISIBLEINMOBILE$98);
            return target;
        }
    }
    
    /**
     * Nils the "IsVisibleInMobile" element
     */
    public void setNilIsVisibleInMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVISIBLEINMOBILE$98, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVISIBLEINMOBILE$98);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsVisibleInMobile" element
     */
    public void unsetIsVisibleInMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVISIBLEINMOBILE$98, 0);
        }
    }
    
    /**
     * Gets the "IsVisibleInMobileClient" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsVisibleInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVISIBLEINMOBILECLIENT$100, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsVisibleInMobileClient" element
     */
    public boolean isNilIsVisibleInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVISIBLEINMOBILECLIENT$100, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsVisibleInMobileClient" element
     */
    public boolean isSetIsVisibleInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVISIBLEINMOBILECLIENT$100) != 0;
        }
    }
    
    /**
     * Sets the "IsVisibleInMobileClient" element
     */
    public void setIsVisibleInMobileClient(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isVisibleInMobileClient)
    {
        generatedSetterHelperImpl(isVisibleInMobileClient, ISVISIBLEINMOBILECLIENT$100, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsVisibleInMobileClient" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsVisibleInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVISIBLEINMOBILECLIENT$100);
            return target;
        }
    }
    
    /**
     * Nils the "IsVisibleInMobileClient" element
     */
    public void setNilIsVisibleInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVISIBLEINMOBILECLIENT$100, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVISIBLEINMOBILECLIENT$100);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsVisibleInMobileClient" element
     */
    public void unsetIsVisibleInMobileClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVISIBLEINMOBILECLIENT$100, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$102, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$102, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$102, 0);
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
            return get_store().count_elements(LOGICALNAME$102) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALNAME$102);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$102);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$102);
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
            get_store().remove_element(LOGICALNAME$102, 0);
        }
    }
    
    /**
     * Gets the "ManyToManyRelationships" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata getManyToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPS$104, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManyToManyRelationships" element
     */
    public boolean isNilManyToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPS$104, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ManyToManyRelationships" element
     */
    public boolean isSetManyToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANYTOMANYRELATIONSHIPS$104) != 0;
        }
    }
    
    /**
     * Sets the "ManyToManyRelationships" element
     */
    public void setManyToManyRelationships(com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata manyToManyRelationships)
    {
        generatedSetterHelperImpl(manyToManyRelationships, MANYTOMANYRELATIONSHIPS$104, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManyToManyRelationships" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata addNewManyToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().add_element_user(MANYTOMANYRELATIONSHIPS$104);
            return target;
        }
    }
    
    /**
     * Nils the "ManyToManyRelationships" element
     */
    public void setNilManyToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPS$104, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().add_element_user(MANYTOMANYRELATIONSHIPS$104);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ManyToManyRelationships" element
     */
    public void unsetManyToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANYTOMANYRELATIONSHIPS$104, 0);
        }
    }
    
    /**
     * Gets the "ManyToOneRelationships" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata getManyToOneRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(MANYTOONERELATIONSHIPS$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManyToOneRelationships" element
     */
    public boolean isNilManyToOneRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(MANYTOONERELATIONSHIPS$106, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ManyToOneRelationships" element
     */
    public boolean isSetManyToOneRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANYTOONERELATIONSHIPS$106) != 0;
        }
    }
    
    /**
     * Sets the "ManyToOneRelationships" element
     */
    public void setManyToOneRelationships(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata manyToOneRelationships)
    {
        generatedSetterHelperImpl(manyToOneRelationships, MANYTOONERELATIONSHIPS$106, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManyToOneRelationships" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata addNewManyToOneRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().add_element_user(MANYTOONERELATIONSHIPS$106);
            return target;
        }
    }
    
    /**
     * Nils the "ManyToOneRelationships" element
     */
    public void setNilManyToOneRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(MANYTOONERELATIONSHIPS$106, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().add_element_user(MANYTOONERELATIONSHIPS$106);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ManyToOneRelationships" element
     */
    public void unsetManyToOneRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANYTOONERELATIONSHIPS$106, 0);
        }
    }
    
    /**
     * Gets the "ObjectTypeCode" element
     */
    public int getObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPECODE$108, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectTypeCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OBJECTTYPECODE$108, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ObjectTypeCode" element
     */
    public boolean isNilObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OBJECTTYPECODE$108, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ObjectTypeCode" element
     */
    public boolean isSetObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTTYPECODE$108) != 0;
        }
    }
    
    /**
     * Sets the "ObjectTypeCode" element
     */
    public void setObjectTypeCode(int objectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPECODE$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPECODE$108);
            }
            target.setIntValue(objectTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectTypeCode" element
     */
    public void xsetObjectTypeCode(org.apache.xmlbeans.XmlInt objectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OBJECTTYPECODE$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OBJECTTYPECODE$108);
            }
            target.set(objectTypeCode);
        }
    }
    
    /**
     * Nils the "ObjectTypeCode" element
     */
    public void setNilObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OBJECTTYPECODE$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OBJECTTYPECODE$108);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ObjectTypeCode" element
     */
    public void unsetObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTTYPECODE$108, 0);
        }
    }
    
    /**
     * Gets the "OneToManyRelationships" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata getOneToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPS$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OneToManyRelationships" element
     */
    public boolean isNilOneToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPS$110, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OneToManyRelationships" element
     */
    public boolean isSetOneToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONETOMANYRELATIONSHIPS$110) != 0;
        }
    }
    
    /**
     * Sets the "OneToManyRelationships" element
     */
    public void setOneToManyRelationships(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata oneToManyRelationships)
    {
        generatedSetterHelperImpl(oneToManyRelationships, ONETOMANYRELATIONSHIPS$110, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OneToManyRelationships" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata addNewOneToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().add_element_user(ONETOMANYRELATIONSHIPS$110);
            return target;
        }
    }
    
    /**
     * Nils the "OneToManyRelationships" element
     */
    public void setNilOneToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPS$110, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().add_element_user(ONETOMANYRELATIONSHIPS$110);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OneToManyRelationships" element
     */
    public void unsetOneToManyRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONETOMANYRELATIONSHIPS$110, 0);
        }
    }
    
    /**
     * Gets the "OwnershipType" element
     */
    public java.util.List getOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$112, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwnershipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes xgetOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPE$112, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OwnershipType" element
     */
    public boolean isNilOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPE$112, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OwnershipType" element
     */
    public boolean isSetOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERSHIPTYPE$112) != 0;
        }
    }
    
    /**
     * Sets the "OwnershipType" element
     */
    public void setOwnershipType(java.util.List ownershipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPTYPE$112);
            }
            target.setListValue(ownershipType);
        }
    }
    
    /**
     * Sets (as xml) the "OwnershipType" element
     */
    public void xsetOwnershipType(com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes ownershipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPE$112, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().add_element_user(OWNERSHIPTYPE$112);
            }
            target.set(ownershipType);
        }
    }
    
    /**
     * Nils the "OwnershipType" element
     */
    public void setNilOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPE$112, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().add_element_user(OWNERSHIPTYPE$112);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OwnershipType" element
     */
    public void unsetOwnershipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERSHIPTYPE$112, 0);
        }
    }
    
    /**
     * Gets the "PrimaryIdAttribute" element
     */
    public java.lang.String getPrimaryIdAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYIDATTRIBUTE$114, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrimaryIdAttribute" element
     */
    public org.apache.xmlbeans.XmlString xgetPrimaryIdAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIDATTRIBUTE$114, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrimaryIdAttribute" element
     */
    public boolean isNilPrimaryIdAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIDATTRIBUTE$114, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PrimaryIdAttribute" element
     */
    public boolean isSetPrimaryIdAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYIDATTRIBUTE$114) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryIdAttribute" element
     */
    public void setPrimaryIdAttribute(java.lang.String primaryIdAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYIDATTRIBUTE$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYIDATTRIBUTE$114);
            }
            target.setStringValue(primaryIdAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "PrimaryIdAttribute" element
     */
    public void xsetPrimaryIdAttribute(org.apache.xmlbeans.XmlString primaryIdAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIDATTRIBUTE$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYIDATTRIBUTE$114);
            }
            target.set(primaryIdAttribute);
        }
    }
    
    /**
     * Nils the "PrimaryIdAttribute" element
     */
    public void setNilPrimaryIdAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIDATTRIBUTE$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYIDATTRIBUTE$114);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PrimaryIdAttribute" element
     */
    public void unsetPrimaryIdAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYIDATTRIBUTE$114, 0);
        }
    }
    
    /**
     * Gets the "PrimaryNameAttribute" element
     */
    public java.lang.String getPrimaryNameAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYNAMEATTRIBUTE$116, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrimaryNameAttribute" element
     */
    public org.apache.xmlbeans.XmlString xgetPrimaryNameAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYNAMEATTRIBUTE$116, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrimaryNameAttribute" element
     */
    public boolean isNilPrimaryNameAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYNAMEATTRIBUTE$116, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PrimaryNameAttribute" element
     */
    public boolean isSetPrimaryNameAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYNAMEATTRIBUTE$116) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryNameAttribute" element
     */
    public void setPrimaryNameAttribute(java.lang.String primaryNameAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYNAMEATTRIBUTE$116, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYNAMEATTRIBUTE$116);
            }
            target.setStringValue(primaryNameAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "PrimaryNameAttribute" element
     */
    public void xsetPrimaryNameAttribute(org.apache.xmlbeans.XmlString primaryNameAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYNAMEATTRIBUTE$116, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYNAMEATTRIBUTE$116);
            }
            target.set(primaryNameAttribute);
        }
    }
    
    /**
     * Nils the "PrimaryNameAttribute" element
     */
    public void setNilPrimaryNameAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYNAMEATTRIBUTE$116, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYNAMEATTRIBUTE$116);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PrimaryNameAttribute" element
     */
    public void unsetPrimaryNameAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYNAMEATTRIBUTE$116, 0);
        }
    }
    
    /**
     * Gets the "Privileges" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata getPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().find_element_user(PRIVILEGES$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Privileges" element
     */
    public boolean isNilPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().find_element_user(PRIVILEGES$118, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Privileges" element
     */
    public boolean isSetPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVILEGES$118) != 0;
        }
    }
    
    /**
     * Sets the "Privileges" element
     */
    public void setPrivileges(com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata privileges)
    {
        generatedSetterHelperImpl(privileges, PRIVILEGES$118, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Privileges" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata addNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().add_element_user(PRIVILEGES$118);
            return target;
        }
    }
    
    /**
     * Nils the "Privileges" element
     */
    public void setNilPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().find_element_user(PRIVILEGES$118, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata)get_store().add_element_user(PRIVILEGES$118);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Privileges" element
     */
    public void unsetPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVILEGES$118, 0);
        }
    }
    
    /**
     * Gets the "RecurrenceBaseEntityLogicalName" element
     */
    public java.lang.String getRecurrenceBaseEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEBASEENTITYLOGICALNAME$120, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrenceBaseEntityLogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetRecurrenceBaseEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEBASEENTITYLOGICALNAME$120, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RecurrenceBaseEntityLogicalName" element
     */
    public boolean isNilRecurrenceBaseEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEBASEENTITYLOGICALNAME$120, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RecurrenceBaseEntityLogicalName" element
     */
    public boolean isSetRecurrenceBaseEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECURRENCEBASEENTITYLOGICALNAME$120) != 0;
        }
    }
    
    /**
     * Sets the "RecurrenceBaseEntityLogicalName" element
     */
    public void setRecurrenceBaseEntityLogicalName(java.lang.String recurrenceBaseEntityLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEBASEENTITYLOGICALNAME$120, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCEBASEENTITYLOGICALNAME$120);
            }
            target.setStringValue(recurrenceBaseEntityLogicalName);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrenceBaseEntityLogicalName" element
     */
    public void xsetRecurrenceBaseEntityLogicalName(org.apache.xmlbeans.XmlString recurrenceBaseEntityLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEBASEENTITYLOGICALNAME$120, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECURRENCEBASEENTITYLOGICALNAME$120);
            }
            target.set(recurrenceBaseEntityLogicalName);
        }
    }
    
    /**
     * Nils the "RecurrenceBaseEntityLogicalName" element
     */
    public void setNilRecurrenceBaseEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEBASEENTITYLOGICALNAME$120, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECURRENCEBASEENTITYLOGICALNAME$120);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RecurrenceBaseEntityLogicalName" element
     */
    public void unsetRecurrenceBaseEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECURRENCEBASEENTITYLOGICALNAME$120, 0);
        }
    }
    
    /**
     * Gets the "ReportViewName" element
     */
    public java.lang.String getReportViewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTVIEWNAME$122, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportViewName" element
     */
    public org.apache.xmlbeans.XmlString xgetReportViewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTVIEWNAME$122, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ReportViewName" element
     */
    public boolean isNilReportViewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTVIEWNAME$122, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ReportViewName" element
     */
    public boolean isSetReportViewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTVIEWNAME$122) != 0;
        }
    }
    
    /**
     * Sets the "ReportViewName" element
     */
    public void setReportViewName(java.lang.String reportViewName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTVIEWNAME$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTVIEWNAME$122);
            }
            target.setStringValue(reportViewName);
        }
    }
    
    /**
     * Sets (as xml) the "ReportViewName" element
     */
    public void xsetReportViewName(org.apache.xmlbeans.XmlString reportViewName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTVIEWNAME$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORTVIEWNAME$122);
            }
            target.set(reportViewName);
        }
    }
    
    /**
     * Nils the "ReportViewName" element
     */
    public void setNilReportViewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTVIEWNAME$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORTVIEWNAME$122);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ReportViewName" element
     */
    public void unsetReportViewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTVIEWNAME$122, 0);
        }
    }
    
    /**
     * Gets the "SchemaName" element
     */
    public java.lang.String getSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$124, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SchemaName" element
     */
    public org.apache.xmlbeans.XmlString xgetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$124, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SchemaName" element
     */
    public boolean isNilSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$124, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SchemaName" element
     */
    public boolean isSetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMANAME$124) != 0;
        }
    }
    
    /**
     * Sets the "SchemaName" element
     */
    public void setSchemaName(java.lang.String schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMANAME$124);
            }
            target.setStringValue(schemaName);
        }
    }
    
    /**
     * Sets (as xml) the "SchemaName" element
     */
    public void xsetSchemaName(org.apache.xmlbeans.XmlString schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$124);
            }
            target.set(schemaName);
        }
    }
    
    /**
     * Nils the "SchemaName" element
     */
    public void setNilSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$124);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SchemaName" element
     */
    public void unsetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMANAME$124, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$126, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$126, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$126, 0);
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
            return get_store().count_elements(INTRODUCEDVERSION$126) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRODUCEDVERSION$126);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$126);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$126);
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
            get_store().remove_element(INTRODUCEDVERSION$126, 0);
        }
    }
    
    /**
     * Gets the "PrimaryImageAttribute" element
     */
    public java.lang.String getPrimaryImageAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYIMAGEATTRIBUTE$128, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrimaryImageAttribute" element
     */
    public org.apache.xmlbeans.XmlString xgetPrimaryImageAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIMAGEATTRIBUTE$128, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrimaryImageAttribute" element
     */
    public boolean isNilPrimaryImageAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIMAGEATTRIBUTE$128, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PrimaryImageAttribute" element
     */
    public boolean isSetPrimaryImageAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYIMAGEATTRIBUTE$128) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryImageAttribute" element
     */
    public void setPrimaryImageAttribute(java.lang.String primaryImageAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYIMAGEATTRIBUTE$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYIMAGEATTRIBUTE$128);
            }
            target.setStringValue(primaryImageAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "PrimaryImageAttribute" element
     */
    public void xsetPrimaryImageAttribute(org.apache.xmlbeans.XmlString primaryImageAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIMAGEATTRIBUTE$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYIMAGEATTRIBUTE$128);
            }
            target.set(primaryImageAttribute);
        }
    }
    
    /**
     * Nils the "PrimaryImageAttribute" element
     */
    public void setNilPrimaryImageAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYIMAGEATTRIBUTE$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYIMAGEATTRIBUTE$128);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PrimaryImageAttribute" element
     */
    public void unsetPrimaryImageAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYIMAGEATTRIBUTE$128, 0);
        }
    }
    
    /**
     * Gets the "CanChangeHierarchicalRelationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanChangeHierarchicalRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCHANGEHIERARCHICALRELATIONSHIP$130, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanChangeHierarchicalRelationship" element
     */
    public boolean isNilCanChangeHierarchicalRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCHANGEHIERARCHICALRELATIONSHIP$130, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanChangeHierarchicalRelationship" element
     */
    public boolean isSetCanChangeHierarchicalRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCHANGEHIERARCHICALRELATIONSHIP$130) != 0;
        }
    }
    
    /**
     * Sets the "CanChangeHierarchicalRelationship" element
     */
    public void setCanChangeHierarchicalRelationship(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canChangeHierarchicalRelationship)
    {
        generatedSetterHelperImpl(canChangeHierarchicalRelationship, CANCHANGEHIERARCHICALRELATIONSHIP$130, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanChangeHierarchicalRelationship" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanChangeHierarchicalRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCHANGEHIERARCHICALRELATIONSHIP$130);
            return target;
        }
    }
    
    /**
     * Nils the "CanChangeHierarchicalRelationship" element
     */
    public void setNilCanChangeHierarchicalRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANCHANGEHIERARCHICALRELATIONSHIP$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANCHANGEHIERARCHICALRELATIONSHIP$130);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanChangeHierarchicalRelationship" element
     */
    public void unsetCanChangeHierarchicalRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCHANGEHIERARCHICALRELATIONSHIP$130, 0);
        }
    }
    
    /**
     * Gets the "EntityHelpUrl" element
     */
    public java.lang.String getEntityHelpUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYHELPURL$132, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityHelpUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityHelpUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYHELPURL$132, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityHelpUrl" element
     */
    public boolean isNilEntityHelpUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYHELPURL$132, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityHelpUrl" element
     */
    public boolean isSetEntityHelpUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYHELPURL$132) != 0;
        }
    }
    
    /**
     * Sets the "EntityHelpUrl" element
     */
    public void setEntityHelpUrl(java.lang.String entityHelpUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYHELPURL$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYHELPURL$132);
            }
            target.setStringValue(entityHelpUrl);
        }
    }
    
    /**
     * Sets (as xml) the "EntityHelpUrl" element
     */
    public void xsetEntityHelpUrl(org.apache.xmlbeans.XmlString entityHelpUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYHELPURL$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYHELPURL$132);
            }
            target.set(entityHelpUrl);
        }
    }
    
    /**
     * Nils the "EntityHelpUrl" element
     */
    public void setNilEntityHelpUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYHELPURL$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYHELPURL$132);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityHelpUrl" element
     */
    public void unsetEntityHelpUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYHELPURL$132, 0);
        }
    }
    
    /**
     * Gets the "EntityHelpUrlEnabled" element
     */
    public boolean getEntityHelpUrlEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYHELPURLENABLED$134, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityHelpUrlEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEntityHelpUrlEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTITYHELPURLENABLED$134, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityHelpUrlEnabled" element
     */
    public boolean isNilEntityHelpUrlEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTITYHELPURLENABLED$134, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityHelpUrlEnabled" element
     */
    public boolean isSetEntityHelpUrlEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYHELPURLENABLED$134) != 0;
        }
    }
    
    /**
     * Sets the "EntityHelpUrlEnabled" element
     */
    public void setEntityHelpUrlEnabled(boolean entityHelpUrlEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYHELPURLENABLED$134, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYHELPURLENABLED$134);
            }
            target.setBooleanValue(entityHelpUrlEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "EntityHelpUrlEnabled" element
     */
    public void xsetEntityHelpUrlEnabled(org.apache.xmlbeans.XmlBoolean entityHelpUrlEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTITYHELPURLENABLED$134, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENTITYHELPURLENABLED$134);
            }
            target.set(entityHelpUrlEnabled);
        }
    }
    
    /**
     * Nils the "EntityHelpUrlEnabled" element
     */
    public void setNilEntityHelpUrlEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTITYHELPURLENABLED$134, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENTITYHELPURLENABLED$134);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityHelpUrlEnabled" element
     */
    public void unsetEntityHelpUrlEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYHELPURLENABLED$134, 0);
        }
    }
    
    /**
     * Gets the "CollectionSchemaName" element
     */
    public java.lang.String getCollectionSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIONSCHEMANAME$136, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CollectionSchemaName" element
     */
    public org.apache.xmlbeans.XmlString xgetCollectionSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIONSCHEMANAME$136, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CollectionSchemaName" element
     */
    public boolean isNilCollectionSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIONSCHEMANAME$136, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CollectionSchemaName" element
     */
    public boolean isSetCollectionSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLECTIONSCHEMANAME$136) != 0;
        }
    }
    
    /**
     * Sets the "CollectionSchemaName" element
     */
    public void setCollectionSchemaName(java.lang.String collectionSchemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIONSCHEMANAME$136, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIONSCHEMANAME$136);
            }
            target.setStringValue(collectionSchemaName);
        }
    }
    
    /**
     * Sets (as xml) the "CollectionSchemaName" element
     */
    public void xsetCollectionSchemaName(org.apache.xmlbeans.XmlString collectionSchemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIONSCHEMANAME$136, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIONSCHEMANAME$136);
            }
            target.set(collectionSchemaName);
        }
    }
    
    /**
     * Nils the "CollectionSchemaName" element
     */
    public void setNilCollectionSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIONSCHEMANAME$136, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIONSCHEMANAME$136);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CollectionSchemaName" element
     */
    public void unsetCollectionSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLECTIONSCHEMANAME$136, 0);
        }
    }
    
    /**
     * Gets the "EntityColor" element
     */
    public java.lang.String getEntityColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYCOLOR$138, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityColor" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYCOLOR$138, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityColor" element
     */
    public boolean isNilEntityColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYCOLOR$138, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityColor" element
     */
    public boolean isSetEntityColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYCOLOR$138) != 0;
        }
    }
    
    /**
     * Sets the "EntityColor" element
     */
    public void setEntityColor(java.lang.String entityColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYCOLOR$138, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYCOLOR$138);
            }
            target.setStringValue(entityColor);
        }
    }
    
    /**
     * Sets (as xml) the "EntityColor" element
     */
    public void xsetEntityColor(org.apache.xmlbeans.XmlString entityColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYCOLOR$138, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYCOLOR$138);
            }
            target.set(entityColor);
        }
    }
    
    /**
     * Nils the "EntityColor" element
     */
    public void setNilEntityColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYCOLOR$138, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYCOLOR$138);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityColor" element
     */
    public void unsetEntityColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYCOLOR$138, 0);
        }
    }
    
    /**
     * Gets the "IsOptimisticConcurrencyEnabled" element
     */
    public boolean getIsOptimisticConcurrencyEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOPTIMISTICCONCURRENCYENABLED$140, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsOptimisticConcurrencyEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsOptimisticConcurrencyEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOPTIMISTICCONCURRENCYENABLED$140, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsOptimisticConcurrencyEnabled" element
     */
    public boolean isNilIsOptimisticConcurrencyEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOPTIMISTICCONCURRENCYENABLED$140, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsOptimisticConcurrencyEnabled" element
     */
    public boolean isSetIsOptimisticConcurrencyEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISOPTIMISTICCONCURRENCYENABLED$140) != 0;
        }
    }
    
    /**
     * Sets the "IsOptimisticConcurrencyEnabled" element
     */
    public void setIsOptimisticConcurrencyEnabled(boolean isOptimisticConcurrencyEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOPTIMISTICCONCURRENCYENABLED$140, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOPTIMISTICCONCURRENCYENABLED$140);
            }
            target.setBooleanValue(isOptimisticConcurrencyEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "IsOptimisticConcurrencyEnabled" element
     */
    public void xsetIsOptimisticConcurrencyEnabled(org.apache.xmlbeans.XmlBoolean isOptimisticConcurrencyEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOPTIMISTICCONCURRENCYENABLED$140, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISOPTIMISTICCONCURRENCYENABLED$140);
            }
            target.set(isOptimisticConcurrencyEnabled);
        }
    }
    
    /**
     * Nils the "IsOptimisticConcurrencyEnabled" element
     */
    public void setNilIsOptimisticConcurrencyEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOPTIMISTICCONCURRENCYENABLED$140, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISOPTIMISTICCONCURRENCYENABLED$140);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsOptimisticConcurrencyEnabled" element
     */
    public void unsetIsOptimisticConcurrencyEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISOPTIMISTICCONCURRENCYENABLED$140, 0);
        }
    }
    
    /**
     * Gets the "LogicalCollectionName" element
     */
    public java.lang.String getLogicalCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALCOLLECTIONNAME$142, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogicalCollectionName" element
     */
    public org.apache.xmlbeans.XmlString xgetLogicalCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALCOLLECTIONNAME$142, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LogicalCollectionName" element
     */
    public boolean isNilLogicalCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALCOLLECTIONNAME$142, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LogicalCollectionName" element
     */
    public boolean isSetLogicalCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGICALCOLLECTIONNAME$142) != 0;
        }
    }
    
    /**
     * Sets the "LogicalCollectionName" element
     */
    public void setLogicalCollectionName(java.lang.String logicalCollectionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALCOLLECTIONNAME$142, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALCOLLECTIONNAME$142);
            }
            target.setStringValue(logicalCollectionName);
        }
    }
    
    /**
     * Sets (as xml) the "LogicalCollectionName" element
     */
    public void xsetLogicalCollectionName(org.apache.xmlbeans.XmlString logicalCollectionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALCOLLECTIONNAME$142, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALCOLLECTIONNAME$142);
            }
            target.set(logicalCollectionName);
        }
    }
    
    /**
     * Nils the "LogicalCollectionName" element
     */
    public void setNilLogicalCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALCOLLECTIONNAME$142, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALCOLLECTIONNAME$142);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LogicalCollectionName" element
     */
    public void unsetLogicalCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGICALCOLLECTIONNAME$142, 0);
        }
    }
}
