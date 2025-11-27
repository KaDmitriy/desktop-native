module kda.desktop.nativefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens kda.desktop.nativefx.gui to javafx.fxml;
    opens kda.desktop.nativefx to javafx.fxml;

    exports kda.desktop.nativefx;
    exports kda.desktop.nativefx.gui;
}