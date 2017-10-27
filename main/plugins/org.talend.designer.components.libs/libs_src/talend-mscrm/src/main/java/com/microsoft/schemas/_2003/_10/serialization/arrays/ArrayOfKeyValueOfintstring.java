/*
 * XML Type:  ArrayOfKeyValueOfintstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays;


/**
 * An XML ArrayOfKeyValueOfintstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public interface ArrayOfKeyValueOfintstring extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfKeyValueOfintstring.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofkeyvalueofintstringefe7type");
    
    /**
     * Gets array of all "KeyValueOfintstring" elements
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring[] getKeyValueOfintstringArray();
    
    /**
     * Gets ith "KeyValueOfintstring" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring getKeyValueOfintstringArray(int i);
    
    /**
     * Returns number of "KeyValueOfintstring" element
     */
    int sizeOfKeyValueOfintstringArray();
    
    /**
     * Sets array of all "KeyValueOfintstring" element
     */
    void setKeyValueOfintstringArray(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring[] keyValueOfintstringArray);
    
    /**
     * Sets ith "KeyValueOfintstring" element
     */
    void setKeyValueOfintstringArray(int i, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring keyValueOfintstring);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueOfintstring" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring insertNewKeyValueOfintstring(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueOfintstring" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring addNewKeyValueOfintstring();
    
    /**
     * Removes the ith "KeyValueOfintstring" element
     */
    void removeKeyValueOfintstring(int i);
    
    /**
     * An XML KeyValueOfintstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
     *
     * This is a complex type.
     */
    public interface KeyValueOfintstring extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyValueOfintstring.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("keyvalueofintstring8924elemtype");
        
        /**
         * Gets the "Key" element
         */
        int getKey();
        
        /**
         * Gets (as xml) the "Key" element
         */
        org.apache.xmlbeans.XmlInt xgetKey();
        
        /**
         * Sets the "Key" element
         */
        void setKey(int key);
        
        /**
         * Sets (as xml) the "Key" element
         */
        void xsetKey(org.apache.xmlbeans.XmlInt key);
        
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
            public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring newInstance() {
              return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring.KeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring newInstance() {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
