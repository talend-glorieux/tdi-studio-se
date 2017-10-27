/*
 * XML Type:  ExecuteMultipleSettings
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts;


/**
 * An XML ExecuteMultipleSettings(@http://schemas.microsoft.com/xrm/2012/Contracts).
 *
 * This is a complex type.
 */
public interface ExecuteMultipleSettings extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExecuteMultipleSettings.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("executemultiplesettings0608type");
    
    /**
     * Gets the "ContinueOnError" element
     */
    boolean getContinueOnError();
    
    /**
     * Gets (as xml) the "ContinueOnError" element
     */
    org.apache.xmlbeans.XmlBoolean xgetContinueOnError();
    
    /**
     * True if has "ContinueOnError" element
     */
    boolean isSetContinueOnError();
    
    /**
     * Sets the "ContinueOnError" element
     */
    void setContinueOnError(boolean continueOnError);
    
    /**
     * Sets (as xml) the "ContinueOnError" element
     */
    void xsetContinueOnError(org.apache.xmlbeans.XmlBoolean continueOnError);
    
    /**
     * Unsets the "ContinueOnError" element
     */
    void unsetContinueOnError();
    
    /**
     * Gets the "ReturnResponses" element
     */
    boolean getReturnResponses();
    
    /**
     * Gets (as xml) the "ReturnResponses" element
     */
    org.apache.xmlbeans.XmlBoolean xgetReturnResponses();
    
    /**
     * True if has "ReturnResponses" element
     */
    boolean isSetReturnResponses();
    
    /**
     * Sets the "ReturnResponses" element
     */
    void setReturnResponses(boolean returnResponses);
    
    /**
     * Sets (as xml) the "ReturnResponses" element
     */
    void xsetReturnResponses(org.apache.xmlbeans.XmlBoolean returnResponses);
    
    /**
     * Unsets the "ReturnResponses" element
     */
    void unsetReturnResponses();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings newInstance() {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
