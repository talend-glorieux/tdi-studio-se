/*
 * XML Type:  StringAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML StringAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface StringAttributeMetadata extends com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StringAttributeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("stringattributemetadataa897type");
    
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
     * Gets the "YomiOf" element
     */
    java.lang.String getYomiOf();
    
    /**
     * Gets (as xml) the "YomiOf" element
     */
    org.apache.xmlbeans.XmlString xgetYomiOf();
    
    /**
     * Tests for nil "YomiOf" element
     */
    boolean isNilYomiOf();
    
    /**
     * True if has "YomiOf" element
     */
    boolean isSetYomiOf();
    
    /**
     * Sets the "YomiOf" element
     */
    void setYomiOf(java.lang.String yomiOf);
    
    /**
     * Sets (as xml) the "YomiOf" element
     */
    void xsetYomiOf(org.apache.xmlbeans.XmlString yomiOf);
    
    /**
     * Nils the "YomiOf" element
     */
    void setNilYomiOf();
    
    /**
     * Unsets the "YomiOf" element
     */
    void unsetYomiOf();
    
    /**
     * Gets the "FormatName" element
     */
    com.microsoft.schemas.xrm._2013.metadata.StringFormatName getFormatName();
    
    /**
     * Tests for nil "FormatName" element
     */
    boolean isNilFormatName();
    
    /**
     * True if has "FormatName" element
     */
    boolean isSetFormatName();
    
    /**
     * Sets the "FormatName" element
     */
    void setFormatName(com.microsoft.schemas.xrm._2013.metadata.StringFormatName formatName);
    
    /**
     * Appends and returns a new empty "FormatName" element
     */
    com.microsoft.schemas.xrm._2013.metadata.StringFormatName addNewFormatName();
    
    /**
     * Nils the "FormatName" element
     */
    void setNilFormatName();
    
    /**
     * Unsets the "FormatName" element
     */
    void unsetFormatName();
    
    /**
     * Gets the "FormulaDefinition" element
     */
    java.lang.String getFormulaDefinition();
    
    /**
     * Gets (as xml) the "FormulaDefinition" element
     */
    org.apache.xmlbeans.XmlString xgetFormulaDefinition();
    
    /**
     * Tests for nil "FormulaDefinition" element
     */
    boolean isNilFormulaDefinition();
    
    /**
     * True if has "FormulaDefinition" element
     */
    boolean isSetFormulaDefinition();
    
    /**
     * Sets the "FormulaDefinition" element
     */
    void setFormulaDefinition(java.lang.String formulaDefinition);
    
    /**
     * Sets (as xml) the "FormulaDefinition" element
     */
    void xsetFormulaDefinition(org.apache.xmlbeans.XmlString formulaDefinition);
    
    /**
     * Nils the "FormulaDefinition" element
     */
    void setNilFormulaDefinition();
    
    /**
     * Unsets the "FormulaDefinition" element
     */
    void unsetFormulaDefinition();
    
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
     * Gets the "SourceTypeMask" element
     */
    int getSourceTypeMask();
    
    /**
     * Gets (as xml) the "SourceTypeMask" element
     */
    org.apache.xmlbeans.XmlInt xgetSourceTypeMask();
    
    /**
     * Tests for nil "SourceTypeMask" element
     */
    boolean isNilSourceTypeMask();
    
    /**
     * True if has "SourceTypeMask" element
     */
    boolean isSetSourceTypeMask();
    
    /**
     * Sets the "SourceTypeMask" element
     */
    void setSourceTypeMask(int sourceTypeMask);
    
    /**
     * Sets (as xml) the "SourceTypeMask" element
     */
    void xsetSourceTypeMask(org.apache.xmlbeans.XmlInt sourceTypeMask);
    
    /**
     * Nils the "SourceTypeMask" element
     */
    void setNilSourceTypeMask();
    
    /**
     * Unsets the "SourceTypeMask" element
     */
    void unsetSourceTypeMask();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
