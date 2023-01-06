package controlstructuresoperators;

public class LogicalOperatorsShortCircuit {

    public static void main(String[] args) {
        final int firstNumber = 10;
        int secondNumber = 20;

        final boolean result = firstNumber == 15 || secondNumber++ == 20;

        System.out.println(result);
        System.out.println(secondNumber);
    }
}
