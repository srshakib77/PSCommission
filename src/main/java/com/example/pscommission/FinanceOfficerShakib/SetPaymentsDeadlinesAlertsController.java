package com.example.pscommission.FinanceOfficerShakib;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SetPaymentsDeadlinesAlertsController
{
    @javafx.fxml.FXML
    private TableColumn<SetPaymentsDeadlinesAlerts, String> exmTypeCol;
    @javafx.fxml.FXML
    private TableColumn<SetPaymentsDeadlinesAlerts, String> ReminderDaysCol;
    @javafx.fxml.FXML
    private DatePicker DeadlineDatePicker;
    @javafx.fxml.FXML
    private TableColumn<SetPaymentsDeadlinesAlerts, String> AlertMessageCol;
    @javafx.fxml.FXML
    private TextArea AlertmessageTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> ExamTypeComboBox;
    @javafx.fxml.FXML
    private TextField ReminderdaysTextField;

    private ArrayList<SetPaymentsDeadlinesAlerts>SetPaymentsDeadlines = new ArrayList<>();
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    @javafx.fxml.FXML
    private TableColumn DeadlineDateCol;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
        exmTypeCol.setCellValueFactory(new PropertyValueFactory<>("examType"));
        DeadlineDateCol.setCellValueFactory(new PropertyValueFactory<>("deadlineDate"));
        ReminderDaysCol.setCellValueFactory(new PropertyValueFactory<>("reminderDays"));
        AlertMessageCol.setCellValueFactory(new PropertyValueFactory<>("alertMessage"));

        ExamTypeComboBox.getItems().addAll(
                "Certification Exam",
                "Professional Exam",
                "Recertification",
                "Training Program"
        );

    }

    @javafx.fxml.FXML
    public void handleClearFormButton(ActionEvent actionEvent) {
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Deprecated
    public void BackToHomeHandleButton(ActionEvent actionEvent)throws IOException {
            Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("SetPaymentDeadlinesAlerts.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
    }

    @javafx.fxml.FXML
    public void handleSaveDeadlinesButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleBackToHomeButton(ActionEvent actionEvent) {
    }
}