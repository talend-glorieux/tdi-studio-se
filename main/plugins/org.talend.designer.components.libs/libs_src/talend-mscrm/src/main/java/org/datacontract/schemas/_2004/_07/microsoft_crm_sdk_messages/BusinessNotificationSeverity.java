/*
 * XML Type:  BusinessNotificationSeverity
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages;


/**
 * An XML BusinessNotificationSeverity(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages).
 *
 * This is an atomic type that is a restriction of org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.
 */
public interface BusinessNotificationSeverity extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessNotificationSeverity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("businessnotificationseverity4f69type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("None");
    static final Enum ERROR = Enum.forString("Error");
    static final Enum WARNING = Enum.forString("Warning");
    static final Enum INFORMATION = Enum.forString("Information");
    static final Enum USER_DEFINED = Enum.forString("UserDefined");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_ERROR = Enum.INT_ERROR;
    static final int INT_WARNING = Enum.INT_WARNING;
    static final int INT_INFORMATION = Enum.INT_INFORMATION;
    static final int INT_USER_DEFINED = Enum.INT_USER_DEFINED;
    
    /**
     * Enumeration value class for org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_NONE = 1;
        static final int INT_ERROR = 2;
        static final int INT_WARNING = 3;
        static final int INT_INFORMATION = 4;
        static final int INT_USER_DEFINED = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("None", INT_NONE),
                new Enum("Error", INT_ERROR),
                new Enum("Warning", INT_WARNING),
                new Enum("Information", INT_INFORMATION),
                new Enum("UserDefined", INT_USER_DEFINED),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity newValue(java.lang.Object obj) {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) type.newValue( obj ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity newInstance() {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
