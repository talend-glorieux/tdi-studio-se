/*
 * XML Type:  FilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.FilterExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML FilterExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface FilterExpression extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterExpression.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("filterexpressionc8c1type");
    
    /**
     * Gets the "Conditions" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression getConditions();
    
    /**
     * Tests for nil "Conditions" element
     */
    boolean isNilConditions();
    
    /**
     * True if has "Conditions" element
     */
    boolean isSetConditions();
    
    /**
     * Sets the "Conditions" element
     */
    void setConditions(com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression conditions);
    
    /**
     * Appends and returns a new empty "Conditions" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression addNewConditions();
    
    /**
     * Nils the "Conditions" element
     */
    void setNilConditions();
    
    /**
     * Unsets the "Conditions" element
     */
    void unsetConditions();
    
    /**
     * Gets the "FilterOperator" element
     */
    com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum getFilterOperator();
    
    /**
     * Gets (as xml) the "FilterOperator" element
     */
    com.microsoft.schemas.xrm._2011.contracts.LogicalOperator xgetFilterOperator();
    
    /**
     * True if has "FilterOperator" element
     */
    boolean isSetFilterOperator();
    
    /**
     * Sets the "FilterOperator" element
     */
    void setFilterOperator(com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum filterOperator);
    
    /**
     * Sets (as xml) the "FilterOperator" element
     */
    void xsetFilterOperator(com.microsoft.schemas.xrm._2011.contracts.LogicalOperator filterOperator);
    
    /**
     * Unsets the "FilterOperator" element
     */
    void unsetFilterOperator();
    
    /**
     * Gets the "Filters" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression getFilters();
    
    /**
     * Tests for nil "Filters" element
     */
    boolean isNilFilters();
    
    /**
     * True if has "Filters" element
     */
    boolean isSetFilters();
    
    /**
     * Sets the "Filters" element
     */
    void setFilters(com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression filters);
    
    /**
     * Appends and returns a new empty "Filters" element
     */
    com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression addNewFilters();
    
    /**
     * Nils the "Filters" element
     */
    void setNilFilters();
    
    /**
     * Unsets the "Filters" element
     */
    void unsetFilters();
    
    /**
     * Gets the "IsQuickFindFilter" element
     */
    boolean getIsQuickFindFilter();
    
    /**
     * Gets (as xml) the "IsQuickFindFilter" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsQuickFindFilter();
    
    /**
     * True if has "IsQuickFindFilter" element
     */
    boolean isSetIsQuickFindFilter();
    
    /**
     * Sets the "IsQuickFindFilter" element
     */
    void setIsQuickFindFilter(boolean isQuickFindFilter);
    
    /**
     * Sets (as xml) the "IsQuickFindFilter" element
     */
    void xsetIsQuickFindFilter(org.apache.xmlbeans.XmlBoolean isQuickFindFilter);
    
    /**
     * Unsets the "IsQuickFindFilter" element
     */
    void unsetIsQuickFindFilter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.FilterExpression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.FilterExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
