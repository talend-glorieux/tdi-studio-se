/*
 * XML Type:  ManagedPropertyMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML ManagedPropertyMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface ManagedPropertyMetadata extends com.microsoft.schemas.xrm._2011.metadata.MetadataBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ManagedPropertyMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("managedpropertymetadata9d6etype");
    
    /**
     * Gets the "Description" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label getDescription();
    
    /**
     * Tests for nil "Description" element
     */
    boolean isNilDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(com.microsoft.schemas.xrm._2011.contracts.Label description);
    
    /**
     * Appends and returns a new empty "Description" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label addNewDescription();
    
    /**
     * Nils the "Description" element
     */
    void setNilDescription();
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "DisplayName" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label getDisplayName();
    
    /**
     * Tests for nil "DisplayName" element
     */
    boolean isNilDisplayName();
    
    /**
     * True if has "DisplayName" element
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "DisplayName" element
     */
    void setDisplayName(com.microsoft.schemas.xrm._2011.contracts.Label displayName);
    
    /**
     * Appends and returns a new empty "DisplayName" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Label addNewDisplayName();
    
    /**
     * Nils the "DisplayName" element
     */
    void setNilDisplayName();
    
    /**
     * Unsets the "DisplayName" element
     */
    void unsetDisplayName();
    
    /**
     * Gets the "EnablesAttributeName" element
     */
    java.lang.String getEnablesAttributeName();
    
    /**
     * Gets (as xml) the "EnablesAttributeName" element
     */
    org.apache.xmlbeans.XmlString xgetEnablesAttributeName();
    
    /**
     * Tests for nil "EnablesAttributeName" element
     */
    boolean isNilEnablesAttributeName();
    
    /**
     * True if has "EnablesAttributeName" element
     */
    boolean isSetEnablesAttributeName();
    
    /**
     * Sets the "EnablesAttributeName" element
     */
    void setEnablesAttributeName(java.lang.String enablesAttributeName);
    
    /**
     * Sets (as xml) the "EnablesAttributeName" element
     */
    void xsetEnablesAttributeName(org.apache.xmlbeans.XmlString enablesAttributeName);
    
    /**
     * Nils the "EnablesAttributeName" element
     */
    void setNilEnablesAttributeName();
    
    /**
     * Unsets the "EnablesAttributeName" element
     */
    void unsetEnablesAttributeName();
    
    /**
     * Gets the "EnablesEntityName" element
     */
    java.lang.String getEnablesEntityName();
    
    /**
     * Gets (as xml) the "EnablesEntityName" element
     */
    org.apache.xmlbeans.XmlString xgetEnablesEntityName();
    
    /**
     * Tests for nil "EnablesEntityName" element
     */
    boolean isNilEnablesEntityName();
    
    /**
     * True if has "EnablesEntityName" element
     */
    boolean isSetEnablesEntityName();
    
    /**
     * Sets the "EnablesEntityName" element
     */
    void setEnablesEntityName(java.lang.String enablesEntityName);
    
    /**
     * Sets (as xml) the "EnablesEntityName" element
     */
    void xsetEnablesEntityName(org.apache.xmlbeans.XmlString enablesEntityName);
    
    /**
     * Nils the "EnablesEntityName" element
     */
    void setNilEnablesEntityName();
    
    /**
     * Unsets the "EnablesEntityName" element
     */
    void unsetEnablesEntityName();
    
    /**
     * Gets the "ErrorCode" element
     */
    int getErrorCode();
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    org.apache.xmlbeans.XmlInt xgetErrorCode();
    
    /**
     * Tests for nil "ErrorCode" element
     */
    boolean isNilErrorCode();
    
    /**
     * True if has "ErrorCode" element
     */
    boolean isSetErrorCode();
    
    /**
     * Sets the "ErrorCode" element
     */
    void setErrorCode(int errorCode);
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode);
    
    /**
     * Nils the "ErrorCode" element
     */
    void setNilErrorCode();
    
    /**
     * Unsets the "ErrorCode" element
     */
    void unsetErrorCode();
    
    /**
     * Gets the "EvaluationPriority" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum getEvaluationPriority();
    
    /**
     * Gets (as xml) the "EvaluationPriority" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority xgetEvaluationPriority();
    
    /**
     * Tests for nil "EvaluationPriority" element
     */
    boolean isNilEvaluationPriority();
    
    /**
     * True if has "EvaluationPriority" element
     */
    boolean isSetEvaluationPriority();
    
    /**
     * Sets the "EvaluationPriority" element
     */
    void setEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum evaluationPriority);
    
    /**
     * Sets (as xml) the "EvaluationPriority" element
     */
    void xsetEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority evaluationPriority);
    
    /**
     * Nils the "EvaluationPriority" element
     */
    void setNilEvaluationPriority();
    
    /**
     * Unsets the "EvaluationPriority" element
     */
    void unsetEvaluationPriority();
    
    /**
     * Gets the "IsGlobalForOperation" element
     */
    boolean getIsGlobalForOperation();
    
    /**
     * Gets (as xml) the "IsGlobalForOperation" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsGlobalForOperation();
    
    /**
     * Tests for nil "IsGlobalForOperation" element
     */
    boolean isNilIsGlobalForOperation();
    
    /**
     * True if has "IsGlobalForOperation" element
     */
    boolean isSetIsGlobalForOperation();
    
    /**
     * Sets the "IsGlobalForOperation" element
     */
    void setIsGlobalForOperation(boolean isGlobalForOperation);
    
    /**
     * Sets (as xml) the "IsGlobalForOperation" element
     */
    void xsetIsGlobalForOperation(org.apache.xmlbeans.XmlBoolean isGlobalForOperation);
    
    /**
     * Nils the "IsGlobalForOperation" element
     */
    void setNilIsGlobalForOperation();
    
    /**
     * Unsets the "IsGlobalForOperation" element
     */
    void unsetIsGlobalForOperation();
    
    /**
     * Gets the "IsPrivate" element
     */
    boolean getIsPrivate();
    
    /**
     * Gets (as xml) the "IsPrivate" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPrivate();
    
    /**
     * Tests for nil "IsPrivate" element
     */
    boolean isNilIsPrivate();
    
    /**
     * True if has "IsPrivate" element
     */
    boolean isSetIsPrivate();
    
    /**
     * Sets the "IsPrivate" element
     */
    void setIsPrivate(boolean isPrivate);
    
    /**
     * Sets (as xml) the "IsPrivate" element
     */
    void xsetIsPrivate(org.apache.xmlbeans.XmlBoolean isPrivate);
    
    /**
     * Nils the "IsPrivate" element
     */
    void setNilIsPrivate();
    
    /**
     * Unsets the "IsPrivate" element
     */
    void unsetIsPrivate();
    
    /**
     * Gets the "LogicalName" element
     */
    java.lang.String getLogicalName();
    
    /**
     * Gets (as xml) the "LogicalName" element
     */
    org.apache.xmlbeans.XmlString xgetLogicalName();
    
    /**
     * Tests for nil "LogicalName" element
     */
    boolean isNilLogicalName();
    
    /**
     * True if has "LogicalName" element
     */
    boolean isSetLogicalName();
    
    /**
     * Sets the "LogicalName" element
     */
    void setLogicalName(java.lang.String logicalName);
    
    /**
     * Sets (as xml) the "LogicalName" element
     */
    void xsetLogicalName(org.apache.xmlbeans.XmlString logicalName);
    
    /**
     * Nils the "LogicalName" element
     */
    void setNilLogicalName();
    
    /**
     * Unsets the "LogicalName" element
     */
    void unsetLogicalName();
    
    /**
     * Gets the "ManagedPropertyType" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum getManagedPropertyType();
    
    /**
     * Gets (as xml) the "ManagedPropertyType" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType xgetManagedPropertyType();
    
    /**
     * Tests for nil "ManagedPropertyType" element
     */
    boolean isNilManagedPropertyType();
    
    /**
     * True if has "ManagedPropertyType" element
     */
    boolean isSetManagedPropertyType();
    
    /**
     * Sets the "ManagedPropertyType" element
     */
    void setManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum managedPropertyType);
    
    /**
     * Sets (as xml) the "ManagedPropertyType" element
     */
    void xsetManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType managedPropertyType);
    
    /**
     * Nils the "ManagedPropertyType" element
     */
    void setNilManagedPropertyType();
    
    /**
     * Unsets the "ManagedPropertyType" element
     */
    void unsetManagedPropertyType();
    
    /**
     * Gets the "Operation" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum getOperation();
    
    /**
     * Gets (as xml) the "Operation" element
     */
    com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation xgetOperation();
    
    /**
     * Tests for nil "Operation" element
     */
    boolean isNilOperation();
    
    /**
     * True if has "Operation" element
     */
    boolean isSetOperation();
    
    /**
     * Sets the "Operation" element
     */
    void setOperation(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum operation);
    
    /**
     * Sets (as xml) the "Operation" element
     */
    void xsetOperation(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation operation);
    
    /**
     * Nils the "Operation" element
     */
    void setNilOperation();
    
    /**
     * Unsets the "Operation" element
     */
    void unsetOperation();
    
    /**
     * Gets the "IntroducedVersion" element
     */
    java.lang.String getIntroducedVersion();
    
    /**
     * Gets (as xml) the "IntroducedVersion" element
     */
    org.apache.xmlbeans.XmlString xgetIntroducedVersion();
    
    /**
     * Tests for nil "IntroducedVersion" element
     */
    boolean isNilIntroducedVersion();
    
    /**
     * True if has "IntroducedVersion" element
     */
    boolean isSetIntroducedVersion();
    
    /**
     * Sets the "IntroducedVersion" element
     */
    void setIntroducedVersion(java.lang.String introducedVersion);
    
    /**
     * Sets (as xml) the "IntroducedVersion" element
     */
    void xsetIntroducedVersion(org.apache.xmlbeans.XmlString introducedVersion);
    
    /**
     * Nils the "IntroducedVersion" element
     */
    void setNilIntroducedVersion();
    
    /**
     * Unsets the "IntroducedVersion" element
     */
    void unsetIntroducedVersion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
