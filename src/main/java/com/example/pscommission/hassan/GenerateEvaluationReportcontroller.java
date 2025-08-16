package com.example.pscommission.hassan;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class GenerateEvaluationReportcontroller
{
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private ComboBox subjectComboBox;
    @javafx.fxml.FXML
    private TextArea reportPreviewArea;
    @javafx.fxml.FXML
    private Button handleDownloadbutton;
    @javafx.fxml.FXML
    private Button handleGenarateReportbutton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handlebacktohomebutton(ActionEvent actionEvent) {
    }
}