/*
 * XML Type:  OrganizationDetail
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery;


/**
 * An XML OrganizationDetail(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public interface OrganizationDetail extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganizationDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC955E2CBD0784A9DEBCE84F203AEA053").resolveHandle("organizationdetaild9b6type");
    
    /**
     * Gets the "Endpoints" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection getEndpoints();
    
    /**
     * Tests for nil "Endpoints" element
     */
    boolean isNilEndpoints();
    
    /**
     * True if has "Endpoints" element
     */
    boolean isSetEndpoints();
    
    /**
     * Sets the "Endpoints" element
     */
    void setEndpoints(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection endpoints);
    
    /**
     * Appends and returns a new empty "Endpoints" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection addNewEndpoints();
    
    /**
     * Nils the "Endpoints" element
     */
    void setNilEndpoints();
    
    /**
     * Unsets the "Endpoints" element
     */
    void unsetEndpoints();
    
    /**
     * Gets the "FriendlyName" element
     */
    java.lang.String getFriendlyName();
    
    /**
     * Gets (as xml) the "FriendlyName" element
     */
    org.apache.xmlbeans.XmlString xgetFriendlyName();
    
    /**
     * Tests for nil "FriendlyName" element
     */
    boolean isNilFriendlyName();
    
    /**
     * True if has "FriendlyName" element
     */
    boolean isSetFriendlyName();
    
    /**
     * Sets the "FriendlyName" element
     */
    void setFriendlyName(java.lang.String friendlyName);
    
    /**
     * Sets (as xml) the "FriendlyName" element
     */
    void xsetFriendlyName(org.apache.xmlbeans.XmlString friendlyName);
    
    /**
     * Nils the "FriendlyName" element
     */
    void setNilFriendlyName();
    
    /**
     * Unsets the "FriendlyName" element
     */
    void unsetFriendlyName();
    
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
     * Gets the "OrganizationVersion" element
     */
    java.lang.String getOrganizationVersion();
    
    /**
     * Gets (as xml) the "OrganizationVersion" element
     */
    org.apache.xmlbeans.XmlString xgetOrganizationVersion();
    
    /**
     * Tests for nil "OrganizationVersion" element
     */
    boolean isNilOrganizationVersion();
    
    /**
     * True if has "OrganizationVersion" element
     */
    boolean isSetOrganizationVersion();
    
    /**
     * Sets the "OrganizationVersion" element
     */
    void setOrganizationVersion(java.lang.String organizationVersion);
    
    /**
     * Sets (as xml) the "OrganizationVersion" element
     */
    void xsetOrganizationVersion(org.apache.xmlbeans.XmlString organizationVersion);
    
    /**
     * Nils the "OrganizationVersion" element
     */
    void setNilOrganizationVersion();
    
    /**
     * Unsets the "OrganizationVersion" element
     */
    void unsetOrganizationVersion();
    
    /**
     * Gets the "State" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState.Enum getState();
    
    /**
     * Gets (as xml) the "State" element
     */
    com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState xgetState();
    
    /**
     * True if has "State" element
     */
    boolean isSetState();
    
    /**
     * Sets the "State" element
     */
    void setState(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState.Enum state);
    
    /**
     * Sets (as xml) the "State" element
     */
    void xsetState(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState state);
    
    /**
     * Unsets the "State" element
     */
    void unsetState();
    
    /**
     * Gets the "UniqueName" element
     */
    java.lang.String getUniqueName();
    
    /**
     * Gets (as xml) the "UniqueName" element
     */
    org.apache.xmlbeans.XmlString xgetUniqueName();
    
    /**
     * Tests for nil "UniqueName" element
     */
    boolean isNilUniqueName();
    
    /**
     * True if has "UniqueName" element
     */
    boolean isSetUniqueName();
    
    /**
     * Sets the "UniqueName" element
     */
    void setUniqueName(java.lang.String uniqueName);
    
    /**
     * Sets (as xml) the "UniqueName" element
     */
    void xsetUniqueName(org.apache.xmlbeans.XmlString uniqueName);
    
    /**
     * Nils the "UniqueName" element
     */
    void setNilUniqueName();
    
    /**
     * Unsets the "UniqueName" element
     */
    void unsetUniqueName();
    
    /**
     * Gets the "UrlName" element
     */
    java.lang.String getUrlName();
    
    /**
     * Gets (as xml) the "UrlName" element
     */
    org.apache.xmlbeans.XmlString xgetUrlName();
    
    /**
     * Tests for nil "UrlName" element
     */
    boolean isNilUrlName();
    
    /**
     * True if has "UrlName" element
     */
    boolean isSetUrlName();
    
    /**
     * Sets the "UrlName" element
     */
    void setUrlName(java.lang.String urlName);
    
    /**
     * Sets (as xml) the "UrlName" element
     */
    void xsetUrlName(org.apache.xmlbeans.XmlString urlName);
    
    /**
     * Nils the "UrlName" element
     */
    void setNilUrlName();
    
    /**
     * Unsets the "UrlName" element
     */
    void unsetUrlName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
