/*
 * XML Type:  QueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QueryExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML QueryExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface QueryExpression extends com.microsoft.schemas.xrm._2011.contracts.QueryBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryExpression.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("queryexpressioncfdftype");
    
    /**
     * Gets the "ColumnSet" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ColumnSet getColumnSet();
    
    /**
     * Tests for nil "ColumnSet" element
     */
    boolean isNilColumnSet();
    
    /**
     * True if has "ColumnSet" element
     */
    boolean isSetColumnSet();
    
    /**
     * Sets the "ColumnSet" element
     */
    void setColumnSet(com.microsoft.schemas.xrm._2011.contracts.ColumnSet columnSet);
    
    /**
     * Appends and returns a new empty "ColumnSet" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ColumnSet addNewColumnSet();
    
    /**
     * Nils the "ColumnSet" element
     */
    void setNilColumnSet();
    
    /**
     * Unsets the "ColumnSet" element
     */
    void unsetColumnSet();
    
    /**
     * Gets the "Criteria" element
     */
    com.microsoft.schemas.xrm._2011.contracts.FilterExpression getCriteria();
    
    /**
     * Tests for nil "Criteria" element
     */
    boolean isNilCriteria();
    
    /**
     * True if has "Criteria" element
     */
    boolean isSetCriteria();
    
    /**
     * Sets the "Criteria" element
     */
    void setCriteria(com.microsoft.schemas.xrm._2011.contracts.FilterExpression criteria);
    
    /**
     * Appends and returns a new empty "Criteria" element
     */
    com.microsoft.schemas.xrm._2011.contracts.FilterExpression addNewCriteria();
    
    /**
     * Nils the "Criteria" element
     */
    void setNilCriteria();
    
    /**
     * Unsets the "Criteria" element
     */
    void unsetCriteria();
    
    /**
     * Gets the "Distinct" element
     */
    boolean getDistinct();
    
    /**
     * Gets (as xml) the "Distinct" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDistinct();
    
    /**
     * True if has "Distinct" element
     */
    boolean isSetDistinct();
    
    /**
     * Sets the "Distinct" element
     */
    void setDistinct(boolean distinct);
    
    /**
     * Sets (as xml) the "Distinct" element
     */
    void xsetDistinct(org.apache.xmlbeans.XmlBoolean distinct);
    
    /**
     * Unsets the "Distinct" element
     */
    void unsetDistinct();
    
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
     * Gets the "LinkEntities" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity getLinkEntities();
    
    /**
     * Tests for nil "LinkEntities" element
     */
    boolean isNilLinkEntities();
    
    /**
     * True if has "LinkEntities" element
     */
    boolean isSetLinkEntities();
    
    /**
     * Sets the "LinkEntities" element
     */
    void setLinkEntities(com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity linkEntities);
    
    /**
     * Appends and returns a new empty "LinkEntities" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity addNewLinkEntities();
    
    /**
     * Nils the "LinkEntities" element
     */
    void setNilLinkEntities();
    
    /**
     * Unsets the "LinkEntities" element
     */
    void unsetLinkEntities();
    
    /**
     * Gets the "Orders" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression getOrders();
    
    /**
     * Tests for nil "Orders" element
     */
    boolean isNilOrders();
    
    /**
     * True if has "Orders" element
     */
    boolean isSetOrders();
    
    /**
     * Sets the "Orders" element
     */
    void setOrders(com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression orders);
    
    /**
     * Appends and returns a new empty "Orders" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression addNewOrders();
    
    /**
     * Nils the "Orders" element
     */
    void setNilOrders();
    
    /**
     * Unsets the "Orders" element
     */
    void unsetOrders();
    
    /**
     * Gets the "PageInfo" element
     */
    com.microsoft.schemas.xrm._2011.contracts.PagingInfo getPageInfo();
    
    /**
     * Tests for nil "PageInfo" element
     */
    boolean isNilPageInfo();
    
    /**
     * True if has "PageInfo" element
     */
    boolean isSetPageInfo();
    
    /**
     * Sets the "PageInfo" element
     */
    void setPageInfo(com.microsoft.schemas.xrm._2011.contracts.PagingInfo pageInfo);
    
    /**
     * Appends and returns a new empty "PageInfo" element
     */
    com.microsoft.schemas.xrm._2011.contracts.PagingInfo addNewPageInfo();
    
    /**
     * Nils the "PageInfo" element
     */
    void setNilPageInfo();
    
    /**
     * Unsets the "PageInfo" element
     */
    void unsetPageInfo();
    
    /**
     * Gets the "NoLock" element
     */
    boolean getNoLock();
    
    /**
     * Gets (as xml) the "NoLock" element
     */
    org.apache.xmlbeans.XmlBoolean xgetNoLock();
    
    /**
     * True if has "NoLock" element
     */
    boolean isSetNoLock();
    
    /**
     * Sets the "NoLock" element
     */
    void setNoLock(boolean noLock);
    
    /**
     * Sets (as xml) the "NoLock" element
     */
    void xsetNoLock(org.apache.xmlbeans.XmlBoolean noLock);
    
    /**
     * Unsets the "NoLock" element
     */
    void unsetNoLock();
    
    /**
     * Gets the "TopCount" element
     */
    int getTopCount();
    
    /**
     * Gets (as xml) the "TopCount" element
     */
    org.apache.xmlbeans.XmlInt xgetTopCount();
    
    /**
     * Tests for nil "TopCount" element
     */
    boolean isNilTopCount();
    
    /**
     * True if has "TopCount" element
     */
    boolean isSetTopCount();
    
    /**
     * Sets the "TopCount" element
     */
    void setTopCount(int topCount);
    
    /**
     * Sets (as xml) the "TopCount" element
     */
    void xsetTopCount(org.apache.xmlbeans.XmlInt topCount);
    
    /**
     * Nils the "TopCount" element
     */
    void setNilTopCount();
    
    /**
     * Unsets the "TopCount" element
     */
    void unsetTopCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.QueryExpression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.QueryExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
