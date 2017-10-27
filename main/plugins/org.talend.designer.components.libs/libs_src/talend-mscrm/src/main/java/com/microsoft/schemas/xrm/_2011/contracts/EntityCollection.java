/*
 * XML Type:  EntityCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML EntityCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface EntityCollection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("entitycollection2d72type");
    
    /**
     * Gets the "Entities" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity getEntities();
    
    /**
     * Tests for nil "Entities" element
     */
    boolean isNilEntities();
    
    /**
     * True if has "Entities" element
     */
    boolean isSetEntities();
    
    /**
     * Sets the "Entities" element
     */
    void setEntities(com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity entities);
    
    /**
     * Appends and returns a new empty "Entities" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity addNewEntities();
    
    /**
     * Nils the "Entities" element
     */
    void setNilEntities();
    
    /**
     * Unsets the "Entities" element
     */
    void unsetEntities();
    
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
     * Gets the "MinActiveRowVersion" element
     */
    java.lang.String getMinActiveRowVersion();
    
    /**
     * Gets (as xml) the "MinActiveRowVersion" element
     */
    org.apache.xmlbeans.XmlString xgetMinActiveRowVersion();
    
    /**
     * Tests for nil "MinActiveRowVersion" element
     */
    boolean isNilMinActiveRowVersion();
    
    /**
     * True if has "MinActiveRowVersion" element
     */
    boolean isSetMinActiveRowVersion();
    
    /**
     * Sets the "MinActiveRowVersion" element
     */
    void setMinActiveRowVersion(java.lang.String minActiveRowVersion);
    
    /**
     * Sets (as xml) the "MinActiveRowVersion" element
     */
    void xsetMinActiveRowVersion(org.apache.xmlbeans.XmlString minActiveRowVersion);
    
    /**
     * Nils the "MinActiveRowVersion" element
     */
    void setNilMinActiveRowVersion();
    
    /**
     * Unsets the "MinActiveRowVersion" element
     */
    void unsetMinActiveRowVersion();
    
    /**
     * Gets the "MoreRecords" element
     */
    boolean getMoreRecords();
    
    /**
     * Gets (as xml) the "MoreRecords" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMoreRecords();
    
    /**
     * True if has "MoreRecords" element
     */
    boolean isSetMoreRecords();
    
    /**
     * Sets the "MoreRecords" element
     */
    void setMoreRecords(boolean moreRecords);
    
    /**
     * Sets (as xml) the "MoreRecords" element
     */
    void xsetMoreRecords(org.apache.xmlbeans.XmlBoolean moreRecords);
    
    /**
     * Unsets the "MoreRecords" element
     */
    void unsetMoreRecords();
    
    /**
     * Gets the "PagingCookie" element
     */
    java.lang.String getPagingCookie();
    
    /**
     * Gets (as xml) the "PagingCookie" element
     */
    org.apache.xmlbeans.XmlString xgetPagingCookie();
    
    /**
     * Tests for nil "PagingCookie" element
     */
    boolean isNilPagingCookie();
    
    /**
     * True if has "PagingCookie" element
     */
    boolean isSetPagingCookie();
    
    /**
     * Sets the "PagingCookie" element
     */
    void setPagingCookie(java.lang.String pagingCookie);
    
    /**
     * Sets (as xml) the "PagingCookie" element
     */
    void xsetPagingCookie(org.apache.xmlbeans.XmlString pagingCookie);
    
    /**
     * Nils the "PagingCookie" element
     */
    void setNilPagingCookie();
    
    /**
     * Unsets the "PagingCookie" element
     */
    void unsetPagingCookie();
    
    /**
     * Gets the "TotalRecordCount" element
     */
    int getTotalRecordCount();
    
    /**
     * Gets (as xml) the "TotalRecordCount" element
     */
    org.apache.xmlbeans.XmlInt xgetTotalRecordCount();
    
    /**
     * True if has "TotalRecordCount" element
     */
    boolean isSetTotalRecordCount();
    
    /**
     * Sets the "TotalRecordCount" element
     */
    void setTotalRecordCount(int totalRecordCount);
    
    /**
     * Sets (as xml) the "TotalRecordCount" element
     */
    void xsetTotalRecordCount(org.apache.xmlbeans.XmlInt totalRecordCount);
    
    /**
     * Unsets the "TotalRecordCount" element
     */
    void unsetTotalRecordCount();
    
    /**
     * Gets the "TotalRecordCountLimitExceeded" element
     */
    boolean getTotalRecordCountLimitExceeded();
    
    /**
     * Gets (as xml) the "TotalRecordCountLimitExceeded" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTotalRecordCountLimitExceeded();
    
    /**
     * True if has "TotalRecordCountLimitExceeded" element
     */
    boolean isSetTotalRecordCountLimitExceeded();
    
    /**
     * Sets the "TotalRecordCountLimitExceeded" element
     */
    void setTotalRecordCountLimitExceeded(boolean totalRecordCountLimitExceeded);
    
    /**
     * Sets (as xml) the "TotalRecordCountLimitExceeded" element
     */
    void xsetTotalRecordCountLimitExceeded(org.apache.xmlbeans.XmlBoolean totalRecordCountLimitExceeded);
    
    /**
     * Unsets the "TotalRecordCountLimitExceeded" element
     */
    void unsetTotalRecordCountLimitExceeded();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.EntityCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.EntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
