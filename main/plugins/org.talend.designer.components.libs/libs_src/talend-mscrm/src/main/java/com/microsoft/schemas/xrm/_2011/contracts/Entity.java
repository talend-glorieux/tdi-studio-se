/*
 * XML Type:  Entity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.Entity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML Entity(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface Entity extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("entityfdb4type");
    
    /**
     * Gets the "Attributes" element
     */
    com.microsoft.schemas.xrm._2011.contracts.AttributeCollection getAttributes();
    
    /**
     * Tests for nil "Attributes" element
     */
    boolean isNilAttributes();
    
    /**
     * True if has "Attributes" element
     */
    boolean isSetAttributes();
    
    /**
     * Sets the "Attributes" element
     */
    void setAttributes(com.microsoft.schemas.xrm._2011.contracts.AttributeCollection attributes);
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    com.microsoft.schemas.xrm._2011.contracts.AttributeCollection addNewAttributes();
    
    /**
     * Nils the "Attributes" element
     */
    void setNilAttributes();
    
    /**
     * Unsets the "Attributes" element
     */
    void unsetAttributes();
    
    /**
     * Gets the "EntityState" element
     */
    com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum getEntityState();
    
    /**
     * Gets (as xml) the "EntityState" element
     */
    com.microsoft.schemas.xrm._2011.contracts.EntityState xgetEntityState();
    
    /**
     * Tests for nil "EntityState" element
     */
    boolean isNilEntityState();
    
    /**
     * True if has "EntityState" element
     */
    boolean isSetEntityState();
    
    /**
     * Sets the "EntityState" element
     */
    void setEntityState(com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum entityState);
    
    /**
     * Sets (as xml) the "EntityState" element
     */
    void xsetEntityState(com.microsoft.schemas.xrm._2011.contracts.EntityState entityState);
    
    /**
     * Nils the "EntityState" element
     */
    void setNilEntityState();
    
    /**
     * Unsets the "EntityState" element
     */
    void unsetEntityState();
    
    /**
     * Gets the "FormattedValues" element
     */
    com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection getFormattedValues();
    
    /**
     * Tests for nil "FormattedValues" element
     */
    boolean isNilFormattedValues();
    
    /**
     * True if has "FormattedValues" element
     */
    boolean isSetFormattedValues();
    
    /**
     * Sets the "FormattedValues" element
     */
    void setFormattedValues(com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection formattedValues);
    
    /**
     * Appends and returns a new empty "FormattedValues" element
     */
    com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection addNewFormattedValues();
    
    /**
     * Nils the "FormattedValues" element
     */
    void setNilFormattedValues();
    
    /**
     * Unsets the "FormattedValues" element
     */
    void unsetFormattedValues();
    
    /**
     * Gets the "Id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "Id" element
     */
    com.microsoft.schemas._2003._10.serialization.Guid xgetId();
    
    /**
     * True if has "Id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "Id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "Id" element
     */
    void xsetId(com.microsoft.schemas._2003._10.serialization.Guid id);
    
    /**
     * Unsets the "Id" element
     */
    void unsetId();
    
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
     * Gets the "RelatedEntities" element
     */
    com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection getRelatedEntities();
    
    /**
     * Tests for nil "RelatedEntities" element
     */
    boolean isNilRelatedEntities();
    
    /**
     * True if has "RelatedEntities" element
     */
    boolean isSetRelatedEntities();
    
    /**
     * Sets the "RelatedEntities" element
     */
    void setRelatedEntities(com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection relatedEntities);
    
    /**
     * Appends and returns a new empty "RelatedEntities" element
     */
    com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection addNewRelatedEntities();
    
    /**
     * Nils the "RelatedEntities" element
     */
    void setNilRelatedEntities();
    
    /**
     * Unsets the "RelatedEntities" element
     */
    void unsetRelatedEntities();
    
    /**
     * Gets the "RowVersion" element
     */
    java.lang.String getRowVersion();
    
    /**
     * Gets (as xml) the "RowVersion" element
     */
    org.apache.xmlbeans.XmlString xgetRowVersion();
    
    /**
     * Tests for nil "RowVersion" element
     */
    boolean isNilRowVersion();
    
    /**
     * True if has "RowVersion" element
     */
    boolean isSetRowVersion();
    
    /**
     * Sets the "RowVersion" element
     */
    void setRowVersion(java.lang.String rowVersion);
    
    /**
     * Sets (as xml) the "RowVersion" element
     */
    void xsetRowVersion(org.apache.xmlbeans.XmlString rowVersion);
    
    /**
     * Nils the "RowVersion" element
     */
    void setNilRowVersion();
    
    /**
     * Unsets the "RowVersion" element
     */
    void unsetRowVersion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.Entity newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.Entity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
