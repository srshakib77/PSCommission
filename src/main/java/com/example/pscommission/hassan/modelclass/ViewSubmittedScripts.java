package com.example.pscommission.hassan.modelclass;

public class ViewSubmittedScripts {
    public String examsessioncombobox,tableviewcol;

    public ViewSubmittedScripts(String examsessioncombobox, String tableviewcol) {
        this.examsessioncombobox = examsessioncombobox;
        this.tableviewcol = tableviewcol;
    }

    public String getExamsessioncombobox() {
        return examsessioncombobox;
    }

    public void setExamsessioncombobox(String examsessioncombobox) {
        this.examsessioncombobox = examsessioncombobox;
    }

    public String getTableviewcol() {
        return tableviewcol;
    }

    public void setTableviewcol(String tableviewcol) {
        this.tableviewcol = tableviewcol;
    }

    @Override
    public String toString() {
        return "ViewSubmittedScripts{" +
                "examsessioncombobox='" + examsessioncombobox + '\'' +
                ", tableviewcol='" + tableviewcol + '\'' +
                '}';
    }
}
