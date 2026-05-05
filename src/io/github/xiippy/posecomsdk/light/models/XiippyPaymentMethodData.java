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

public class XiippyPaymentMethodData {

    private String Cryptogram;
    private String EncryptedTrack2;
    private boolean IsInterac;
    private String Ksn;
    private XiippyReadMethod ReadMethod;
    private XiippySwipeReason SwipeReason;
    private String Tlv;
    private String Track2;

    public String getCryptogram() { return Cryptogram; }
    public void setCryptogram(String Cryptogram) { this.Cryptogram = Cryptogram; }

    public String getEncryptedTrack2() { return EncryptedTrack2; }
    public void setEncryptedTrack2(String EncryptedTrack2) { this.EncryptedTrack2 = EncryptedTrack2; }

    public boolean getIsInterac() { return IsInterac; }
    public void setIsInterac(boolean IsInterac) { this.IsInterac = IsInterac; }

    public String getKsn() { return Ksn; }
    public void setKsn(String Ksn) { this.Ksn = Ksn; }

    public XiippyReadMethod getReadMethod() { return ReadMethod; }
    public void setReadMethod(XiippyReadMethod ReadMethod) { this.ReadMethod = ReadMethod; }

    public XiippySwipeReason getSwipeReason() { return SwipeReason; }
    public void setSwipeReason(XiippySwipeReason SwipeReason) { this.SwipeReason = SwipeReason; }

    public String getTlv() { return Tlv; }
    public void setTlv(String Tlv) { this.Tlv = Tlv; }

    public String getTrack2() { return Track2; }
    public void setTrack2(String Track2) { this.Track2 = Track2; }
}
