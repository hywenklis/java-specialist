package ObjectOrientedProgramming.classs;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.manufacturingYear = 2021;
        myCar.color = "Black";
        myCar.manufacturer = "Honda";
        myCar.model = "HR-V";

        Car yourCar = new Car();
        yourCar.manufacturingYear = 2022;
        yourCar.color = "White";
        yourCar.manufacturer = "BMW";
        yourCar.model = "X6";

        System.out.println("My car");
        System.out.println("--------");
        System.out.printf("Model: %s%n", myCar.model);
        System.out.printf("Year: %d%n", myCar.manufacturingYear);

        System.out.println();

        System.out.println("Your car");
        System.out.println("--------");
        System.out.printf("Model: %s%n", yourCar.model);
        System.out.printf("Year: %d%n", yourCar.manufacturingYear);

    }
}
