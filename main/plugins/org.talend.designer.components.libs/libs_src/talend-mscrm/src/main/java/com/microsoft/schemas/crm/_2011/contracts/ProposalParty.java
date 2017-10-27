/*
 * XML Type:  ProposalParty
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ProposalParty
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML ProposalParty(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface ProposalParty extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProposalParty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("proposalparty0ea8type");
    
    /**
     * Gets the "DisplayName" element
     */
    java.lang.String getDisplayName();
    
    /**
     * Gets (as xml) the "DisplayName" element
     */
    org.apache.xmlbeans.XmlString xgetDisplayName();
    
    /**
     * Tests for nil "DisplayName" element
     */
    boolean isNilDisplayName();
    
    /**
     * True if has "DisplayName" element
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "DisplayName" element
     */
    void setDisplayName(java.lang.String displayName);
    
    /**
     * Sets (as xml) the "DisplayName" element
     */
    void xsetDisplayName(org.apache.xmlbeans.XmlString displayName);
    
    /**
     * Nils the "DisplayName" element
     */
    void setNilDisplayName();
    
    /**
     * Unsets the "DisplayName" element
     */
    void unsetDisplayName();
    
    /**
     * Gets the "EffortRequired" element
     */
    double getEffortRequired();
    
    /**
     * Gets (as xml) the "EffortRequired" element
     */
    org.apache.xmlbeans.XmlDouble xgetEffortRequired();
    
    /**
     * True if has "EffortRequired" element
     */
    boolean isSetEffortRequired();
    
    /**
     * Sets the "EffortRequired" element
     */
    void setEffortRequired(double effortRequired);
    
    /**
     * Sets (as xml) the "EffortRequired" element
     */
    void xsetEffortRequired(org.apache.xmlbeans.XmlDouble effortRequired);
    
    /**
     * Unsets the "EffortRequired" element
     */
    void unsetEffortRequired();
    
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
     * Gets the "ResourceId" element
     */
    java.lang.String getResourceId();
    
    /**
     * Gets (as xml) the "ResourceId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetResourceId();
    
    /**
     * True if has "ResourceId" element
     */
    boolean isSetResourceId();
    
    /**
     * Sets the "ResourceId" element
     */
    void setResourceId(java.lang.String resourceId);
    
    /**
     * Sets (as xml) the "ResourceId" element
     */
    void xsetResourceId(com.microsoft.schemas._2003._10.serialization.Guid resourceId);
    
    /**
     * Unsets the "ResourceId" element
     */
    void unsetResourceId();
    
    /**
     * Gets the "ResourceSpecId" element
     */
    java.lang.String getResourceSpecId();
    
    /**
     * Gets (as xml) the "ResourceSpecId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetResourceSpecId();
    
    /**
     * True if has "ResourceSpecId" element
     */
    boolean isSetResourceSpecId();
    
    /**
     * Sets the "ResourceSpecId" element
     */
    void setResourceSpecId(java.lang.String resourceSpecId);
    
    /**
     * Sets (as xml) the "ResourceSpecId" element
     */
    void xsetResourceSpecId(com.microsoft.schemas._2003._10.serialization.Guid resourceSpecId);
    
    /**
     * Unsets the "ResourceSpecId" element
     */
    void unsetResourceSpecId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ProposalParty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ProposalParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
