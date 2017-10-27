/**
 * IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0  Built on : Jan 18, 2016 (09:41:27 GMT)
 */
package com.microsoft.schemas.xrm._2011.contracts;

public class IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1477289786162L;
    private com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument faultMessage;

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage() {
        super(
            "IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage");
    }

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument msg) {
        faultMessage = msg;
    }

    public com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument getFaultMessage() {
        return faultMessage;
    }
}
