package com.example.pscommission.FinanceOfficerShakib;

import java.time.LocalDate;

public class SetPaymentsDeadlinesAlerts {
    private String examType;
    private LocalDate deadlineDate;
    private int reminderDays;
    private String alertMessage;

    public SetPaymentsDeadlinesAlerts(String examType, LocalDate deadlineDate, int reminderDays, String alertMessage) {
        this.examType = examType;
        this.deadlineDate = deadlineDate;
        this.reminderDays = reminderDays;
        this.alertMessage = alertMessage;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public int getReminderDays() {
        return reminderDays;
    }

    public void setReminderDays(int reminderDays) {
        this.reminderDays = reminderDays;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

}
