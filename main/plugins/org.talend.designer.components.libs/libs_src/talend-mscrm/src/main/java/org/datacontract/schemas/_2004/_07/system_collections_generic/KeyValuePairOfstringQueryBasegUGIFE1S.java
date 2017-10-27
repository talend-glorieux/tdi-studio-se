/*
 * XML Type:  KeyValuePairOfstringQueryBasegUGIFE1S
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic;


/**
 * An XML KeyValuePairOfstringQueryBasegUGIFE1S(@http://schemas.datacontract.org/2004/07/System.Collections.Generic).
 *
 * This is a complex type.
 */
public interface KeyValuePairOfstringQueryBasegUGIFE1S extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyValuePairOfstringQueryBasegUGIFE1S.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("keyvaluepairofstringquerybasegugife1s055ctype");
    
    /**
     * Gets the "key" element
     */
    java.lang.String getKey();
    
    /**
     * Gets (as xml) the "key" element
     */
    org.apache.xmlbeans.XmlString xgetKey();
    
    /**
     * Tests for nil "key" element
     */
    boolean isNilKey();
    
    /**
     * Sets the "key" element
     */
    void setKey(java.lang.String key);
    
    /**
     * Sets (as xml) the "key" element
     */
    void xsetKey(org.apache.xmlbeans.XmlString key);
    
    /**
     * Nils the "key" element
     */
    void setNilKey();
    
    /**
     * Gets the "value" element
     */
    com.microsoft.schemas.xrm._2011.contracts.QueryBase getValue();
    
    /**
     * Tests for nil "value" element
     */
    boolean isNilValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(com.microsoft.schemas.xrm._2011.contracts.QueryBase value);
    
    /**
     * Appends and returns a new empty "value" element
     */
    com.microsoft.schemas.xrm._2011.contracts.QueryBase addNewValue();
    
    /**
     * Nils the "value" element
     */
    void setNilValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S newInstance() {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
