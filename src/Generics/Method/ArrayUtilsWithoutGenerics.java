package Generics.Method;

public class ArrayUtilsWithoutGenerics {
    public static <T> T getElement(T[] array, int i) {
        if (i >= array.length || i <0) {
            return null;
        }
        return array[i];
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"texto 1", "texto 2", "texto 1"};

        Integer firstObject = getElement(integers, 0);
        System.out.println("first object=" + firstObject);

        String firstString = getElement(strings, 0);
        System.out.println("first string=" + firstString);
    }
}
