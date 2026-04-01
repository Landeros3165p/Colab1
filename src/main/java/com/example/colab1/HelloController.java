package com.example.colab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import  javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {

    @FXML
    protected TextField txt1;
    @FXML
    protected TextField txt2;
    @FXML
    protected Label elsee;

    public void abrirVentana (ActionEvent event){

        String usuario = "eloys";
        String contrasenia = "admin";

        String intentosUsuario;
        String intentosContrasenioas;

        intentosUsuario = txt1.getText();
        intentosContrasenioas = txt2.getText();

        if (intentosUsuario.equals(usuario)&&intentosContrasenioas.equals(contrasenia)){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SegundaVista.fxml"));
            try {
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle("Bienvenido al menú");//hola
                stage.setScene(new Scene(root));
                stage.show();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            elsee.setText("usuario y contrasenia incorrectos");
        }

    }}