package com.example.pscommission.Shafin;

import java.util.List;

public class ExamCoordinatorDashboardModel {

        private String userName;
        private String role;
        private final List<String> goals;

        public ExamCoordinatorDashboardModel(List<String> goals, String role, String userName) {
        this.goals = goals;
        this.role = role;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        return "ExamCoordinatorDashboardModel{" +
                "userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                ", goals=" + goals +
                '}';
    }