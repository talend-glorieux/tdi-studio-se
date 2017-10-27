/*
 * XML Type:  QueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML QueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface QueryByEntityNameDictionary extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryByEntityNameDictionary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("querybyentitynamedictionary8377type");
    
    /**
     * Gets array of all "KeyValuePairOfstringQueryBasegUGIFE1S" elements
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S[] getKeyValuePairOfstringQueryBasegUGIFE1SArray();
    
    /**
     * Gets ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S getKeyValuePairOfstringQueryBasegUGIFE1SArray(int i);
    
    /**
     * Returns number of "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    int sizeOfKeyValuePairOfstringQueryBasegUGIFE1SArray();
    
    /**
     * Sets array of all "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    void setKeyValuePairOfstringQueryBasegUGIFE1SArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S[] keyValuePairOfstringQueryBasegUGIFE1SArray);
    
    /**
     * Sets ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    void setKeyValuePairOfstringQueryBasegUGIFE1SArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S keyValuePairOfstringQueryBasegUGIFE1S);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S insertNewKeyValuePairOfstringQueryBasegUGIFE1S(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S addNewKeyValuePairOfstringQueryBasegUGIFE1S();
    
    /**
     * Removes the ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    void removeKeyValuePairOfstringQueryBasegUGIFE1S(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
