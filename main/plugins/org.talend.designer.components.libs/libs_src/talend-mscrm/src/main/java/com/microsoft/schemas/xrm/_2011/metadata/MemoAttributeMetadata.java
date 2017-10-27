/*
 * XML Type:  MemoAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML MemoAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface MemoAttributeMetadata extends com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MemoAttributeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("memoattributemetadataf400type");
    
    /**
     * Gets the "Format" element
     */
    com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum getFormat();
    
    /**
     * Gets (as xml) the "Format" element
     */
    com.microsoft.schemas.xrm._2011.metadata.StringFormat xgetFormat();
    
    /**
     * Tests for nil "Format" element
     */
    boolean isNilFormat();
    
    /**
     * True if has "Format" element
     */
    boolean isSetFormat();
    
    /**
     * Sets the "Format" element
     */
    void setFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum format);
    
    /**
     * Sets (as xml) the "Format" element
     */
    void xsetFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat format);
    
    /**
     * Nils the "Format" element
     */
    void setNilFormat();
    
    /**
     * Unsets the "Format" element
     */
    void unsetFormat();
    
    /**
     * Gets the "ImeMode" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum getImeMode();
    
    /**
     * Gets (as xml) the "ImeMode" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ImeMode xgetImeMode();
    
    /**
     * Tests for nil "ImeMode" element
     */
    boolean isNilImeMode();
    
    /**
     * True if has "ImeMode" element
     */
    boolean isSetImeMode();
    
    /**
     * Sets the "ImeMode" element
     */
    void setImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum imeMode);
    
    /**
     * Sets (as xml) the "ImeMode" element
     */
    void xsetImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode imeMode);
    
    /**
     * Nils the "ImeMode" element
     */
    void setNilImeMode();
    
    /**
     * Unsets the "ImeMode" element
     */
    void unsetImeMode();
    
    /**
     * Gets the "MaxLength" element
     */
    int getMaxLength();
    
    /**
     * Gets (as xml) the "MaxLength" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxLength();
    
    /**
     * Tests for nil "MaxLength" element
     */
    boolean isNilMaxLength();
    
    /**
     * True if has "MaxLength" element
     */
    boolean isSetMaxLength();
    
    /**
     * Sets the "MaxLength" element
     */
    void setMaxLength(int maxLength);
    
    /**
     * Sets (as xml) the "MaxLength" element
     */
    void xsetMaxLength(org.apache.xmlbeans.XmlInt maxLength);
    
    /**
     * Nils the "MaxLength" element
     */
    void setNilMaxLength();
    
    /**
     * Unsets the "MaxLength" element
     */
    void unsetMaxLength();
    
    /**
     * Gets the "IsLocalizable" element
     */
    boolean getIsLocalizable();
    
    /**
     * Gets (as xml) the "IsLocalizable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsLocalizable();
    
    /**
     * Tests for nil "IsLocalizable" element
     */
    boolean isNilIsLocalizable();
    
    /**
     * True if has "IsLocalizable" element
     */
    boolean isSetIsLocalizable();
    
    /**
     * Sets the "IsLocalizable" element
     */
    void setIsLocalizable(boolean isLocalizable);
    
    /**
     * Sets (as xml) the "IsLocalizable" element
     */
    void xsetIsLocalizable(org.apache.xmlbeans.XmlBoolean isLocalizable);
    
    /**
     * Nils the "IsLocalizable" element
     */
    void setNilIsLocalizable();
    
    /**
     * Unsets the "IsLocalizable" element
     */
    void unsetIsLocalizable();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
