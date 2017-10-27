/*
 * XML Type:  ArrayOfManagedPropertyEvaluationPriority
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML ArrayOfManagedPropertyEvaluationPriority(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface ArrayOfManagedPropertyEvaluationPriority extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfManagedPropertyEvaluationPriority.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("arrayofmanagedpropertyevaluationpriority8a3btype");
    
    /**
     * Gets array of all "ManagedPropertyEvaluationPriority" elements
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum[] getManagedPropertyEvaluationPriorityArray();
    
    /**
     * Gets ith "ManagedPropertyEvaluationPriority" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum getManagedPropertyEvaluationPriorityArray(int i);
    
    /**
     * Gets (as xml) array of all "ManagedPropertyEvaluationPriority" elements
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority[] xgetManagedPropertyEvaluationPriorityArray();
    
    /**
     * Gets (as xml) ith "ManagedPropertyEvaluationPriority" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority xgetManagedPropertyEvaluationPriorityArray(int i);
    
    /**
     * Returns number of "ManagedPropertyEvaluationPriority" element
     */
    int sizeOfManagedPropertyEvaluationPriorityArray();
    
    /**
     * Sets array of all "ManagedPropertyEvaluationPriority" element
     */
    void setManagedPropertyEvaluationPriorityArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum[] managedPropertyEvaluationPriorityArray);
    
    /**
     * Sets ith "ManagedPropertyEvaluationPriority" element
     */
    void setManagedPropertyEvaluationPriorityArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum managedPropertyEvaluationPriority);
    
    /**
     * Sets (as xml) array of all "ManagedPropertyEvaluationPriority" element
     */
    void xsetManagedPropertyEvaluationPriorityArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority[] managedPropertyEvaluationPriorityArray);
    
    /**
     * Sets (as xml) ith "ManagedPropertyEvaluationPriority" element
     */
    void xsetManagedPropertyEvaluationPriorityArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority managedPropertyEvaluationPriority);
    
    /**
     * Inserts the value as the ith "ManagedPropertyEvaluationPriority" element
     */
    void insertManagedPropertyEvaluationPriority(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum managedPropertyEvaluationPriority);
    
    /**
     * Appends the value as the last "ManagedPropertyEvaluationPriority" element
     */
    void addManagedPropertyEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum managedPropertyEvaluationPriority);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ManagedPropertyEvaluationPriority" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority insertNewManagedPropertyEvaluationPriority(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ManagedPropertyEvaluationPriority" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority addNewManagedPropertyEvaluationPriority();
    
    /**
     * Removes the ith "ManagedPropertyEvaluationPriority" element
     */
    void removeManagedPropertyEvaluationPriority(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
