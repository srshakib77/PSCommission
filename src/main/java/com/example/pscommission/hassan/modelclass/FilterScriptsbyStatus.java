package com.example.pscommission.hassan.modelclass;

public class FilterScriptsbyStatus {
    private String StatusComboBox, TableViewcol;

    public FilterScriptsbyStatus(String statusComboBox, String tableViewcol) {
        StatusComboBox = statusComboBox;
        TableViewcol = tableViewcol;
    }

    public String getStatusComboBox() {
        return StatusComboBox;
    }

    public void setStatusComboBox(String statusComboBox) {
        StatusComboBox = statusComboBox;
    }

    public String getTableViewcol() {
        return TableViewcol;
    }

    public void setTableViewcol(String tableViewcol) {
        TableViewcol = tableViewcol;
    }

    @Override
    public String toString() {
        return "FilterScriptsbyStatus{" +
                "StatusComboBox='" + StatusComboBox + '\'' +
                ", TableViewcol='" + TableViewcol + '\'' +
                '}';
    }
}
