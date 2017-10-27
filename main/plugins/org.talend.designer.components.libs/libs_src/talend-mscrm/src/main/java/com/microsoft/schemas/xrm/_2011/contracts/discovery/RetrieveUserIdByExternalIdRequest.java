/*
 * XML Type:  RetrieveUserIdByExternalIdRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery;


/**
 * An XML RetrieveUserIdByExternalIdRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public interface RetrieveUserIdByExternalIdRequest extends com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetrieveUserIdByExternalIdRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC955E2CBD0784A9DEBCE84F203AEA053").resolveHandle("retrieveuseridbyexternalidrequest2ef0type");
    
    /**
     * Gets the "ExternalId" element
     */
    java.lang.String getExternalId();
    
    /**
     * Gets (as xml) the "ExternalId" element
     */
    org.apache.xmlbeans.XmlString xgetExternalId();
    
    /**
     * Tests for nil "ExternalId" element
     */
    boolean isNilExternalId();
    
    /**
     * True if has "ExternalId" element
     */
    boolean isSetExternalId();
    
    /**
     * Sets the "ExternalId" element
     */
    void setExternalId(java.lang.String externalId);
    
    /**
     * Sets (as xml) the "ExternalId" element
     */
    void xsetExternalId(org.apache.xmlbeans.XmlString externalId);
    
    /**
     * Nils the "ExternalId" element
     */
    void setNilExternalId();
    
    /**
     * Unsets the "ExternalId" element
     */
    void unsetExternalId();
    
    /**
     * Gets the "OrganizationId" element
     */
    java.lang.String getOrganizationId();
    
    /**
     * Gets (as xml) the "OrganizationId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetOrganizationId();
    
    /**
     * True if has "OrganizationId" element
     */
    boolean isSetOrganizationId();
    
    /**
     * Sets the "OrganizationId" element
     */
    void setOrganizationId(java.lang.String organizationId);
    
    /**
     * Sets (as xml) the "OrganizationId" element
     */
    void xsetOrganizationId(com.microsoft.schemas._2003._10.serialization.Guid organizationId);
    
    /**
     * Unsets the "OrganizationId" element
     */
    void unsetOrganizationId();
    
    /**
     * Gets the "OrganizationName" element
     */
    java.lang.String getOrganizationName();
    
    /**
     * Gets (as xml) the "OrganizationName" element
     */
    org.apache.xmlbeans.XmlString xgetOrganizationName();
    
    /**
     * Tests for nil "OrganizationName" element
     */
    boolean isNilOrganizationName();
    
    /**
     * True if has "OrganizationName" element
     */
    boolean isSetOrganizationName();
    
    /**
     * Sets the "OrganizationName" element
     */
    void setOrganizationName(java.lang.String organizationName);
    
    /**
     * Sets (as xml) the "OrganizationName" element
     */
    void xsetOrganizationName(org.apache.xmlbeans.XmlString organizationName);
    
    /**
     * Nils the "OrganizationName" element
     */
    void setNilOrganizationName();
    
    /**
     * Unsets the "OrganizationName" element
     */
    void unsetOrganizationName();
    
    /**
     * Gets the "Release" element
     */
    java.lang.String getRelease();
    
    /**
     * Gets (as xml) the "Release" element
     */
    org.apache.xmlbeans.XmlString xgetRelease();
    
    /**
     * Tests for nil "Release" element
     */
    boolean isNilRelease();
    
    /**
     * True if has "Release" element
     */
    boolean isSetRelease();
    
    /**
     * Sets the "Release" element
     */
    void setRelease(java.lang.String release);
    
    /**
     * Sets (as xml) the "Release" element
     */
    void xsetRelease(org.apache.xmlbeans.XmlString release);
    
    /**
     * Nils the "Release" element
     */
    void setNilRelease();
    
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
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
