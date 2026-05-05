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

public class TotalBillVariation {

    private String TotalBillVariationID;

    // foreign key
    private String RandomStatementID;

    private String Description;
    private Float TotalAmountVariationCoefficientAfterTax;
    private Float TotalAmountVariationCoefficientAfterTaxInputValueCap;
    private Float TotalAmountVariationCoefficientBeforeTax;
    private Float TotalAmountVariationCoefficientBeforeCap;
    private Float TotalAmountVariationFixedAmountAfterTax;
    private Float TotalAmountVariationFixedAmountAfterTaxCap;
    private Float TotalAmountVariationFixedAmountBeforeTax;
    private Float TotalAmountVariationFixedAmountBeforeTaxCap;

    public String getTotalBillVariationID() { return TotalBillVariationID; }
    public void setTotalBillVariationID(String TotalBillVariationID) { this.TotalBillVariationID = TotalBillVariationID; }

    public String getRandomStatementID() { return RandomStatementID; }
    public void setRandomStatementID(String RandomStatementID) { this.RandomStatementID = RandomStatementID; }

    public String getDescription() { return Description; }
    public void setDescription(String Description) { this.Description = Description; }

    public Float getTotalAmountVariationCoefficientAfterTax() { return TotalAmountVariationCoefficientAfterTax; }
    public void setTotalAmountVariationCoefficientAfterTax(Float TotalAmountVariationCoefficientAfterTax) { this.TotalAmountVariationCoefficientAfterTax = TotalAmountVariationCoefficientAfterTax; }

    public Float getTotalAmountVariationCoefficientAfterTaxInputValueCap() { return TotalAmountVariationCoefficientAfterTaxInputValueCap; }
    public void setTotalAmountVariationCoefficientAfterTaxInputValueCap(Float TotalAmountVariationCoefficientAfterTaxInputValueCap) { this.TotalAmountVariationCoefficientAfterTaxInputValueCap = TotalAmountVariationCoefficientAfterTaxInputValueCap; }

    public Float getTotalAmountVariationCoefficientBeforeTax() { return TotalAmountVariationCoefficientBeforeTax; }
    public void setTotalAmountVariationCoefficientBeforeTax(Float TotalAmountVariationCoefficientBeforeTax) { this.TotalAmountVariationCoefficientBeforeTax = TotalAmountVariationCoefficientBeforeTax; }

    public Float getTotalAmountVariationCoefficientBeforeCap() { return TotalAmountVariationCoefficientBeforeCap; }
    public void setTotalAmountVariationCoefficientBeforeCap(Float TotalAmountVariationCoefficientBeforeCap) { this.TotalAmountVariationCoefficientBeforeCap = TotalAmountVariationCoefficientBeforeCap; }

    public Float getTotalAmountVariationFixedAmountAfterTax() { return TotalAmountVariationFixedAmountAfterTax; }
    public void setTotalAmountVariationFixedAmountAfterTax(Float TotalAmountVariationFixedAmountAfterTax) { this.TotalAmountVariationFixedAmountAfterTax = TotalAmountVariationFixedAmountAfterTax; }

    public Float getTotalAmountVariationFixedAmountAfterTaxCap() { return TotalAmountVariationFixedAmountAfterTaxCap; }
    public void setTotalAmountVariationFixedAmountAfterTaxCap(Float TotalAmountVariationFixedAmountAfterTaxCap) { this.TotalAmountVariationFixedAmountAfterTaxCap = TotalAmountVariationFixedAmountAfterTaxCap; }

    public Float getTotalAmountVariationFixedAmountBeforeTax() { return TotalAmountVariationFixedAmountBeforeTax; }
    public void setTotalAmountVariationFixedAmountBeforeTax(Float TotalAmountVariationFixedAmountBeforeTax) { this.TotalAmountVariationFixedAmountBeforeTax = TotalAmountVariationFixedAmountBeforeTax; }

    public Float getTotalAmountVariationFixedAmountBeforeTaxCap() { return TotalAmountVariationFixedAmountBeforeTaxCap; }
    public void setTotalAmountVariationFixedAmountBeforeTaxCap(Float TotalAmountVariationFixedAmountBeforeTaxCap) { this.TotalAmountVariationFixedAmountBeforeTaxCap = TotalAmountVariationFixedAmountBeforeTaxCap; }
}
