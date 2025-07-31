module com.example.pscommission {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pscommission to javafx.fxml;
    exports com.example.pscommission;
}