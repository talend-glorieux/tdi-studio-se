/*
 * An XML document type.
 * Localname: ArrayOfBusinessNotificationParameter
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages;


/**
 * A document containing one ArrayOfBusinessNotificationParameter(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages) element.
 *
 * This is a complex type.
 */
public interface ArrayOfBusinessNotificationParameterDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfBusinessNotificationParameterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofbusinessnotificationparameterd093doctype");
    
    /**
     * Gets the "ArrayOfBusinessNotificationParameter" element
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter getArrayOfBusinessNotificationParameter();
    
    /**
     * Tests for nil "ArrayOfBusinessNotificationParameter" element
     */
    boolean isNilArrayOfBusinessNotificationParameter();
    
    /**
     * Sets the "ArrayOfBusinessNotificationParameter" element
     */
    void setArrayOfBusinessNotificationParameter(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter arrayOfBusinessNotificationParameter);
    
    /**
     * Appends and returns a new empty "ArrayOfBusinessNotificationParameter" element
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter addNewArrayOfBusinessNotificationParameter();
    
    /**
     * Nils the "ArrayOfBusinessNotificationParameter" element
     */
    void setNilArrayOfBusinessNotificationParameter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument newInstance() {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
