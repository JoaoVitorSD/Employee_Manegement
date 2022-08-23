package com.example.javafxfirst;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button button;

    public void onHelloButtonClick(){
        System.out.println("Hello");
    }
}
