/*
 * XML Type:  SecurityPrivilegeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML SecurityPrivilegeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface SecurityPrivilegeMetadata extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityPrivilegeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("securityprivilegemetadataf9d1type");
    
    /**
     * Gets the "CanBeBasic" element
     */
    boolean getCanBeBasic();
    
    /**
     * Gets (as xml) the "CanBeBasic" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCanBeBasic();
    
    /**
     * True if has "CanBeBasic" element
     */
    boolean isSetCanBeBasic();
    
    /**
     * Sets the "CanBeBasic" element
     */
    void setCanBeBasic(boolean canBeBasic);
    
    /**
     * Sets (as xml) the "CanBeBasic" element
     */
    void xsetCanBeBasic(org.apache.xmlbeans.XmlBoolean canBeBasic);
    
    /**
     * Unsets the "CanBeBasic" element
     */
    void unsetCanBeBasic();
    
    /**
     * Gets the "CanBeDeep" element
     */
    boolean getCanBeDeep();
    
    /**
     * Gets (as xml) the "CanBeDeep" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCanBeDeep();
    
    /**
     * True if has "CanBeDeep" element
     */
    boolean isSetCanBeDeep();
    
    /**
     * Sets the "CanBeDeep" element
     */
    void setCanBeDeep(boolean canBeDeep);
    
    /**
     * Sets (as xml) the "CanBeDeep" element
     */
    void xsetCanBeDeep(org.apache.xmlbeans.XmlBoolean canBeDeep);
    
    /**
     * Unsets the "CanBeDeep" element
     */
    void unsetCanBeDeep();
    
    /**
     * Gets the "CanBeGlobal" element
     */
    boolean getCanBeGlobal();
    
    /**
     * Gets (as xml) the "CanBeGlobal" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCanBeGlobal();
    
    /**
     * True if has "CanBeGlobal" element
     */
    boolean isSetCanBeGlobal();
    
    /**
     * Sets the "CanBeGlobal" element
     */
    void setCanBeGlobal(boolean canBeGlobal);
    
    /**
     * Sets (as xml) the "CanBeGlobal" element
     */
    void xsetCanBeGlobal(org.apache.xmlbeans.XmlBoolean canBeGlobal);
    
    /**
     * Unsets the "CanBeGlobal" element
     */
    void unsetCanBeGlobal();
    
    /**
     * Gets the "CanBeLocal" element
     */
    boolean getCanBeLocal();
    
    /**
     * Gets (as xml) the "CanBeLocal" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCanBeLocal();
    
    /**
     * True if has "CanBeLocal" element
     */
    boolean isSetCanBeLocal();
    
    /**
     * Sets the "CanBeLocal" element
     */
    void setCanBeLocal(boolean canBeLocal);
    
    /**
     * Sets (as xml) the "CanBeLocal" element
     */
    void xsetCanBeLocal(org.apache.xmlbeans.XmlBoolean canBeLocal);
    
    /**
     * Unsets the "CanBeLocal" element
     */
    void unsetCanBeLocal();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Tests for nil "Name" element
     */
    boolean isNilName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Nils the "Name" element
     */
    void setNilName();
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "PrivilegeId" element
     */
    java.lang.String getPrivilegeId();
    
    /**
     * Gets (as xml) the "PrivilegeId" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetPrivilegeId();
    
    /**
     * True if has "PrivilegeId" element
     */
    boolean isSetPrivilegeId();
    
    /**
     * Sets the "PrivilegeId" element
     */
    void setPrivilegeId(java.lang.String privilegeId);
    
    /**
     * Sets (as xml) the "PrivilegeId" element
     */
    void xsetPrivilegeId(com.microsoft.schemas._2003._10.serialization.Guid privilegeId);
    
    /**
     * Unsets the "PrivilegeId" element
     */
    void unsetPrivilegeId();
    
    /**
     * Gets the "PrivilegeType" element
     */
    com.microsoft.schemas.xrm._2011.metadata.PrivilegeType.Enum getPrivilegeType();
    
    /**
     * Gets (as xml) the "PrivilegeType" element
     */
    com.microsoft.schemas.xrm._2011.metadata.PrivilegeType xgetPrivilegeType();
    
    /**
     * True if has "PrivilegeType" element
     */
    boolean isSetPrivilegeType();
    
    /**
     * Sets the "PrivilegeType" element
     */
    void setPrivilegeType(com.microsoft.schemas.xrm._2011.metadata.PrivilegeType.Enum privilegeType);
    
    /**
     * Sets (as xml) the "PrivilegeType" element
     */
    void xsetPrivilegeType(com.microsoft.schemas.xrm._2011.metadata.PrivilegeType privilegeType);
    
    /**
     * Unsets the "PrivilegeType" element
     */
    void unsetPrivilegeType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
