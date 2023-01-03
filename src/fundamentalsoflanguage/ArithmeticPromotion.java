package fundamentalsoflanguage;

public class ArithmeticPromotion {

    private static final float AGE_QUANTITIES = 3f;

    public static void main(String[] args) {
        int age1 = 30;
        int age2 = 40;
        int age3 = 60;

        float ageAverage = (age1 + age2 + age3) / AGE_QUANTITIES;

        System.out.println("Age average: " + ageAverage);
    }
}
