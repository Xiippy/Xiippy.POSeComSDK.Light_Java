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

public class PaymentRecordCustomerAddress implements IAddress {
    private String paymentRecordCustomerAddressID;
    private String line1;
    private String line2;
    private String cityOrSuburb;
    private String stateOrPrivince;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String fullName;

    public String getPaymentRecordCustomerAddressID() {
        return paymentRecordCustomerAddressID;
    }

    public void setPaymentRecordCustomerAddressID(String paymentRecordCustomerAddressID) {
        this.paymentRecordCustomerAddressID = paymentRecordCustomerAddressID;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCityOrSuburb() {
        return cityOrSuburb;
    }

    public void setCityOrSuburb(String cityOrSuburb) {
        this.cityOrSuburb = cityOrSuburb;
    }

    public String getStateOrPrivince() {
        return stateOrPrivince;
    }

    public void setStateOrPrivince(String stateOrPrivince) {
        this.stateOrPrivince = stateOrPrivince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}