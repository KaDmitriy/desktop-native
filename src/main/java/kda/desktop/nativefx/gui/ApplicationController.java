package kda.desktop.nativefx.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ApplicationController {
    @FXML
    private TextField fieldText;

    @FXML
    protected void onButtonClick() {
        fieldText.setText("Welcome to JavaFX Application!");
    }
}
