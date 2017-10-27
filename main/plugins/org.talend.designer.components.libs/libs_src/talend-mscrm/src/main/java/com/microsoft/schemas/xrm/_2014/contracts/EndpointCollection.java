/*
 * XML Type:  EndpointCollection
 * Namespace: http://schemas.microsoft.com/xrm/2014/Contracts
 * Java type: com.microsoft.schemas.xrm._2014.contracts.EndpointCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2014.contracts;


/**
 * An XML EndpointCollection(@http://schemas.microsoft.com/xrm/2014/Contracts).
 *
 * This is a complex type.
 */
public interface EndpointCollection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EndpointCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("endpointcollection1ea7type");
    
    /**
     * Gets array of all "KeyValuePairOfEndpointTypestringyDL0RVHi" elements
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi[] getKeyValuePairOfEndpointTypestringyDL0RVHiArray();
    
    /**
     * Gets ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi getKeyValuePairOfEndpointTypestringyDL0RVHiArray(int i);
    
    /**
     * Returns number of "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    int sizeOfKeyValuePairOfEndpointTypestringyDL0RVHiArray();
    
    /**
     * Sets array of all "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    void setKeyValuePairOfEndpointTypestringyDL0RVHiArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi[] keyValuePairOfEndpointTypestringyDL0RVHiArray);
    
    /**
     * Sets ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    void setKeyValuePairOfEndpointTypestringyDL0RVHiArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi keyValuePairOfEndpointTypestringyDL0RVHi);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi insertNewKeyValuePairOfEndpointTypestringyDL0RVHi(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi addNewKeyValuePairOfEndpointTypestringyDL0RVHi();
    
    /**
     * Removes the ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    void removeKeyValuePairOfEndpointTypestringyDL0RVHi(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection newInstance() {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2014.contracts.EndpointCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
