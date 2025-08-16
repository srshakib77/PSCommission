package com.example.pscommission.hassan.modelclass;

public class UpdateEvaluation {
    private String scriptIdField,studentnameField,CurrentMarkField,newMarkField1;

    public UpdateEvaluation(String scriptIdField, String studentnameField, String currentMarkField, String newMarkField1) {
        this.scriptIdField = scriptIdField;
        this.studentnameField = studentnameField;
        CurrentMarkField = currentMarkField;
        this.newMarkField1 = newMarkField1;
    }

    public String getScriptIdField() {
        return scriptIdField;
    }

    public void setScriptIdField(String scriptIdField) {
        this.scriptIdField = scriptIdField;
    }

    public String getStudentnameField() {
        return studentnameField;
    }

    public void setStudentnameField(String studentnameField) {
        this.studentnameField = studentnameField;
    }

    public String getCurrentMarkField() {
        return CurrentMarkField;
    }

    public void setCurrentMarkField(String currentMarkField) {
        CurrentMarkField = currentMarkField;
    }

    public String getNewMarkField1() {
        return newMarkField1;
    }

    public void setNewMarkField1(String newMarkField1) {
        this.newMarkField1 = newMarkField1;
    }

    @Override
    public String toString() {
        return "UpdateEvaluation{" +
                "scriptIdField='" + scriptIdField + '\'' +
                ", studentnameField='" + studentnameField + '\'' +
                ", CurrentMarkField='" + CurrentMarkField + '\'' +
                ", newMarkField1='" + newMarkField1 + '\'' +
                '}';
    }
}
