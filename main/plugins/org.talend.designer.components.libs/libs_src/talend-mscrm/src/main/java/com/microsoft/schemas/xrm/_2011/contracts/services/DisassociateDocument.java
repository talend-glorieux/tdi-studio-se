/*
 * An XML document type.
 * Localname: Disassociate
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services;


/**
 * A document containing one Disassociate(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public interface DisassociateDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisassociateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("disassociatea35cdoctype");
    
    /**
     * Gets the "Disassociate" element
     */
    com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate getDisassociate();
    
    /**
     * Sets the "Disassociate" element
     */
    void setDisassociate(com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate disassociate);
    
    /**
     * Appends and returns a new empty "Disassociate" element
     */
    com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate addNewDisassociate();
    
    /**
     * An XML Disassociate(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public interface Disassociate extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Disassociate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("disassociate7a68elemtype");
        
        /**
         * Gets the "entityName" element
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entityName" element
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * Tests for nil "entityName" element
         */
        boolean isNilEntityName();
        
        /**
         * True if has "entityName" element
         */
        boolean isSetEntityName();
        
        /**
         * Sets the "entityName" element
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entityName" element
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Nils the "entityName" element
         */
        void setNilEntityName();
        
        /**
         * Unsets the "entityName" element
         */
        void unsetEntityName();
        
        /**
         * Gets the "entityId" element
         */
        java.lang.String getEntityId();
        
        /**
         * Gets (as xml) the "entityId" element
         */
        com.microsoft.schemas._2003._10.serialization.Guid xgetEntityId();
        
        /**
         * True if has "entityId" element
         */
        boolean isSetEntityId();
        
        /**
         * Sets the "entityId" element
         */
        void setEntityId(java.lang.String entityId);
        
        /**
         * Sets (as xml) the "entityId" element
         */
        void xsetEntityId(com.microsoft.schemas._2003._10.serialization.Guid entityId);
        
        /**
         * Unsets the "entityId" element
         */
        void unsetEntityId();
        
        /**
         * Gets the "relationship" element
         */
        com.microsoft.schemas.xrm._2011.contracts.Relationship getRelationship();
        
        /**
         * Tests for nil "relationship" element
         */
        boolean isNilRelationship();
        
        /**
         * True if has "relationship" element
         */
        boolean isSetRelationship();
        
        /**
         * Sets the "relationship" element
         */
        void setRelationship(com.microsoft.schemas.xrm._2011.contracts.Relationship relationship);
        
        /**
         * Appends and returns a new empty "relationship" element
         */
        com.microsoft.schemas.xrm._2011.contracts.Relationship addNewRelationship();
        
        /**
         * Nils the "relationship" element
         */
        void setNilRelationship();
        
        /**
         * Unsets the "relationship" element
         */
        void unsetRelationship();
        
        /**
         * Gets the "relatedEntities" element
         */
        com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection getRelatedEntities();
        
        /**
         * Tests for nil "relatedEntities" element
         */
        boolean isNilRelatedEntities();
        
        /**
         * True if has "relatedEntities" element
         */
        boolean isSetRelatedEntities();
        
        /**
         * Sets the "relatedEntities" element
         */
        void setRelatedEntities(com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection relatedEntities);
        
        /**
         * Appends and returns a new empty "relatedEntities" element
         */
        com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection addNewRelatedEntities();
        
        /**
         * Nils the "relatedEntities" element
         */
        void setNilRelatedEntities();
        
        /**
         * Unsets the "relatedEntities" element
         */
        void unsetRelatedEntities();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate newInstance() {
              return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Disassociate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
