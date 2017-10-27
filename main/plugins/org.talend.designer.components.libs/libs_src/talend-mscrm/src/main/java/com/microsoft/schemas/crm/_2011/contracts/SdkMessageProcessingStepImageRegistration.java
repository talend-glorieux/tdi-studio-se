/*
 * XML Type:  SdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML SdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface SdkMessageProcessingStepImageRegistration extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SdkMessageProcessingStepImageRegistration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("sdkmessageprocessingstepimageregistration35dctype");
    
    /**
     * Gets the "Attributes" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getAttributes();
    
    /**
     * Tests for nil "Attributes" element
     */
    boolean isNilAttributes();
    
    /**
     * True if has "Attributes" element
     */
    boolean isSetAttributes();
    
    /**
     * Sets the "Attributes" element
     */
    void setAttributes(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring attributes);
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewAttributes();
    
    /**
     * Nils the "Attributes" element
     */
    void setNilAttributes();
    
    /**
     * Unsets the "Attributes" element
     */
    void unsetAttributes();
    
    /**
     * Gets the "EntityAlias" element
     */
    java.lang.String getEntityAlias();
    
    /**
     * Gets (as xml) the "EntityAlias" element
     */
    org.apache.xmlbeans.XmlString xgetEntityAlias();
    
    /**
     * Tests for nil "EntityAlias" element
     */
    boolean isNilEntityAlias();
    
    /**
     * True if has "EntityAlias" element
     */
    boolean isSetEntityAlias();
    
    /**
     * Sets the "EntityAlias" element
     */
    void setEntityAlias(java.lang.String entityAlias);
    
    /**
     * Sets (as xml) the "EntityAlias" element
     */
    void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias);
    
    /**
     * Nils the "EntityAlias" element
     */
    void setNilEntityAlias();
    
    /**
     * Unsets the "EntityAlias" element
     */
    void unsetEntityAlias();
    
    /**
     * Gets the "ImageType" element
     */
    int getImageType();
    
    /**
     * Gets (as xml) the "ImageType" element
     */
    org.apache.xmlbeans.XmlInt xgetImageType();
    
    /**
     * True if has "ImageType" element
     */
    boolean isSetImageType();
    
    /**
     * Sets the "ImageType" element
     */
    void setImageType(int imageType);
    
    /**
     * Sets (as xml) the "ImageType" element
     */
    void xsetImageType(org.apache.xmlbeans.XmlInt imageType);
    
    /**
     * Unsets the "ImageType" element
     */
    void unsetImageType();
    
    /**
     * Gets the "MessagePropertyName" element
     */
    java.lang.String getMessagePropertyName();
    
    /**
     * Gets (as xml) the "MessagePropertyName" element
     */
    org.apache.xmlbeans.XmlString xgetMessagePropertyName();
    
    /**
     * Tests for nil "MessagePropertyName" element
     */
    boolean isNilMessagePropertyName();
    
    /**
     * True if has "MessagePropertyName" element
     */
    boolean isSetMessagePropertyName();
    
    /**
     * Sets the "MessagePropertyName" element
     */
    void setMessagePropertyName(java.lang.String messagePropertyName);
    
    /**
     * Sets (as xml) the "MessagePropertyName" element
     */
    void xsetMessagePropertyName(org.apache.xmlbeans.XmlString messagePropertyName);
    
    /**
     * Nils the "MessagePropertyName" element
     */
    void setNilMessagePropertyName();
    
    /**
     * Unsets the "MessagePropertyName" element
     */
    void unsetMessagePropertyName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
