module main.urejanje_radijev {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens main.urejanje_radijev to javafx.fxml;
    exports main.urejanje_radijev;
}