/*
 * XML Type:  IntegerAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML IntegerAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface IntegerAttributeMetadata extends com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntegerAttributeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("integerattributemetadata6352type");
    
    /**
     * Gets the "Format" element
     */
    com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum getFormat();
    
    /**
     * Gets (as xml) the "Format" element
     */
    com.microsoft.schemas.xrm._2011.metadata.IntegerFormat xgetFormat();
    
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
    void setFormat(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum format);
    
    /**
     * Sets (as xml) the "Format" element
     */
    void xsetFormat(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat format);
    
    /**
     * Nils the "Format" element
     */
    void setNilFormat();
    
    /**
     * Unsets the "Format" element
     */
    void unsetFormat();
    
    /**
     * Gets the "MaxValue" element
     */
    int getMaxValue();
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxValue();
    
    /**
     * Tests for nil "MaxValue" element
     */
    boolean isNilMaxValue();
    
    /**
     * True if has "MaxValue" element
     */
    boolean isSetMaxValue();
    
    /**
     * Sets the "MaxValue" element
     */
    void setMaxValue(int maxValue);
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    void xsetMaxValue(org.apache.xmlbeans.XmlInt maxValue);
    
    /**
     * Nils the "MaxValue" element
     */
    void setNilMaxValue();
    
    /**
     * Unsets the "MaxValue" element
     */
    void unsetMaxValue();
    
    /**
     * Gets the "MinValue" element
     */
    int getMinValue();
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    org.apache.xmlbeans.XmlInt xgetMinValue();
    
    /**
     * Tests for nil "MinValue" element
     */
    boolean isNilMinValue();
    
    /**
     * True if has "MinValue" element
     */
    boolean isSetMinValue();
    
    /**
     * Sets the "MinValue" element
     */
    void setMinValue(int minValue);
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    void xsetMinValue(org.apache.xmlbeans.XmlInt minValue);
    
    /**
     * Nils the "MinValue" element
     */
    void setNilMinValue();
    
    /**
     * Unsets the "MinValue" element
     */
    void unsetMinValue();
    
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
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
