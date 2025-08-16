package com.example.pscommission.FinanceOfficerShakib;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MonitorDailyTransactionsController
{
    @javafx.fxml.FXML
    private DatePicker FinalDatePicker;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn TransactionIDCol;
    @javafx.fxml.FXML
    private BarChart AmountBarChart;
    @javafx.fxml.FXML
    private TableColumn candidateCol;
    @javafx.fxml.FXML
    private DatePicker InitialDatePicker;
    @javafx.fxml.FXML
    private TableColumn DateCol;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleLoadTransactionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackToHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleTodayButton(ActionEvent actionEvent) {
    }
}