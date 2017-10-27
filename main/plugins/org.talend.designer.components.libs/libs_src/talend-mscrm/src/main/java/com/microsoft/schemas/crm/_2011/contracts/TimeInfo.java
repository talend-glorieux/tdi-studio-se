/*
 * XML Type:  TimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.TimeInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML TimeInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface TimeInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("timeinfoec21type");
    
    /**
     * Gets the "ActivityStatusCode" element
     */
    int getActivityStatusCode();
    
    /**
     * Gets (as xml) the "ActivityStatusCode" element
     */
    org.apache.xmlbeans.XmlInt xgetActivityStatusCode();
    
    /**
     * True if has "ActivityStatusCode" element
     */
    boolean isSetActivityStatusCode();
    
    /**
     * Sets the "ActivityStatusCode" element
     */
    void setActivityStatusCode(int activityStatusCode);
    
    /**
     * Sets (as xml) the "ActivityStatusCode" element
     */
    void xsetActivityStatusCode(org.apache.xmlbeans.XmlInt activityStatusCode);
    
    /**
     * Unsets the "ActivityStatusCode" element
     */
    void unsetActivityStatusCode();
    
    /**
     * Gets the "CalendarId" element
     */
    java.lang.String getCalendarId();
    
    /**
     * Gets (as xml) the "CalendarId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetCalendarId();
    
    /**
     * True if has "CalendarId" element
     */
    boolean isSetCalendarId();
    
    /**
     * Sets the "CalendarId" element
     */
    void setCalendarId(java.lang.String calendarId);
    
    /**
     * Sets (as xml) the "CalendarId" element
     */
    void xsetCalendarId(com.microsoft.schemas._2003._10.serialization.Guid calendarId);
    
    /**
     * Unsets the "CalendarId" element
     */
    void unsetCalendarId();
    
    /**
     * Gets the "DisplayText" element
     */
    java.lang.String getDisplayText();
    
    /**
     * Gets (as xml) the "DisplayText" element
     */
    org.apache.xmlbeans.XmlString xgetDisplayText();
    
    /**
     * Tests for nil "DisplayText" element
     */
    boolean isNilDisplayText();
    
    /**
     * True if has "DisplayText" element
     */
    boolean isSetDisplayText();
    
    /**
     * Sets the "DisplayText" element
     */
    void setDisplayText(java.lang.String displayText);
    
    /**
     * Sets (as xml) the "DisplayText" element
     */
    void xsetDisplayText(org.apache.xmlbeans.XmlString displayText);
    
    /**
     * Nils the "DisplayText" element
     */
    void setNilDisplayText();
    
    /**
     * Unsets the "DisplayText" element
     */
    void unsetDisplayText();
    
    /**
     * Gets the "Effort" element
     */
    double getEffort();
    
    /**
     * Gets (as xml) the "Effort" element
     */
    org.apache.xmlbeans.XmlDouble xgetEffort();
    
    /**
     * True if has "Effort" element
     */
    boolean isSetEffort();
    
    /**
     * Sets the "Effort" element
     */
    void setEffort(double effort);
    
    /**
     * Sets (as xml) the "Effort" element
     */
    void xsetEffort(org.apache.xmlbeans.XmlDouble effort);
    
    /**
     * Unsets the "Effort" element
     */
    void unsetEffort();
    
    /**
     * Gets the "End" element
     */
    java.util.Calendar getEnd();
    
    /**
     * Gets (as xml) the "End" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEnd();
    
    /**
     * Tests for nil "End" element
     */
    boolean isNilEnd();
    
    /**
     * True if has "End" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "End" element
     */
    void setEnd(java.util.Calendar end);
    
    /**
     * Sets (as xml) the "End" element
     */
    void xsetEnd(org.apache.xmlbeans.XmlDateTime end);
    
    /**
     * Nils the "End" element
     */
    void setNilEnd();
    
    /**
     * Unsets the "End" element
     */
    void unsetEnd();
    
    /**
     * Gets the "IsActivity" element
     */
    boolean getIsActivity();
    
    /**
     * Gets (as xml) the "IsActivity" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsActivity();
    
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
     * Unsets the "IsActivity" element
     */
    void unsetIsActivity();
    
    /**
     * Gets the "SourceId" element
     */
    java.lang.String getSourceId();
    
    /**
     * Gets (as xml) the "SourceId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetSourceId();
    
    /**
     * True if has "SourceId" element
     */
    boolean isSetSourceId();
    
    /**
     * Sets the "SourceId" element
     */
    void setSourceId(java.lang.String sourceId);
    
    /**
     * Sets (as xml) the "SourceId" element
     */
    void xsetSourceId(com.microsoft.schemas._2003._10.serialization.Guid sourceId);
    
    /**
     * Unsets the "SourceId" element
     */
    void unsetSourceId();
    
    /**
     * Gets the "SourceTypeCode" element
     */
    int getSourceTypeCode();
    
    /**
     * Gets (as xml) the "SourceTypeCode" element
     */
    org.apache.xmlbeans.XmlInt xgetSourceTypeCode();
    
    /**
     * True if has "SourceTypeCode" element
     */
    boolean isSetSourceTypeCode();
    
    /**
     * Sets the "SourceTypeCode" element
     */
    void setSourceTypeCode(int sourceTypeCode);
    
    /**
     * Sets (as xml) the "SourceTypeCode" element
     */
    void xsetSourceTypeCode(org.apache.xmlbeans.XmlInt sourceTypeCode);
    
    /**
     * Unsets the "SourceTypeCode" element
     */
    void unsetSourceTypeCode();
    
    /**
     * Gets the "Start" element
     */
    java.util.Calendar getStart();
    
    /**
     * Gets (as xml) the "Start" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStart();
    
    /**
     * Tests for nil "Start" element
     */
    boolean isNilStart();
    
    /**
     * True if has "Start" element
     */
    boolean isSetStart();
    
    /**
     * Sets the "Start" element
     */
    void setStart(java.util.Calendar start);
    
    /**
     * Sets (as xml) the "Start" element
     */
    void xsetStart(org.apache.xmlbeans.XmlDateTime start);
    
    /**
     * Nils the "Start" element
     */
    void setNilStart();
    
    /**
     * Unsets the "Start" element
     */
    void unsetStart();
    
    /**
     * Gets the "SubCode" element
     */
    com.microsoft.schemas.crm._2011.contracts.SubCode.Enum getSubCode();
    
    /**
     * Gets (as xml) the "SubCode" element
     */
    com.microsoft.schemas.crm._2011.contracts.SubCode xgetSubCode();
    
    /**
     * True if has "SubCode" element
     */
    boolean isSetSubCode();
    
    /**
     * Sets the "SubCode" element
     */
    void setSubCode(com.microsoft.schemas.crm._2011.contracts.SubCode.Enum subCode);
    
    /**
     * Sets (as xml) the "SubCode" element
     */
    void xsetSubCode(com.microsoft.schemas.crm._2011.contracts.SubCode subCode);
    
    /**
     * Unsets the "SubCode" element
     */
    void unsetSubCode();
    
    /**
     * Gets the "TimeCode" element
     */
    com.microsoft.schemas.crm._2011.contracts.TimeCode.Enum getTimeCode();
    
    /**
     * Gets (as xml) the "TimeCode" element
     */
    com.microsoft.schemas.crm._2011.contracts.TimeCode xgetTimeCode();
    
    /**
     * True if has "TimeCode" element
     */
    boolean isSetTimeCode();
    
    /**
     * Sets the "TimeCode" element
     */
    void setTimeCode(com.microsoft.schemas.crm._2011.contracts.TimeCode.Enum timeCode);
    
    /**
     * Sets (as xml) the "TimeCode" element
     */
    void xsetTimeCode(com.microsoft.schemas.crm._2011.contracts.TimeCode timeCode);
    
    /**
     * Unsets the "TimeCode" element
     */
    void unsetTimeCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.TimeInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
