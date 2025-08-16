package com.example.pscommission.Shafin;

public class PrepareScheduleModel {

    private String draftSchedule;
    private String departmentInputs;
    private String finalSchedule;
    private String approvalStatus;
    private boolean published;

    public PrepareScheduleModel() {
        this.draftSchedule = "";
        this.departmentInputs = "Math: 10 AM\nPhysics: 1 PM\nChemistry: 3 PM"; // default sample
        this.finalSchedule = "";
        this.approvalStatus = "Pending";
        this.published = false;
    }

    public String getDraftSchedule() {
        return draftSchedule;
    }

    public void setDraftSchedule(String draftSchedule) {
        this.draftSchedule = draftSchedule;
    }

    public String getDepartmentInputs() {
        return departmentInputs;
    }

    public void setDepartmentInputs(String departmentInputs) {
        this.departmentInputs = departmentInputs;
    }

    public String getFinalSchedule() {
        return finalSchedule;
    }

    public void setFinalSchedule(String finalSchedule) {
        this.finalSchedule = finalSchedule;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "PrepareScheduleModel{" +
                "draftSchedule='" + draftSchedule + '\'' +
                ", departmentInputs='" + departmentInputs + '\'' +
                ", finalSchedule='" + finalSchedule + '\'' +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", published=" + published +
                '}';
    }



