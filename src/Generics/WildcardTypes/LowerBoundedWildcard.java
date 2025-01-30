package Generics.WildcardTypes;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {

    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Number> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        printOnlyIntegerClassorSuperClass(integers);
        printOnlyIntegerClassorSuperClass(numbers);

        // Does not accept Double
        //List<Double> doubles = List.of(1.0, 2.0);
        //printOnlyIntegerClassorSuperClass(doubles);
    }
}
