/*
 * XML Type:  ArrayOfArrayOfQueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML ArrayOfArrayOfQueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface ArrayOfArrayOfQueryByEntityNameDictionary extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfArrayOfQueryByEntityNameDictionary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofarrayofquerybyentitynamedictionary1537type");
    
    /**
     * Gets array of all "ArrayOfQueryByEntityNameDictionary" elements
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary[] getArrayOfQueryByEntityNameDictionaryArray();
    
    /**
     * Gets ith "ArrayOfQueryByEntityNameDictionary" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary getArrayOfQueryByEntityNameDictionaryArray(int i);
    
    /**
     * Tests for nil ith "ArrayOfQueryByEntityNameDictionary" element
     */
    boolean isNilArrayOfQueryByEntityNameDictionaryArray(int i);
    
    /**
     * Returns number of "ArrayOfQueryByEntityNameDictionary" element
     */
    int sizeOfArrayOfQueryByEntityNameDictionaryArray();
    
    /**
     * Sets array of all "ArrayOfQueryByEntityNameDictionary" element
     */
    void setArrayOfQueryByEntityNameDictionaryArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary[] arrayOfQueryByEntityNameDictionaryArray);
    
    /**
     * Sets ith "ArrayOfQueryByEntityNameDictionary" element
     */
    void setArrayOfQueryByEntityNameDictionaryArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary arrayOfQueryByEntityNameDictionary);
    
    /**
     * Nils the ith "ArrayOfQueryByEntityNameDictionary" element
     */
    void setNilArrayOfQueryByEntityNameDictionaryArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfQueryByEntityNameDictionary" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary insertNewArrayOfQueryByEntityNameDictionary(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfQueryByEntityNameDictionary" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary addNewArrayOfQueryByEntityNameDictionary();
    
    /**
     * Removes the ith "ArrayOfQueryByEntityNameDictionary" element
     */
    void removeArrayOfQueryByEntityNameDictionary(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
