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

package io.github.xiippy.posecomsdk.light.models;

import java.util.Map;

public class PaymentProcessingResponse implements IPaymentProcessingResponse {
    private String clientSecret;
    private String clientAuthenticator;
    private String randomStatementID;
    private String statementTimeStamp;
    private String externalUniqueID;
    private Map<String, String> data;
    private String paymentProcessingResponseID;

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getClientAuthenticator() {
        return clientAuthenticator;
    }

    public void setClientAuthenticator(String clientAuthenticator) {
        this.clientAuthenticator = clientAuthenticator;
    }

    public String getRandomStatementID() {
        return randomStatementID;
    }

    public void setRandomStatementID(String randomStatementID) {
        this.randomStatementID = randomStatementID;
    }

    public String getStatementTimeStamp() {
        return statementTimeStamp;
    }

    public void setStatementTimeStamp(String statementTimeStamp) {
        this.statementTimeStamp = statementTimeStamp;
    }

    public String getExternalUniqueID() {
        return externalUniqueID;
    }

    public void setExternalUniqueID(String externalUniqueID) {
        this.externalUniqueID = externalUniqueID;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public String getPaymentProcessingResponseID() {
        return paymentProcessingResponseID;
    }

    public void setPaymentProcessingResponseID(String paymentProcessingResponseID) {
        this.paymentProcessingResponseID = paymentProcessingResponseID;
    }
}