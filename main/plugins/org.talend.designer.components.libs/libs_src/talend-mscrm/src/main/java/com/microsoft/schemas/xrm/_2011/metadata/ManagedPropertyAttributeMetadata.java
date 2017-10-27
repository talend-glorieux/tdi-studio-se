/*
 * XML Type:  ManagedPropertyAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML ManagedPropertyAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface ManagedPropertyAttributeMetadata extends com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ManagedPropertyAttributeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("managedpropertyattributemetadata2da8type");
    
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
     * Gets the "ParentAttributeName" element
     */
    java.lang.String getParentAttributeName();
    
    /**
     * Gets (as xml) the "ParentAttributeName" element
     */
    org.apache.xmlbeans.XmlString xgetParentAttributeName();
    
    /**
     * Tests for nil "ParentAttributeName" element
     */
    boolean isNilParentAttributeName();
    
    /**
     * True if has "ParentAttributeName" element
     */
    boolean isSetParentAttributeName();
    
    /**
     * Sets the "ParentAttributeName" element
     */
    void setParentAttributeName(java.lang.String parentAttributeName);
    
    /**
     * Sets (as xml) the "ParentAttributeName" element
     */
    void xsetParentAttributeName(org.apache.xmlbeans.XmlString parentAttributeName);
    
    /**
     * Nils the "ParentAttributeName" element
     */
    void setNilParentAttributeName();
    
    /**
     * Unsets the "ParentAttributeName" element
     */
    void unsetParentAttributeName();
    
    /**
     * Gets the "ParentComponentType" element
     */
    int getParentComponentType();
    
    /**
     * Gets (as xml) the "ParentComponentType" element
     */
    org.apache.xmlbeans.XmlInt xgetParentComponentType();
    
    /**
     * Tests for nil "ParentComponentType" element
     */
    boolean isNilParentComponentType();
    
    /**
     * True if has "ParentComponentType" element
     */
    boolean isSetParentComponentType();
    
    /**
     * Sets the "ParentComponentType" element
     */
    void setParentComponentType(int parentComponentType);
    
    /**
     * Sets (as xml) the "ParentComponentType" element
     */
    void xsetParentComponentType(org.apache.xmlbeans.XmlInt parentComponentType);
    
    /**
     * Nils the "ParentComponentType" element
     */
    void setNilParentComponentType();
    
    /**
     * Unsets the "ParentComponentType" element
     */
    void unsetParentComponentType();
    
    /**
     * Gets the "ValueAttributeTypeCode" element
     */
    com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum getValueAttributeTypeCode();
    
    /**
     * Gets (as xml) the "ValueAttributeTypeCode" element
     */
    com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode xgetValueAttributeTypeCode();
    
    /**
     * True if has "ValueAttributeTypeCode" element
     */
    boolean isSetValueAttributeTypeCode();
    
    /**
     * Sets the "ValueAttributeTypeCode" element
     */
    void setValueAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum valueAttributeTypeCode);
    
    /**
     * Sets (as xml) the "ValueAttributeTypeCode" element
     */
    void xsetValueAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode valueAttributeTypeCode);
    
    /**
     * Unsets the "ValueAttributeTypeCode" element
     */
    void unsetValueAttributeTypeCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
