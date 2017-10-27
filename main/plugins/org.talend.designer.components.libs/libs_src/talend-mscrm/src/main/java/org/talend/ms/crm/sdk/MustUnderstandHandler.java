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

import java.util.Iterator;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

/***
 * Handler for SOAP header.
 *
 */
public final class MustUnderstandHandler extends AbstractHandler {

    public MustUnderstandHandler() {
    }
    /***
     * Process the security block from the message context header.
     */
    public InvocationResponse invoke(MessageContext msgContext)
            throws AxisFault {

        SOAPHeader header = msgContext.getEnvelope().getHeader();

        if (header != null) {
            Iterator<?> blocks = header.examineAllHeaderBlocks();

            while (blocks.hasNext()) {
                SOAPHeaderBlock block = (SOAPHeaderBlock) blocks.next();

                if(block != null){                	
                	if (block.getLocalName().equals("Security")) {
                		block.setProcessed();
                	}
                }
            }
        }

        return InvocationResponse.CONTINUE;
    }
}
