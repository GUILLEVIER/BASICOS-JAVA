module com.guillevier.resumen {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.jdbc;
    requires java.sql;


    opens com.guillevier.resumen to javafx.fxml;
    exports com.guillevier.resumen;
}