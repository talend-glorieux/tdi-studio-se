/*
 * XML Type:  ArrayOfBusinessNotificationParameter
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages;


/**
 * An XML ArrayOfBusinessNotificationParameter(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages).
 *
 * This is a complex type.
 */
public interface ArrayOfBusinessNotificationParameter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfBusinessNotificationParameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofbusinessnotificationparameter00a3type");
    
    /**
     * Gets array of all "BusinessNotificationParameter" elements
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter[] getBusinessNotificationParameterArray();
    
    /**
     * Gets ith "BusinessNotificationParameter" element
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter getBusinessNotificationParameterArray(int i);
    
    /**
     * Tests for nil ith "BusinessNotificationParameter" element
     */
    boolean isNilBusinessNotificationParameterArray(int i);
    
    /**
     * Returns number of "BusinessNotificationParameter" element
     */
    int sizeOfBusinessNotificationParameterArray();
    
    /**
     * Sets array of all "BusinessNotificationParameter" element
     */
    void setBusinessNotificationParameterArray(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter[] businessNotificationParameterArray);
    
    /**
     * Sets ith "BusinessNotificationParameter" element
     */
    void setBusinessNotificationParameterArray(int i, org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter businessNotificationParameter);
    
    /**
     * Nils the ith "BusinessNotificationParameter" element
     */
    void setNilBusinessNotificationParameterArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BusinessNotificationParameter" element
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter insertNewBusinessNotificationParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BusinessNotificationParameter" element
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter addNewBusinessNotificationParameter();
    
    /**
     * Removes the ith "BusinessNotificationParameter" element
     */
    void removeBusinessNotificationParameter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter newInstance() {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
