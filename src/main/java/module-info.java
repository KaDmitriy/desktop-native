module kda.desktop.nativefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
    //requires spring.beans;

    //uses org.apache.logging.log4j.spi.Provider;
    //uses org.springframework.beans.factory.serviceloader.AbstractServiceLoaderBasedFactoryBean;

    opens kda.desktop.nativefx.gui to javafx.fxml;
    opens kda.desktop.nativefx to javafx.fxml;

    exports kda.desktop.nativefx;
    exports kda.desktop.nativefx.gui;
}