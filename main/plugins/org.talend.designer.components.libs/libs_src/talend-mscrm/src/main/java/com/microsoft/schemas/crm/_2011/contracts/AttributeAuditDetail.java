/*
 * XML Type:  AttributeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML AttributeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface AttributeAuditDetail extends com.microsoft.schemas.crm._2011.contracts.AuditDetail
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributeAuditDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("attributeauditdetail5f56type");
    
    /**
     * Gets the "InvalidNewValueAttributes" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getInvalidNewValueAttributes();
    
    /**
     * Tests for nil "InvalidNewValueAttributes" element
     */
    boolean isNilInvalidNewValueAttributes();
    
    /**
     * True if has "InvalidNewValueAttributes" element
     */
    boolean isSetInvalidNewValueAttributes();
    
    /**
     * Sets the "InvalidNewValueAttributes" element
     */
    void setInvalidNewValueAttributes(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring invalidNewValueAttributes);
    
    /**
     * Appends and returns a new empty "InvalidNewValueAttributes" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewInvalidNewValueAttributes();
    
    /**
     * Nils the "InvalidNewValueAttributes" element
     */
    void setNilInvalidNewValueAttributes();
    
    /**
     * Unsets the "InvalidNewValueAttributes" element
     */
    void unsetInvalidNewValueAttributes();
    
    /**
     * Gets the "NewValue" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Entity getNewValue();
    
    /**
     * Tests for nil "NewValue" element
     */
    boolean isNilNewValue();
    
    /**
     * True if has "NewValue" element
     */
    boolean isSetNewValue();
    
    /**
     * Sets the "NewValue" element
     */
    void setNewValue(com.microsoft.schemas.xrm._2011.contracts.Entity newValue);
    
    /**
     * Appends and returns a new empty "NewValue" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Entity addNewNewValue();
    
    /**
     * Nils the "NewValue" element
     */
    void setNilNewValue();
    
    /**
     * Unsets the "NewValue" element
     */
    void unsetNewValue();
    
    /**
     * Gets the "OldValue" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Entity getOldValue();
    
    /**
     * Tests for nil "OldValue" element
     */
    boolean isNilOldValue();
    
    /**
     * True if has "OldValue" element
     */
    boolean isSetOldValue();
    
    /**
     * Sets the "OldValue" element
     */
    void setOldValue(com.microsoft.schemas.xrm._2011.contracts.Entity oldValue);
    
    /**
     * Appends and returns a new empty "OldValue" element
     */
    com.microsoft.schemas.xrm._2011.contracts.Entity addNewOldValue();
    
    /**
     * Nils the "OldValue" element
     */
    void setNilOldValue();
    
    /**
     * Unsets the "OldValue" element
     */
    void unsetOldValue();
    
    /**
     * Gets the "DeletedAttributes" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring getDeletedAttributes();
    
    /**
     * Tests for nil "DeletedAttributes" element
     */
    boolean isNilDeletedAttributes();
    
    /**
     * True if has "DeletedAttributes" element
     */
    boolean isSetDeletedAttributes();
    
    /**
     * Sets the "DeletedAttributes" element
     */
    void setDeletedAttributes(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring deletedAttributes);
    
    /**
     * Appends and returns a new empty "DeletedAttributes" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring addNewDeletedAttributes();
    
    /**
     * Nils the "DeletedAttributes" element
     */
    void setNilDeletedAttributes();
    
    /**
     * Unsets the "DeletedAttributes" element
     */
    void unsetDeletedAttributes();
    
    /**
     * Gets the "LocLabelLanguageCode" element
     */
    int getLocLabelLanguageCode();
    
    /**
     * Gets (as xml) the "LocLabelLanguageCode" element
     */
    org.apache.xmlbeans.XmlInt xgetLocLabelLanguageCode();
    
    /**
     * True if has "LocLabelLanguageCode" element
     */
    boolean isSetLocLabelLanguageCode();
    
    /**
     * Sets the "LocLabelLanguageCode" element
     */
    void setLocLabelLanguageCode(int locLabelLanguageCode);
    
    /**
     * Sets (as xml) the "LocLabelLanguageCode" element
     */
    void xsetLocLabelLanguageCode(org.apache.xmlbeans.XmlInt locLabelLanguageCode);
    
    /**
     * Unsets the "LocLabelLanguageCode" element
     */
    void unsetLocLabelLanguageCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
