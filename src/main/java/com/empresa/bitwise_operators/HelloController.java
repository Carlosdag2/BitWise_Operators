package com.empresa.bitwise_operators;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private TextField inputNum1;

    @FXML
    private TextField inputNum2;

    @FXML
    private ChoiceBox<String> operatorChoice;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField resultField;

    @FXML
    public void initialize() {
        calculateButton.setOnAction(event -> calculateResult());
    }

    private void calculateResult() {
        try {
            int num1 = Integer.parseInt(inputNum1.getText());
            int num2 = Integer.parseInt(inputNum2.getText());
            String operator = operatorChoice.getValue();

            int result = 0;
            switch (operator) {
                case "AND":
                    result = num1 & num2;
                    break;
                case "OR":
                    result = num1 | num2;
                    break;
                case "XOR":
                    result = num1 ^ num2;
                    break;
                case "NOT":
                    result = ~num1;
                    break;
                case "LEFT SHIFT":
                    result = num1 << num2;
                    break;
                case "RIGHT SHIFT":
                    result = num1 >> num2;
                    break;
                case "UNSIGNED RIGHT SHIFT":
                    result = num1 >>> num2;
                    break;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Entrada no válida");
        }
    }
}
