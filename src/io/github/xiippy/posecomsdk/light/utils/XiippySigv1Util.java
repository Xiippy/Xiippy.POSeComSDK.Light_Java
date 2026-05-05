// *******************************************************************************************
// Copyright © 2019 Xiippy.ai. All rights reserved. Australian patents awarded. PCT patent pending.
//
// NOTES:
//
// - No payment gateway SDK function is consumed directly. Interfaces are defined out of such interactions and then the interface is implemented for payment gateways. Design the interface with the most common members and data structures between different gateways. 
// - A proper factory or provider must instantiate an instance of the interface that is interacted with.
// - Any major change made to SDKs should begin with the c sharp SDK with the mindset to keep the high-level syntax, structures and class names the same to minimise porting efforts to other languages. Do not use language specific features that do not exist in other languages. We are not in the business of doing the same thing from scratch multiple times in different forms.
// - Pascal Case for naming conventions should be used for all languages
// - No secret or passwords or keys must exist in the code when checked in
//
// *******************************************************************************************

package io.github.xiippy.posecomsdk.light.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class XiippySigv1Util {
    public static final String XiippyReqSignatureHeader = "XIIPPY-API-SIG-V1";
    public static final String XiippyReqMomentHeader = "XIIPPY-MOMENT-V1";

    public static byte[] hashHMAC(byte[] key, byte[] message) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "HmacSHA256");
            mac.init(secretKeySpec);
            return mac.doFinal(message);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, String> getXiippyV1RequestSignatureHeaders(String content, String apiKey) {
        Map<String, String> headers = new HashMap<>();
        if (apiKey != null && !apiKey.isEmpty()) {
            byte[] key = Base64.getDecoder().decode(apiKey);
            long now = System.currentTimeMillis();
            String stringToSign = content + "_" + now;
            byte[] sigBytes = hashHMAC(key, stringToSign.getBytes(StandardCharsets.UTF_8));
            String signatureHeaderValue = Base64.getEncoder().encodeToString(sigBytes);
            headers.put(XiippyReqMomentHeader, String.valueOf(now));
            headers.put(XiippyReqSignatureHeader, signatureHeaderValue);
        }
        return headers;
    }

    public static boolean verifyXiippyV1RequestSignature(String content, long moment, String signature, String apiKey) {
        if (apiKey != null && !apiKey.isEmpty()) {
            byte[] key = Base64.getDecoder().decode(apiKey);
            long now = System.currentTimeMillis();
            if (now - moment > 20000) { // allow a 20-second window of validity
                return false;
            }
            String stringToSign = content + "_" + moment;
            byte[] sigBytes = hashHMAC(key, stringToSign.getBytes(StandardCharsets.UTF_8));
            byte[] sigBytesPassed = Base64.getDecoder().decode(signature);
            return java.util.Arrays.equals(sigBytes, sigBytesPassed);
        }
        return false;
    }
}