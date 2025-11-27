package kda.desktop.nativefx.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class ApplicationMain extends Application {

    private final Logger log = LogManager.getLogger(ApplicationMain.class);

    @Override
    public void start(Stage stage) throws IOException {
        log.info("GUI application started");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("application.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}
