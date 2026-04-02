package com.example.colab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DepositarController {

        @FXML
        private TextField txtCantidad;

        @FXML
        private Label lblSaldo;

        double saldo = 0;

        @FXML
        public void onEnviar() {
            try {
                double cantidad = Double.parseDouble(txtCantidad.getText());

                saldo += cantidad;

                lblSaldo.setText("Tu saldo es: " + saldo);

                txtCantidad.clear();

            } catch (NumberFormatException e) {
                lblSaldo.setText("Ingresa un número válido");
            }
        }
        @FXML
    public void onRegresar(ActionEvent event){
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    }


