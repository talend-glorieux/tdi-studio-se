/*
 * XML Type:  DoubleAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML DoubleAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface DoubleAttributeMetadata extends com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DoubleAttributeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("doubleattributemetadatac457type");
    
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
     * Gets the "MaxValue" element
     */
    double getMaxValue();
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    org.apache.xmlbeans.XmlDouble xgetMaxValue();
    
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
    void setMaxValue(double maxValue);
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    void xsetMaxValue(org.apache.xmlbeans.XmlDouble maxValue);
    
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
    double getMinValue();
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    org.apache.xmlbeans.XmlDouble xgetMinValue();
    
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
    void setMinValue(double minValue);
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    void xsetMinValue(org.apache.xmlbeans.XmlDouble minValue);
    
    /**
     * Nils the "MinValue" element
     */
    void setNilMinValue();
    
    /**
     * Unsets the "MinValue" element
     */
    void unsetMinValue();
    
    /**
     * Gets the "Precision" element
     */
    int getPrecision();
    
    /**
     * Gets (as xml) the "Precision" element
     */
    org.apache.xmlbeans.XmlInt xgetPrecision();
    
    /**
     * Tests for nil "Precision" element
     */
    boolean isNilPrecision();
    
    /**
     * True if has "Precision" element
     */
    boolean isSetPrecision();
    
    /**
     * Sets the "Precision" element
     */
    void setPrecision(int precision);
    
    /**
     * Sets (as xml) the "Precision" element
     */
    void xsetPrecision(org.apache.xmlbeans.XmlInt precision);
    
    /**
     * Nils the "Precision" element
     */
    void setNilPrecision();
    
    /**
     * Unsets the "Precision" element
     */
    void unsetPrecision();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
