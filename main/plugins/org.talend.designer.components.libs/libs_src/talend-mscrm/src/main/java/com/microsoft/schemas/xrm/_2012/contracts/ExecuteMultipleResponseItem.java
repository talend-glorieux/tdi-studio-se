/*
 * XML Type:  ExecuteMultipleResponseItem
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts;


/**
 * An XML ExecuteMultipleResponseItem(@http://schemas.microsoft.com/xrm/2012/Contracts).
 *
 * This is a complex type.
 */
public interface ExecuteMultipleResponseItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExecuteMultipleResponseItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("executemultipleresponseitem10d9type");
    
    /**
     * Gets the "Fault" element
     */
    com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault getFault();
    
    /**
     * Tests for nil "Fault" element
     */
    boolean isNilFault();
    
    /**
     * True if has "Fault" element
     */
    boolean isSetFault();
    
    /**
     * Sets the "Fault" element
     */
    void setFault(com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault fault);
    
    /**
     * Appends and returns a new empty "Fault" element
     */
    com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault addNewFault();
    
    /**
     * Nils the "Fault" element
     */
    void setNilFault();
    
    /**
     * Unsets the "Fault" element
     */
    void unsetFault();
    
    /**
     * Gets the "RequestIndex" element
     */
    int getRequestIndex();
    
    /**
     * Gets (as xml) the "RequestIndex" element
     */
    org.apache.xmlbeans.XmlInt xgetRequestIndex();
    
    /**
     * True if has "RequestIndex" element
     */
    boolean isSetRequestIndex();
    
    /**
     * Sets the "RequestIndex" element
     */
    void setRequestIndex(int requestIndex);
    
    /**
     * Sets (as xml) the "RequestIndex" element
     */
    void xsetRequestIndex(org.apache.xmlbeans.XmlInt requestIndex);
    
    /**
     * Unsets the "RequestIndex" element
     */
    void unsetRequestIndex();
    
    /**
     * Gets the "Response" element
     */
    com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse getResponse();
    
    /**
     * Tests for nil "Response" element
     */
    boolean isNilResponse();
    
    /**
     * True if has "Response" element
     */
    boolean isSetResponse();
    
    /**
     * Sets the "Response" element
     */
    void setResponse(com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse response);
    
    /**
     * Appends and returns a new empty "Response" element
     */
    com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse addNewResponse();
    
    /**
     * Nils the "Response" element
     */
    void setNilResponse();
    
    /**
     * Unsets the "Response" element
     */
    void unsetResponse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem newInstance() {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
