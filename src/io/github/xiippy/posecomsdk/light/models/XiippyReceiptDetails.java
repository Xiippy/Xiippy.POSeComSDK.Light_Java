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

public class XiippyReceiptDetails {

    private String Tsi;
    private String DedicatedFileName;
    private String Cvm;
    private String AuthorizationResponseCode;
    private String AuthorizationCode;
    private String ApplicationPreferredName;
    private String ApplicationCryptogram;
    private String AccountType;
    private String Tvr;

    public String getTsi() { return Tsi; }
    public void setTsi(String Tsi) { this.Tsi = Tsi; }

    public String getDedicatedFileName() { return DedicatedFileName; }
    public void setDedicatedFileName(String DedicatedFileName) { this.DedicatedFileName = DedicatedFileName; }

    public String getCvm() { return Cvm; }
    public void setCvm(String Cvm) { this.Cvm = Cvm; }

    public String getAuthorizationResponseCode() { return AuthorizationResponseCode; }
    public void setAuthorizationResponseCode(String AuthorizationResponseCode) { this.AuthorizationResponseCode = AuthorizationResponseCode; }

    public String getAuthorizationCode() { return AuthorizationCode; }
    public void setAuthorizationCode(String AuthorizationCode) { this.AuthorizationCode = AuthorizationCode; }

    public String getApplicationPreferredName() { return ApplicationPreferredName; }
    public void setApplicationPreferredName(String ApplicationPreferredName) { this.ApplicationPreferredName = ApplicationPreferredName; }

    public String getApplicationCryptogram() { return ApplicationCryptogram; }
    public void setApplicationCryptogram(String ApplicationCryptogram) { this.ApplicationCryptogram = ApplicationCryptogram; }

    public String getAccountType() { return AccountType; }
    public void setAccountType(String AccountType) { this.AccountType = AccountType; }

    public String getTvr() { return Tvr; }
    public void setTvr(String Tvr) { this.Tvr = Tvr; }
}
