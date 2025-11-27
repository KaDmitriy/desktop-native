package kda.desktop.nativefx;

import javafx.application.Application;
import kda.desktop.nativefx.gui.ApplicationMain;

public class Launcher {
    public static void main(String[] args) {
        System.out.printf("Start application!");
        Application.launch(ApplicationMain.class, args);
    }
}