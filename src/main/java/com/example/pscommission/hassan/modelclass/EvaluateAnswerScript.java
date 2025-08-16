package com.example.pscommission.hassan.modelclass;

public class EvaluateAnswerScript {
    private String SelectQuestionScript ,Remarks, Marks;

    public EvaluateAnswerScript(String selectQuestionScript, String remarks, String marks) {
        SelectQuestionScript = selectQuestionScript;
        Remarks = remarks;
        Marks = marks;
    }

    public String getSelectQuestionScript() {
        return SelectQuestionScript;
    }

    public void setSelectQuestionScript(String selectQuestionScript) {
        SelectQuestionScript = selectQuestionScript;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "EvaluateAnswerScript{" +
                "SelectQuestionScript='" + SelectQuestionScript + '\'' +
                ", Remarks='" + Remarks + '\'' +
                ", Marks='" + Marks + '\'' +
                '}';
    }
}
