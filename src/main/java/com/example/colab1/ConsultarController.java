package com.example.colab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;


public class ConsultarController {

    @FXML
    private TextField Saldo1;
    @FXML
    private Label Muestra, Eloys, Comision;
    @FXML
    private double Dinero = 0 ;
    @FXML
    private double monto = 0 ;



    public void OnSaldo(){
        Saldo1.setVisible(true);
        if(!Saldo1.getText().isEmpty())
            monto = Double.parseDouble(Saldo1.getText());
         monto+=Dinero ;
        Saldo1.clear();
        Muestra.setText("Saldo actualizado"+monto);
        Muestra.setVisible(true);
        Comision.setVisible(false);
        Eloys.setVisible(false);
    }
    public void OnName(){
        Eloys.setVisible(true);
        Muestra.setVisible(false);
        Comision.setVisible(false);
        Saldo1.setVisible(false);
    }
    public void OnMostra(){

Comision.setText("Saldo actual sin comision de 10% "+Dinero);
        Dinero = monto * 0.90;
        Eloys.setVisible(false);
        Muestra.setVisible(false);
        Comision.setVisible(true);
        Saldo1.setVisible(false);
    }
    public void OnSalir(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();


    }



}


