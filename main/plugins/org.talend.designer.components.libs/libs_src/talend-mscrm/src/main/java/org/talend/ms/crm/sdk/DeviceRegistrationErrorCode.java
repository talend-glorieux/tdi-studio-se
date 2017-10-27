// =====================================================================
//  This file is part of the Microsoft Dynamics CRM SDK code samples.
//
//  Copyright (C) Microsoft Corporation.  All rights reserved.
//
//  This source code is intended only as a supplement to Microsoft
//  Development Tools and/or on-line documentation.  See these other
//  materials for detailed information regarding Microsoft code samples.
//
//  THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
//  KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
//  IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
//  PARTICULAR PURPOSE.
// =====================================================================

package org.talend.ms.crm.sdk;

/**
 * Indicates an error during registration
 */
public enum DeviceRegistrationErrorCode {
    /**
	 * Unspecified or Unknown Error occurred
	 */
    Unknown,
    /**
     *  Interface Disabled
     */
    InterfaceDisabled,
    /**
     *  Invalid Request Format
     */
    InvalidRequestFormat,
    /**
     *  Unknown Client Version
     */
    UnknownClientVersion,
    /**
     *  Blank Password
     */
    BlankPassword,
    /**
     *  Missing Device User Name or Password
     */
    MissingDeviceUserNameOrPassword,
    /**
     *  Invalid Parameter Syntax
     */
    InvalidParameterSyntax,
    /**
     *  Internal Error
     */
    InternalError,
    /**
     *  Device Already Exists
     */
    DeviceAlreadyExists
}
