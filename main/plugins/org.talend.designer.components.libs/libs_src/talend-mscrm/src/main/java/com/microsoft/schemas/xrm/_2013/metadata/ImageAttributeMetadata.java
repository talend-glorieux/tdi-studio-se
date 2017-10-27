/*
 * XML Type:  ImageAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata;


/**
 * An XML ImageAttributeMetadata(@http://schemas.microsoft.com/xrm/2013/Metadata).
 *
 * This is a complex type.
 */
public interface ImageAttributeMetadata extends com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImageAttributeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("imageattributemetadata6f6dtype");
    
    /**
     * Gets the "IsPrimaryImage" element
     */
    boolean getIsPrimaryImage();
    
    /**
     * Gets (as xml) the "IsPrimaryImage" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPrimaryImage();
    
    /**
     * Tests for nil "IsPrimaryImage" element
     */
    boolean isNilIsPrimaryImage();
    
    /**
     * True if has "IsPrimaryImage" element
     */
    boolean isSetIsPrimaryImage();
    
    /**
     * Sets the "IsPrimaryImage" element
     */
    void setIsPrimaryImage(boolean isPrimaryImage);
    
    /**
     * Sets (as xml) the "IsPrimaryImage" element
     */
    void xsetIsPrimaryImage(org.apache.xmlbeans.XmlBoolean isPrimaryImage);
    
    /**
     * Nils the "IsPrimaryImage" element
     */
    void setNilIsPrimaryImage();
    
    /**
     * Unsets the "IsPrimaryImage" element
     */
    void unsetIsPrimaryImage();
    
    /**
     * Gets the "MaxHeight" element
     */
    short getMaxHeight();
    
    /**
     * Gets (as xml) the "MaxHeight" element
     */
    org.apache.xmlbeans.XmlShort xgetMaxHeight();
    
    /**
     * Tests for nil "MaxHeight" element
     */
    boolean isNilMaxHeight();
    
    /**
     * True if has "MaxHeight" element
     */
    boolean isSetMaxHeight();
    
    /**
     * Sets the "MaxHeight" element
     */
    void setMaxHeight(short maxHeight);
    
    /**
     * Sets (as xml) the "MaxHeight" element
     */
    void xsetMaxHeight(org.apache.xmlbeans.XmlShort maxHeight);
    
    /**
     * Nils the "MaxHeight" element
     */
    void setNilMaxHeight();
    
    /**
     * Unsets the "MaxHeight" element
     */
    void unsetMaxHeight();
    
    /**
     * Gets the "MaxWidth" element
     */
    short getMaxWidth();
    
    /**
     * Gets (as xml) the "MaxWidth" element
     */
    org.apache.xmlbeans.XmlShort xgetMaxWidth();
    
    /**
     * Tests for nil "MaxWidth" element
     */
    boolean isNilMaxWidth();
    
    /**
     * True if has "MaxWidth" element
     */
    boolean isSetMaxWidth();
    
    /**
     * Sets the "MaxWidth" element
     */
    void setMaxWidth(short maxWidth);
    
    /**
     * Sets (as xml) the "MaxWidth" element
     */
    void xsetMaxWidth(org.apache.xmlbeans.XmlShort maxWidth);
    
    /**
     * Nils the "MaxWidth" element
     */
    void setNilMaxWidth();
    
    /**
     * Unsets the "MaxWidth" element
     */
    void unsetMaxWidth();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
