/*
 * XML Type:  EntityMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.EntityMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML EntityMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface EntityMetadata extends com.microsoft.schemas.xrm._2011.metadata.MetadataBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("entitymetadata618dtype");
    
    /**
     * Gets the "ActivityTypeMask" element
     */
    int getActivityTypeMask();
    
    /**
     * Gets (as xml) the "ActivityTypeMask" element
     */
    org.apache.xmlbeans.XmlInt xgetActivityTypeMask();
    
    /**
     * Tests for nil "ActivityTypeMask" element
     */
    boolean isNilActivityTypeMask();
    
    /**
     * True if has "ActivityTypeMask" element
     */
    boolean isSetActivityTypeMask();
    
    /**
     * Sets the "ActivityTypeMask" element
     */
    void setActivityTypeMask(int activityTypeMask);
    
    /**
     * Sets (as xml) the "ActivityTypeMask" element
     */
    void xsetActivityTypeMask(org.apache.xmlbeans.XmlInt activityTypeMask);
    
    /**
     * Nils the "ActivityTypeMask" element
     */
    void setNilActivityTypeMask();
    
    /**
     * Unsets the "ActivityTypeMask" element
     */
    void unsetActivityTypeMask();
    
    /**
     * Gets the "Attributes" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata getAttributes();
    
    /**
     * Tests for nil "Attributes" element
     */
    boolean isNilAttributes();
    
    /**
     * True if has "Attributes" element
     */
    boolean isSetAttributes();
    
    /**
     * Sets the "Attributes" element
     */
    void setAttributes(com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata attributes);
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata addNewAttributes();
    
    /**
     * Nils the "Attributes" element
     */
    void setNilAttributes();
    
    /**
     * Unsets the "Attributes" element
     */
    void unsetAttributes();
    
    /**
     * Gets the "AutoCreateAccessTeams" element
     */
    boolean getAutoCreateAccessTeams();
    
    /**
     * Gets (as xml) the "AutoCreateAccessTeams" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoCreateAccessTeams();
    
    /**
     * Tests for nil "AutoCreateAccessTeams" element
     */
    boolean isNilAutoCreateAccessTeams();
    
    /**
     * True if has "AutoCreateAccessTeams" element
     */
    boolean isSetAutoCreateAccessTeams();
    
    /**
     * Sets the "AutoCreateAccessTeams" element
     */
    void setAutoCreateAccessTeams(boolean autoCreateAccessTeams);
    
    /**
     * Sets (as xml) the "AutoCreateAccessTeams" element
     */
    void xsetAutoCreateAccessTeams(org.apache.xmlbeans.XmlBoolean autoCreateAccessTeams);
    
    /**
     * Nils the "AutoCreateAccessTeams" element
     */
    void setNilAutoCreateAccessTeams();
    
    /**
     * Unsets the "AutoCreateAccessTeams" element
     */
    void unsetAutoCreateAccessTeams();
    
    /**
     * Gets the "AutoRouteToOwnerQueue" element
     */
    boolean getAutoRouteToOwnerQueue();
    
    /**
     * Gets (as xml) the "AutoRouteToOwnerQueue" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoRouteToOwnerQueue();
    
    /**
     * Tests for nil "AutoRouteToOwnerQueue" element
     */
    boolean isNilAutoRouteToOwnerQueue();
    
    /**
     * True if has "AutoRouteToOwnerQueue" element
     */
    boolean isSetAutoRouteToOwnerQueue();
    
    /**
     * Sets the "AutoRouteToOwnerQueue" element
     */
    void setAutoRouteToOwnerQueue(boolean autoRouteToOwnerQueue);
    
    /**
     * Sets (as xml) the "AutoRouteToOwnerQueue" element
     */
    void xsetAutoRouteToOwnerQueue(org.apache.xmlbeans.XmlBoolean autoRouteToOwnerQueue);
    
    /**
     * Nils the "AutoRouteToOwnerQueue" element
     */
    void setNilAutoRouteToOwnerQueue();
    
    /**
     * Unsets the "AutoRouteToOwnerQueue" element
     */
    void unsetAutoRouteToOwnerQueue();
    
    /**
     * Gets the "CanBeInManyToMany" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanBeInManyToMany();
    
    /**
     * Tests for nil "CanBeInManyToMany" element
     */
    boolean isNilCanBeInManyToMany();
    
    /**
     * True if has "CanBeInManyToMany" element
     */
    boolean isSetCanBeInManyToMany();
    
    /**
     * Sets the "CanBeInManyToMany" element
     */
    void setCanBeInManyToMany(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canBeInManyToMany);
    
    /**
     * Appends and returns a new empty "CanBeInManyToMany" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanBeInManyToMany();
    
    /**
     * Nils the "CanBeInManyToMany" element
     */
    void setNilCanBeInManyToMany();
    
    /**
     * Unsets the "CanBeInManyToMany" element
     */
    void unsetCanBeInManyToMany();
    
    /**
     * Gets the "CanBePrimaryEntityInRelationship" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanBePrimaryEntityInRelationship();
    
    /**
     * Tests for nil "CanBePrimaryEntityInRelationship" element
     */
    boolean isNilCanBePrimaryEntityInRelationship();
    
    /**
     * True if has "CanBePrimaryEntityInRelationship" element
     */
    boolean isSetCanBePrimaryEntityInRelationship();
    
    /**
     * Sets the "CanBePrimaryEntityInRelationship" element
     */
    void setCanBePrimaryEntityInRelationship(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canBePrimaryEntityInRelationship);
    
    /**
     * Appends and returns a new empty "CanBePrimaryEntityInRelationship" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanBePrimaryEntityInRelationship();
    
    /**
     * Nils the "CanBePrimaryEntityInRelationship" element
     */
    void setNilCanBePrimaryEntityInRelationship();
    
    /**
     * Unsets the "CanBePrimaryEntityInRelationship" element
     */
    void unsetCanBePrimaryEntityInRelationship();
    
    /**
     * Gets the "CanBeRelatedEntityInRelationship" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanBeRelatedEntityInRelationship();
    
    /**
     * Tests for nil "CanBeRelatedEntityInRelationship" element
     */
    boolean isNilCanBeRelatedEntityInRelationship();
    
    /**
     * True if has "CanBeRelatedEntityInRelationship" element
     */
    boolean isSetCanBeRelatedEntityInRelationship();
    
    /**
     * Sets the "CanBeRelatedEntityInRelationship" element
     */
    void setCanBeRelatedEntityInRelationship(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canBeRelatedEntityInRelationship);
    
    /**
     * Appends and returns a new empty "CanBeRelatedEntityInRelationship" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanBeRelatedEntityInRelationship();
    
    /**
     * Nils the "CanBeRelatedEntityInRelationship" element
     */
    void setNilCanBeRelatedEntityInRelationship();
    
    /**
     * Unsets the "CanBeRelatedEntityInRelationship" element
     */
    void unsetCanBeRelatedEntityInRelationship();
    
    /**
     * Gets the "CanCreateAttributes" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateAttributes();
    
    /**
     * Tests for nil "CanCreateAttributes" element
     */
    boolean isNilCanCreateAttributes();
    
    /**
     * True if has "CanCreateAttributes" element
     */
    boolean isSetCanCreateAttributes();
    
    /**
     * Sets the "CanCreateAttributes" element
     */
    void setCanCreateAttributes(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateAttributes);
    
    /**
     * Appends and returns a new empty "CanCreateAttributes" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateAttributes();
    
    /**
     * Nils the "CanCreateAttributes" element
     */
    void setNilCanCreateAttributes();
    
    /**
     * Unsets the "CanCreateAttributes" element
     */
    void unsetCanCreateAttributes();
    
    /**
     * Gets the "CanCreateCharts" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateCharts();
    
    /**
     * Tests for nil "CanCreateCharts" element
     */
    boolean isNilCanCreateCharts();
    
    /**
     * True if has "CanCreateCharts" element
     */
    boolean isSetCanCreateCharts();
    
    /**
     * Sets the "CanCreateCharts" element
     */
    void setCanCreateCharts(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateCharts);
    
    /**
     * Appends and returns a new empty "CanCreateCharts" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateCharts();
    
    /**
     * Nils the "CanCreateCharts" element
     */
    void setNilCanCreateCharts();
    
    /**
     * Unsets the "CanCreateCharts" element
     */
    void unsetCanCreateCharts();
    
    /**
     * Gets the "CanCreateForms" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateForms();
    
    /**
     * Tests for nil "CanCreateForms" element
     */
    boolean isNilCanCreateForms();
    
    /**
     * True if has "CanCreateForms" element
     */
    boolean isSetCanCreateForms();
    
    /**
     * Sets the "CanCreateForms" element
     */
    void setCanCreateForms(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateForms);
    
    /**
     * Appends and returns a new empty "CanCreateForms" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateForms();
    
    /**
     * Nils the "CanCreateForms" element
     */
    void setNilCanCreateForms();
    
    /**
     * Unsets the "CanCreateForms" element
     */
    void unsetCanCreateForms();
    
    /**
     * Gets the "CanCreateViews" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanCreateViews();
    
    /**
     * Tests for nil "CanCreateViews" element
     */
    boolean isNilCanCreateViews();
    
    /**
     * True if has "CanCreateViews" element
     */
    boolean isSetCanCreateViews();
    
    /**
     * Sets the "CanCreateViews" element
     */
    void setCanCreateViews(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canCreateViews);
    
    /**
     * Appends and returns a new empty "CanCreateViews" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanCreateViews();
    
    /**
     * Nils the "CanCreateViews" element
     */
    void setNilCanCreateViews();
    
    /**
     * Unsets the "CanCreateViews" element
     */
    void unsetCanCreateViews();
    
    /**
     * Gets the "CanModifyAdditionalSettings" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanModifyAdditionalSettings();
    
    /**
     * Tests for nil "CanModifyAdditionalSettings" element
     */
    boolean isNilCanModifyAdditionalSettings();
    
    /**
     * True if has "CanModifyAdditionalSettings" element
     */
    boolean isSetCanModifyAdditionalSettings();
    
    /**
     * Sets the "CanModifyAdditionalSettings" element
     */
    void setCanModifyAdditionalSettings(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canModifyAdditionalSettings);
    
    /**
     * Appends and returns a new empty "CanModifyAdditionalSettings" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanModifyAdditionalSettings();
    
    /**
     * Nils the "CanModifyAdditionalSettings" element
     */
    void setNilCanModifyAdditionalSettings();
    
    /**
     * Unsets the "CanModifyAdditionalSettings" element
     */
    void unsetCanModifyAdditionalSettings();
    
    /**
     * Gets the "CanTriggerWorkflow" element
     */
    boolean getCanTriggerWorkflow();
    
    /**
     * Gets (as xml) the "CanTriggerWorkflow" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCanTriggerWorkflow();
    
    /**
     * Tests for nil "CanTriggerWorkflow" element
     */
    boolean isNilCanTriggerWorkflow();
    
    /**
     * True if has "CanTriggerWorkflow" element
     */
    boolean isSetCanTriggerWorkflow();
    
    /**
     * Sets the "CanTriggerWorkflow" element
     */
    void setCanTriggerWorkflow(boolean canTriggerWorkflow);
    
    /**
     * Sets (as xml) the "CanTriggerWorkflow" element
     */
    void xsetCanTriggerWorkflow(org.apache.xmlbeans.XmlBoolean canTriggerWorkflow);
    
    /**
     * Nils the "CanTriggerWorkflow" element
     */
    void setNilCanTriggerWorkflow();
    
    /**
     * Unsets the "CanTriggerWorkflow" element
     */
    void unsetCanTriggerWorkflow();
    
    /**
     * Gets the "ChangeTrackingEnabled" element
     */
    boolean getChangeTrackingEnabled();
    
    /**
     * Gets (as xml) the "ChangeTrackingEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetChangeTrackingEnabled();
    
    /**
     * Tests for nil "ChangeTrackingEnabled" element
     */
    boolean isNilChangeTrackingEnabled();
    
    /**
     * True if has "ChangeTrackingEnabled" element
     */
    boolean isSetChangeTrackingEnabled();
    
    /**
     * Sets the "ChangeTrackingEnabled" element
     */
    void setChangeTrackingEnabled(boolean changeTrackingEnabled);
    
    /**
     * Sets (as xml) the "ChangeTrackingEnabled" element
     */
    void xsetChangeTrackingEnabled(org.apache.xmlbeans.XmlBoolean changeTrackingEnabled);
    
    /**
     * Nils the "ChangeTrackingEnabled" element
     */
    void setNilChangeTrackingEnabled();
    
    /**
     * Unsets the "ChangeTrackingEnabled" element
     */
    void unsetChangeTrackingEnabled();
    
    /**
     * Gets the "Description" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label getDescription();
    
    /**
     * Tests for nil "Description" element
     */
    boolean isNilDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(com.microsoft.schemas.xrm._2011.contracts.Label description);
    
    /**
     * Appends and returns a new empty "Description" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label addNewDescription();
    
    /**
     * Nils the "Description" element
     */
    void setNilDescription();
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "DisplayCollectionName" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label getDisplayCollectionName();
    
    /**
     * Tests for nil "DisplayCollectionName" element
     */
    boolean isNilDisplayCollectionName();
    
    /**
     * True if has "DisplayCollectionName" element
     */
    boolean isSetDisplayCollectionName();
    
    /**
     * Sets the "DisplayCollectionName" element
     */
    void setDisplayCollectionName(com.microsoft.schemas.xrm._2011.contracts.Label displayCollectionName);
    
    /**
     * Appends and returns a new empty "DisplayCollectionName" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label addNewDisplayCollectionName();
    
    /**
     * Nils the "DisplayCollectionName" element
     */
    void setNilDisplayCollectionName();
    
    /**
     * Unsets the "DisplayCollectionName" element
     */
    void unsetDisplayCollectionName();
    
    /**
     * Gets the "DisplayName" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label getDisplayName();
    
    /**
     * Tests for nil "DisplayName" element
     */
    boolean isNilDisplayName();
    
    /**
     * True if has "DisplayName" element
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "DisplayName" element
     */
    void setDisplayName(com.microsoft.schemas.xrm._2011.contracts.Label displayName);
    
    /**
     * Appends and returns a new empty "DisplayName" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label addNewDisplayName();
    
    /**
     * Nils the "DisplayName" element
     */
    void setNilDisplayName();
    
    /**
     * Unsets the "DisplayName" element
     */
    void unsetDisplayName();
    
    /**
     * Gets the "EnforceStateTransitions" element
     */
    boolean getEnforceStateTransitions();
    
    /**
     * Gets (as xml) the "EnforceStateTransitions" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEnforceStateTransitions();
    
    /**
     * Tests for nil "EnforceStateTransitions" element
     */
    boolean isNilEnforceStateTransitions();
    
    /**
     * True if has "EnforceStateTransitions" element
     */
    boolean isSetEnforceStateTransitions();
    
    /**
     * Sets the "EnforceStateTransitions" element
     */
    void setEnforceStateTransitions(boolean enforceStateTransitions);
    
    /**
     * Sets (as xml) the "EnforceStateTransitions" element
     */
    void xsetEnforceStateTransitions(org.apache.xmlbeans.XmlBoolean enforceStateTransitions);
    
    /**
     * Nils the "EnforceStateTransitions" element
     */
    void setNilEnforceStateTransitions();
    
    /**
     * Unsets the "EnforceStateTransitions" element
     */
    void unsetEnforceStateTransitions();
    
    /**
     * Gets the "IconLargeName" element
     */
    java.lang.String getIconLargeName();
    
    /**
     * Gets (as xml) the "IconLargeName" element
     */
    org.apache.xmlbeans.XmlString xgetIconLargeName();
    
    /**
     * Tests for nil "IconLargeName" element
     */
    boolean isNilIconLargeName();
    
    /**
     * True if has "IconLargeName" element
     */
    boolean isSetIconLargeName();
    
    /**
     * Sets the "IconLargeName" element
     */
    void setIconLargeName(java.lang.String iconLargeName);
    
    /**
     * Sets (as xml) the "IconLargeName" element
     */
    void xsetIconLargeName(org.apache.xmlbeans.XmlString iconLargeName);
    
    /**
     * Nils the "IconLargeName" element
     */
    void setNilIconLargeName();
    
    /**
     * Unsets the "IconLargeName" element
     */
    void unsetIconLargeName();
    
    /**
     * Gets the "IconMediumName" element
     */
    java.lang.String getIconMediumName();
    
    /**
     * Gets (as xml) the "IconMediumName" element
     */
    org.apache.xmlbeans.XmlString xgetIconMediumName();
    
    /**
     * Tests for nil "IconMediumName" element
     */
    boolean isNilIconMediumName();
    
    /**
     * True if has "IconMediumName" element
     */
    boolean isSetIconMediumName();
    
    /**
     * Sets the "IconMediumName" element
     */
    void setIconMediumName(java.lang.String iconMediumName);
    
    /**
     * Sets (as xml) the "IconMediumName" element
     */
    void xsetIconMediumName(org.apache.xmlbeans.XmlString iconMediumName);
    
    /**
     * Nils the "IconMediumName" element
     */
    void setNilIconMediumName();
    
    /**
     * Unsets the "IconMediumName" element
     */
    void unsetIconMediumName();
    
    /**
     * Gets the "IconSmallName" element
     */
    java.lang.String getIconSmallName();
    
    /**
     * Gets (as xml) the "IconSmallName" element
     */
    org.apache.xmlbeans.XmlString xgetIconSmallName();
    
    /**
     * Tests for nil "IconSmallName" element
     */
    boolean isNilIconSmallName();
    
    /**
     * True if has "IconSmallName" element
     */
    boolean isSetIconSmallName();
    
    /**
     * Sets the "IconSmallName" element
     */
    void setIconSmallName(java.lang.String iconSmallName);
    
    /**
     * Sets (as xml) the "IconSmallName" element
     */
    void xsetIconSmallName(org.apache.xmlbeans.XmlString iconSmallName);
    
    /**
     * Nils the "IconSmallName" element
     */
    void setNilIconSmallName();
    
    /**
     * Unsets the "IconSmallName" element
     */
    void unsetIconSmallName();
    
    /**
     * Gets the "IsAIRUpdated" element
     */
    boolean getIsAIRUpdated();
    
    /**
     * Gets (as xml) the "IsAIRUpdated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAIRUpdated();
    
    /**
     * Tests for nil "IsAIRUpdated" element
     */
    boolean isNilIsAIRUpdated();
    
    /**
     * True if has "IsAIRUpdated" element
     */
    boolean isSetIsAIRUpdated();
    
    /**
     * Sets the "IsAIRUpdated" element
     */
    void setIsAIRUpdated(boolean isAIRUpdated);
    
    /**
     * Sets (as xml) the "IsAIRUpdated" element
     */
    void xsetIsAIRUpdated(org.apache.xmlbeans.XmlBoolean isAIRUpdated);
    
    /**
     * Nils the "IsAIRUpdated" element
     */
    void setNilIsAIRUpdated();
    
    /**
     * Unsets the "IsAIRUpdated" element
     */
    void unsetIsAIRUpdated();
    
    /**
     * Gets the "IsActivity" element
     */
    boolean getIsActivity();
    
    /**
     * Gets (as xml) the "IsActivity" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsActivity();
    
    /**
     * Tests for nil "IsActivity" element
     */
    boolean isNilIsActivity();
    
    /**
     * True if has "IsActivity" element
     */
    boolean isSetIsActivity();
    
    /**
     * Sets the "IsActivity" element
     */
    void setIsActivity(boolean isActivity);
    
    /**
     * Sets (as xml) the "IsActivity" element
     */
    void xsetIsActivity(org.apache.xmlbeans.XmlBoolean isActivity);
    
    /**
     * Nils the "IsActivity" element
     */
    void setNilIsActivity();
    
    /**
     * Unsets the "IsActivity" element
     */
    void unsetIsActivity();
    
    /**
     * Gets the "IsActivityParty" element
     */
    boolean getIsActivityParty();
    
    /**
     * Gets (as xml) the "IsActivityParty" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsActivityParty();
    
    /**
     * Tests for nil "IsActivityParty" element
     */
    boolean isNilIsActivityParty();
    
    /**
     * True if has "IsActivityParty" element
     */
    boolean isSetIsActivityParty();
    
    /**
     * Sets the "IsActivityParty" element
     */
    void setIsActivityParty(boolean isActivityParty);
    
    /**
     * Sets (as xml) the "IsActivityParty" element
     */
    void xsetIsActivityParty(org.apache.xmlbeans.XmlBoolean isActivityParty);
    
    /**
     * Nils the "IsActivityParty" element
     */
    void setNilIsActivityParty();
    
    /**
     * Unsets the "IsActivityParty" element
     */
    void unsetIsActivityParty();
    
    /**
     * Gets the "IsAuditEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsAuditEnabled();
    
    /**
     * Tests for nil "IsAuditEnabled" element
     */
    boolean isNilIsAuditEnabled();
    
    /**
     * True if has "IsAuditEnabled" element
     */
    boolean isSetIsAuditEnabled();
    
    /**
     * Sets the "IsAuditEnabled" element
     */
    void setIsAuditEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isAuditEnabled);
    
    /**
     * Appends and returns a new empty "IsAuditEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsAuditEnabled();
    
    /**
     * Nils the "IsAuditEnabled" element
     */
    void setNilIsAuditEnabled();
    
    /**
     * Unsets the "IsAuditEnabled" element
     */
    void unsetIsAuditEnabled();
    
    /**
     * Gets the "IsAvailableOffline" element
     */
    boolean getIsAvailableOffline();
    
    /**
     * Gets (as xml) the "IsAvailableOffline" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAvailableOffline();
    
    /**
     * Tests for nil "IsAvailableOffline" element
     */
    boolean isNilIsAvailableOffline();
    
    /**
     * True if has "IsAvailableOffline" element
     */
    boolean isSetIsAvailableOffline();
    
    /**
     * Sets the "IsAvailableOffline" element
     */
    void setIsAvailableOffline(boolean isAvailableOffline);
    
    /**
     * Sets (as xml) the "IsAvailableOffline" element
     */
    void xsetIsAvailableOffline(org.apache.xmlbeans.XmlBoolean isAvailableOffline);
    
    /**
     * Nils the "IsAvailableOffline" element
     */
    void setNilIsAvailableOffline();
    
    /**
     * Unsets the "IsAvailableOffline" element
     */
    void unsetIsAvailableOffline();
    
    /**
     * Gets the "IsBusinessProcessEnabled" element
     */
    boolean getIsBusinessProcessEnabled();
    
    /**
     * Gets (as xml) the "IsBusinessProcessEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsBusinessProcessEnabled();
    
    /**
     * Tests for nil "IsBusinessProcessEnabled" element
     */
    boolean isNilIsBusinessProcessEnabled();
    
    /**
     * True if has "IsBusinessProcessEnabled" element
     */
    boolean isSetIsBusinessProcessEnabled();
    
    /**
     * Sets the "IsBusinessProcessEnabled" element
     */
    void setIsBusinessProcessEnabled(boolean isBusinessProcessEnabled);
    
    /**
     * Sets (as xml) the "IsBusinessProcessEnabled" element
     */
    void xsetIsBusinessProcessEnabled(org.apache.xmlbeans.XmlBoolean isBusinessProcessEnabled);
    
    /**
     * Nils the "IsBusinessProcessEnabled" element
     */
    void setNilIsBusinessProcessEnabled();
    
    /**
     * Unsets the "IsBusinessProcessEnabled" element
     */
    void unsetIsBusinessProcessEnabled();
    
    /**
     * Gets the "IsChildEntity" element
     */
    boolean getIsChildEntity();
    
    /**
     * Gets (as xml) the "IsChildEntity" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsChildEntity();
    
    /**
     * Tests for nil "IsChildEntity" element
     */
    boolean isNilIsChildEntity();
    
    /**
     * True if has "IsChildEntity" element
     */
    boolean isSetIsChildEntity();
    
    /**
     * Sets the "IsChildEntity" element
     */
    void setIsChildEntity(boolean isChildEntity);
    
    /**
     * Sets (as xml) the "IsChildEntity" element
     */
    void xsetIsChildEntity(org.apache.xmlbeans.XmlBoolean isChildEntity);
    
    /**
     * Nils the "IsChildEntity" element
     */
    void setNilIsChildEntity();
    
    /**
     * Unsets the "IsChildEntity" element
     */
    void unsetIsChildEntity();
    
    /**
     * Gets the "IsConnectionsEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsConnectionsEnabled();
    
    /**
     * Tests for nil "IsConnectionsEnabled" element
     */
    boolean isNilIsConnectionsEnabled();
    
    /**
     * True if has "IsConnectionsEnabled" element
     */
    boolean isSetIsConnectionsEnabled();
    
    /**
     * Sets the "IsConnectionsEnabled" element
     */
    void setIsConnectionsEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isConnectionsEnabled);
    
    /**
     * Appends and returns a new empty "IsConnectionsEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsConnectionsEnabled();
    
    /**
     * Nils the "IsConnectionsEnabled" element
     */
    void setNilIsConnectionsEnabled();
    
    /**
     * Unsets the "IsConnectionsEnabled" element
     */
    void unsetIsConnectionsEnabled();
    
    /**
     * Gets the "IsCustomEntity" element
     */
    boolean getIsCustomEntity();
    
    /**
     * Gets (as xml) the "IsCustomEntity" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomEntity();
    
    /**
     * Tests for nil "IsCustomEntity" element
     */
    boolean isNilIsCustomEntity();
    
    /**
     * True if has "IsCustomEntity" element
     */
    boolean isSetIsCustomEntity();
    
    /**
     * Sets the "IsCustomEntity" element
     */
    void setIsCustomEntity(boolean isCustomEntity);
    
    /**
     * Sets (as xml) the "IsCustomEntity" element
     */
    void xsetIsCustomEntity(org.apache.xmlbeans.XmlBoolean isCustomEntity);
    
    /**
     * Nils the "IsCustomEntity" element
     */
    void setNilIsCustomEntity();
    
    /**
     * Unsets the "IsCustomEntity" element
     */
    void unsetIsCustomEntity();
    
    /**
     * Gets the "IsCustomizable" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsCustomizable();
    
    /**
     * Tests for nil "IsCustomizable" element
     */
    boolean isNilIsCustomizable();
    
    /**
     * True if has "IsCustomizable" element
     */
    boolean isSetIsCustomizable();
    
    /**
     * Sets the "IsCustomizable" element
     */
    void setIsCustomizable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isCustomizable);
    
    /**
     * Appends and returns a new empty "IsCustomizable" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsCustomizable();
    
    /**
     * Nils the "IsCustomizable" element
     */
    void setNilIsCustomizable();
    
    /**
     * Unsets the "IsCustomizable" element
     */
    void unsetIsCustomizable();
    
    /**
     * Gets the "IsDocumentManagementEnabled" element
     */
    boolean getIsDocumentManagementEnabled();
    
    /**
     * Gets (as xml) the "IsDocumentManagementEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDocumentManagementEnabled();
    
    /**
     * Tests for nil "IsDocumentManagementEnabled" element
     */
    boolean isNilIsDocumentManagementEnabled();
    
    /**
     * True if has "IsDocumentManagementEnabled" element
     */
    boolean isSetIsDocumentManagementEnabled();
    
    /**
     * Sets the "IsDocumentManagementEnabled" element
     */
    void setIsDocumentManagementEnabled(boolean isDocumentManagementEnabled);
    
    /**
     * Sets (as xml) the "IsDocumentManagementEnabled" element
     */
    void xsetIsDocumentManagementEnabled(org.apache.xmlbeans.XmlBoolean isDocumentManagementEnabled);
    
    /**
     * Nils the "IsDocumentManagementEnabled" element
     */
    void setNilIsDocumentManagementEnabled();
    
    /**
     * Unsets the "IsDocumentManagementEnabled" element
     */
    void unsetIsDocumentManagementEnabled();
    
    /**
     * Gets the "IsDuplicateDetectionEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsDuplicateDetectionEnabled();
    
    /**
     * Tests for nil "IsDuplicateDetectionEnabled" element
     */
    boolean isNilIsDuplicateDetectionEnabled();
    
    /**
     * True if has "IsDuplicateDetectionEnabled" element
     */
    boolean isSetIsDuplicateDetectionEnabled();
    
    /**
     * Sets the "IsDuplicateDetectionEnabled" element
     */
    void setIsDuplicateDetectionEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isDuplicateDetectionEnabled);
    
    /**
     * Appends and returns a new empty "IsDuplicateDetectionEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsDuplicateDetectionEnabled();
    
    /**
     * Nils the "IsDuplicateDetectionEnabled" element
     */
    void setNilIsDuplicateDetectionEnabled();
    
    /**
     * Unsets the "IsDuplicateDetectionEnabled" element
     */
    void unsetIsDuplicateDetectionEnabled();
    
    /**
     * Gets the "IsEnabledForCharts" element
     */
    boolean getIsEnabledForCharts();
    
    /**
     * Gets (as xml) the "IsEnabledForCharts" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsEnabledForCharts();
    
    /**
     * Tests for nil "IsEnabledForCharts" element
     */
    boolean isNilIsEnabledForCharts();
    
    /**
     * True if has "IsEnabledForCharts" element
     */
    boolean isSetIsEnabledForCharts();
    
    /**
     * Sets the "IsEnabledForCharts" element
     */
    void setIsEnabledForCharts(boolean isEnabledForCharts);
    
    /**
     * Sets (as xml) the "IsEnabledForCharts" element
     */
    void xsetIsEnabledForCharts(org.apache.xmlbeans.XmlBoolean isEnabledForCharts);
    
    /**
     * Nils the "IsEnabledForCharts" element
     */
    void setNilIsEnabledForCharts();
    
    /**
     * Unsets the "IsEnabledForCharts" element
     */
    void unsetIsEnabledForCharts();
    
    /**
     * Gets the "IsEnabledForTrace" element
     */
    boolean getIsEnabledForTrace();
    
    /**
     * Gets (as xml) the "IsEnabledForTrace" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsEnabledForTrace();
    
    /**
     * Tests for nil "IsEnabledForTrace" element
     */
    boolean isNilIsEnabledForTrace();
    
    /**
     * True if has "IsEnabledForTrace" element
     */
    boolean isSetIsEnabledForTrace();
    
    /**
     * Sets the "IsEnabledForTrace" element
     */
    void setIsEnabledForTrace(boolean isEnabledForTrace);
    
    /**
     * Sets (as xml) the "IsEnabledForTrace" element
     */
    void xsetIsEnabledForTrace(org.apache.xmlbeans.XmlBoolean isEnabledForTrace);
    
    /**
     * Nils the "IsEnabledForTrace" element
     */
    void setNilIsEnabledForTrace();
    
    /**
     * Unsets the "IsEnabledForTrace" element
     */
    void unsetIsEnabledForTrace();
    
    /**
     * Gets the "IsImportable" element
     */
    boolean getIsImportable();
    
    /**
     * Gets (as xml) the "IsImportable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsImportable();
    
    /**
     * Tests for nil "IsImportable" element
     */
    boolean isNilIsImportable();
    
    /**
     * True if has "IsImportable" element
     */
    boolean isSetIsImportable();
    
    /**
     * Sets the "IsImportable" element
     */
    void setIsImportable(boolean isImportable);
    
    /**
     * Sets (as xml) the "IsImportable" element
     */
    void xsetIsImportable(org.apache.xmlbeans.XmlBoolean isImportable);
    
    /**
     * Nils the "IsImportable" element
     */
    void setNilIsImportable();
    
    /**
     * Unsets the "IsImportable" element
     */
    void unsetIsImportable();
    
    /**
     * Gets the "IsIntersect" element
     */
    boolean getIsIntersect();
    
    /**
     * Gets (as xml) the "IsIntersect" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsIntersect();
    
    /**
     * Tests for nil "IsIntersect" element
     */
    boolean isNilIsIntersect();
    
    /**
     * True if has "IsIntersect" element
     */
    boolean isSetIsIntersect();
    
    /**
     * Sets the "IsIntersect" element
     */
    void setIsIntersect(boolean isIntersect);
    
    /**
     * Sets (as xml) the "IsIntersect" element
     */
    void xsetIsIntersect(org.apache.xmlbeans.XmlBoolean isIntersect);
    
    /**
     * Nils the "IsIntersect" element
     */
    void setNilIsIntersect();
    
    /**
     * Unsets the "IsIntersect" element
     */
    void unsetIsIntersect();
    
    /**
     * Gets the "IsKnowledgeManagementEnabled" element
     */
    boolean getIsKnowledgeManagementEnabled();
    
    /**
     * Gets (as xml) the "IsKnowledgeManagementEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsKnowledgeManagementEnabled();
    
    /**
     * Tests for nil "IsKnowledgeManagementEnabled" element
     */
    boolean isNilIsKnowledgeManagementEnabled();
    
    /**
     * True if has "IsKnowledgeManagementEnabled" element
     */
    boolean isSetIsKnowledgeManagementEnabled();
    
    /**
     * Sets the "IsKnowledgeManagementEnabled" element
     */
    void setIsKnowledgeManagementEnabled(boolean isKnowledgeManagementEnabled);
    
    /**
     * Sets (as xml) the "IsKnowledgeManagementEnabled" element
     */
    void xsetIsKnowledgeManagementEnabled(org.apache.xmlbeans.XmlBoolean isKnowledgeManagementEnabled);
    
    /**
     * Nils the "IsKnowledgeManagementEnabled" element
     */
    void setNilIsKnowledgeManagementEnabled();
    
    /**
     * Unsets the "IsKnowledgeManagementEnabled" element
     */
    void unsetIsKnowledgeManagementEnabled();
    
    /**
     * Gets the "IsMailMergeEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsMailMergeEnabled();
    
    /**
     * Tests for nil "IsMailMergeEnabled" element
     */
    boolean isNilIsMailMergeEnabled();
    
    /**
     * True if has "IsMailMergeEnabled" element
     */
    boolean isSetIsMailMergeEnabled();
    
    /**
     * Sets the "IsMailMergeEnabled" element
     */
    void setIsMailMergeEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isMailMergeEnabled);
    
    /**
     * Appends and returns a new empty "IsMailMergeEnabled" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsMailMergeEnabled();
    
    /**
     * Nils the "IsMailMergeEnabled" element
     */
    void setNilIsMailMergeEnabled();
    
    /**
     * Unsets the "IsMailMergeEnabled" element
     */
    void unsetIsMailMergeEnabled();
    
    /**
     * Gets the "IsManaged" element
     */
    boolean getIsManaged();
    
    /**
     * Gets (as xml) the "IsManaged" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsManaged();
    
    /**
     * Tests for nil "IsManaged" element
     */
    boolean isNilIsManaged();
    
    /**
     * True if has "IsManaged" element
     */
    boolean isSetIsManaged();
    
    /**
     * Sets the "IsManaged" element
     */
    void setIsManaged(boolean isManaged);
    
    /**
     * Sets (as xml) the "IsManaged" element
     */
    void xsetIsManaged(org.apache.xmlbeans.XmlBoolean isManaged);
    
    /**
     * Nils the "IsManaged" element
     */
    void setNilIsManaged();
    
    /**
     * Unsets the "IsManaged" element
     */
    void unsetIsManaged();
    
    /**
     * Gets the "IsMappable" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsMappable();
    
    /**
     * Tests for nil "IsMappable" element
     */
    boolean isNilIsMappable();
    
    /**
     * True if has "IsMappable" element
     */
    boolean isSetIsMappable();
    
    /**
     * Sets the "IsMappable" element
     */
    void setIsMappable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isMappable);
    
    /**
     * Appends and returns a new empty "IsMappable" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsMappable();
    
    /**
     * Nils the "IsMappable" element
     */
    void setNilIsMappable();
    
    /**
     * Unsets the "IsMappable" element
     */
    void unsetIsMappable();
    
    /**
     * Gets the "IsOneNoteIntegrationEnabled" element
     */
    boolean getIsOneNoteIntegrationEnabled();
    
    /**
     * Gets (as xml) the "IsOneNoteIntegrationEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsOneNoteIntegrationEnabled();
    
    /**
     * Tests for nil "IsOneNoteIntegrationEnabled" element
     */
    boolean isNilIsOneNoteIntegrationEnabled();
    
    /**
     * True if has "IsOneNoteIntegrationEnabled" element
     */
    boolean isSetIsOneNoteIntegrationEnabled();
    
    /**
     * Sets the "IsOneNoteIntegrationEnabled" element
     */
    void setIsOneNoteIntegrationEnabled(boolean isOneNoteIntegrationEnabled);
    
    /**
     * Sets (as xml) the "IsOneNoteIntegrationEnabled" element
     */
    void xsetIsOneNoteIntegrationEnabled(org.apache.xmlbeans.XmlBoolean isOneNoteIntegrationEnabled);
    
    /**
     * Nils the "IsOneNoteIntegrationEnabled" element
     */
    void setNilIsOneNoteIntegrationEnabled();
    
    /**
     * Unsets the "IsOneNoteIntegrationEnabled" element
     */
    void unsetIsOneNoteIntegrationEnabled();
    
    /**
     * Gets the "IsQuickCreateEnabled" element
     */
    boolean getIsQuickCreateEnabled();
    
    /**
     * Gets (as xml) the "IsQuickCreateEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsQuickCreateEnabled();
    
    /**
     * Tests for nil "IsQuickCreateEnabled" element
     */
    boolean isNilIsQuickCreateEnabled();
    
    /**
     * True if has "IsQuickCreateEnabled" element
     */
    boolean isSetIsQuickCreateEnabled();
    
    /**
     * Sets the "IsQuickCreateEnabled" element
     */
    void setIsQuickCreateEnabled(boolean isQuickCreateEnabled);
    
    /**
     * Sets (as xml) the "IsQuickCreateEnabled" element
     */
    void xsetIsQuickCreateEnabled(org.apache.xmlbeans.XmlBoolean isQuickCreateEnabled);
    
    /**
     * Nils the "IsQuickCreateEnabled" element
     */
    void setNilIsQuickCreateEnabled();
    
    /**
     * Unsets the "IsQuickCreateEnabled" element
     */
    void unsetIsQuickCreateEnabled();
    
    /**
     * Gets the "IsReadOnlyInMobileClient" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsReadOnlyInMobileClient();
    
    /**
     * Tests for nil "IsReadOnlyInMobileClient" element
     */
    boolean isNilIsReadOnlyInMobileClient();
    
    /**
     * True if has "IsReadOnlyInMobileClient" element
     */
    boolean isSetIsReadOnlyInMobileClient();
    
    /**
     * Sets the "IsReadOnlyInMobileClient" element
     */
    void setIsReadOnlyInMobileClient(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isReadOnlyInMobileClient);
    
    /**
     * Appends and returns a new empty "IsReadOnlyInMobileClient" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsReadOnlyInMobileClient();
    
    /**
     * Nils the "IsReadOnlyInMobileClient" element
     */
    void setNilIsReadOnlyInMobileClient();
    
    /**
     * Unsets the "IsReadOnlyInMobileClient" element
     */
    void unsetIsReadOnlyInMobileClient();
    
    /**
     * Gets the "IsReadingPaneEnabled" element
     */
    boolean getIsReadingPaneEnabled();
    
    /**
     * Gets (as xml) the "IsReadingPaneEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsReadingPaneEnabled();
    
    /**
     * Tests for nil "IsReadingPaneEnabled" element
     */
    boolean isNilIsReadingPaneEnabled();
    
    /**
     * True if has "IsReadingPaneEnabled" element
     */
    boolean isSetIsReadingPaneEnabled();
    
    /**
     * Sets the "IsReadingPaneEnabled" element
     */
    void setIsReadingPaneEnabled(boolean isReadingPaneEnabled);
    
    /**
     * Sets (as xml) the "IsReadingPaneEnabled" element
     */
    void xsetIsReadingPaneEnabled(org.apache.xmlbeans.XmlBoolean isReadingPaneEnabled);
    
    /**
     * Nils the "IsReadingPaneEnabled" element
     */
    void setNilIsReadingPaneEnabled();
    
    /**
     * Unsets the "IsReadingPaneEnabled" element
     */
    void unsetIsReadingPaneEnabled();
    
    /**
     * Gets the "IsRenameable" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsRenameable();
    
    /**
     * Tests for nil "IsRenameable" element
     */
    boolean isNilIsRenameable();
    
    /**
     * True if has "IsRenameable" element
     */
    boolean isSetIsRenameable();
    
    /**
     * Sets the "IsRenameable" element
     */
    void setIsRenameable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isRenameable);
    
    /**
     * Appends and returns a new empty "IsRenameable" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsRenameable();
    
    /**
     * Nils the "IsRenameable" element
     */
    void setNilIsRenameable();
    
    /**
     * Unsets the "IsRenameable" element
     */
    void unsetIsRenameable();
    
    /**
     * Gets the "IsStateModelAware" element
     */
    boolean getIsStateModelAware();
    
    /**
     * Gets (as xml) the "IsStateModelAware" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsStateModelAware();
    
    /**
     * Tests for nil "IsStateModelAware" element
     */
    boolean isNilIsStateModelAware();
    
    /**
     * True if has "IsStateModelAware" element
     */
    boolean isSetIsStateModelAware();
    
    /**
     * Sets the "IsStateModelAware" element
     */
    void setIsStateModelAware(boolean isStateModelAware);
    
    /**
     * Sets (as xml) the "IsStateModelAware" element
     */
    void xsetIsStateModelAware(org.apache.xmlbeans.XmlBoolean isStateModelAware);
    
    /**
     * Nils the "IsStateModelAware" element
     */
    void setNilIsStateModelAware();
    
    /**
     * Unsets the "IsStateModelAware" element
     */
    void unsetIsStateModelAware();
    
    /**
     * Gets the "IsValidForAdvancedFind" element
     */
    boolean getIsValidForAdvancedFind();
    
    /**
     * Gets (as xml) the "IsValidForAdvancedFind" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsValidForAdvancedFind();
    
    /**
     * Tests for nil "IsValidForAdvancedFind" element
     */
    boolean isNilIsValidForAdvancedFind();
    
    /**
     * True if has "IsValidForAdvancedFind" element
     */
    boolean isSetIsValidForAdvancedFind();
    
    /**
     * Sets the "IsValidForAdvancedFind" element
     */
    void setIsValidForAdvancedFind(boolean isValidForAdvancedFind);
    
    /**
     * Sets (as xml) the "IsValidForAdvancedFind" element
     */
    void xsetIsValidForAdvancedFind(org.apache.xmlbeans.XmlBoolean isValidForAdvancedFind);
    
    /**
     * Nils the "IsValidForAdvancedFind" element
     */
    void setNilIsValidForAdvancedFind();
    
    /**
     * Unsets the "IsValidForAdvancedFind" element
     */
    void unsetIsValidForAdvancedFind();
    
    /**
     * Gets the "IsValidForQueue" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsValidForQueue();
    
    /**
     * Tests for nil "IsValidForQueue" element
     */
    boolean isNilIsValidForQueue();
    
    /**
     * True if has "IsValidForQueue" element
     */
    boolean isSetIsValidForQueue();
    
    /**
     * Sets the "IsValidForQueue" element
     */
    void setIsValidForQueue(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isValidForQueue);
    
    /**
     * Appends and returns a new empty "IsValidForQueue" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsValidForQueue();
    
    /**
     * Nils the "IsValidForQueue" element
     */
    void setNilIsValidForQueue();
    
    /**
     * Unsets the "IsValidForQueue" element
     */
    void unsetIsValidForQueue();
    
    /**
     * Gets the "IsVisibleInMobile" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsVisibleInMobile();
    
    /**
     * Tests for nil "IsVisibleInMobile" element
     */
    boolean isNilIsVisibleInMobile();
    
    /**
     * True if has "IsVisibleInMobile" element
     */
    boolean isSetIsVisibleInMobile();
    
    /**
     * Sets the "IsVisibleInMobile" element
     */
    void setIsVisibleInMobile(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isVisibleInMobile);
    
    /**
     * Appends and returns a new empty "IsVisibleInMobile" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsVisibleInMobile();
    
    /**
     * Nils the "IsVisibleInMobile" element
     */
    void setNilIsVisibleInMobile();
    
    /**
     * Unsets the "IsVisibleInMobile" element
     */
    void unsetIsVisibleInMobile();
    
    /**
     * Gets the "IsVisibleInMobileClient" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsVisibleInMobileClient();
    
    /**
     * Tests for nil "IsVisibleInMobileClient" element
     */
    boolean isNilIsVisibleInMobileClient();
    
    /**
     * True if has "IsVisibleInMobileClient" element
     */
    boolean isSetIsVisibleInMobileClient();
    
    /**
     * Sets the "IsVisibleInMobileClient" element
     */
    void setIsVisibleInMobileClient(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isVisibleInMobileClient);
    
    /**
     * Appends and returns a new empty "IsVisibleInMobileClient" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsVisibleInMobileClient();
    
    /**
     * Nils the "IsVisibleInMobileClient" element
     */
    void setNilIsVisibleInMobileClient();
    
    /**
     * Unsets the "IsVisibleInMobileClient" element
     */
    void unsetIsVisibleInMobileClient();
    
    /**
     * Gets the "LogicalName" element
     */
    java.lang.String getLogicalName();
    
    /**
     * Gets (as xml) the "LogicalName" element
     */
    org.apache.xmlbeans.XmlString xgetLogicalName();
    
    /**
     * Tests for nil "LogicalName" element
     */
    boolean isNilLogicalName();
    
    /**
     * True if has "LogicalName" element
     */
    boolean isSetLogicalName();
    
    /**
     * Sets the "LogicalName" element
     */
    void setLogicalName(java.lang.String logicalName);
    
    /**
     * Sets (as xml) the "LogicalName" element
     */
    void xsetLogicalName(org.apache.xmlbeans.XmlString logicalName);
    
    /**
     * Nils the "LogicalName" element
     */
    void setNilLogicalName();
    
    /**
     * Unsets the "LogicalName" element
     */
    void unsetLogicalName();
    
    /**
     * Gets the "ManyToManyRelationships" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata getManyToManyRelationships();
    
    /**
     * Tests for nil "ManyToManyRelationships" element
     */
    boolean isNilManyToManyRelationships();
    
    /**
     * True if has "ManyToManyRelationships" element
     */
    boolean isSetManyToManyRelationships();
    
    /**
     * Sets the "ManyToManyRelationships" element
     */
    void setManyToManyRelationships(com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata manyToManyRelationships);
    
    /**
     * Appends and returns a new empty "ManyToManyRelationships" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata addNewManyToManyRelationships();
    
    /**
     * Nils the "ManyToManyRelationships" element
     */
    void setNilManyToManyRelationships();
    
    /**
     * Unsets the "ManyToManyRelationships" element
     */
    void unsetManyToManyRelationships();
    
    /**
     * Gets the "ManyToOneRelationships" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata getManyToOneRelationships();
    
    /**
     * Tests for nil "ManyToOneRelationships" element
     */
    boolean isNilManyToOneRelationships();
    
    /**
     * True if has "ManyToOneRelationships" element
     */
    boolean isSetManyToOneRelationships();
    
    /**
     * Sets the "ManyToOneRelationships" element
     */
    void setManyToOneRelationships(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata manyToOneRelationships);
    
    /**
     * Appends and returns a new empty "ManyToOneRelationships" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata addNewManyToOneRelationships();
    
    /**
     * Nils the "ManyToOneRelationships" element
     */
    void setNilManyToOneRelationships();
    
    /**
     * Unsets the "ManyToOneRelationships" element
     */
    void unsetManyToOneRelationships();
    
    /**
     * Gets the "ObjectTypeCode" element
     */
    int getObjectTypeCode();
    
    /**
     * Gets (as xml) the "ObjectTypeCode" element
     */
    org.apache.xmlbeans.XmlInt xgetObjectTypeCode();
    
    /**
     * Tests for nil "ObjectTypeCode" element
     */
    boolean isNilObjectTypeCode();
    
    /**
     * True if has "ObjectTypeCode" element
     */
    boolean isSetObjectTypeCode();
    
    /**
     * Sets the "ObjectTypeCode" element
     */
    void setObjectTypeCode(int objectTypeCode);
    
    /**
     * Sets (as xml) the "ObjectTypeCode" element
     */
    void xsetObjectTypeCode(org.apache.xmlbeans.XmlInt objectTypeCode);
    
    /**
     * Nils the "ObjectTypeCode" element
     */
    void setNilObjectTypeCode();
    
    /**
     * Unsets the "ObjectTypeCode" element
     */
    void unsetObjectTypeCode();
    
    /**
     * Gets the "OneToManyRelationships" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata getOneToManyRelationships();
    
    /**
     * Tests for nil "OneToManyRelationships" element
     */
    boolean isNilOneToManyRelationships();
    
    /**
     * True if has "OneToManyRelationships" element
     */
    boolean isSetOneToManyRelationships();
    
    /**
     * Sets the "OneToManyRelationships" element
     */
    void setOneToManyRelationships(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata oneToManyRelationships);
    
    /**
     * Appends and returns a new empty "OneToManyRelationships" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata addNewOneToManyRelationships();
    
    /**
     * Nils the "OneToManyRelationships" element
     */
    void setNilOneToManyRelationships();
    
    /**
     * Unsets the "OneToManyRelationships" element
     */
    void unsetOneToManyRelationships();
    
    /**
     * Gets the "OwnershipType" element
     */
    java.util.List getOwnershipType();
    
    /**
     * Gets (as xml) the "OwnershipType" element
     */
    com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes xgetOwnershipType();
    
    /**
     * Tests for nil "OwnershipType" element
     */
    boolean isNilOwnershipType();
    
    /**
     * True if has "OwnershipType" element
     */
    boolean isSetOwnershipType();
    
    /**
     * Sets the "OwnershipType" element
     */
    void setOwnershipType(java.util.List ownershipType);
    
    /**
     * Sets (as xml) the "OwnershipType" element
     */
    void xsetOwnershipType(com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes ownershipType);
    
    /**
     * Nils the "OwnershipType" element
     */
    void setNilOwnershipType();
    
    /**
     * Unsets the "OwnershipType" element
     */
    void unsetOwnershipType();
    
    /**
     * Gets the "PrimaryIdAttribute" element
     */
    java.lang.String getPrimaryIdAttribute();
    
    /**
     * Gets (as xml) the "PrimaryIdAttribute" element
     */
    org.apache.xmlbeans.XmlString xgetPrimaryIdAttribute();
    
    /**
     * Tests for nil "PrimaryIdAttribute" element
     */
    boolean isNilPrimaryIdAttribute();
    
    /**
     * True if has "PrimaryIdAttribute" element
     */
    boolean isSetPrimaryIdAttribute();
    
    /**
     * Sets the "PrimaryIdAttribute" element
     */
    void setPrimaryIdAttribute(java.lang.String primaryIdAttribute);
    
    /**
     * Sets (as xml) the "PrimaryIdAttribute" element
     */
    void xsetPrimaryIdAttribute(org.apache.xmlbeans.XmlString primaryIdAttribute);
    
    /**
     * Nils the "PrimaryIdAttribute" element
     */
    void setNilPrimaryIdAttribute();
    
    /**
     * Unsets the "PrimaryIdAttribute" element
     */
    void unsetPrimaryIdAttribute();
    
    /**
     * Gets the "PrimaryNameAttribute" element
     */
    java.lang.String getPrimaryNameAttribute();
    
    /**
     * Gets (as xml) the "PrimaryNameAttribute" element
     */
    org.apache.xmlbeans.XmlString xgetPrimaryNameAttribute();
    
    /**
     * Tests for nil "PrimaryNameAttribute" element
     */
    boolean isNilPrimaryNameAttribute();
    
    /**
     * True if has "PrimaryNameAttribute" element
     */
    boolean isSetPrimaryNameAttribute();
    
    /**
     * Sets the "PrimaryNameAttribute" element
     */
    void setPrimaryNameAttribute(java.lang.String primaryNameAttribute);
    
    /**
     * Sets (as xml) the "PrimaryNameAttribute" element
     */
    void xsetPrimaryNameAttribute(org.apache.xmlbeans.XmlString primaryNameAttribute);
    
    /**
     * Nils the "PrimaryNameAttribute" element
     */
    void setNilPrimaryNameAttribute();
    
    /**
     * Unsets the "PrimaryNameAttribute" element
     */
    void unsetPrimaryNameAttribute();
    
    /**
     * Gets the "Privileges" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata getPrivileges();
    
    /**
     * Tests for nil "Privileges" element
     */
    boolean isNilPrivileges();
    
    /**
     * True if has "Privileges" element
     */
    boolean isSetPrivileges();
    
    /**
     * Sets the "Privileges" element
     */
    void setPrivileges(com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata privileges);
    
    /**
     * Appends and returns a new empty "Privileges" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ArrayOfSecurityPrivilegeMetadata addNewPrivileges();
    
    /**
     * Nils the "Privileges" element
     */
    void setNilPrivileges();
    
    /**
     * Unsets the "Privileges" element
     */
    void unsetPrivileges();
    
    /**
     * Gets the "RecurrenceBaseEntityLogicalName" element
     */
    java.lang.String getRecurrenceBaseEntityLogicalName();
    
    /**
     * Gets (as xml) the "RecurrenceBaseEntityLogicalName" element
     */
    org.apache.xmlbeans.XmlString xgetRecurrenceBaseEntityLogicalName();
    
    /**
     * Tests for nil "RecurrenceBaseEntityLogicalName" element
     */
    boolean isNilRecurrenceBaseEntityLogicalName();
    
    /**
     * True if has "RecurrenceBaseEntityLogicalName" element
     */
    boolean isSetRecurrenceBaseEntityLogicalName();
    
    /**
     * Sets the "RecurrenceBaseEntityLogicalName" element
     */
    void setRecurrenceBaseEntityLogicalName(java.lang.String recurrenceBaseEntityLogicalName);
    
    /**
     * Sets (as xml) the "RecurrenceBaseEntityLogicalName" element
     */
    void xsetRecurrenceBaseEntityLogicalName(org.apache.xmlbeans.XmlString recurrenceBaseEntityLogicalName);
    
    /**
     * Nils the "RecurrenceBaseEntityLogicalName" element
     */
    void setNilRecurrenceBaseEntityLogicalName();
    
    /**
     * Unsets the "RecurrenceBaseEntityLogicalName" element
     */
    void unsetRecurrenceBaseEntityLogicalName();
    
    /**
     * Gets the "ReportViewName" element
     */
    java.lang.String getReportViewName();
    
    /**
     * Gets (as xml) the "ReportViewName" element
     */
    org.apache.xmlbeans.XmlString xgetReportViewName();
    
    /**
     * Tests for nil "ReportViewName" element
     */
    boolean isNilReportViewName();
    
    /**
     * True if has "ReportViewName" element
     */
    boolean isSetReportViewName();
    
    /**
     * Sets the "ReportViewName" element
     */
    void setReportViewName(java.lang.String reportViewName);
    
    /**
     * Sets (as xml) the "ReportViewName" element
     */
    void xsetReportViewName(org.apache.xmlbeans.XmlString reportViewName);
    
    /**
     * Nils the "ReportViewName" element
     */
    void setNilReportViewName();
    
    /**
     * Unsets the "ReportViewName" element
     */
    void unsetReportViewName();
    
    /**
     * Gets the "SchemaName" element
     */
    java.lang.String getSchemaName();
    
    /**
     * Gets (as xml) the "SchemaName" element
     */
    org.apache.xmlbeans.XmlString xgetSchemaName();
    
    /**
     * Tests for nil "SchemaName" element
     */
    boolean isNilSchemaName();
    
    /**
     * True if has "SchemaName" element
     */
    boolean isSetSchemaName();
    
    /**
     * Sets the "SchemaName" element
     */
    void setSchemaName(java.lang.String schemaName);
    
    /**
     * Sets (as xml) the "SchemaName" element
     */
    void xsetSchemaName(org.apache.xmlbeans.XmlString schemaName);
    
    /**
     * Nils the "SchemaName" element
     */
    void setNilSchemaName();
    
    /**
     * Unsets the "SchemaName" element
     */
    void unsetSchemaName();
    
    /**
     * Gets the "IntroducedVersion" element
     */
    java.lang.String getIntroducedVersion();
    
    /**
     * Gets (as xml) the "IntroducedVersion" element
     */
    org.apache.xmlbeans.XmlString xgetIntroducedVersion();
    
    /**
     * Tests for nil "IntroducedVersion" element
     */
    boolean isNilIntroducedVersion();
    
    /**
     * True if has "IntroducedVersion" element
     */
    boolean isSetIntroducedVersion();
    
    /**
     * Sets the "IntroducedVersion" element
     */
    void setIntroducedVersion(java.lang.String introducedVersion);
    
    /**
     * Sets (as xml) the "IntroducedVersion" element
     */
    void xsetIntroducedVersion(org.apache.xmlbeans.XmlString introducedVersion);
    
    /**
     * Nils the "IntroducedVersion" element
     */
    void setNilIntroducedVersion();
    
    /**
     * Unsets the "IntroducedVersion" element
     */
    void unsetIntroducedVersion();
    
    /**
     * Gets the "PrimaryImageAttribute" element
     */
    java.lang.String getPrimaryImageAttribute();
    
    /**
     * Gets (as xml) the "PrimaryImageAttribute" element
     */
    org.apache.xmlbeans.XmlString xgetPrimaryImageAttribute();
    
    /**
     * Tests for nil "PrimaryImageAttribute" element
     */
    boolean isNilPrimaryImageAttribute();
    
    /**
     * True if has "PrimaryImageAttribute" element
     */
    boolean isSetPrimaryImageAttribute();
    
    /**
     * Sets the "PrimaryImageAttribute" element
     */
    void setPrimaryImageAttribute(java.lang.String primaryImageAttribute);
    
    /**
     * Sets (as xml) the "PrimaryImageAttribute" element
     */
    void xsetPrimaryImageAttribute(org.apache.xmlbeans.XmlString primaryImageAttribute);
    
    /**
     * Nils the "PrimaryImageAttribute" element
     */
    void setNilPrimaryImageAttribute();
    
    /**
     * Unsets the "PrimaryImageAttribute" element
     */
    void unsetPrimaryImageAttribute();
    
    /**
     * Gets the "CanChangeHierarchicalRelationship" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanChangeHierarchicalRelationship();
    
    /**
     * Tests for nil "CanChangeHierarchicalRelationship" element
     */
    boolean isNilCanChangeHierarchicalRelationship();
    
    /**
     * True if has "CanChangeHierarchicalRelationship" element
     */
    boolean isSetCanChangeHierarchicalRelationship();
    
    /**
     * Sets the "CanChangeHierarchicalRelationship" element
     */
    void setCanChangeHierarchicalRelationship(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canChangeHierarchicalRelationship);
    
    /**
     * Appends and returns a new empty "CanChangeHierarchicalRelationship" element
     */
    com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanChangeHierarchicalRelationship();
    
    /**
     * Nils the "CanChangeHierarchicalRelationship" element
     */
    void setNilCanChangeHierarchicalRelationship();
    
    /**
     * Unsets the "CanChangeHierarchicalRelationship" element
     */
    void unsetCanChangeHierarchicalRelationship();
    
    /**
     * Gets the "EntityHelpUrl" element
     */
    java.lang.String getEntityHelpUrl();
    
    /**
     * Gets (as xml) the "EntityHelpUrl" element
     */
    org.apache.xmlbeans.XmlString xgetEntityHelpUrl();
    
    /**
     * Tests for nil "EntityHelpUrl" element
     */
    boolean isNilEntityHelpUrl();
    
    /**
     * True if has "EntityHelpUrl" element
     */
    boolean isSetEntityHelpUrl();
    
    /**
     * Sets the "EntityHelpUrl" element
     */
    void setEntityHelpUrl(java.lang.String entityHelpUrl);
    
    /**
     * Sets (as xml) the "EntityHelpUrl" element
     */
    void xsetEntityHelpUrl(org.apache.xmlbeans.XmlString entityHelpUrl);
    
    /**
     * Nils the "EntityHelpUrl" element
     */
    void setNilEntityHelpUrl();
    
    /**
     * Unsets the "EntityHelpUrl" element
     */
    void unsetEntityHelpUrl();
    
    /**
     * Gets the "EntityHelpUrlEnabled" element
     */
    boolean getEntityHelpUrlEnabled();
    
    /**
     * Gets (as xml) the "EntityHelpUrlEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEntityHelpUrlEnabled();
    
    /**
     * Tests for nil "EntityHelpUrlEnabled" element
     */
    boolean isNilEntityHelpUrlEnabled();
    
    /**
     * True if has "EntityHelpUrlEnabled" element
     */
    boolean isSetEntityHelpUrlEnabled();
    
    /**
     * Sets the "EntityHelpUrlEnabled" element
     */
    void setEntityHelpUrlEnabled(boolean entityHelpUrlEnabled);
    
    /**
     * Sets (as xml) the "EntityHelpUrlEnabled" element
     */
    void xsetEntityHelpUrlEnabled(org.apache.xmlbeans.XmlBoolean entityHelpUrlEnabled);
    
    /**
     * Nils the "EntityHelpUrlEnabled" element
     */
    void setNilEntityHelpUrlEnabled();
    
    /**
     * Unsets the "EntityHelpUrlEnabled" element
     */
    void unsetEntityHelpUrlEnabled();
    
    /**
     * Gets the "CollectionSchemaName" element
     */
    java.lang.String getCollectionSchemaName();
    
    /**
     * Gets (as xml) the "CollectionSchemaName" element
     */
    org.apache.xmlbeans.XmlString xgetCollectionSchemaName();
    
    /**
     * Tests for nil "CollectionSchemaName" element
     */
    boolean isNilCollectionSchemaName();
    
    /**
     * True if has "CollectionSchemaName" element
     */
    boolean isSetCollectionSchemaName();
    
    /**
     * Sets the "CollectionSchemaName" element
     */
    void setCollectionSchemaName(java.lang.String collectionSchemaName);
    
    /**
     * Sets (as xml) the "CollectionSchemaName" element
     */
    void xsetCollectionSchemaName(org.apache.xmlbeans.XmlString collectionSchemaName);
    
    /**
     * Nils the "CollectionSchemaName" element
     */
    void setNilCollectionSchemaName();
    
    /**
     * Unsets the "CollectionSchemaName" element
     */
    void unsetCollectionSchemaName();
    
    /**
     * Gets the "EntityColor" element
     */
    java.lang.String getEntityColor();
    
    /**
     * Gets (as xml) the "EntityColor" element
     */
    org.apache.xmlbeans.XmlString xgetEntityColor();
    
    /**
     * Tests for nil "EntityColor" element
     */
    boolean isNilEntityColor();
    
    /**
     * True if has "EntityColor" element
     */
    boolean isSetEntityColor();
    
    /**
     * Sets the "EntityColor" element
     */
    void setEntityColor(java.lang.String entityColor);
    
    /**
     * Sets (as xml) the "EntityColor" element
     */
    void xsetEntityColor(org.apache.xmlbeans.XmlString entityColor);
    
    /**
     * Nils the "EntityColor" element
     */
    void setNilEntityColor();
    
    /**
     * Unsets the "EntityColor" element
     */
    void unsetEntityColor();
    
    /**
     * Gets the "IsOptimisticConcurrencyEnabled" element
     */
    boolean getIsOptimisticConcurrencyEnabled();
    
    /**
     * Gets (as xml) the "IsOptimisticConcurrencyEnabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsOptimisticConcurrencyEnabled();
    
    /**
     * Tests for nil "IsOptimisticConcurrencyEnabled" element
     */
    boolean isNilIsOptimisticConcurrencyEnabled();
    
    /**
     * True if has "IsOptimisticConcurrencyEnabled" element
     */
    boolean isSetIsOptimisticConcurrencyEnabled();
    
    /**
     * Sets the "IsOptimisticConcurrencyEnabled" element
     */
    void setIsOptimisticConcurrencyEnabled(boolean isOptimisticConcurrencyEnabled);
    
    /**
     * Sets (as xml) the "IsOptimisticConcurrencyEnabled" element
     */
    void xsetIsOptimisticConcurrencyEnabled(org.apache.xmlbeans.XmlBoolean isOptimisticConcurrencyEnabled);
    
    /**
     * Nils the "IsOptimisticConcurrencyEnabled" element
     */
    void setNilIsOptimisticConcurrencyEnabled();
    
    /**
     * Unsets the "IsOptimisticConcurrencyEnabled" element
     */
    void unsetIsOptimisticConcurrencyEnabled();
    
    /**
     * Gets the "LogicalCollectionName" element
     */
    java.lang.String getLogicalCollectionName();
    
    /**
     * Gets (as xml) the "LogicalCollectionName" element
     */
    org.apache.xmlbeans.XmlString xgetLogicalCollectionName();
    
    /**
     * Tests for nil "LogicalCollectionName" element
     */
    boolean isNilLogicalCollectionName();
    
    /**
     * True if has "LogicalCollectionName" element
     */
    boolean isSetLogicalCollectionName();
    
    /**
     * Sets the "LogicalCollectionName" element
     */
    void setLogicalCollectionName(java.lang.String logicalCollectionName);
    
    /**
     * Sets (as xml) the "LogicalCollectionName" element
     */
    void xsetLogicalCollectionName(org.apache.xmlbeans.XmlString logicalCollectionName);
    
    /**
     * Nils the "LogicalCollectionName" element
     */
    void setNilLogicalCollectionName();
    
    /**
     * Unsets the "LogicalCollectionName" element
     */
    void unsetLogicalCollectionName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.EntityMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
