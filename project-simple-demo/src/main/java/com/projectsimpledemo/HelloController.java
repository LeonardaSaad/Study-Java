package com.projectsimpledemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class HelloController {
    public BorderPane borderpane;
    public TextArea inputconvertedText;
    public TextArea inputNormalText;
    @FXML
    private Label welcomeText;

    private MorseConverter morseConverter;

    @FXML
    public void initialize() {
        morseConverter = new MorseConverter();

    }

    @FXML
    protected void onHelloButtonClick() {


        inputconvertedText.setText(morseConverter.convertToMorse(inputNormalText.getText()));
    }
}