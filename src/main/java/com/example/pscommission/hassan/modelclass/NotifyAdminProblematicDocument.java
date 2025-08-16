package com.example.pscommission.hassan.modelclass;

public class NotifyAdminProblematicDocument {
    private String flaggedFilesComboBox,issueSummaryTextArea;

    public NotifyAdminProblematicDocument(String flaggedFilesComboBox, String issueSummaryTextArea) {
        this.flaggedFilesComboBox = flaggedFilesComboBox;
        this.issueSummaryTextArea = issueSummaryTextArea;
    }

    public String getFlaggedFilesComboBox() {
        return flaggedFilesComboBox;
    }

    public void setFlaggedFilesComboBox(String flaggedFilesComboBox) {
        this.flaggedFilesComboBox = flaggedFilesComboBox;
    }

    public String getIssueSummaryTextArea() {
        return issueSummaryTextArea;
    }

    public void setIssueSummaryTextArea(String issueSummaryTextArea) {
        this.issueSummaryTextArea = issueSummaryTextArea;
    }

    @Override
    public String toString() {
        return "NotifyAdminProblematicDocument{" +
                "flaggedFilesComboBox='" + flaggedFilesComboBox + '\'' +
                ", issueSummaryTextArea='" + issueSummaryTextArea + '\'' +
                '}';
    }
}
