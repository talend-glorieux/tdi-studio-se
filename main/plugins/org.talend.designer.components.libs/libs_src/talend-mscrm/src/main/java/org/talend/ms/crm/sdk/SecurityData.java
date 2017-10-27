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
 * Stores security KeyIdentifier and Tokens
 */
public final class SecurityData {

	private String _keyIdentifier;
    private String _securityToken0;
    private String _securityToken1;

    /**
     * Set security KeyIdentifier, SecurityToken0 and SecurityToken1.
     * @param keyIdentifier
     * @param securityToken0
     * @param securityToken1
     */
    public SecurityData(String keyIdentifier, String securityToken0, String securityToken1) {
        this._keyIdentifier = keyIdentifier;
        this._securityToken0 = securityToken0;
        this._securityToken1 = securityToken1;
    }
    
    /**
     * Get the KeyIdentifier.
     * @return String
     */
    public String getKeyIdentifier() {
        return this._keyIdentifier;
    }

    /**
     * Get the SecurityToken0.
     * @return String
     */
    public String getSecurityToken0() {
        return this._securityToken0;
    }

    /**
     * Get the SecurityToken1.
     * @return String
     */
    public String getSecurityToken1() {
        return this._securityToken1;
    }
}
