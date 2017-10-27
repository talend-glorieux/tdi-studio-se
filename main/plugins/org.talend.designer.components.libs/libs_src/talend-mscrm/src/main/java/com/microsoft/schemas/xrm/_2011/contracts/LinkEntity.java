/*
 * XML Type:  LinkEntity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LinkEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML LinkEntity(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface LinkEntity extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("linkentitycdcetype");
    
    /**
     * Gets the "Columns" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ColumnSet getColumns();
    
    /**
     * Tests for nil "Columns" element
     */
    boolean isNilColumns();
    
    /**
     * True if has "Columns" element
     */
    boolean isSetColumns();
    
    /**
     * Sets the "Columns" element
     */
    void setColumns(com.microsoft.schemas.xrm._2011.contracts.ColumnSet columns);
    
    /**
     * Appends and returns a new empty "Columns" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ColumnSet addNewColumns();
    
    /**
     * Nils the "Columns" element
     */
    void setNilColumns();
    
    /**
     * Unsets the "Columns" element
     */
    void unsetColumns();
    
    /**
     * Gets the "EntityAlias" element
     */
    java.lang.String getEntityAlias();
    
    /**
     * Gets (as xml) the "EntityAlias" element
     */
    org.apache.xmlbeans.XmlString xgetEntityAlias();
    
    /**
     * Tests for nil "EntityAlias" element
     */
    boolean isNilEntityAlias();
    
    /**
     * True if has "EntityAlias" element
     */
    boolean isSetEntityAlias();
    
    /**
     * Sets the "EntityAlias" element
     */
    void setEntityAlias(java.lang.String entityAlias);
    
    /**
     * Sets (as xml) the "EntityAlias" element
     */
    void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias);
    
    /**
     * Nils the "EntityAlias" element
     */
    void setNilEntityAlias();
    
    /**
     * Unsets the "EntityAlias" element
     */
    void unsetEntityAlias();
    
    /**
     * Gets the "JoinOperator" element
     */
    com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum getJoinOperator();
    
    /**
     * Gets (as xml) the "JoinOperator" element
     */
    com.microsoft.schemas.xrm._2011.contracts.JoinOperator xgetJoinOperator();
    
    /**
     * True if has "JoinOperator" element
     */
    boolean isSetJoinOperator();
    
    /**
     * Sets the "JoinOperator" element
     */
    void setJoinOperator(com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum joinOperator);
    
    /**
     * Sets (as xml) the "JoinOperator" element
     */
    void xsetJoinOperator(com.microsoft.schemas.xrm._2011.contracts.JoinOperator joinOperator);
    
    /**
     * Unsets the "JoinOperator" element
     */
    void unsetJoinOperator();
    
    /**
     * Gets the "LinkCriteria" element
     */
    com.microsoft.schemas.xrm._2011.contracts.FilterExpression getLinkCriteria();
    
    /**
     * Tests for nil "LinkCriteria" element
     */
    boolean isNilLinkCriteria();
    
    /**
     * True if has "LinkCriteria" element
     */
    boolean isSetLinkCriteria();
    
    /**
     * Sets the "LinkCriteria" element
     */
    void setLinkCriteria(com.microsoft.schemas.xrm._2011.contracts.FilterExpression linkCriteria);
    
    /**
     * Appends and returns a new empty "LinkCriteria" element
     */
    com.microsoft.schemas.xrm._2011.contracts.FilterExpression addNewLinkCriteria();
    
    /**
     * Nils the "LinkCriteria" element
     */
    void setNilLinkCriteria();
    
    /**
     * Unsets the "LinkCriteria" element
     */
    void unsetLinkCriteria();
    
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
     * Gets the "LinkFromAttributeName" element
     */
    java.lang.String getLinkFromAttributeName();
    
    /**
     * Gets (as xml) the "LinkFromAttributeName" element
     */
    org.apache.xmlbeans.XmlString xgetLinkFromAttributeName();
    
    /**
     * Tests for nil "LinkFromAttributeName" element
     */
    boolean isNilLinkFromAttributeName();
    
    /**
     * True if has "LinkFromAttributeName" element
     */
    boolean isSetLinkFromAttributeName();
    
    /**
     * Sets the "LinkFromAttributeName" element
     */
    void setLinkFromAttributeName(java.lang.String linkFromAttributeName);
    
    /**
     * Sets (as xml) the "LinkFromAttributeName" element
     */
    void xsetLinkFromAttributeName(org.apache.xmlbeans.XmlString linkFromAttributeName);
    
    /**
     * Nils the "LinkFromAttributeName" element
     */
    void setNilLinkFromAttributeName();
    
    /**
     * Unsets the "LinkFromAttributeName" element
     */
    void unsetLinkFromAttributeName();
    
    /**
     * Gets the "LinkFromEntityName" element
     */
    java.lang.String getLinkFromEntityName();
    
    /**
     * Gets (as xml) the "LinkFromEntityName" element
     */
    org.apache.xmlbeans.XmlString xgetLinkFromEntityName();
    
    /**
     * Tests for nil "LinkFromEntityName" element
     */
    boolean isNilLinkFromEntityName();
    
    /**
     * True if has "LinkFromEntityName" element
     */
    boolean isSetLinkFromEntityName();
    
    /**
     * Sets the "LinkFromEntityName" element
     */
    void setLinkFromEntityName(java.lang.String linkFromEntityName);
    
    /**
     * Sets (as xml) the "LinkFromEntityName" element
     */
    void xsetLinkFromEntityName(org.apache.xmlbeans.XmlString linkFromEntityName);
    
    /**
     * Nils the "LinkFromEntityName" element
     */
    void setNilLinkFromEntityName();
    
    /**
     * Unsets the "LinkFromEntityName" element
     */
    void unsetLinkFromEntityName();
    
    /**
     * Gets the "LinkToAttributeName" element
     */
    java.lang.String getLinkToAttributeName();
    
    /**
     * Gets (as xml) the "LinkToAttributeName" element
     */
    org.apache.xmlbeans.XmlString xgetLinkToAttributeName();
    
    /**
     * Tests for nil "LinkToAttributeName" element
     */
    boolean isNilLinkToAttributeName();
    
    /**
     * True if has "LinkToAttributeName" element
     */
    boolean isSetLinkToAttributeName();
    
    /**
     * Sets the "LinkToAttributeName" element
     */
    void setLinkToAttributeName(java.lang.String linkToAttributeName);
    
    /**
     * Sets (as xml) the "LinkToAttributeName" element
     */
    void xsetLinkToAttributeName(org.apache.xmlbeans.XmlString linkToAttributeName);
    
    /**
     * Nils the "LinkToAttributeName" element
     */
    void setNilLinkToAttributeName();
    
    /**
     * Unsets the "LinkToAttributeName" element
     */
    void unsetLinkToAttributeName();
    
    /**
     * Gets the "LinkToEntityName" element
     */
    java.lang.String getLinkToEntityName();
    
    /**
     * Gets (as xml) the "LinkToEntityName" element
     */
    org.apache.xmlbeans.XmlString xgetLinkToEntityName();
    
    /**
     * Tests for nil "LinkToEntityName" element
     */
    boolean isNilLinkToEntityName();
    
    /**
     * True if has "LinkToEntityName" element
     */
    boolean isSetLinkToEntityName();
    
    /**
     * Sets the "LinkToEntityName" element
     */
    void setLinkToEntityName(java.lang.String linkToEntityName);
    
    /**
     * Sets (as xml) the "LinkToEntityName" element
     */
    void xsetLinkToEntityName(org.apache.xmlbeans.XmlString linkToEntityName);
    
    /**
     * Nils the "LinkToEntityName" element
     */
    void setNilLinkToEntityName();
    
    /**
     * Unsets the "LinkToEntityName" element
     */
    void unsetLinkToEntityName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.LinkEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.LinkEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
