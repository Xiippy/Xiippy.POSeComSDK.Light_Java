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

import java.util.Map;

public class XiippyCharge {

    // region MW
    private int ResponseCode;
    private String AuthSettledDate;
    private String AuthMessage;
    // endregion MW

    private long Amount;
    private long AmountRefunded;
    private String Application;
    private String ApplicationFee;
    private Long ApplicationFeeAmount;
    private String BalanceTransaction;
    private boolean Captured;
    private long Created;
    private String Currency;
    private String Customer;
    private String Description;
    private String Dispute;
    private String FailureCode;
    private String FailureMessage;
    private String Id;
    private String Invoice;
    private String ReceiptNumber;
    private String Transfer;
    private String Status;
    private String StatementDescriptor;
    private String Review;
    private boolean Refunded;
    private String ReceiptUrl;
    private boolean Livemode;
    private String TransferGroup;
    private String PaymentMethodId;
    private XiippyPaymentMethodDetails PaymentMethodDetails;
    private String PaymentIntentId;
    private boolean Paid;
    private String Order;
    private String OnBehalfOf;
    private Map<String, String> Metadata;
    private String ReceiptEmail;

    // region serverside
    private String TransferId;
    private long AmountCaptured;
    private String StatementDescriptorSuffix;
    private String SourceTransferId;
    private String ReviewId;
    private String PaymentMethod;
    private String Object;
    private String OnBehalfOfId;
    private String OrderId;
    private String InvoiceId;
    private String DestinationId;
    private boolean Disputed;
    private String DisputeId;
    private String CustomerId;
    private String ApplicationFeeId;
    private String ApplicationId;
    private String AuthorizationCode;
    private String BalanceTransactionId;
    private String CalculatedStatementDescriptor;
    private XiippyChargeOutcome Outcome;
    // endregion serverside

    public int getResponseCode() { return ResponseCode; }
    public void setResponseCode(int ResponseCode) { this.ResponseCode = ResponseCode; }

    public String getAuthSettledDate() { return AuthSettledDate; }
    public void setAuthSettledDate(String AuthSettledDate) { this.AuthSettledDate = AuthSettledDate; }

    public String getAuthMessage() { return AuthMessage; }
    public void setAuthMessage(String AuthMessage) { this.AuthMessage = AuthMessage; }

    public long getAmount() { return Amount; }
    public void setAmount(long Amount) { this.Amount = Amount; }

    public long getAmountRefunded() { return AmountRefunded; }
    public void setAmountRefunded(long AmountRefunded) { this.AmountRefunded = AmountRefunded; }

    public String getApplication() { return Application; }
    public void setApplication(String Application) { this.Application = Application; }

    public String getApplicationFee() { return ApplicationFee; }
    public void setApplicationFee(String ApplicationFee) { this.ApplicationFee = ApplicationFee; }

    public Long getApplicationFeeAmount() { return ApplicationFeeAmount; }
    public void setApplicationFeeAmount(Long ApplicationFeeAmount) { this.ApplicationFeeAmount = ApplicationFeeAmount; }

    public String getBalanceTransaction() { return BalanceTransaction; }
    public void setBalanceTransaction(String BalanceTransaction) { this.BalanceTransaction = BalanceTransaction; }

    public boolean getCaptured() { return Captured; }
    public void setCaptured(boolean Captured) { this.Captured = Captured; }

    public long getCreated() { return Created; }
    public void setCreated(long Created) { this.Created = Created; }

    public String getCurrency() { return Currency; }
    public void setCurrency(String Currency) { this.Currency = Currency; }

    public String getCustomer() { return Customer; }
    public void setCustomer(String Customer) { this.Customer = Customer; }

    public String getDescription() { return Description; }
    public void setDescription(String Description) { this.Description = Description; }

    public String getDispute() { return Dispute; }
    public void setDispute(String Dispute) { this.Dispute = Dispute; }

    public String getFailureCode() { return FailureCode; }
    public void setFailureCode(String FailureCode) { this.FailureCode = FailureCode; }

    public String getFailureMessage() { return FailureMessage; }
    public void setFailureMessage(String FailureMessage) { this.FailureMessage = FailureMessage; }

    public String getId() { return Id; }
    public void setId(String Id) { this.Id = Id; }

    public String getInvoice() { return Invoice; }
    public void setInvoice(String Invoice) { this.Invoice = Invoice; }

    public String getReceiptNumber() { return ReceiptNumber; }
    public void setReceiptNumber(String ReceiptNumber) { this.ReceiptNumber = ReceiptNumber; }

    public String getTransfer() { return Transfer; }
    public void setTransfer(String Transfer) { this.Transfer = Transfer; }

    public String getStatus() { return Status; }
    public void setStatus(String Status) { this.Status = Status; }

    public String getStatementDescriptor() { return StatementDescriptor; }
    public void setStatementDescriptor(String StatementDescriptor) { this.StatementDescriptor = StatementDescriptor; }

    public String getReview() { return Review; }
    public void setReview(String Review) { this.Review = Review; }

    public boolean getRefunded() { return Refunded; }
    public void setRefunded(boolean Refunded) { this.Refunded = Refunded; }

    public String getReceiptUrl() { return ReceiptUrl; }
    public void setReceiptUrl(String ReceiptUrl) { this.ReceiptUrl = ReceiptUrl; }

    public boolean getLivemode() { return Livemode; }
    public void setLivemode(boolean Livemode) { this.Livemode = Livemode; }

    public String getTransferGroup() { return TransferGroup; }
    public void setTransferGroup(String TransferGroup) { this.TransferGroup = TransferGroup; }

    public String getPaymentMethodId() { return PaymentMethodId; }
    public void setPaymentMethodId(String PaymentMethodId) { this.PaymentMethodId = PaymentMethodId; }

    public XiippyPaymentMethodDetails getPaymentMethodDetails() { return PaymentMethodDetails; }
    public void setPaymentMethodDetails(XiippyPaymentMethodDetails PaymentMethodDetails) { this.PaymentMethodDetails = PaymentMethodDetails; }

    public String getPaymentIntentId() { return PaymentIntentId; }
    public void setPaymentIntentId(String PaymentIntentId) { this.PaymentIntentId = PaymentIntentId; }

    public boolean getPaid() { return Paid; }
    public void setPaid(boolean Paid) { this.Paid = Paid; }

    public String getOrder() { return Order; }
    public void setOrder(String Order) { this.Order = Order; }

    public String getOnBehalfOf() { return OnBehalfOf; }
    public void setOnBehalfOf(String OnBehalfOf) { this.OnBehalfOf = OnBehalfOf; }

    public Map<String, String> getMetadata() { return Metadata; }
    public void setMetadata(Map<String, String> Metadata) { this.Metadata = Metadata; }

    public String getReceiptEmail() { return ReceiptEmail; }
    public void setReceiptEmail(String ReceiptEmail) { this.ReceiptEmail = ReceiptEmail; }

    public String getTransferId() { return TransferId; }
    public void setTransferId(String TransferId) { this.TransferId = TransferId; }

    public long getAmountCaptured() { return AmountCaptured; }
    public void setAmountCaptured(long AmountCaptured) { this.AmountCaptured = AmountCaptured; }

    public String getStatementDescriptorSuffix() { return StatementDescriptorSuffix; }
    public void setStatementDescriptorSuffix(String StatementDescriptorSuffix) { this.StatementDescriptorSuffix = StatementDescriptorSuffix; }

    public String getSourceTransferId() { return SourceTransferId; }
    public void setSourceTransferId(String SourceTransferId) { this.SourceTransferId = SourceTransferId; }

    public String getReviewId() { return ReviewId; }
    public void setReviewId(String ReviewId) { this.ReviewId = ReviewId; }

    public String getPaymentMethod() { return PaymentMethod; }
    public void setPaymentMethod(String PaymentMethod) { this.PaymentMethod = PaymentMethod; }

    public String getObject() { return Object; }
    public void setObject(String Object) { this.Object = Object; }

    public String getOnBehalfOfId() { return OnBehalfOfId; }
    public void setOnBehalfOfId(String OnBehalfOfId) { this.OnBehalfOfId = OnBehalfOfId; }

    public String getOrderId() { return OrderId; }
    public void setOrderId(String OrderId) { this.OrderId = OrderId; }

    public String getInvoiceId() { return InvoiceId; }
    public void setInvoiceId(String InvoiceId) { this.InvoiceId = InvoiceId; }

    public String getDestinationId() { return DestinationId; }
    public void setDestinationId(String DestinationId) { this.DestinationId = DestinationId; }

    public boolean getDisputed() { return Disputed; }
    public void setDisputed(boolean Disputed) { this.Disputed = Disputed; }

    public String getDisputeId() { return DisputeId; }
    public void setDisputeId(String DisputeId) { this.DisputeId = DisputeId; }

    public String getCustomerId() { return CustomerId; }
    public void setCustomerId(String CustomerId) { this.CustomerId = CustomerId; }

    public String getApplicationFeeId() { return ApplicationFeeId; }
    public void setApplicationFeeId(String ApplicationFeeId) { this.ApplicationFeeId = ApplicationFeeId; }

    public String getApplicationId() { return ApplicationId; }
    public void setApplicationId(String ApplicationId) { this.ApplicationId = ApplicationId; }

    public String getAuthorizationCode() { return AuthorizationCode; }
    public void setAuthorizationCode(String AuthorizationCode) { this.AuthorizationCode = AuthorizationCode; }

    public String getBalanceTransactionId() { return BalanceTransactionId; }
    public void setBalanceTransactionId(String BalanceTransactionId) { this.BalanceTransactionId = BalanceTransactionId; }

    public String getCalculatedStatementDescriptor() { return CalculatedStatementDescriptor; }
    public void setCalculatedStatementDescriptor(String CalculatedStatementDescriptor) { this.CalculatedStatementDescriptor = CalculatedStatementDescriptor; }

    public XiippyChargeOutcome getOutcome() { return Outcome; }
    public void setOutcome(XiippyChargeOutcome Outcome) { this.Outcome = Outcome; }
}
