package ControlStructuresOperators;

public class LogicalOperatorsPrecedence {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        boolean result = firstNumber == 13 && (firstNumber == 15 || secondNumber == 20);

        System.out.println(result);
    }

}

