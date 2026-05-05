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
import java.util.Map;

public class XiippyPaymentContext {

    // region MW
    private String MWTransactionID;
    // endregion MW

    private String Currency;
    private long Amount;
    private long AmountCapturable;
    private long AmountReceived;
    private String Application;
    private Long ApplicationFeeAmount;
    private Long CanceledAt;
    private String CancellationReason;
    private String CaptureMethod;
    private List<XiippyCharge> Charges;
    private String ClientSecret;
    private String ConfirmationMethod;
    private long Created;
    private String TransferGroup;
    private String Description;
    private String Id;
    private String Invoice;
    private XiippyApiError LastPaymentError;
    private boolean Livemode;
    private Map<String, String> Metadata;
    private String OnBehalfOf;
    private XiippyPaymentMethodData PaymentMethodData;
    private String PaymentMethodId;
    private String ReceiptEmail;
    private String Review;
    private String StatementDescriptor;
    private XiippyPaymentContextStatus Status;
    private String Customer;

    // region serverside
    private String Object;
    private String ReviewId;
    private String SetupFutureUsage;
    private String SourceId;
    private List<String> PaymentMethodTypes;
    private String StatementDescriptorSuffix;
    private String CustomerId;
    private String OnBehalfOfId;
    private String ApplicationId;
    private String InvoiceId;
    private String _OriginalJason;
    // endregion serverside

    public String getMWTransactionID() { return MWTransactionID; }
    public void setMWTransactionID(String MWTransactionID) { this.MWTransactionID = MWTransactionID; }

    public String getCurrency() { return Currency; }
    public void setCurrency(String Currency) { this.Currency = Currency; }

    public long getAmount() { return Amount; }
    public void setAmount(long Amount) { this.Amount = Amount; }

    public long getAmountCapturable() { return AmountCapturable; }
    public void setAmountCapturable(long AmountCapturable) { this.AmountCapturable = AmountCapturable; }

    public long getAmountReceived() { return AmountReceived; }
    public void setAmountReceived(long AmountReceived) { this.AmountReceived = AmountReceived; }

    public String getApplication() { return Application; }
    public void setApplication(String Application) { this.Application = Application; }

    public Long getApplicationFeeAmount() { return ApplicationFeeAmount; }
    public void setApplicationFeeAmount(Long ApplicationFeeAmount) { this.ApplicationFeeAmount = ApplicationFeeAmount; }

    public Long getCanceledAt() { return CanceledAt; }
    public void setCanceledAt(Long CanceledAt) { this.CanceledAt = CanceledAt; }

    public String getCancellationReason() { return CancellationReason; }
    public void setCancellationReason(String CancellationReason) { this.CancellationReason = CancellationReason; }

    public String getCaptureMethod() { return CaptureMethod; }
    public void setCaptureMethod(String CaptureMethod) { this.CaptureMethod = CaptureMethod; }

    public List<XiippyCharge> getCharges() { return Charges; }
    public void setCharges(List<XiippyCharge> Charges) { this.Charges = Charges; }

    public String getClientSecret() { return ClientSecret; }
    public void setClientSecret(String ClientSecret) { this.ClientSecret = ClientSecret; }

    public String getConfirmationMethod() { return ConfirmationMethod; }
    public void setConfirmationMethod(String ConfirmationMethod) { this.ConfirmationMethod = ConfirmationMethod; }

    public long getCreated() { return Created; }
    public void setCreated(long Created) { this.Created = Created; }

    public String getTransferGroup() { return TransferGroup; }
    public void setTransferGroup(String TransferGroup) { this.TransferGroup = TransferGroup; }

    public String getDescription() { return Description; }
    public void setDescription(String Description) { this.Description = Description; }

    public String getId() { return Id; }
    public void setId(String Id) { this.Id = Id; }

    public String getInvoice() { return Invoice; }
    public void setInvoice(String Invoice) { this.Invoice = Invoice; }

    public XiippyApiError getLastPaymentError() { return LastPaymentError; }
    public void setLastPaymentError(XiippyApiError LastPaymentError) { this.LastPaymentError = LastPaymentError; }

    public boolean getLivemode() { return Livemode; }
    public void setLivemode(boolean Livemode) { this.Livemode = Livemode; }

    public Map<String, String> getMetadata() { return Metadata; }
    public void setMetadata(Map<String, String> Metadata) { this.Metadata = Metadata; }

    public String getOnBehalfOf() { return OnBehalfOf; }
    public void setOnBehalfOf(String OnBehalfOf) { this.OnBehalfOf = OnBehalfOf; }

    public XiippyPaymentMethodData getPaymentMethodData() { return PaymentMethodData; }
    public void setPaymentMethodData(XiippyPaymentMethodData PaymentMethodData) { this.PaymentMethodData = PaymentMethodData; }

    public String getPaymentMethodId() { return PaymentMethodId; }
    public void setPaymentMethodId(String PaymentMethodId) { this.PaymentMethodId = PaymentMethodId; }

    public String getReceiptEmail() { return ReceiptEmail; }
    public void setReceiptEmail(String ReceiptEmail) { this.ReceiptEmail = ReceiptEmail; }

    public String getReview() { return Review; }
    public void setReview(String Review) { this.Review = Review; }

    public String getStatementDescriptor() { return StatementDescriptor; }
    public void setStatementDescriptor(String StatementDescriptor) { this.StatementDescriptor = StatementDescriptor; }

    public XiippyPaymentContextStatus getStatus() { return Status; }
    public void setStatus(XiippyPaymentContextStatus Status) { this.Status = Status; }

    public String getCustomer() { return Customer; }
    public void setCustomer(String Customer) { this.Customer = Customer; }

    public String getObject() { return Object; }
    public void setObject(String Object) { this.Object = Object; }

    public String getReviewId() { return ReviewId; }
    public void setReviewId(String ReviewId) { this.ReviewId = ReviewId; }

    public String getSetupFutureUsage() { return SetupFutureUsage; }
    public void setSetupFutureUsage(String SetupFutureUsage) { this.SetupFutureUsage = SetupFutureUsage; }

    public String getSourceId() { return SourceId; }
    public void setSourceId(String SourceId) { this.SourceId = SourceId; }

    public List<String> getPaymentMethodTypes() { return PaymentMethodTypes; }
    public void setPaymentMethodTypes(List<String> PaymentMethodTypes) { this.PaymentMethodTypes = PaymentMethodTypes; }

    public String getStatementDescriptorSuffix() { return StatementDescriptorSuffix; }
    public void setStatementDescriptorSuffix(String StatementDescriptorSuffix) { this.StatementDescriptorSuffix = StatementDescriptorSuffix; }

    public String getCustomerId() { return CustomerId; }
    public void setCustomerId(String CustomerId) { this.CustomerId = CustomerId; }

    public String getOnBehalfOfId() { return OnBehalfOfId; }
    public void setOnBehalfOfId(String OnBehalfOfId) { this.OnBehalfOfId = OnBehalfOfId; }

    public String getApplicationId() { return ApplicationId; }
    public void setApplicationId(String ApplicationId) { this.ApplicationId = ApplicationId; }

    public String getInvoiceId() { return InvoiceId; }
    public void setInvoiceId(String InvoiceId) { this.InvoiceId = InvoiceId; }

    public String get_OriginalJason() { return _OriginalJason; }
    public void set_OriginalJason(String _OriginalJason) { this._OriginalJason = _OriginalJason; }
}
