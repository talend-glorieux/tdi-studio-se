/*
 * XML Type:  AppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML AppointmentRequest(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface AppointmentRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AppointmentRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("appointmentrequesta7b6type");
    
    /**
     * Gets the "AnchorOffset" element
     */
    int getAnchorOffset();
    
    /**
     * Gets (as xml) the "AnchorOffset" element
     */
    org.apache.xmlbeans.XmlInt xgetAnchorOffset();
    
    /**
     * True if has "AnchorOffset" element
     */
    boolean isSetAnchorOffset();
    
    /**
     * Sets the "AnchorOffset" element
     */
    void setAnchorOffset(int anchorOffset);
    
    /**
     * Sets (as xml) the "AnchorOffset" element
     */
    void xsetAnchorOffset(org.apache.xmlbeans.XmlInt anchorOffset);
    
    /**
     * Unsets the "AnchorOffset" element
     */
    void unsetAnchorOffset();
    
    /**
     * Gets the "AppointmentsToIgnore" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore getAppointmentsToIgnore();
    
    /**
     * Tests for nil "AppointmentsToIgnore" element
     */
    boolean isNilAppointmentsToIgnore();
    
    /**
     * True if has "AppointmentsToIgnore" element
     */
    boolean isSetAppointmentsToIgnore();
    
    /**
     * Sets the "AppointmentsToIgnore" element
     */
    void setAppointmentsToIgnore(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore appointmentsToIgnore);
    
    /**
     * Appends and returns a new empty "AppointmentsToIgnore" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore addNewAppointmentsToIgnore();
    
    /**
     * Nils the "AppointmentsToIgnore" element
     */
    void setNilAppointmentsToIgnore();
    
    /**
     * Unsets the "AppointmentsToIgnore" element
     */
    void unsetAppointmentsToIgnore();
    
    /**
     * Gets the "Constraints" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation getConstraints();
    
    /**
     * Tests for nil "Constraints" element
     */
    boolean isNilConstraints();
    
    /**
     * True if has "Constraints" element
     */
    boolean isSetConstraints();
    
    /**
     * Sets the "Constraints" element
     */
    void setConstraints(com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation constraints);
    
    /**
     * Appends and returns a new empty "Constraints" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation addNewConstraints();
    
    /**
     * Nils the "Constraints" element
     */
    void setNilConstraints();
    
    /**
     * Unsets the "Constraints" element
     */
    void unsetConstraints();
    
    /**
     * Gets the "Direction" element
     */
    com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum getDirection();
    
    /**
     * Gets (as xml) the "Direction" element
     */
    com.microsoft.schemas.crm._2011.contracts.SearchDirection xgetDirection();
    
    /**
     * True if has "Direction" element
     */
    boolean isSetDirection();
    
    /**
     * Sets the "Direction" element
     */
    void setDirection(com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum direction);
    
    /**
     * Sets (as xml) the "Direction" element
     */
    void xsetDirection(com.microsoft.schemas.crm._2011.contracts.SearchDirection direction);
    
    /**
     * Unsets the "Direction" element
     */
    void unsetDirection();
    
    /**
     * Gets the "Duration" element
     */
    int getDuration();
    
    /**
     * Gets (as xml) the "Duration" element
     */
    org.apache.xmlbeans.XmlInt xgetDuration();
    
    /**
     * True if has "Duration" element
     */
    boolean isSetDuration();
    
    /**
     * Sets the "Duration" element
     */
    void setDuration(int duration);
    
    /**
     * Sets (as xml) the "Duration" element
     */
    void xsetDuration(org.apache.xmlbeans.XmlInt duration);
    
    /**
     * Unsets the "Duration" element
     */
    void unsetDuration();
    
    /**
     * Gets the "NumberOfResults" element
     */
    int getNumberOfResults();
    
    /**
     * Gets (as xml) the "NumberOfResults" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfResults();
    
    /**
     * True if has "NumberOfResults" element
     */
    boolean isSetNumberOfResults();
    
    /**
     * Sets the "NumberOfResults" element
     */
    void setNumberOfResults(int numberOfResults);
    
    /**
     * Sets (as xml) the "NumberOfResults" element
     */
    void xsetNumberOfResults(org.apache.xmlbeans.XmlInt numberOfResults);
    
    /**
     * Unsets the "NumberOfResults" element
     */
    void unsetNumberOfResults();
    
    /**
     * Gets the "Objectives" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation getObjectives();
    
    /**
     * Tests for nil "Objectives" element
     */
    boolean isNilObjectives();
    
    /**
     * True if has "Objectives" element
     */
    boolean isSetObjectives();
    
    /**
     * Sets the "Objectives" element
     */
    void setObjectives(com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation objectives);
    
    /**
     * Appends and returns a new empty "Objectives" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation addNewObjectives();
    
    /**
     * Nils the "Objectives" element
     */
    void setNilObjectives();
    
    /**
     * Unsets the "Objectives" element
     */
    void unsetObjectives();
    
    /**
     * Gets the "RecurrenceDuration" element
     */
    int getRecurrenceDuration();
    
    /**
     * Gets (as xml) the "RecurrenceDuration" element
     */
    org.apache.xmlbeans.XmlInt xgetRecurrenceDuration();
    
    /**
     * True if has "RecurrenceDuration" element
     */
    boolean isSetRecurrenceDuration();
    
    /**
     * Sets the "RecurrenceDuration" element
     */
    void setRecurrenceDuration(int recurrenceDuration);
    
    /**
     * Sets (as xml) the "RecurrenceDuration" element
     */
    void xsetRecurrenceDuration(org.apache.xmlbeans.XmlInt recurrenceDuration);
    
    /**
     * Unsets the "RecurrenceDuration" element
     */
    void unsetRecurrenceDuration();
    
    /**
     * Gets the "RecurrenceTimeZoneCode" element
     */
    int getRecurrenceTimeZoneCode();
    
    /**
     * Gets (as xml) the "RecurrenceTimeZoneCode" element
     */
    org.apache.xmlbeans.XmlInt xgetRecurrenceTimeZoneCode();
    
    /**
     * True if has "RecurrenceTimeZoneCode" element
     */
    boolean isSetRecurrenceTimeZoneCode();
    
    /**
     * Sets the "RecurrenceTimeZoneCode" element
     */
    void setRecurrenceTimeZoneCode(int recurrenceTimeZoneCode);
    
    /**
     * Sets (as xml) the "RecurrenceTimeZoneCode" element
     */
    void xsetRecurrenceTimeZoneCode(org.apache.xmlbeans.XmlInt recurrenceTimeZoneCode);
    
    /**
     * Unsets the "RecurrenceTimeZoneCode" element
     */
    void unsetRecurrenceTimeZoneCode();
    
    /**
     * Gets the "RequiredResources" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource getRequiredResources();
    
    /**
     * Tests for nil "RequiredResources" element
     */
    boolean isNilRequiredResources();
    
    /**
     * True if has "RequiredResources" element
     */
    boolean isSetRequiredResources();
    
    /**
     * Sets the "RequiredResources" element
     */
    void setRequiredResources(com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource requiredResources);
    
    /**
     * Appends and returns a new empty "RequiredResources" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource addNewRequiredResources();
    
    /**
     * Nils the "RequiredResources" element
     */
    void setNilRequiredResources();
    
    /**
     * Unsets the "RequiredResources" element
     */
    void unsetRequiredResources();
    
    /**
     * Gets the "SearchRecurrenceRule" element
     */
    java.lang.String getSearchRecurrenceRule();
    
    /**
     * Gets (as xml) the "SearchRecurrenceRule" element
     */
    org.apache.xmlbeans.XmlString xgetSearchRecurrenceRule();
    
    /**
     * Tests for nil "SearchRecurrenceRule" element
     */
    boolean isNilSearchRecurrenceRule();
    
    /**
     * True if has "SearchRecurrenceRule" element
     */
    boolean isSetSearchRecurrenceRule();
    
    /**
     * Sets the "SearchRecurrenceRule" element
     */
    void setSearchRecurrenceRule(java.lang.String searchRecurrenceRule);
    
    /**
     * Sets (as xml) the "SearchRecurrenceRule" element
     */
    void xsetSearchRecurrenceRule(org.apache.xmlbeans.XmlString searchRecurrenceRule);
    
    /**
     * Nils the "SearchRecurrenceRule" element
     */
    void setNilSearchRecurrenceRule();
    
    /**
     * Unsets the "SearchRecurrenceRule" element
     */
    void unsetSearchRecurrenceRule();
    
    /**
     * Gets the "SearchRecurrenceStart" element
     */
    java.util.Calendar getSearchRecurrenceStart();
    
    /**
     * Gets (as xml) the "SearchRecurrenceStart" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSearchRecurrenceStart();
    
    /**
     * Tests for nil "SearchRecurrenceStart" element
     */
    boolean isNilSearchRecurrenceStart();
    
    /**
     * True if has "SearchRecurrenceStart" element
     */
    boolean isSetSearchRecurrenceStart();
    
    /**
     * Sets the "SearchRecurrenceStart" element
     */
    void setSearchRecurrenceStart(java.util.Calendar searchRecurrenceStart);
    
    /**
     * Sets (as xml) the "SearchRecurrenceStart" element
     */
    void xsetSearchRecurrenceStart(org.apache.xmlbeans.XmlDateTime searchRecurrenceStart);
    
    /**
     * Nils the "SearchRecurrenceStart" element
     */
    void setNilSearchRecurrenceStart();
    
    /**
     * Unsets the "SearchRecurrenceStart" element
     */
    void unsetSearchRecurrenceStart();
    
    /**
     * Gets the "SearchWindowEnd" element
     */
    java.util.Calendar getSearchWindowEnd();
    
    /**
     * Gets (as xml) the "SearchWindowEnd" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSearchWindowEnd();
    
    /**
     * Tests for nil "SearchWindowEnd" element
     */
    boolean isNilSearchWindowEnd();
    
    /**
     * True if has "SearchWindowEnd" element
     */
    boolean isSetSearchWindowEnd();
    
    /**
     * Sets the "SearchWindowEnd" element
     */
    void setSearchWindowEnd(java.util.Calendar searchWindowEnd);
    
    /**
     * Sets (as xml) the "SearchWindowEnd" element
     */
    void xsetSearchWindowEnd(org.apache.xmlbeans.XmlDateTime searchWindowEnd);
    
    /**
     * Nils the "SearchWindowEnd" element
     */
    void setNilSearchWindowEnd();
    
    /**
     * Unsets the "SearchWindowEnd" element
     */
    void unsetSearchWindowEnd();
    
    /**
     * Gets the "SearchWindowStart" element
     */
    java.util.Calendar getSearchWindowStart();
    
    /**
     * Gets (as xml) the "SearchWindowStart" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSearchWindowStart();
    
    /**
     * Tests for nil "SearchWindowStart" element
     */
    boolean isNilSearchWindowStart();
    
    /**
     * True if has "SearchWindowStart" element
     */
    boolean isSetSearchWindowStart();
    
    /**
     * Sets the "SearchWindowStart" element
     */
    void setSearchWindowStart(java.util.Calendar searchWindowStart);
    
    /**
     * Sets (as xml) the "SearchWindowStart" element
     */
    void xsetSearchWindowStart(org.apache.xmlbeans.XmlDateTime searchWindowStart);
    
    /**
     * Nils the "SearchWindowStart" element
     */
    void setNilSearchWindowStart();
    
    /**
     * Unsets the "SearchWindowStart" element
     */
    void unsetSearchWindowStart();
    
    /**
     * Gets the "ServiceId" element
     */
    java.lang.String getServiceId();
    
    /**
     * Gets (as xml) the "ServiceId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetServiceId();
    
    /**
     * True if has "ServiceId" element
     */
    boolean isSetServiceId();
    
    /**
     * Sets the "ServiceId" element
     */
    void setServiceId(java.lang.String serviceId);
    
    /**
     * Sets (as xml) the "ServiceId" element
     */
    void xsetServiceId(com.microsoft.schemas._2003._10.serialization.Guid serviceId);
    
    /**
     * Unsets the "ServiceId" element
     */
    void unsetServiceId();
    
    /**
     * Gets the "Sites" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid getSites();
    
    /**
     * Tests for nil "Sites" element
     */
    boolean isNilSites();
    
    /**
     * True if has "Sites" element
     */
    boolean isSetSites();
    
    /**
     * Sets the "Sites" element
     */
    void setSites(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid sites);
    
    /**
     * Appends and returns a new empty "Sites" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid addNewSites();
    
    /**
     * Nils the "Sites" element
     */
    void setNilSites();
    
    /**
     * Unsets the "Sites" element
     */
    void unsetSites();
    
    /**
     * Gets the "UserTimeZoneCode" element
     */
    int getUserTimeZoneCode();
    
    /**
     * Gets (as xml) the "UserTimeZoneCode" element
     */
    org.apache.xmlbeans.XmlInt xgetUserTimeZoneCode();
    
    /**
     * True if has "UserTimeZoneCode" element
     */
    boolean isSetUserTimeZoneCode();
    
    /**
     * Sets the "UserTimeZoneCode" element
     */
    void setUserTimeZoneCode(int userTimeZoneCode);
    
    /**
     * Sets (as xml) the "UserTimeZoneCode" element
     */
    void xsetUserTimeZoneCode(org.apache.xmlbeans.XmlInt userTimeZoneCode);
    
    /**
     * Unsets the "UserTimeZoneCode" element
     */
    void unsetUserTimeZoneCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
