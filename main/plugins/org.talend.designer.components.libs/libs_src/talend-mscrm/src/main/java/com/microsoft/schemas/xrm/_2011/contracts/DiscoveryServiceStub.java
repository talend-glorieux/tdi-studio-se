/**
 * DiscoveryServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0  Built on : Jan 18, 2016 (09:41:27 GMT)
 */
package com.microsoft.schemas.xrm._2011.contracts;


/*
 *  DiscoveryServiceStub java implementation
 */
public class DiscoveryServiceStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    /////////////////////////////////////////////////////////////////////////
    private javax.xml.namespace.QName[] opNameArray = null;

    //https://disco.crm.dynamics.com/XRMServices/2011/Discovery.svc
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
    public DiscoveryServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public DiscoveryServiceStub(
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
    public DiscoveryServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://disco.crm.dynamics.com/XRMServices/2011/Discovery.svc");
    }

    /**
     * Default Constructor
     */
    public DiscoveryServiceStub() throws org.apache.axis2.AxisFault {
        this("https://disco.crm.dynamics.com/XRMServices/2011/Discovery.svc");
    }

    /**
     * Constructor taking the target endpoint
     */
    public DiscoveryServiceStub(java.lang.String targetEndpoint)
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
                "DiscoveryService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/xrm/2011/Contracts/Discovery",
                "execute"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IDiscoveryService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"CustomBinding_IDiscoveryService_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2011/Contracts/Services\">\n          <ms-xrm:Authentication>LiveId</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            <ms-xrm:LiveTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n            </ms-xrm:LiveTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><ms-xrm:AuthenticationPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:Authentication>OnlineFederation</ms-xrm:Authentication>\n          <ms-xrm:SecureTokenService>\n            <ms-xrm:Identifier>https://dynamicscrmna.accesscontrol.windows.net/</ms-xrm:Identifier>\n            <ms-xrm:OrgTrust>\n              <ms-xrm:AppliesTo>urn:crmna:dynamics.com</ms-xrm:AppliesTo>\n              <ms-xrm:TrustVersion>WSTrustFeb2005</ms-xrm:TrustVersion>\n              <ms-xrm:SecurityMode>TransportWithMessageCredential</ms-xrm:SecurityMode>\n              <ms-xrm:LivePolicy>MBI_FED_SSL</ms-xrm:LivePolicy>\n              <ms-xrm:LiveIdAppliesTo>http://Passport.NET/tb</ms-xrm:LiveIdAppliesTo>\n              <ms-xrm:LiveEndpoint>https://login.microsoftonline.com/RST2.srf</ms-xrm:LiveEndpoint>\n              <ms-xrm:Identifier>urn:federation:MicrosoftOnline</ms-xrm:Identifier>\n            </ms-xrm:OrgTrust>\n          </ms-xrm:SecureTokenService>\n        </ms-xrm:AuthenticationPolicy><ms-xrm:FailoverPolicy xmlns:ms-xrm=\"http://schemas.microsoft.com/xrm/2012/Contracts/Services\">\n          <ms-xrm:FailoverAvailable>false</ms-xrm:FailoverAvailable>\n          <ms-xrm:EndpointEnabled>true</ms-xrm:EndpointEnabled>\n        </ms-xrm:FailoverPolicy><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken/></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDes/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:IssuedToken sp:IncludeToken=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/IncludeToken/AlwaysToRecipient\">\n              <Issuer xmlns=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n                <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://login.microsoftonline.com/RST2.srf</Address>\n                \n                <Metadata xmlns=\"http://www.w3.org/2005/08/addressing\">\n                  <Metadata xmlns=\"http://schemas.xmlsoap.org/ws/2004/09/mex\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n                    <wsx:MetadataSection xmlns=\"\" xmlns:wsx=\"http://schemas.xmlsoap.org/ws/2004/09/mex\">\n                      <wsx:MetadataReference>\n                        <Address xmlns=\"http://www.w3.org/2005/08/addressing\">https://dynamicscrmna.accesscontrol.windows.net/v2/wstrust/mex</Address>\n                      </wsx:MetadataReference>\n                    </wsx:MetadataSection>\n                  </Metadata>\n                </Metadata>\n              </Issuer>\n              <sp:RequestSecurityTokenTemplate>\n                <trust:KeyType xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey</trust:KeyType>\n                <trust:KeySize xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">192</trust:KeySize>\n                <trust:Claims xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\" Dialect=\"http://schemas.xmlsoap.org/ws/2005/05/identity\">\n                  <wsid:ClaimType xmlns:wsid=\"http://schemas.xmlsoap.org/ws/2005/05/identity\" Uri=\"http://schemas.xmlsoap.org/ws/2005/05/identity/claims/nameidentifier\"/>\n                </trust:Claims>\n                <trust:KeyWrapAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p</trust:KeyWrapAlgorithm>\n                <trust:EncryptWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptWith>\n                <trust:SignWith xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2000/09/xmldsig#hmac-sha1</trust:SignWith>\n                <trust:CanonicalizationAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/10/xml-exc-c14n#</trust:CanonicalizationAlgorithm>\n                <trust:EncryptionAlgorithm xmlns:trust=\"http://docs.oasis-open.org/ws-sx/ws-trust/200512\">http://www.w3.org/2001/04/xmlenc#tripledes-cbc</trust:EncryptionAlgorithm>\n              </sp:RequestSecurityTokenTemplate>\n              <wsp:Policy>\n                <sp:RequireInternalReference/>\n              </wsp:Policy>\n            </sp:IssuedToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"/></sp:Wss11><sp:Trust13 xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens/><sp:RequireClientEntropy/><sp:RequireServerEntropy/></wsp:Policy></sp:Trust13><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "DiscoveryServiceFault"), "Execute"),
            "com.microsoft.schemas.xrm._2011.contracts.IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "DiscoveryServiceFault"), "Execute"),
            "com.microsoft.schemas.xrm._2011.contracts.IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schemas.microsoft.com/xrm/2011/Contracts",
                    "DiscoveryServiceFault"), "Execute"),
            "com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument");
    }

    /**
     * Auto generated method signature
     *
     * @see com.microsoft.schemas.xrm._2011.contracts.DiscoveryService#execute
     * @param execute
     * @throws com.microsoft.schemas.xrm._2011.contracts.IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage :
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument execute(
        com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument execute)
        throws java.rmi.RemoteException,
            com.microsoft.schemas.xrm._2011.contracts.IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery/IDiscoveryService/Execute");
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
                            "http://schemas.microsoft.com/xrm/2011/Contracts/Discovery",
                            "execute")),
                    new javax.xml.namespace.QName(
                        "http://schemas.microsoft.com/xrm/2011/Contracts/Discovery",
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
                    com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument.class);

            return (com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument) object;
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

                        if (ex instanceof com.microsoft.schemas.xrm._2011.contracts.IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage) {
                            throw (com.microsoft.schemas.xrm._2011.contracts.IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage) ex;
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
        com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument param)
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
        com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument param)
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
        com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument param)
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
        com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument param,
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
            if (com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
