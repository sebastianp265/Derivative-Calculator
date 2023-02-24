module com.sebastianp.derivativecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sebastianp.derivativecalculator to javafx.fxml;
    exports com.sebastianp.derivativecalculator;
}