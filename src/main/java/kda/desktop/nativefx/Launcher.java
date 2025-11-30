package kda.desktop.nativefx;

import javafx.application.Application;
import kda.desktop.nativefx.gui.ApplicationMain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Launcher {

    private static final Logger log = LogManager.getLogger(Launcher.class);

    public static void main(String[] args) {
        log.info("Start application!");
        Application.launch(ApplicationMain.class, args);
        log.debug("Stop application!");
    }
}