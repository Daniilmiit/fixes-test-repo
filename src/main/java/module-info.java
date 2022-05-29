module com.example.fixestest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fixestest to javafx.fxml;
    exports com.example.fixestest;
}