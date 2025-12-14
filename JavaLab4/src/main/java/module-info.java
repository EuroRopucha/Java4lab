module org.example.javalab4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires javafx.graphics;

    opens org.example.javalab4 to javafx.fxml;
    exports org.example.javalab4;
}