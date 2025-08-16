package com.example.pscommission.hassan.modelclass;

public class AddCommentDocument {
    private String SelectApplicant, EnterComment;

    public AddCommentDocument(String enterComment, String selectApplicant) {
        EnterComment = enterComment;
        SelectApplicant = selectApplicant;
    }

    public String getSelectApplicant() {
        return SelectApplicant;
    }

    public void setSelectApplicant(String selectApplicant) {
        SelectApplicant = selectApplicant;
    }

    public String getEnterComment() {
        return EnterComment;
    }

    public void setEnterComment(String enterComment) {
        EnterComment = enterComment;
    }

    @Override
    public String toString() {
        return "AddCommentDocument{" +
                "SelectApplicant='" + SelectApplicant + '\'' +
                ", EnterComment='" + EnterComment + '\'' +
                '}';
    }
}
