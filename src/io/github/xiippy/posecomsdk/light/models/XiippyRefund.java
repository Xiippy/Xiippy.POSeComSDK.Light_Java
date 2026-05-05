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

import java.time.OffsetDateTime;
import java.util.Map;

public class XiippyRefund {
    private String xiippyPaymentContextID;
    private String xiippyPaymentChargeID;
    private String id;
    private String object;
    private long amount;
    private String balanceTransaction;
    private String charge;
    private OffsetDateTime created;
    private String currency;
    private Map<String, String> metadata;
    private String paymentIntent;
    private String reason;
    private String receiptNumber;
    private String sourceTransferReversal;
    private String status;
    private String transferReversal;

    public String getXiippyPaymentContextID() {
        return xiippyPaymentContextID;
    }

    public void setXiippyPaymentContextID(String xiippyPaymentContextID) {
        this.xiippyPaymentContextID = xiippyPaymentContextID;
    }

    public String getXiippyPaymentChargeID() {
        return xiippyPaymentChargeID;
    }

    public void setXiippyPaymentChargeID(String xiippyPaymentChargeID) {
        this.xiippyPaymentChargeID = xiippyPaymentChargeID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getBalanceTransaction() {
        return balanceTransaction;
    }

    public void setBalanceTransaction(String balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public String getPaymentIntent() {
        return paymentIntent;
    }

    public void setPaymentIntent(String paymentIntent) {
        this.paymentIntent = paymentIntent;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getSourceTransferReversal() {
        return sourceTransferReversal;
    }

    public void setSourceTransferReversal(String sourceTransferReversal) {
        this.sourceTransferReversal = sourceTransferReversal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransferReversal() {
        return transferReversal;
    }

    public void setTransferReversal(String transferReversal) {
        this.transferReversal = transferReversal;
    }
}