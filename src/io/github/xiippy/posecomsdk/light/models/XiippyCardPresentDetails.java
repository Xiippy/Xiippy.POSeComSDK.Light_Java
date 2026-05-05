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

public class XiippyCardPresentDetails {

    private String GeneratedCard;
    private String Funding;
    private String Fingerprint;
    private int ExpYear;
    private int ExpMonth;
    private String EmvAuthData;
    private String Country;
    private String CardholderName;
    private String Brand;
    private XiippyReceiptDetails ReceiptDetails;
    private String Last4;
    private String ReadMethod;

    /**
     * The retailer card id, privately issued to the merchant chain or retailer group
     */
    private String RetailerCardID;

    // region serverside
    private String Description;
    private String Iin;
    private String Issuer;
    private Boolean Moto;
    private String Network;
    // endregion serverside

    public String getGeneratedCard() { return GeneratedCard; }
    public void setGeneratedCard(String GeneratedCard) { this.GeneratedCard = GeneratedCard; }

    public String getFunding() { return Funding; }
    public void setFunding(String Funding) { this.Funding = Funding; }

    public String getFingerprint() { return Fingerprint; }
    public void setFingerprint(String Fingerprint) { this.Fingerprint = Fingerprint; }

    public int getExpYear() { return ExpYear; }
    public void setExpYear(int ExpYear) { this.ExpYear = ExpYear; }

    public int getExpMonth() { return ExpMonth; }
    public void setExpMonth(int ExpMonth) { this.ExpMonth = ExpMonth; }

    public String getEmvAuthData() { return EmvAuthData; }
    public void setEmvAuthData(String EmvAuthData) { this.EmvAuthData = EmvAuthData; }

    public String getCountry() { return Country; }
    public void setCountry(String Country) { this.Country = Country; }

    public String getCardholderName() { return CardholderName; }
    public void setCardholderName(String CardholderName) { this.CardholderName = CardholderName; }

    public String getBrand() { return Brand; }
    public void setBrand(String Brand) { this.Brand = Brand; }

    public XiippyReceiptDetails getReceiptDetails() { return ReceiptDetails; }
    public void setReceiptDetails(XiippyReceiptDetails ReceiptDetails) { this.ReceiptDetails = ReceiptDetails; }

    public String getLast4() { return Last4; }
    public void setLast4(String Last4) { this.Last4 = Last4; }

    public String getReadMethod() { return ReadMethod; }
    public void setReadMethod(String ReadMethod) { this.ReadMethod = ReadMethod; }

    public String getRetailerCardID() { return RetailerCardID; }
    public void setRetailerCardID(String RetailerCardID) { this.RetailerCardID = RetailerCardID; }

    public String getDescription() { return Description; }
    public void setDescription(String Description) { this.Description = Description; }

    public String getIin() { return Iin; }
    public void setIin(String Iin) { this.Iin = Iin; }

    public String getIssuer() { return Issuer; }
    public void setIssuer(String Issuer) { this.Issuer = Issuer; }

    public Boolean getMoto() { return Moto; }
    public void setMoto(Boolean Moto) { this.Moto = Moto; }

    public String getNetwork() { return Network; }
    public void setNetwork(String Network) { this.Network = Network; }
}
