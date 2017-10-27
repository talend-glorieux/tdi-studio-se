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

/***
 * Stores create and expire DateTime in string.
 *
 */
public class RequestDateTimeData {

	private final String _createdDateTime;
    private final String _expiresDateTime;
	/***
	 * Sets create and expire DateTime in string format.
	 * @param createdDateTime
	 * @param expiresDateTime
	 */
    public RequestDateTimeData(String createdDateTime, String expiresDateTime) {
        this._createdDateTime = createdDateTime;
        this._expiresDateTime = expiresDateTime;
    }    

    /***
     * Get the create DateTime.
     * @return String
     */
    public String getCreatedDateTime() {
        return this._createdDateTime;
    }

    /***
     * Get the expire DateTime.
     * @return String
     */
    public String getExpiresDateTime() {
        return this._expiresDateTime;
    }
}
