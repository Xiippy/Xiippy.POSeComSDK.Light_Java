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

package io.github.xiippy.posecomsdk.light.xiippysdkbridgeapiclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.xiippy.posecomsdk.light.models.*;
import io.github.xiippy.posecomsdk.light.utils.XiippySigv1Util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class XiippySDKBridgeApiClient {
    public static final String XiippyReqSignatureHeader = "XIIPPY-API-SIG-V1";
    public static final String XiippyReqMomentHeader = "XIIPPY-MOMENT-V1";

    private static final String ApplicationJson = "application/json";
    private String bridgeBaseUrl = "https://localhost:19019";
    private final HttpClient client;
    private boolean isTest;
    private String bridgeAPIKey;
    private String merchantID;
    private String merchantGroupID;

    public XiippySDKBridgeApiClient(boolean isTest, String bridgeAPIKey, String bridgeBaseUrl, String merchantID, String merchantGroupID) {
        this.bridgeAPIKey = bridgeAPIKey;
        this.bridgeBaseUrl = bridgeBaseUrl;
        this.isTest = isTest;
        this.merchantID = merchantID;
        this.merchantGroupID = merchantGroupID;
        this.client = HttpClient.newHttpClient();
    }

    public PaymentProcessingResponse initiateXiippyPayment(PaymentProcessingRequest req) throws IOException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(req);
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(bridgeBaseUrl + Constants.InitiateXiippyPaymentPath))
                .header("Content-Type", ApplicationJson)
                .header("Accept", ApplicationJson);
        Map<String, String> sigHeaders = XiippySigv1Util.getXiippyV1RequestSignatureHeaders(json, bridgeAPIKey);
        for (Map.Entry<String, String> entry : sigHeaders.entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }
        HttpRequest request = builder.POST(HttpRequest.BodyPublishers.ofString(json)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new RuntimeException("Response Code: " + response.statusCode() + " Body: " + response.body());
        }
        PaymentProcessingResponse returnedObj = mapper.readValue(response.body(), PaymentProcessingResponse.class);
        return returnedObj;
    }

    public RefundCardPaymentResponse refundCardPayment(RefundCardPaymentRequest req) throws IOException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(req);
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(bridgeBaseUrl + Constants.RefundCardPaymentPath))
                .header("Content-Type", ApplicationJson)
                .header("Accept", ApplicationJson);
        Map<String, String> sigHeaders = XiippySigv1Util.getXiippyV1RequestSignatureHeaders(json, bridgeAPIKey);
        for (Map.Entry<String, String> entry : sigHeaders.entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }
        HttpRequest request = builder.POST(HttpRequest.BodyPublishers.ofString(json)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new RuntimeException("Response Code: " + response.statusCode() + " Body: " + response.body());
        }
        RefundCardPaymentResponse returnedObj = mapper.readValue(response.body(), RefundCardPaymentResponse.class);
        return returnedObj;
    }

    public GetPaymentStatusResponse getPaymentStatus(GetPaymentStatusRequest req) throws IOException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(req);
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(bridgeBaseUrl + Constants.GetPaymentStatusPath))
                .header("Content-Type", ApplicationJson)
                .header("Accept", ApplicationJson);
        Map<String, String> sigHeaders = XiippySigv1Util.getXiippyV1RequestSignatureHeaders(json, bridgeAPIKey);
        for (Map.Entry<String, String> entry : sigHeaders.entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }
        HttpRequest request = builder.POST(HttpRequest.BodyPublishers.ofString(json)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new RuntimeException("Response Code: " + response.statusCode() + " Body: " + response.body());
        }
        GetPaymentStatusResponse returnedObj = mapper.readValue(response.body(), GetPaymentStatusResponse.class);
        return returnedObj;
    }
}