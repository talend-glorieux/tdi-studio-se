/*
 * XML Type:  ArrayOfdouble
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays;


/**
 * An XML ArrayOfdouble(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public interface ArrayOfdouble extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfdouble.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofdoubleb7aftype");
    
    /**
     * Gets array of all "double" elements
     */
    double[] getDoubleArray();
    
    /**
     * Gets ith "double" element
     */
    double getDoubleArray(int i);
    
    /**
     * Gets (as xml) array of all "double" elements
     */
    org.apache.xmlbeans.XmlDouble[] xgetDoubleArray();
    
    /**
     * Gets (as xml) ith "double" element
     */
    org.apache.xmlbeans.XmlDouble xgetDoubleArray(int i);
    
    /**
     * Returns number of "double" element
     */
    int sizeOfDoubleArray();
    
    /**
     * Sets array of all "double" element
     */
    void setDoubleArray(double[] xdoubleArray);
    
    /**
     * Sets ith "double" element
     */
    void setDoubleArray(int i, double xdouble);
    
    /**
     * Sets (as xml) array of all "double" element
     */
    void xsetDoubleArray(org.apache.xmlbeans.XmlDouble[] xdoubleArray);
    
    /**
     * Sets (as xml) ith "double" element
     */
    void xsetDoubleArray(int i, org.apache.xmlbeans.XmlDouble xdouble);
    
    /**
     * Inserts the value as the ith "double" element
     */
    void insertDouble(int i, double xdouble);
    
    /**
     * Appends the value as the last "double" element
     */
    void addDouble(double xdouble);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "double" element
     */
    org.apache.xmlbeans.XmlDouble insertNewDouble(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "double" element
     */
    org.apache.xmlbeans.XmlDouble addNewDouble();
    
    /**
     * Removes the ith "double" element
     */
    void removeDouble(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble newInstance() {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
