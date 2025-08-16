package com.example.pscommission.hassan.modelclass;

public class AddGenaralFeedback {
    private String Feedback;

    public AddGenaralFeedback(String feedback) {
        Feedback = feedback;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    @Override
    public String toString() {
        return "AddGenaralFeedback{" +
                "Feedback='" + Feedback + '\'' +
                '}';
    }
}
