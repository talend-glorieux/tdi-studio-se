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
 * Provides device credentials for username and password based authentication schemes.
 */
public final class DeviceCredentials {

    private String _deviceName;
    private String _password;

    /**
     * Create a new instance of DeviceCredentials class by 
     * setting associated device name and password.
     * @param deviceName device name string
     * @param password password string
     */
    public DeviceCredentials(String deviceName, String password) {
    	if(deviceName == null)
    		throw new NullPointerException("deviceName");
    	if(password == null)
    		throw new NullPointerException("password");
        this._deviceName = deviceName;
        this._password = password;
    }

    /**
     * Get the device name associated with the credentials.
     * @return The user name associated with the credentials.
     */
    public String getDeviceName() {
        return this._deviceName;
    }

    /**
     * Get the password for the device name associated with the credentials.
     * @return The password associated with the credentials.
     */
    public String getPassword() {
        return this._password;
    }
}
