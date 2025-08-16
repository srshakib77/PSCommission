package com.example.pscommission.hassan.modelclass;

public class ReevaluateFlaggedScript {
    private String scriptComboBox,StudentIDtextfield,OriginalScoreTextFeild,Flagreasontextfeild,answerTextArea,NewScoreField;

    public ReevaluateFlaggedScript(String scriptComboBox, String studentIDtextfield, String originalScoreTextFeild, String flagreasontextfeild, String answerTextArea, String newScoreField) {
        this.scriptComboBox = scriptComboBox;
        StudentIDtextfield = studentIDtextfield;
        OriginalScoreTextFeild = originalScoreTextFeild;
        Flagreasontextfeild = flagreasontextfeild;
        this.answerTextArea = answerTextArea;
        NewScoreField = newScoreField;
    }

    public String getScriptComboBox() {
        return scriptComboBox;
    }

    public void setScriptComboBox(String scriptComboBox) {
        this.scriptComboBox = scriptComboBox;
    }

    public String getStudentIDtextfield() {
        return StudentIDtextfield;
    }

    public void setStudentIDtextfield(String studentIDtextfield) {
        StudentIDtextfield = studentIDtextfield;
    }

    public String getOriginalScoreTextFeild() {
        return OriginalScoreTextFeild;
    }

    public void setOriginalScoreTextFeild(String originalScoreTextFeild) {
        OriginalScoreTextFeild = originalScoreTextFeild;
    }

    public String getFlagreasontextfeild() {
        return Flagreasontextfeild;
    }

    public void setFlagreasontextfeild(String flagreasontextfeild) {
        Flagreasontextfeild = flagreasontextfeild;
    }

    public String getAnswerTextArea() {
        return answerTextArea;
    }

    public void setAnswerTextArea(String answerTextArea) {
        this.answerTextArea = answerTextArea;
    }

    public String getNewScoreField() {
        return NewScoreField;
    }

    public void setNewScoreField(String newScoreField) {
        NewScoreField = newScoreField;
    }

    @Override
    public String toString() {
        return "ReevaluateFlaggedScript{" +
                "scriptComboBox='" + scriptComboBox + '\'' +
                ", StudentIDtextfield='" + StudentIDtextfield + '\'' +
                ", OriginalScoreTextFeild='" + OriginalScoreTextFeild + '\'' +
                ", Flagreasontextfeild='" + Flagreasontextfeild + '\'' +
                ", answerTextArea='" + answerTextArea + '\'' +
                ", NewScoreField='" + NewScoreField + '\'' +
                '}';
    }
}
