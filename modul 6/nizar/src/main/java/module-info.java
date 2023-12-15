module com.example.nizar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nizar to javafx.fxml;
    exports com.example.nizar;
}