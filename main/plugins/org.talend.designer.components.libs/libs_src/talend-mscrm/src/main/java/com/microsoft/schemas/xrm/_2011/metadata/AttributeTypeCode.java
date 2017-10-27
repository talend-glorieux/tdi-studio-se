/*
 * XML Type:  AttributeTypeCode
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML AttributeTypeCode(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.
 */
public interface AttributeTypeCode extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributeTypeCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("attributetypecode9b0etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BOOLEAN = Enum.forString("Boolean");
    static final Enum CUSTOMER = Enum.forString("Customer");
    static final Enum DATE_TIME = Enum.forString("DateTime");
    static final Enum DECIMAL = Enum.forString("Decimal");
    static final Enum DOUBLE = Enum.forString("Double");
    static final Enum INTEGER = Enum.forString("Integer");
    static final Enum LOOKUP = Enum.forString("Lookup");
    static final Enum MEMO = Enum.forString("Memo");
    static final Enum MONEY = Enum.forString("Money");
    static final Enum OWNER = Enum.forString("Owner");
    static final Enum PARTY_LIST = Enum.forString("PartyList");
    static final Enum PICKLIST = Enum.forString("Picklist");
    static final Enum STATE = Enum.forString("State");
    static final Enum STATUS = Enum.forString("Status");
    static final Enum STRING = Enum.forString("String");
    static final Enum UNIQUEIDENTIFIER = Enum.forString("Uniqueidentifier");
    static final Enum CALENDAR_RULES = Enum.forString("CalendarRules");
    static final Enum VIRTUAL = Enum.forString("Virtual");
    static final Enum BIG_INT = Enum.forString("BigInt");
    static final Enum MANAGED_PROPERTY = Enum.forString("ManagedProperty");
    static final Enum ENTITY_NAME = Enum.forString("EntityName");
    
    static final int INT_BOOLEAN = Enum.INT_BOOLEAN;
    static final int INT_CUSTOMER = Enum.INT_CUSTOMER;
    static final int INT_DATE_TIME = Enum.INT_DATE_TIME;
    static final int INT_DECIMAL = Enum.INT_DECIMAL;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_INTEGER = Enum.INT_INTEGER;
    static final int INT_LOOKUP = Enum.INT_LOOKUP;
    static final int INT_MEMO = Enum.INT_MEMO;
    static final int INT_MONEY = Enum.INT_MONEY;
    static final int INT_OWNER = Enum.INT_OWNER;
    static final int INT_PARTY_LIST = Enum.INT_PARTY_LIST;
    static final int INT_PICKLIST = Enum.INT_PICKLIST;
    static final int INT_STATE = Enum.INT_STATE;
    static final int INT_STATUS = Enum.INT_STATUS;
    static final int INT_STRING = Enum.INT_STRING;
    static final int INT_UNIQUEIDENTIFIER = Enum.INT_UNIQUEIDENTIFIER;
    static final int INT_CALENDAR_RULES = Enum.INT_CALENDAR_RULES;
    static final int INT_VIRTUAL = Enum.INT_VIRTUAL;
    static final int INT_BIG_INT = Enum.INT_BIG_INT;
    static final int INT_MANAGED_PROPERTY = Enum.INT_MANAGED_PROPERTY;
    static final int INT_ENTITY_NAME = Enum.INT_ENTITY_NAME;
    
    /**
     * Enumeration value class for com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BOOLEAN
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
        
        static final int INT_BOOLEAN = 1;
        static final int INT_CUSTOMER = 2;
        static final int INT_DATE_TIME = 3;
        static final int INT_DECIMAL = 4;
        static final int INT_DOUBLE = 5;
        static final int INT_INTEGER = 6;
        static final int INT_LOOKUP = 7;
        static final int INT_MEMO = 8;
        static final int INT_MONEY = 9;
        static final int INT_OWNER = 10;
        static final int INT_PARTY_LIST = 11;
        static final int INT_PICKLIST = 12;
        static final int INT_STATE = 13;
        static final int INT_STATUS = 14;
        static final int INT_STRING = 15;
        static final int INT_UNIQUEIDENTIFIER = 16;
        static final int INT_CALENDAR_RULES = 17;
        static final int INT_VIRTUAL = 18;
        static final int INT_BIG_INT = 19;
        static final int INT_MANAGED_PROPERTY = 20;
        static final int INT_ENTITY_NAME = 21;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Boolean", INT_BOOLEAN),
                new Enum("Customer", INT_CUSTOMER),
                new Enum("DateTime", INT_DATE_TIME),
                new Enum("Decimal", INT_DECIMAL),
                new Enum("Double", INT_DOUBLE),
                new Enum("Integer", INT_INTEGER),
                new Enum("Lookup", INT_LOOKUP),
                new Enum("Memo", INT_MEMO),
                new Enum("Money", INT_MONEY),
                new Enum("Owner", INT_OWNER),
                new Enum("PartyList", INT_PARTY_LIST),
                new Enum("Picklist", INT_PICKLIST),
                new Enum("State", INT_STATE),
                new Enum("Status", INT_STATUS),
                new Enum("String", INT_STRING),
                new Enum("Uniqueidentifier", INT_UNIQUEIDENTIFIER),
                new Enum("CalendarRules", INT_CALENDAR_RULES),
                new Enum("Virtual", INT_VIRTUAL),
                new Enum("BigInt", INT_BIG_INT),
                new Enum("ManagedProperty", INT_MANAGED_PROPERTY),
                new Enum("EntityName", INT_ENTITY_NAME),
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
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode newValue(java.lang.Object obj) {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) type.newValue( obj ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
