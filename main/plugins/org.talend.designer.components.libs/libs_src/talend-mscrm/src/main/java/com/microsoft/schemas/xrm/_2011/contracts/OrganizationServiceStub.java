/**
 * OrganizationServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0  Built on : Jan 18, 2016 (09:41:27 GMT)
 */
package com.microsoft.schemas.xrm._2011.contracts;


/*
 *  OrganizationServiceStub java implementation
 */
public class OrganizationServiceStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    /////////////////////////////////////////////////////////////////////////
    private javax.xml.namespace.QName[] opNameArray = null;

    //https://talend.api.crm.dynamics.com/XRMServices/2011/Organization.svc
    private final org.apache.xmlbeans.XmlOptions _xmlOptions;

    {
        _xmlOptions = new org.apache.xmlbeans.XmlOptions();
        _xmlOptions.setSaveNoXmlDecl();
        _xmlOptions.setSaveAggressiveNamespaces();
        _xmlOptions.setSaveNamespacesFirst();
    }

    /**
     *Constructor that takes in a configContext
     */
    public OrganizationServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public OrganizationServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _service.applyPolicy();

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                      .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public OrganizationServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://talend.api.crm.dynamics.com/XRMServices/2011/Organization.svc");
    }

    /**
     * Default Constructor
     */
    public OrganizationServiceStub() throws org.apache.axis2.AxisFault {
        this(
            "https://talend.api.crm.dynamics.com/XRMServices/2011/Organization.svc");
    }

    /**
     * Constructor taking the target endpoint
     */
    public OrganizationServiceStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "OrganizationService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[8];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "disassociate"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "retrieveMultiple"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "update"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "associate"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "retrieve"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "delete"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "create"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                "execute"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IOrganizationService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[7] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Disassociate"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Disassociate_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Disassociate"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Disassociate_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Disassociate"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "RetrieveMultiple"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "RetrieveMultiple"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "RetrieveMultiple"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Update"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Update"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Update"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Associate"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Associate_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Associate"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Associate_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Associate"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Retrieve"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Retrieve"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Retrieve"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Delete"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Delete"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Delete"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Create"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Create"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Create"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Execute"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Execute"),
            "com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "OrganizationServiceFault"), "Execute"),
            "com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument");
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#disassociate
     * @param disassociate
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Disassociate_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument disassociate(
        com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument disassociate)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Disassociate_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/Disassociate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    disassociate,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "disassociate")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "Disassociate"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Disassociate"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Disassociate"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Disassociate"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Disassociate_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Disassociate_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#retrieveMultiple
     * @param retrieveMultiple
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument retrieveMultiple(
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument retrieveMultiple)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/RetrieveMultiple");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    retrieveMultiple,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "retrieveMultiple")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "RetrieveMultiple"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "RetrieveMultiple"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "RetrieveMultiple"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "RetrieveMultiple"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#update
     * @param update
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument update(
        com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument update)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/Update");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    update,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "update")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "Update"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Update"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Update"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Update"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#associate
     * @param associate
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Associate_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument associate(
        com.microsoft.schemas.xrm._2011.contracts.services.AssociateDocument associate)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Associate_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/Associate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    associate,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "associate")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "Associate"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Associate"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Associate"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Associate"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Associate_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Associate_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#retrieve
     * @param retrieve
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument retrieve(
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument retrieve)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/Retrieve");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    retrieve,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "retrieve")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "Retrieve"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Retrieve"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Retrieve"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Retrieve"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#delete
     * @param delete
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument delete(
        com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument delete)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/Delete");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    delete,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "delete")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "Delete"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Delete"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Delete"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Delete"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#create
     * @param create
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument create(
        com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument create)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/Create");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    create,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "create")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "Create"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Create"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Create"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Create"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.OrganizationService#execute
     * @param execute
     * @throws com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument execute(
        com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument execute)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Services/IOrganizationService/Execute");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    execute,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                            "execute")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Services",
                        "Execute"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Execute"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Execute"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Execute"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////
    private static org.apache.neethi.Policy getPolicy(
        java.lang.String policyString) {
        return org.apache.neethi.PolicyEngine.getPolicy(org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                new java.io.StringReader(policyString)).getDocument()
                                                                                               .getXMLStreamReader(false));
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * Get the {@link org.apache.xmlbeans.XmlOptions} object that the stub uses when
     * serializing objects to XML.
     *
     * @return the options used for serialization
     */
    public org.apache.xmlbeans.XmlOptions _getXmlOptions() {
        return _xmlOptions;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.AssociateDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.AssociateDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.AssociateDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param, java.lang.Class type)
        throws org.apache.axis2.AxisFault {
        try {
            if (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.DisassociateDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.AssociateDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.AssociateDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.ExecuteDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
