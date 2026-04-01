module colab1 {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.colab1;
    opens com.example.colab1 to javafx.fxml;
}


