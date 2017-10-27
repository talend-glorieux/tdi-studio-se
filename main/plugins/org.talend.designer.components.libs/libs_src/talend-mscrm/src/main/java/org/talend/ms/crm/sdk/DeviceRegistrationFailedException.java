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

import java.io.Serializable;

/**
 * Indicates that Device Registration failed
 */
public final class DeviceRegistrationFailedException
        extends Exception
        implements Serializable {

   private static final long SerialVersionUID = 5118164241987152495L;

    /**
     *  Construct an instance of the DeviceRegistrationFailedException class
     */
    public DeviceRegistrationFailedException() {
        super();
    }

    /**
     *  Construct an instance of the DeviceRegistrationFailedException class
     * @param message Message to pass
     */
    public DeviceRegistrationFailedException(String message) {
        super(message);
    }

    /**
     *  Construct an instance of the DeviceRegistrationFailedException class
     * @param message Message to pass
     * @param innerException Exception to include
     */
    public DeviceRegistrationFailedException(String message, Exception innerException) {
        super(message, innerException);
    }

    /**
     *  Construct an instance of the DeviceRegistrationFailedException class
     * @param code Error code that occurred
     * @param subCode Subcode that occurred
     */
    public DeviceRegistrationFailedException(DeviceRegistrationErrorCode code, String subCode) {
        this(code, subCode, null);
    }

    /**
     *  Construct an instance of the DeviceRegistrationFailedException class
     * @param code Error code that occurred
     * @param subCode Subcode that occurred
     * @param innerException Exception to include
     */
    public DeviceRegistrationFailedException(DeviceRegistrationErrorCode code, String subCode, Exception innerException) {
        super(code.toString() + subCode, innerException);
    }
}
