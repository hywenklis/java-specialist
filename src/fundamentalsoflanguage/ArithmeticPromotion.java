package fundamentalsoflanguage;

public class ArithmeticPromotion {

    private static final float NUMBER_OF_PERSONS = 3f;

    public static void main(String[] args) {
        final int agePerson1 = 30;
        final int agePerson2 = 40;
        final int agePerson3 = 60;

        final float ageAverage = (agePerson1 + agePerson2 + agePerson3) / NUMBER_OF_PERSONS;

        System.out.println("Idade média: " + ageAverage);
    }
}
