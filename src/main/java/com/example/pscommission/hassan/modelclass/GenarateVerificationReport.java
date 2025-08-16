package com.example.pscommission.hassan.modelclass;

public class GenarateVerificationReport {
    private String Sessioncombobox,ReportText;

    public GenarateVerificationReport(String sessioncombobox, String reportText) {
        Sessioncombobox = sessioncombobox;
        ReportText = reportText;
    }

    public String getSessioncombobox() {
        return Sessioncombobox;
    }

    public void setSessioncombobox(String sessioncombobox) {
        Sessioncombobox = sessioncombobox;
    }

    public String getReportText() {
        return ReportText;
    }

    public void setReportText(String reportText) {
        ReportText = reportText;
    }

    @Override
    public String toString() {
        return "GenarateVerificationReport{" +
                "Sessioncombobox='" + Sessioncombobox + '\'' +
                ", ReportText='" + ReportText + '\'' +
                '}';
    }
}
