module com.empresa.bitwise_operators {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.bitwise_operators to javafx.fxml;
    exports com.empresa.bitwise_operators;
}