package com.example.colab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Label;

public class ConsultarController {

@FXML
private TextField Saldo1;
@FXML
    private Label Muestra;
@FXML
    private double Dinero = 0 ;
    @FXML
    private double monto = 0 ;

public void OnSaldo(){
if(!Saldo1.getText().isEmpty())
    monto = Double.parseDouble(Saldo1.getText());
    Dinero += monto;

    Muestra.setText("Saldo actualizado");
}








}


