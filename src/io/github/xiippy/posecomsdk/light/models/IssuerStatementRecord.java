// *******************************************************************************************
// Copyright © 2019 Xiippy.ai. All rights reserved. Australian patents awarded. PCT patent pending.
//
// NOTES:
//
// - No payment gateway SDK function is consumed directly. Interfaces are defined out of such interactions and then the interface is implemented for payment gateways. Design the interface with the most common members and data structures between different gateways. 
// A proper factory or provider must instantiate an instance of the interface that is interacted with.
// - Any major change made to SDKs should begin with the c sharp SDK with the mindset to keep the high-level syntax, structures and class names the same to minimise porting efforts to other languages. Do not use language specific features that do not exist in other languages. We are not in the business of doing the same thing from scratch multiple times in different forms.
// - Pascal Case for naming conventions should be used for all languages
// - No secret or passwords or keys must exist in the code when checked in
//
// *******************************************************************************************

package io.github.xiippy.posecomsdk.light.models;

import java.util.List;
import java.util.Map;

public class IssuerStatementRecord {
    private String randomStatementID;
    private List<StatementItem> statementItems;
    private List<ElectronicPaymentPersisted> electronicPayments;
    private List<CashPaymentPersisted> cashPayments;
    private List<TotalBillVariation> totalBillVariations;
    private String shiftID;
    private String statementTimeStamp = "";
    private Map<String, String> issuersPrivateMetadata;
    private String shortStatementID = "";

    public String getRandomStatementID() {
        return randomStatementID;
    }

    public void setRandomStatementID(String randomStatementID) {
        this.randomStatementID = randomStatementID;
    }

    public List<StatementItem> getStatementItems() {
        return statementItems;
    }

    public void setStatementItems(List<StatementItem> statementItems) {
        this.statementItems = statementItems;
    }

    public List<ElectronicPaymentPersisted> getElectronicPayments() {
        return electronicPayments;
    }

    public void setElectronicPayments(List<ElectronicPaymentPersisted> electronicPayments) {
        this.electronicPayments = electronicPayments;
    }

    public List<CashPaymentPersisted> getCashPayments() {
        return cashPayments;
    }

    public void setCashPayments(List<CashPaymentPersisted> cashPayments) {
        this.cashPayments = cashPayments;
    }

    public List<TotalBillVariation> getTotalBillVariations() {
        return totalBillVariations;
    }

    public void setTotalBillVariations(List<TotalBillVariation> totalBillVariations) {
        this.totalBillVariations = totalBillVariations;
    }

    public String getShiftID() {
        return shiftID;
    }

    public void setShiftID(String shiftID) {
        this.shiftID = shiftID;
    }

    public String getStatementTimeStamp() {
        return statementTimeStamp;
    }

    public void setStatementTimeStamp(String statementTimeStamp) {
        this.statementTimeStamp = statementTimeStamp;
    }

    public Map<String, String> getIssuersPrivateMetadata() {
        return issuersPrivateMetadata;
    }

    public void setIssuersPrivateMetadata(Map<String, String> issuersPrivateMetadata) {
        this.issuersPrivateMetadata = issuersPrivateMetadata;
    }

    public String getShortStatementID() {
        return shortStatementID;
    }

    public void setShortStatementID(String shortStatementID) {
        this.shortStatementID = shortStatementID;
    }
}