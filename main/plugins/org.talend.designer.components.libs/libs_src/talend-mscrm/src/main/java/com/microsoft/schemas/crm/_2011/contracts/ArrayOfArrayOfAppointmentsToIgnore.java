/*
 * XML Type:  ArrayOfArrayOfAppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML ArrayOfArrayOfAppointmentsToIgnore(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface ArrayOfArrayOfAppointmentsToIgnore extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfArrayOfAppointmentsToIgnore.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofarrayofappointmentstoignorea4c7type");
    
    /**
     * Gets array of all "ArrayOfAppointmentsToIgnore" elements
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore[] getArrayOfAppointmentsToIgnoreArray();
    
    /**
     * Gets ith "ArrayOfAppointmentsToIgnore" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore getArrayOfAppointmentsToIgnoreArray(int i);
    
    /**
     * Tests for nil ith "ArrayOfAppointmentsToIgnore" element
     */
    boolean isNilArrayOfAppointmentsToIgnoreArray(int i);
    
    /**
     * Returns number of "ArrayOfAppointmentsToIgnore" element
     */
    int sizeOfArrayOfAppointmentsToIgnoreArray();
    
    /**
     * Sets array of all "ArrayOfAppointmentsToIgnore" element
     */
    void setArrayOfAppointmentsToIgnoreArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore[] arrayOfAppointmentsToIgnoreArray);
    
    /**
     * Sets ith "ArrayOfAppointmentsToIgnore" element
     */
    void setArrayOfAppointmentsToIgnoreArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore arrayOfAppointmentsToIgnore);
    
    /**
     * Nils the ith "ArrayOfAppointmentsToIgnore" element
     */
    void setNilArrayOfAppointmentsToIgnoreArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAppointmentsToIgnore" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore insertNewArrayOfAppointmentsToIgnore(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAppointmentsToIgnore" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore addNewArrayOfAppointmentsToIgnore();
    
    /**
     * Removes the ith "ArrayOfAppointmentsToIgnore" element
     */
    void removeArrayOfAppointmentsToIgnore(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
