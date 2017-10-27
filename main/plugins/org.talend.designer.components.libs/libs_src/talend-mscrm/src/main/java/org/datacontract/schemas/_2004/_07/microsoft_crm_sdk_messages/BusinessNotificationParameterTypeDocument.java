/*
 * An XML document type.
 * Localname: BusinessNotificationParameterType
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages;


/**
 * A document containing one BusinessNotificationParameterType(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages) element.
 *
 * This is a complex type.
 */
public interface BusinessNotificationParameterTypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessNotificationParameterTypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("businessnotificationparametertypeb29bdoctype");
    
    /**
     * Gets the "BusinessNotificationParameterType" element
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum getBusinessNotificationParameterType();
    
    /**
     * Gets (as xml) the "BusinessNotificationParameterType" element
     */
    org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType xgetBusinessNotificationParameterType();
    
    /**
     * Tests for nil "BusinessNotificationParameterType" element
     */
    boolean isNilBusinessNotificationParameterType();
    
    /**
     * Sets the "BusinessNotificationParameterType" element
     */
    void setBusinessNotificationParameterType(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum businessNotificationParameterType);
    
    /**
     * Sets (as xml) the "BusinessNotificationParameterType" element
     */
    void xsetBusinessNotificationParameterType(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType businessNotificationParameterType);
    
    /**
     * Nils the "BusinessNotificationParameterType" element
     */
    void setNilBusinessNotificationParameterType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument newInstance() {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
