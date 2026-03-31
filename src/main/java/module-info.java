module com.example.colab1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.colab1 to javafx.fxml;
    exports com.example.colab1;
}