/*
 * XML Type:  ManagedPropertyboolean
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML ManagedPropertyboolean(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface ManagedPropertyboolean extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ManagedPropertyboolean.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("managedpropertybooleanbce5type");
    
    /**
     * Gets the "CanBeChanged" element
     */
    boolean getCanBeChanged();
    
    /**
     * Gets (as xml) the "CanBeChanged" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCanBeChanged();
    
    /**
     * True if has "CanBeChanged" element
     */
    boolean isSetCanBeChanged();
    
    /**
     * Sets the "CanBeChanged" element
     */
    void setCanBeChanged(boolean canBeChanged);
    
    /**
     * Sets (as xml) the "CanBeChanged" element
     */
    void xsetCanBeChanged(org.apache.xmlbeans.XmlBoolean canBeChanged);
    
    /**
     * Unsets the "CanBeChanged" element
     */
    void unsetCanBeChanged();
    
    /**
     * Gets the "ManagedPropertyLogicalName" element
     */
    java.lang.String getManagedPropertyLogicalName();
    
    /**
     * Gets (as xml) the "ManagedPropertyLogicalName" element
     */
    org.apache.xmlbeans.XmlString xgetManagedPropertyLogicalName();
    
    /**
     * Tests for nil "ManagedPropertyLogicalName" element
     */
    boolean isNilManagedPropertyLogicalName();
    
    /**
     * True if has "ManagedPropertyLogicalName" element
     */
    boolean isSetManagedPropertyLogicalName();
    
    /**
     * Sets the "ManagedPropertyLogicalName" element
     */
    void setManagedPropertyLogicalName(java.lang.String managedPropertyLogicalName);
    
    /**
     * Sets (as xml) the "ManagedPropertyLogicalName" element
     */
    void xsetManagedPropertyLogicalName(org.apache.xmlbeans.XmlString managedPropertyLogicalName);
    
    /**
     * Nils the "ManagedPropertyLogicalName" element
     */
    void setNilManagedPropertyLogicalName();
    
    /**
     * Unsets the "ManagedPropertyLogicalName" element
     */
    void unsetManagedPropertyLogicalName();
    
    /**
     * Gets the "Value" element
     */
    boolean getValue();
    
    /**
     * Gets (as xml) the "Value" element
     */
    org.apache.xmlbeans.XmlBoolean xgetValue();
    
    /**
     * True if has "Value" element
     */
    boolean isSetValue();
    
    /**
     * Sets the "Value" element
     */
    void setValue(boolean value);
    
    /**
     * Sets (as xml) the "Value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlBoolean value);
    
    /**
     * Unsets the "Value" element
     */
    void unsetValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
