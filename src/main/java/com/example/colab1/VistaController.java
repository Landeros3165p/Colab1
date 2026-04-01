package com.example.colab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VistaController {

    @FXML
    public void OnConsultar (ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ConsultarSaldo.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Bienvenido al menú");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void onDepositar (ActionEvent event){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Depositar.fxml"));
        try {

            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Aqui depositas");
            stage.setScene(new Scene(root));
            stage.show();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}