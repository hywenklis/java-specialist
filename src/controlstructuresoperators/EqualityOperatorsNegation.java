package controlstructuresoperators;

public class EqualityOperatorsNegation {

    public static void main(String[] args) {
        final int firstNumber = 10;
        final int secondNumber = 11;
        final boolean areNumbersEqual = firstNumber == secondNumber;
        final boolean areNumbersDifferent = firstNumber != secondNumber;

        System.out.printf("Números são iguais: %b%n", areNumbersEqual);
        System.out.printf("Os números são diferentes: %b%n", areNumbersDifferent);

        String firstName = "Thiago";
        String secondName = "Miguel";
        boolean areNamesEqual = firstName == secondName;

        System.out.printf("os nomes são iguais: %b%n", areNamesEqual);
    }

}

