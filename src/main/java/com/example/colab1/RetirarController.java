package com.example.colab1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class RetirarController {
@FXML
    private TextField montoTxt;
@FXML
    private Label textMensaje;

@FXML
    protected void confirmarRetiro(){
    String  montoString =montoTxt.getText();
    System.out.println("confirmando retiro de "+montoString);

    if (textMensaje != null) {
        textMensaje.setText("Retiro de $"+montoString+"exitoso.");
    }
    else {
        textMensaje.setText("Retiro Fallido");
    }
        }

}
