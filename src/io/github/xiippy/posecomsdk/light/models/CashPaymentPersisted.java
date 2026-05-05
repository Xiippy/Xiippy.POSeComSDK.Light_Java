/*******************************************************************************************
Copyright © 2019 Xiippy.ai. All rights reserved. Australian patents awarded. PCT patent pending.

NOTES:

- No payment gateway SDK function is consumed directly. Interfaces are defined out of such interactions and then the interface is implemented for payment gateways. Design the interface with the most common members and data structures between different gateways.
A proper factory or provider must instantiate an instance of the interface that is interacted with.
- Any major change made to SDKs should begin with the c# SDK with the mindset to keep the high-level syntax, structures and class names the same to minimise porting efforts to other languages. Do not use language specific features that don't exist in other languages. We are not in the business of doing the same thing from scratch multiple times in different forms.
- Pascal Case for naming conventions should be used for all languages
- No secret or passwords or keys must exist in the code when checked in

*******************************************************************************************/

package io.github.xiippy.posecomsdk.light.models;

public class CashPaymentPersisted {

    private String RandomStatementID;
    private float Purchase;
    private float TotalPaid;
    private float AmountReturned;
    private String Currency = "";

    public String getRandomStatementID() {
        return RandomStatementID;
    }

    public void setRandomStatementID(String RandomStatementID) {
        this.RandomStatementID = RandomStatementID;
    }

    public float getPurchase() {
        return Purchase;
    }

    public void setPurchase(float Purchase) {
        this.Purchase = Purchase;
    }

    public float getTotalPaid() {
        return TotalPaid;
    }

    public void setTotalPaid(float TotalPaid) {
        this.TotalPaid = TotalPaid;
    }

    public float getAmountReturned() {
        return AmountReturned;
    }

    public void setAmountReturned(float AmountReturned) {
        this.AmountReturned = AmountReturned;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }
}
