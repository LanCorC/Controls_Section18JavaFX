module com.example.controls_section18javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controls_section18javafx to javafx.fxml;
    exports com.example.controls_section18javafx;
}