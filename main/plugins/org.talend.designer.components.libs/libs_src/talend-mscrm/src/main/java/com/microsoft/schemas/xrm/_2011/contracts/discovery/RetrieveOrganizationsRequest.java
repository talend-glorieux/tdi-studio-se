/*
 * XML Type:  RetrieveOrganizationsRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery;


/**
 * An XML RetrieveOrganizationsRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public interface RetrieveOrganizationsRequest extends com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetrieveOrganizationsRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC955E2CBD0784A9DEBCE84F203AEA053").resolveHandle("retrieveorganizationsrequest077dtype");
    
    /**
     * Gets the "AccessType" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum getAccessType();
    
    /**
     * Gets (as xml) the "AccessType" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType xgetAccessType();
    
    /**
     * True if has "AccessType" element
     */
    boolean isSetAccessType();
    
    /**
     * Sets the "AccessType" element
     */
    void setAccessType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum accessType);
    
    /**
     * Sets (as xml) the "AccessType" element
     */
    void xsetAccessType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType accessType);
    
    /**
     * Unsets the "AccessType" element
     */
    void unsetAccessType();
    
    /**
     * Gets the "IsInternalCrossGeoServerRequest" element
     */
    boolean getIsInternalCrossGeoServerRequest();
    
    /**
     * Gets (as xml) the "IsInternalCrossGeoServerRequest" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsInternalCrossGeoServerRequest();
    
    /**
     * True if has "IsInternalCrossGeoServerRequest" element
     */
    boolean isSetIsInternalCrossGeoServerRequest();
    
    /**
     * Sets the "IsInternalCrossGeoServerRequest" element
     */
    void setIsInternalCrossGeoServerRequest(boolean isInternalCrossGeoServerRequest);
    
    /**
     * Sets (as xml) the "IsInternalCrossGeoServerRequest" element
     */
    void xsetIsInternalCrossGeoServerRequest(org.apache.xmlbeans.XmlBoolean isInternalCrossGeoServerRequest);
    
    /**
     * Unsets the "IsInternalCrossGeoServerRequest" element
     */
    void unsetIsInternalCrossGeoServerRequest();
    
    /**
     * Gets the "Release" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum getRelease();
    
    /**
     * Gets (as xml) the "Release" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease xgetRelease();
    
    /**
     * True if has "Release" element
     */
    boolean isSetRelease();
    
    /**
     * Sets the "Release" element
     */
    void setRelease(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum release);
    
    /**
     * Sets (as xml) the "Release" element
     */
    void xsetRelease(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease release);
    
    /**
     * Unsets the "Release" element
     */
    void unsetRelease();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
