/*
 * XML Type:  ArrayOfKeyValueOfstringstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays;


/**
 * An XML ArrayOfKeyValueOfstringstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public interface ArrayOfKeyValueOfstringstring extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfKeyValueOfstringstring.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofkeyvalueofstringstring1b29type");
    
    /**
     * Gets array of all "KeyValueOfstringstring" elements
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring[] getKeyValueOfstringstringArray();
    
    /**
     * Gets ith "KeyValueOfstringstring" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring getKeyValueOfstringstringArray(int i);
    
    /**
     * Returns number of "KeyValueOfstringstring" element
     */
    int sizeOfKeyValueOfstringstringArray();
    
    /**
     * Sets array of all "KeyValueOfstringstring" element
     */
    void setKeyValueOfstringstringArray(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring[] keyValueOfstringstringArray);
    
    /**
     * Sets ith "KeyValueOfstringstring" element
     */
    void setKeyValueOfstringstringArray(int i, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring keyValueOfstringstring);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueOfstringstring" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring insertNewKeyValueOfstringstring(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueOfstringstring" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring addNewKeyValueOfstringstring();
    
    /**
     * Removes the ith "KeyValueOfstringstring" element
     */
    void removeKeyValueOfstringstring(int i);
    
    /**
     * An XML KeyValueOfstringstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
     *
     * This is a complex type.
     */
    public interface KeyValueOfstringstring extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyValueOfstringstring.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("keyvalueofstringstring00d0elemtype");
        
        /**
         * Gets the "Key" element
         */
        java.lang.String getKey();
        
        /**
         * Gets (as xml) the "Key" element
         */
        org.apache.xmlbeans.XmlString xgetKey();
        
        /**
         * Tests for nil "Key" element
         */
        boolean isNilKey();
        
        /**
         * Sets the "Key" element
         */
        void setKey(java.lang.String key);
        
        /**
         * Sets (as xml) the "Key" element
         */
        void xsetKey(org.apache.xmlbeans.XmlString key);
        
        /**
         * Nils the "Key" element
         */
        void setNilKey();
        
        /**
         * Gets the "Value" element
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "Value" element
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * Tests for nil "Value" element
         */
        boolean isNilValue();
        
        /**
         * Sets the "Value" element
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "Value" element
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * Nils the "Value" element
         */
        void setNilValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring newInstance() {
              return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring newInstance() {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
