package com.example.javafxfirst;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button button;

    public void onHelloButtonClick(){
       Alerts.showAlert("Alert title",null,"Hello", Alert.AlertType.ERROR);
    }

}
