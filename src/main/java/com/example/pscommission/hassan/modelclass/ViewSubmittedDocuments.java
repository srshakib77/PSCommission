package com.example.pscommission.hassan.modelclass;

public class ViewSubmittedDocuments {
    private String applicantsListView,sumitteddocumentsfeild;

    public ViewSubmittedDocuments(String applicantsListView, String sumitteddocumentsfeild) {
        this.applicantsListView = applicantsListView;
        this.sumitteddocumentsfeild = sumitteddocumentsfeild;
    }

    public String getApplicantsListView() {
        return applicantsListView;
    }

    public void setApplicantsListView(String applicantsListView) {
        this.applicantsListView = applicantsListView;
    }

    public String getSumitteddocumentsfeild() {
        return sumitteddocumentsfeild;
    }

    public void setSumitteddocumentsfeild(String sumitteddocumentsfeild) {
        this.sumitteddocumentsfeild = sumitteddocumentsfeild;
    }

    @Override
    public String toString() {
        return "ViewSubmittedDocuments{" +
                "applicantsListView='" + applicantsListView + '\'' +
                ", sumitteddocumentsfeild='" + sumitteddocumentsfeild + '\'' +
                '}';
    }
}
