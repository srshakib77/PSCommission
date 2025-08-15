package com.example.pscommission.FinanceOfficerShakib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SetPaymentsDeadlinesAlertsController
{
    @javafx.fxml.FXML
    private TableColumn exmTypeCol;
    @javafx.fxml.FXML
    private TableColumn DeadlineDateCol;
    @javafx.fxml.FXML
    private TableColumn ReminderDaysCol;
    @javafx.fxml.FXML
    private DatePicker DeadlineDatePicker;
    @javafx.fxml.FXML
    private TableColumn AlertMessageCol;
    @javafx.fxml.FXML
    private TextArea AlertmessageTextArea;
    @javafx.fxml.FXML
    private ComboBox ExamTypeComboBox;
    @javafx.fxml.FXML
    private TextField ReminderdaysTextField;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleClearFormButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackToHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveDeadlinesButton(ActionEvent actionEvent) {
    }
}