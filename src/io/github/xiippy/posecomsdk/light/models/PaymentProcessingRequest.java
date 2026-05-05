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

import jakarta.validation.constraints.NotNull;

public class PaymentProcessingRequest implements IPaymentProcessingRequest {
    @NotNull
    private String merchantGroupID;
    @NotNull
    private String merchantID;
    @NotNull
    private float amount;
    @NotNull
    private String currency;
    private PaymentRecordCustomer customer;
    private String externalUniqueID;
    @NotNull
    private boolean viaTerminal;
    @NotNull
    private boolean preAuth;
    @NotNull
    private IssuerStatementRecord issuerStatementRecord;

    @NotNull
    public String getMerchantGroupID() {
        return merchantGroupID;
    }

    public void setMerchantGroupID(String merchantGroupID) {
        this.merchantGroupID = merchantGroupID;
    }

    @NotNull
    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    @NotNull
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @NotNull
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public PaymentRecordCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(PaymentRecordCustomer customer) {
        this.customer = customer;
    }

    public String getExternalUniqueID() {
        return externalUniqueID;
    }

    public void setExternalUniqueID(String externalUniqueID) {
        this.externalUniqueID = externalUniqueID;
    }

    @NotNull
    public boolean isViaTerminal() {
        return viaTerminal;
    }

    public void setViaTerminal(boolean viaTerminal) {
        this.viaTerminal = viaTerminal;
    }

    @NotNull
    public boolean isPreAuth() {
        return preAuth;
    }

    public void setPreAuth(boolean preAuth) {
        this.preAuth = preAuth;
    }

    @NotNull
    public IssuerStatementRecord getIssuerStatementRecord() {
        return issuerStatementRecord;
    }

    public void setIssuerStatementRecord(IssuerStatementRecord issuerStatementRecord) {
        this.issuerStatementRecord = issuerStatementRecord;
    }
}