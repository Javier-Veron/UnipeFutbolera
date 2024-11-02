module com.example.unipefutbolera {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.unipefutbolera to javafx.fxml;
    exports com.example.unipefutbolera;
}