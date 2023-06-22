module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens HolaMundo to javafx.fxml;
    exports HolaMundo;
}