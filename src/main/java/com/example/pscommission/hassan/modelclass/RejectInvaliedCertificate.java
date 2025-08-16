package com.example.pscommission.hassan.modelclass;

public class RejectInvaliedCertificate {
    private String issueComboBox,reasonTextArea;

    public RejectInvaliedCertificate(String issueComboBox, String reasonTextArea) {
        this.issueComboBox = issueComboBox;
        this.reasonTextArea = reasonTextArea;
    }

    public String getIssueComboBox() {
        return issueComboBox;
    }

    public void setIssueComboBox(String issueComboBox) {
        this.issueComboBox = issueComboBox;
    }

    public String getReasonTextArea() {
        return reasonTextArea;
    }

    public void setReasonTextArea(String reasonTextArea) {
        this.reasonTextArea = reasonTextArea;
    }

    @Override
    public String toString() {
        return "RejectInvaliedCertificate{" +
                "issueComboBox='" + issueComboBox + '\'' +
                ", reasonTextArea='" + reasonTextArea + '\'' +
                '}';
    }
}
