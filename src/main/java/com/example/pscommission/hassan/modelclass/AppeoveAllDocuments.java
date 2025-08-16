package com.example.pscommission.hassan.modelclass;

public class AppeoveAllDocuments {
    private  String filelist;

    public AppeoveAllDocuments(String filelist) {
        this.filelist = filelist;
    }

    public String getFilelist() {
        return filelist;
    }

    public void setFilelist(String filelist) {
        this.filelist = filelist;
    }

    @Override
    public String toString() {
        return "AppeoveAllDocuments{" +
                "filelist='" + filelist + '\'' +
                '}';
    }
}
