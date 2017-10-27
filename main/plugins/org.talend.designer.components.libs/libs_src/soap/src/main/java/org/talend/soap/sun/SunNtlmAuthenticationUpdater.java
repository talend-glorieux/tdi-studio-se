package org.talend.soap.sun;

import java.net.URL;

import sun.net.www.protocol.http.ntlm.NTLMAuthenticationCallback;

public class SunNtlmAuthenticationUpdater {

    private static SunNtlmAuthenticationUpdater instance;

    public static SunNtlmAuthenticationUpdater getInstance() {
        if(instance == null) {
            instance = new SunNtlmAuthenticationUpdater();
        }
        return instance;
    }

    private SunNtlmAuthenticationUpdater() {
    }

    public void resetNtlmAuthenticationCallback() {
        NTLMAuthenticationCallback.setNTLMAuthenticationCallback(createNtlmAuthenticationCallback());
    }

    private NTLMAuthenticationCallback createNtlmAuthenticationCallback() {
        return new NTLMAuthenticationCallback() {
            @Override
            public boolean isTrustedSite(URL arg0) {
                return false;
            }
        };
    }

}
