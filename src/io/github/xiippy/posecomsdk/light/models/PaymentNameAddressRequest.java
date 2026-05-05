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

import java.util.List;

public class PaymentNameAddressRequest {
    private float paymentRequestAmount;
    private String paymentRequestCurrency;
    private List<String> allowedCardNetworks;
    private String paymentRecordClientAuthenticator;
    private boolean includePhoneNumberInResponse;
    private boolean includeNameInResponse;
    private boolean includeEmailAddressInResponse;
    private boolean includeBillingAddressInResponse;
    private boolean includeShippingAddressInResponse;
    private boolean viaTerminal;
    private boolean allowFuturePayments;

    public float getPaymentRequestAmount() {
        return paymentRequestAmount;
    }

    public void setPaymentRequestAmount(float paymentRequestAmount) {
        this.paymentRequestAmount = paymentRequestAmount;
    }

    public String getPaymentRequestCurrency() {
        return paymentRequestCurrency;
    }

    public void setPaymentRequestCurrency(String paymentRequestCurrency) {
        this.paymentRequestCurrency = paymentRequestCurrency;
    }

    public List<String> getAllowedCardNetworks() {
        return allowedCardNetworks;
    }

    public void setAllowedCardNetworks(List<String> allowedCardNetworks) {
        this.allowedCardNetworks = allowedCardNetworks;
    }

    public String getPaymentRecordClientAuthenticator() {
        return paymentRecordClientAuthenticator;
    }

    public void setPaymentRecordClientAuthenticator(String paymentRecordClientAuthenticator) {
        this.paymentRecordClientAuthenticator = paymentRecordClientAuthenticator;
    }

    public boolean isIncludePhoneNumberInResponse() {
        return includePhoneNumberInResponse;
    }

    public void setIncludePhoneNumberInResponse(boolean includePhoneNumberInResponse) {
        this.includePhoneNumberInResponse = includePhoneNumberInResponse;
    }

    public boolean isIncludeNameInResponse() {
        return includeNameInResponse;
    }

    public void setIncludeNameInResponse(boolean includeNameInResponse) {
        this.includeNameInResponse = includeNameInResponse;
    }

    public boolean isIncludeEmailAddressInResponse() {
        return includeEmailAddressInResponse;
    }

    public void setIncludeEmailAddressInResponse(boolean includeEmailAddressInResponse) {
        this.includeEmailAddressInResponse = includeEmailAddressInResponse;
    }

    public boolean isIncludeBillingAddressInResponse() {
        return includeBillingAddressInResponse;
    }

    public void setIncludeBillingAddressInResponse(boolean includeBillingAddressInResponse) {
        this.includeBillingAddressInResponse = includeBillingAddressInResponse;
    }

    public boolean isIncludeShippingAddressInResponse() {
        return includeShippingAddressInResponse;
    }

    public void setIncludeShippingAddressInResponse(boolean includeShippingAddressInResponse) {
        this.includeShippingAddressInResponse = includeShippingAddressInResponse;
    }

    public boolean isViaTerminal() {
        return viaTerminal;
    }

    public void setViaTerminal(boolean viaTerminal) {
        this.viaTerminal = viaTerminal;
    }

    public boolean isAllowFuturePayments() {
        return allowFuturePayments;
    }

    public void setAllowFuturePayments(boolean allowFuturePayments) {
        this.allowFuturePayments = allowFuturePayments;
    }
}