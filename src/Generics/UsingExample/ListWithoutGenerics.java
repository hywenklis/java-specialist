package Generics.UsingExample;

public class ListWithoutGenerics {
    public static void main(String[] args) {
        List<Integer> numbers = new List<>();
        numbers.add(1);
        numbers.add(2);

        List<String> texts = new List<>();
        texts.add("abc");
        texts.add("cba");

        int number = numbers.get(0);
        System.out.println(number);

        String text = texts.get(0);
        System.out.println(text);
    }
}
