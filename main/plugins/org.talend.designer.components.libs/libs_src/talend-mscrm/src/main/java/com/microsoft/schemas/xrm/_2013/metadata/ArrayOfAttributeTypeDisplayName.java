/*
 * XML Type:  ArrayOfAttributeTypeDisplayName
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata;


/**
 * An XML ArrayOfAttributeTypeDisplayName(@http://schemas.microsoft.com/xrm/2013/Metadata).
 *
 * This is a complex type.
 */
public interface ArrayOfAttributeTypeDisplayName extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfAttributeTypeDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofattributetypedisplaynamed948type");
    
    /**
     * Gets array of all "AttributeTypeDisplayName" elements
     */
    com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName[] getAttributeTypeDisplayNameArray();
    
    /**
     * Gets ith "AttributeTypeDisplayName" element
     */
    com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName getAttributeTypeDisplayNameArray(int i);
    
    /**
     * Tests for nil ith "AttributeTypeDisplayName" element
     */
    boolean isNilAttributeTypeDisplayNameArray(int i);
    
    /**
     * Returns number of "AttributeTypeDisplayName" element
     */
    int sizeOfAttributeTypeDisplayNameArray();
    
    /**
     * Sets array of all "AttributeTypeDisplayName" element
     */
    void setAttributeTypeDisplayNameArray(com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName[] attributeTypeDisplayNameArray);
    
    /**
     * Sets ith "AttributeTypeDisplayName" element
     */
    void setAttributeTypeDisplayNameArray(int i, com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName attributeTypeDisplayName);
    
    /**
     * Nils the ith "AttributeTypeDisplayName" element
     */
    void setNilAttributeTypeDisplayNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeTypeDisplayName" element
     */
    com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName insertNewAttributeTypeDisplayName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeTypeDisplayName" element
     */
    com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName addNewAttributeTypeDisplayName();
    
    /**
     * Removes the ith "AttributeTypeDisplayName" element
     */
    void removeAttributeTypeDisplayName(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName newInstance() {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
