package com.example.pscommission;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewController {
     private TextField usernameField;
     private ComboBox<String> roleComboBox;
     private PasswordField passwordField;
     private Label errorLabel;


    public LoginViewController(TextField usernameField, ComboBox<String> roleComboBox, PasswordField passwordField, Label errorLabel) {
        this.usernameField = usernameField;
        this.roleComboBox = roleComboBox;
        this.passwordField = passwordField;
        this.errorLabel = errorLabel;
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public ComboBox<String> getRoleComboBox() {
        return roleComboBox;
    }

    public void setRoleComboBox(ComboBox<String> roleComboBox) {
        this.roleComboBox = roleComboBox;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Label getErrorLabel() {
        return errorLabel;
    }

    public void setErrorLabel(Label errorLabel) {
        this.errorLabel = errorLabel;
    }

    @Override
    public String toString() {
        return "LoginViewController{" +
                "usernameField=" + usernameField +
                ", roleComboBox=" + roleComboBox +
                ", passwordField=" + passwordField +
                ", errorLabel=" + errorLabel +
                '}';
    }
}

