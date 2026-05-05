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

import java.time.OffsetDateTime;

public class StatementItem {

    // public String StatementItemID;
    private int StatementItemID;

    // foreign key from IssuerStatementRecordPersisted
    private String RandomStatementID;

    private String Description = "";
    private String Identifier = "";
    private String Url = "";
    private float Quantity;
    private float UnitPrice;
    private float TotalPrice;
    private float Tax;
    private String ExtraInfo1 = "";
    private String ExtraInfo2 = "";
    private String ExtraInfo3 = "";
    private String ExtraInfo4 = "";
    private String ExtraInfo6 = "";
    private String ExtraInfo5 = "";
    private String UnitTitle = "";
    private float UnitLoyaltyPoint;
    private float LoyaltyPoint;
    private String ItemClsassification = "";
    private String ItemCategoryID = "";
    private String ItemCategoryTitle = "";

    /**
     * Defines what moment this item has been added to the bill. Combined with a charge's
     * OnlyAppliesOnceWithinMinutes, the engine can determine if a row can be added to a bill or not!
     */
    private OffsetDateTime AddedMoment;

    private String WarrantyExpiryMomentISO8601;
    private String LoyaltyPointsExpiryMomentISO8601;

    public int getStatementItemID() { return StatementItemID; }
    public void setStatementItemID(int StatementItemID) { this.StatementItemID = StatementItemID; }

    public String getRandomStatementID() { return RandomStatementID; }
    public void setRandomStatementID(String RandomStatementID) { this.RandomStatementID = RandomStatementID; }

    public String getDescription() { return Description; }
    public void setDescription(String Description) { this.Description = Description; }

    public String getIdentifier() { return Identifier; }
    public void setIdentifier(String Identifier) { this.Identifier = Identifier; }

    public String getUrl() { return Url; }
    public void setUrl(String Url) { this.Url = Url; }

    public float getQuantity() { return Quantity; }
    public void setQuantity(float Quantity) { this.Quantity = Quantity; }

    public float getUnitPrice() { return UnitPrice; }
    public void setUnitPrice(float UnitPrice) { this.UnitPrice = UnitPrice; }

    public float getTotalPrice() { return TotalPrice; }
    public void setTotalPrice(float TotalPrice) { this.TotalPrice = TotalPrice; }

    public float getTax() { return Tax; }
    public void setTax(float Tax) { this.Tax = Tax; }

    public String getExtraInfo1() { return ExtraInfo1; }
    public void setExtraInfo1(String ExtraInfo1) { this.ExtraInfo1 = ExtraInfo1; }

    public String getExtraInfo2() { return ExtraInfo2; }
    public void setExtraInfo2(String ExtraInfo2) { this.ExtraInfo2 = ExtraInfo2; }

    public String getExtraInfo3() { return ExtraInfo3; }
    public void setExtraInfo3(String ExtraInfo3) { this.ExtraInfo3 = ExtraInfo3; }

    public String getExtraInfo4() { return ExtraInfo4; }
    public void setExtraInfo4(String ExtraInfo4) { this.ExtraInfo4 = ExtraInfo4; }

    public String getExtraInfo6() { return ExtraInfo6; }
    public void setExtraInfo6(String ExtraInfo6) { this.ExtraInfo6 = ExtraInfo6; }

    public String getExtraInfo5() { return ExtraInfo5; }
    public void setExtraInfo5(String ExtraInfo5) { this.ExtraInfo5 = ExtraInfo5; }

    public String getUnitTitle() { return UnitTitle; }
    public void setUnitTitle(String UnitTitle) { this.UnitTitle = UnitTitle; }

    public float getUnitLoyaltyPoint() { return UnitLoyaltyPoint; }
    public void setUnitLoyaltyPoint(float UnitLoyaltyPoint) { this.UnitLoyaltyPoint = UnitLoyaltyPoint; }

    public float getLoyaltyPoint() { return LoyaltyPoint; }
    public void setLoyaltyPoint(float LoyaltyPoint) { this.LoyaltyPoint = LoyaltyPoint; }

    public String getItemClsassification() { return ItemClsassification; }
    public void setItemClsassification(String ItemClsassification) { this.ItemClsassification = ItemClsassification; }

    public String getItemCategoryID() { return ItemCategoryID; }
    public void setItemCategoryID(String ItemCategoryID) { this.ItemCategoryID = ItemCategoryID; }

    public String getItemCategoryTitle() { return ItemCategoryTitle; }
    public void setItemCategoryTitle(String ItemCategoryTitle) { this.ItemCategoryTitle = ItemCategoryTitle; }

    public OffsetDateTime getAddedMoment() { return AddedMoment; }
    public void setAddedMoment(OffsetDateTime AddedMoment) { this.AddedMoment = AddedMoment; }

    public String getWarrantyExpiryMomentISO8601() { return WarrantyExpiryMomentISO8601; }
    public void setWarrantyExpiryMomentISO8601(String WarrantyExpiryMomentISO8601) { this.WarrantyExpiryMomentISO8601 = WarrantyExpiryMomentISO8601; }

    public String getLoyaltyPointsExpiryMomentISO8601() { return LoyaltyPointsExpiryMomentISO8601; }
    public void setLoyaltyPointsExpiryMomentISO8601(String LoyaltyPointsExpiryMomentISO8601) { this.LoyaltyPointsExpiryMomentISO8601 = LoyaltyPointsExpiryMomentISO8601; }
}
