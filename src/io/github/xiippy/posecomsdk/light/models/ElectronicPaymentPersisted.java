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

import java.util.HashMap;
import java.util.Map;

public class ElectronicPaymentPersisted {

    private long ElectronicPaymentID;
    private String RandomStatementID;
    private String Bank = "";
    private String MerchantAccountOwnerDetail = "";
    private String Terminal = "";
    private String Reference = "";
    private String CardNO = "";
    private String AccountType = "";
    private String CardExpiry = "";
    private String Aid = "";
    private String Atc = "";
    private String Tvr = "";
    private String Csn = "";
    private String AuthNo = "";
    private String PosRefNo = "";
    private String MAccountNumber = "";
    private String Mrrn = "";
    private String Mauth = "";
    private String PaymentType = "";
    private String MLocationCode = "";
    private String MAccountType = "";
    private String Apsn = "";
    private String Arqc = "";
    private String CurrencyCode = "";
    private String ExtraInfo1 = "";
    private String ExtraInfo2 = "";
    private String ExtraInfo3 = "";
    private String ExtraInfo4 = "";
    private String ExtraInfo5 = "";
    private String ExtraInfo6 = "";
    private String ExtraInfo7 = "";
    private String ExtraInfo8 = "";
    private String ExtraInfo9 = "";
    private String ExtraInfo10 = "";
    private float Purchase;
    private float Total;
    private String TransactionType = "";
    private String StatusId = "";
    private String TxnStatusId = "";
    private String Complete = "";
    private String StatementText = "";
    private boolean ApprovedFlag;
    private String ExpectedSettlementDate = "";
    private String ExpectedSettlementDateTimeZone = "";
    private String DateOfTransaction = "";
    private String DateOfTransactionTimeZone = "";
    private String Stan = "";
    private String DpsBillingId = "";
    private String ResponseCode = "";
    private String ResponseText = "";
    private float AmtSurcgarge;
    private float AmtTip;
    private float AmtCashOut;
    private String CardType = "";
    private Map<String, String> MetaDataExtras;
    private String Tsi;
    private String DedicatedFileName;
    private String Cvm;
    private String AuthorizationCode;
    private String ApplicationPreferredName;

    public long getElectronicPaymentID() { return ElectronicPaymentID; }
    public void setElectronicPaymentID(long ElectronicPaymentID) { this.ElectronicPaymentID = ElectronicPaymentID; }

    public String getRandomStatementID() { return RandomStatementID; }
    public void setRandomStatementID(String RandomStatementID) { this.RandomStatementID = RandomStatementID; }

    public String getBank() { return Bank; }
    public void setBank(String Bank) { this.Bank = Bank; }

    public String getMerchantAccountOwnerDetail() { return MerchantAccountOwnerDetail; }
    public void setMerchantAccountOwnerDetail(String MerchantAccountOwnerDetail) { this.MerchantAccountOwnerDetail = MerchantAccountOwnerDetail; }

    public String getTerminal() { return Terminal; }
    public void setTerminal(String Terminal) { this.Terminal = Terminal; }

    public String getReference() { return Reference; }
    public void setReference(String Reference) { this.Reference = Reference; }

    public String getCardNO() { return CardNO; }
    public void setCardNO(String CardNO) { this.CardNO = CardNO; }

    public String getAccountType() { return AccountType; }
    public void setAccountType(String AccountType) { this.AccountType = AccountType; }

    public String getCardExpiry() { return CardExpiry; }
    public void setCardExpiry(String CardExpiry) { this.CardExpiry = CardExpiry; }

    public String getAid() { return Aid; }
    public void setAid(String Aid) { this.Aid = Aid; }

    public String getAtc() { return Atc; }
    public void setAtc(String Atc) { this.Atc = Atc; }

    public String getTvr() { return Tvr; }
    public void setTvr(String Tvr) { this.Tvr = Tvr; }

    public String getCsn() { return Csn; }
    public void setCsn(String Csn) { this.Csn = Csn; }

    public String getAuthNo() { return AuthNo; }
    public void setAuthNo(String AuthNo) { this.AuthNo = AuthNo; }

    public String getPosRefNo() { return PosRefNo; }
    public void setPosRefNo(String PosRefNo) { this.PosRefNo = PosRefNo; }

    public String getMAccountNumber() { return MAccountNumber; }
    public void setMAccountNumber(String MAccountNumber) { this.MAccountNumber = MAccountNumber; }

    public String getMrrn() { return Mrrn; }
    public void setMrrn(String Mrrn) { this.Mrrn = Mrrn; }

    public String getMauth() { return Mauth; }
    public void setMauth(String Mauth) { this.Mauth = Mauth; }

    public String getPaymentType() { return PaymentType; }
    public void setPaymentType(String PaymentType) { this.PaymentType = PaymentType; }

    public String getMLocationCode() { return MLocationCode; }
    public void setMLocationCode(String MLocationCode) { this.MLocationCode = MLocationCode; }

    public String getMAccountType() { return MAccountType; }
    public void setMAccountType(String MAccountType) { this.MAccountType = MAccountType; }

    public String getApsn() { return Apsn; }
    public void setApsn(String Apsn) { this.Apsn = Apsn; }

    public String getArqc() { return Arqc; }
    public void setArqc(String Arqc) { this.Arqc = Arqc; }

    public String getCurrencyCode() { return CurrencyCode; }
    public void setCurrencyCode(String CurrencyCode) { this.CurrencyCode = CurrencyCode; }

    public String getExtraInfo1() { return ExtraInfo1; }
    public void setExtraInfo1(String ExtraInfo1) { this.ExtraInfo1 = ExtraInfo1; }

    public String getExtraInfo2() { return ExtraInfo2; }
    public void setExtraInfo2(String ExtraInfo2) { this.ExtraInfo2 = ExtraInfo2; }

    public String getExtraInfo3() { return ExtraInfo3; }
    public void setExtraInfo3(String ExtraInfo3) { this.ExtraInfo3 = ExtraInfo3; }

    public String getExtraInfo4() { return ExtraInfo4; }
    public void setExtraInfo4(String ExtraInfo4) { this.ExtraInfo4 = ExtraInfo4; }

    public String getExtraInfo5() { return ExtraInfo5; }
    public void setExtraInfo5(String ExtraInfo5) { this.ExtraInfo5 = ExtraInfo5; }

    public String getExtraInfo6() { return ExtraInfo6; }
    public void setExtraInfo6(String ExtraInfo6) { this.ExtraInfo6 = ExtraInfo6; }

    public String getExtraInfo7() { return ExtraInfo7; }
    public void setExtraInfo7(String ExtraInfo7) { this.ExtraInfo7 = ExtraInfo7; }

    public String getExtraInfo8() { return ExtraInfo8; }
    public void setExtraInfo8(String ExtraInfo8) { this.ExtraInfo8 = ExtraInfo8; }

    public String getExtraInfo9() { return ExtraInfo9; }
    public void setExtraInfo9(String ExtraInfo9) { this.ExtraInfo9 = ExtraInfo9; }

    public String getExtraInfo10() { return ExtraInfo10; }
    public void setExtraInfo10(String ExtraInfo10) { this.ExtraInfo10 = ExtraInfo10; }

    public float getPurchase() { return Purchase; }
    public void setPurchase(float Purchase) { this.Purchase = Purchase; }

    public float getTotal() { return Total; }
    public void setTotal(float Total) { this.Total = Total; }

    public String getTransactionType() { return TransactionType; }
    public void setTransactionType(String TransactionType) { this.TransactionType = TransactionType; }

    public String getStatusId() { return StatusId; }
    public void setStatusId(String StatusId) { this.StatusId = StatusId; }

    public String getTxnStatusId() { return TxnStatusId; }
    public void setTxnStatusId(String TxnStatusId) { this.TxnStatusId = TxnStatusId; }

    public String getComplete() { return Complete; }
    public void setComplete(String Complete) { this.Complete = Complete; }

    public String getStatementText() { return StatementText; }
    public void setStatementText(String StatementText) { this.StatementText = StatementText; }

    public boolean getApprovedFlag() { return ApprovedFlag; }
    public void setApprovedFlag(boolean ApprovedFlag) { this.ApprovedFlag = ApprovedFlag; }

    public String getExpectedSettlementDate() { return ExpectedSettlementDate; }
    public void setExpectedSettlementDate(String ExpectedSettlementDate) { this.ExpectedSettlementDate = ExpectedSettlementDate; }

    public String getExpectedSettlementDateTimeZone() { return ExpectedSettlementDateTimeZone; }
    public void setExpectedSettlementDateTimeZone(String ExpectedSettlementDateTimeZone) { this.ExpectedSettlementDateTimeZone = ExpectedSettlementDateTimeZone; }

    public String getDateOfTransaction() { return DateOfTransaction; }
    public void setDateOfTransaction(String DateOfTransaction) { this.DateOfTransaction = DateOfTransaction; }

    public String getDateOfTransactionTimeZone() { return DateOfTransactionTimeZone; }
    public void setDateOfTransactionTimeZone(String DateOfTransactionTimeZone) { this.DateOfTransactionTimeZone = DateOfTransactionTimeZone; }

    public String getStan() { return Stan; }
    public void setStan(String Stan) { this.Stan = Stan; }

    public String getDpsBillingId() { return DpsBillingId; }
    public void setDpsBillingId(String DpsBillingId) { this.DpsBillingId = DpsBillingId; }

    public String getResponseCode() { return ResponseCode; }
    public void setResponseCode(String ResponseCode) { this.ResponseCode = ResponseCode; }

    public String getResponseText() { return ResponseText; }
    public void setResponseText(String ResponseText) { this.ResponseText = ResponseText; }

    public float getAmtSurcgarge() { return AmtSurcgarge; }
    public void setAmtSurcgarge(float AmtSurcgarge) { this.AmtSurcgarge = AmtSurcgarge; }

    public float getAmtTip() { return AmtTip; }
    public void setAmtTip(float AmtTip) { this.AmtTip = AmtTip; }

    public float getAmtCashOut() { return AmtCashOut; }
    public void setAmtCashOut(float AmtCashOut) { this.AmtCashOut = AmtCashOut; }

    public String getCardType() { return CardType; }
    public void setCardType(String CardType) { this.CardType = CardType; }

    public Map<String, String> getMetaDataExtras() { return MetaDataExtras; }
    public void setMetaDataExtras(Map<String, String> MetaDataExtras) { this.MetaDataExtras = MetaDataExtras; }

    public String getTsi() { return Tsi; }
    public void setTsi(String Tsi) { this.Tsi = Tsi; }

    public String getDedicatedFileName() { return DedicatedFileName; }
    public void setDedicatedFileName(String DedicatedFileName) { this.DedicatedFileName = DedicatedFileName; }

    public String getCvm() { return Cvm; }
    public void setCvm(String Cvm) { this.Cvm = Cvm; }

    public String getAuthorizationCode() { return AuthorizationCode; }
    public void setAuthorizationCode(String AuthorizationCode) { this.AuthorizationCode = AuthorizationCode; }

    public String getApplicationPreferredName() { return ApplicationPreferredName; }
    public void setApplicationPreferredName(String ApplicationPreferredName) { this.ApplicationPreferredName = ApplicationPreferredName; }
}
