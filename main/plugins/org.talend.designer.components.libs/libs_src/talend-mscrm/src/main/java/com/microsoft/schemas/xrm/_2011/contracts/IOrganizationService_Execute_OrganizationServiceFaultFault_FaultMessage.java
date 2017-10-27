/**
 * IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0  Built on : Jan 18, 2016 (09:41:27 GMT)
 */
package com.microsoft.schemas.xrm._2011.contracts;

public class IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1477289848169L;
    private com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument faultMessage;

    public IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage() {
        super(
            "IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage");
    }

    public IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IOrganizationService_Execute_OrganizationServiceFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument msg) {
        faultMessage = msg;
    }

    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument getFaultMessage() {
        return faultMessage;
    }
}
