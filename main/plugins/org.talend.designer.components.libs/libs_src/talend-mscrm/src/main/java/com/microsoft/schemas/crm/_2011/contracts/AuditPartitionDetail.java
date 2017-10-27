/*
 * XML Type:  AuditPartitionDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML AuditPartitionDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface AuditPartitionDetail extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuditPartitionDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("auditpartitiondetailf606type");
    
    /**
     * Gets the "EndDate" element
     */
    java.util.Calendar getEndDate();
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndDate();
    
    /**
     * Tests for nil "EndDate" element
     */
    boolean isNilEndDate();
    
    /**
     * True if has "EndDate" element
     */
    boolean isSetEndDate();
    
    /**
     * Sets the "EndDate" element
     */
    void setEndDate(java.util.Calendar endDate);
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate);
    
    /**
     * Nils the "EndDate" element
     */
    void setNilEndDate();
    
    /**
     * Unsets the "EndDate" element
     */
    void unsetEndDate();
    
    /**
     * Gets the "PartitionNumber" element
     */
    int getPartitionNumber();
    
    /**
     * Gets (as xml) the "PartitionNumber" element
     */
    org.apache.xmlbeans.XmlInt xgetPartitionNumber();
    
    /**
     * True if has "PartitionNumber" element
     */
    boolean isSetPartitionNumber();
    
    /**
     * Sets the "PartitionNumber" element
     */
    void setPartitionNumber(int partitionNumber);
    
    /**
     * Sets (as xml) the "PartitionNumber" element
     */
    void xsetPartitionNumber(org.apache.xmlbeans.XmlInt partitionNumber);
    
    /**
     * Unsets the "PartitionNumber" element
     */
    void unsetPartitionNumber();
    
    /**
     * Gets the "Size" element
     */
    long getSize();
    
    /**
     * Gets (as xml) the "Size" element
     */
    org.apache.xmlbeans.XmlLong xgetSize();
    
    /**
     * True if has "Size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "Size" element
     */
    void setSize(long size);
    
    /**
     * Sets (as xml) the "Size" element
     */
    void xsetSize(org.apache.xmlbeans.XmlLong size);
    
    /**
     * Unsets the "Size" element
     */
    void unsetSize();
    
    /**
     * Gets the "StartDate" element
     */
    java.util.Calendar getStartDate();
    
    /**
     * Gets (as xml) the "StartDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartDate();
    
    /**
     * Tests for nil "StartDate" element
     */
    boolean isNilStartDate();
    
    /**
     * True if has "StartDate" element
     */
    boolean isSetStartDate();
    
    /**
     * Sets the "StartDate" element
     */
    void setStartDate(java.util.Calendar startDate);
    
    /**
     * Sets (as xml) the "StartDate" element
     */
    void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate);
    
    /**
     * Nils the "StartDate" element
     */
    void setNilStartDate();
    
    /**
     * Unsets the "StartDate" element
     */
    void unsetStartDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
