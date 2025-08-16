package com.example.pscommission.hassan.modelclass;

public class FilterVerifiedorUnverifiedApplications {
    private String Allradio,TableView;

    public FilterVerifiedorUnverifiedApplications(String allradio, String tableView) {
        Allradio = allradio;
        TableView = tableView;
    }

    public String getAllradio() {
        return Allradio;
    }

    public void setAllradio(String allradio) {
        Allradio = allradio;
    }

    public String getTableView() {
        return TableView;
    }

    public void setTableView(String tableView) {
        TableView = tableView;
    }

    @Override
    public String toString() {
        return "FilterVerifiedorUnverifiedApplications{" +
                "Allradio='" + Allradio + '\'' +
                ", TableView='" + TableView + '\'' +
                '}';
    }
}
