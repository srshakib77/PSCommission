package com.example.pscommission.hassan.modelclass;

public class GenarateEvaluationReport {
    private String  SubjectComboBox,Datepicker,ReportPreview;

    public GenarateEvaluationReport(String subjectComboBox, String datepicker, String reportPreview) {
        SubjectComboBox = subjectComboBox;
        Datepicker = datepicker;
        ReportPreview = reportPreview;
    }

    public String getSubjectComboBox() {
        return SubjectComboBox;
    }

    public void setSubjectComboBox(String subjectComboBox) {
        SubjectComboBox = subjectComboBox;
    }

    public String getDatepicker() {
        return Datepicker;
    }

    public void setDatepicker(String datepicker) {
        Datepicker = datepicker;
    }

    public String getReportPreview() {
        return ReportPreview;
    }

    public void setReportPreview(String reportPreview) {
        ReportPreview = reportPreview;
    }

    @Override
    public String toString() {
        return "GenarateEvaluationReport{" +
                "SubjectComboBox='" + SubjectComboBox + '\'' +
                ", Datepicker='" + Datepicker + '\'' +
                ", ReportPreview='" + ReportPreview + '\'' +
                '}';
    }
}
