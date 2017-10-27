/*
 * XML Type:  RolePrivilegeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML RolePrivilegeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface RolePrivilegeAuditDetail extends com.microsoft.schemas.crm._2011.contracts.AuditDetail
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RolePrivilegeAuditDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("roleprivilegeauditdetail2f37type");
    
    /**
     * Gets the "InvalidNewPrivileges" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid getInvalidNewPrivileges();
    
    /**
     * Tests for nil "InvalidNewPrivileges" element
     */
    boolean isNilInvalidNewPrivileges();
    
    /**
     * True if has "InvalidNewPrivileges" element
     */
    boolean isSetInvalidNewPrivileges();
    
    /**
     * Sets the "InvalidNewPrivileges" element
     */
    void setInvalidNewPrivileges(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid invalidNewPrivileges);
    
    /**
     * Appends and returns a new empty "InvalidNewPrivileges" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid addNewInvalidNewPrivileges();
    
    /**
     * Nils the "InvalidNewPrivileges" element
     */
    void setNilInvalidNewPrivileges();
    
    /**
     * Unsets the "InvalidNewPrivileges" element
     */
    void unsetInvalidNewPrivileges();
    
    /**
     * Gets the "NewRolePrivileges" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege getNewRolePrivileges();
    
    /**
     * Tests for nil "NewRolePrivileges" element
     */
    boolean isNilNewRolePrivileges();
    
    /**
     * True if has "NewRolePrivileges" element
     */
    boolean isSetNewRolePrivileges();
    
    /**
     * Sets the "NewRolePrivileges" element
     */
    void setNewRolePrivileges(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege newRolePrivileges);
    
    /**
     * Appends and returns a new empty "NewRolePrivileges" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege addNewNewRolePrivileges();
    
    /**
     * Nils the "NewRolePrivileges" element
     */
    void setNilNewRolePrivileges();
    
    /**
     * Unsets the "NewRolePrivileges" element
     */
    void unsetNewRolePrivileges();
    
    /**
     * Gets the "OldRolePrivileges" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege getOldRolePrivileges();
    
    /**
     * Tests for nil "OldRolePrivileges" element
     */
    boolean isNilOldRolePrivileges();
    
    /**
     * True if has "OldRolePrivileges" element
     */
    boolean isSetOldRolePrivileges();
    
    /**
     * Sets the "OldRolePrivileges" element
     */
    void setOldRolePrivileges(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege oldRolePrivileges);
    
    /**
     * Appends and returns a new empty "OldRolePrivileges" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege addNewOldRolePrivileges();
    
    /**
     * Nils the "OldRolePrivileges" element
     */
    void setNilOldRolePrivileges();
    
    /**
     * Unsets the "OldRolePrivileges" element
     */
    void unsetOldRolePrivileges();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
