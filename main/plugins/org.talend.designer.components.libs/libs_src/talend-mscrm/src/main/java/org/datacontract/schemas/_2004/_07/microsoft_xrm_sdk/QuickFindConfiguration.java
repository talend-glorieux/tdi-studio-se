/*
 * XML Type:  QuickFindConfiguration
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk
 * Java type: org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_xrm_sdk;


/**
 * An XML QuickFindConfiguration(@http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk).
 *
 * This is a complex type.
 */
public interface QuickFindConfiguration extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuickFindConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("quickfindconfigurationa4cetype");
    
    /**
     * Gets the "EntityName" element
     */
    java.lang.String getEntityName();
    
    /**
     * Gets (as xml) the "EntityName" element
     */
    org.apache.xmlbeans.XmlString xgetEntityName();
    
    /**
     * Tests for nil "EntityName" element
     */
    boolean isNilEntityName();
    
    /**
     * True if has "EntityName" element
     */
    boolean isSetEntityName();
    
    /**
     * Sets the "EntityName" element
     */
    void setEntityName(java.lang.String entityName);
    
    /**
     * Sets (as xml) the "EntityName" element
     */
    void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
    
    /**
     * Nils the "EntityName" element
     */
    void setNilEntityName();
    
    /**
     * Unsets the "EntityName" element
     */
    void unsetEntityName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration newInstance() {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
