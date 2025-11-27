package kda.desktop.nativefx.gui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApplicationController {

    private final Logger log = LogManager.getLogger(ApplicationController.class);

    @FXML
    private TextField fieldText;

    @FXML
    protected void onButtonClick() {
        log.info("Button clicked");
        fieldText.setText("Welcome to JavaFX Application!");
    }
}
