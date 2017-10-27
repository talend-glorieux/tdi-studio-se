/*
 * XML Type:  AppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentProposal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML AppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface AppointmentProposal extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AppointmentProposal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("appointmentproposala805type");
    
    /**
     * Gets the "End" element
     */
    java.util.Calendar getEnd();
    
    /**
     * Gets (as xml) the "End" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEnd();
    
    /**
     * Tests for nil "End" element
     */
    boolean isNilEnd();
    
    /**
     * True if has "End" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "End" element
     */
    void setEnd(java.util.Calendar end);
    
    /**
     * Sets (as xml) the "End" element
     */
    void xsetEnd(org.apache.xmlbeans.XmlDateTime end);
    
    /**
     * Nils the "End" element
     */
    void setNilEnd();
    
    /**
     * Unsets the "End" element
     */
    void unsetEnd();
    
    /**
     * Gets the "ProposalParties" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty getProposalParties();
    
    /**
     * Tests for nil "ProposalParties" element
     */
    boolean isNilProposalParties();
    
    /**
     * True if has "ProposalParties" element
     */
    boolean isSetProposalParties();
    
    /**
     * Sets the "ProposalParties" element
     */
    void setProposalParties(com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty proposalParties);
    
    /**
     * Appends and returns a new empty "ProposalParties" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty addNewProposalParties();
    
    /**
     * Nils the "ProposalParties" element
     */
    void setNilProposalParties();
    
    /**
     * Unsets the "ProposalParties" element
     */
    void unsetProposalParties();
    
    /**
     * Gets the "SiteId" element
     */
    java.lang.String getSiteId();
    
    /**
     * Gets (as xml) the "SiteId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetSiteId();
    
    /**
     * True if has "SiteId" element
     */
    boolean isSetSiteId();
    
    /**
     * Sets the "SiteId" element
     */
    void setSiteId(java.lang.String siteId);
    
    /**
     * Sets (as xml) the "SiteId" element
     */
    void xsetSiteId(com.microsoft.schemas._2003._10.serialization.Guid siteId);
    
    /**
     * Unsets the "SiteId" element
     */
    void unsetSiteId();
    
    /**
     * Gets the "SiteName" element
     */
    java.lang.String getSiteName();
    
    /**
     * Gets (as xml) the "SiteName" element
     */
    org.apache.xmlbeans.XmlString xgetSiteName();
    
    /**
     * Tests for nil "SiteName" element
     */
    boolean isNilSiteName();
    
    /**
     * True if has "SiteName" element
     */
    boolean isSetSiteName();
    
    /**
     * Sets the "SiteName" element
     */
    void setSiteName(java.lang.String siteName);
    
    /**
     * Sets (as xml) the "SiteName" element
     */
    void xsetSiteName(org.apache.xmlbeans.XmlString siteName);
    
    /**
     * Nils the "SiteName" element
     */
    void setNilSiteName();
    
    /**
     * Unsets the "SiteName" element
     */
    void unsetSiteName();
    
    /**
     * Gets the "Start" element
     */
    java.util.Calendar getStart();
    
    /**
     * Gets (as xml) the "Start" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStart();
    
    /**
     * Tests for nil "Start" element
     */
    boolean isNilStart();
    
    /**
     * True if has "Start" element
     */
    boolean isSetStart();
    
    /**
     * Sets the "Start" element
     */
    void setStart(java.util.Calendar start);
    
    /**
     * Sets (as xml) the "Start" element
     */
    void xsetStart(org.apache.xmlbeans.XmlDateTime start);
    
    /**
     * Nils the "Start" element
     */
    void setNilStart();
    
    /**
     * Unsets the "Start" element
     */
    void unsetStart();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AppointmentProposal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
