package ObjectOrientedProgramming.Composition;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        Person person = new Person();

        person.name = "João";
        person.cpf = "888-888-888-88";
        person.birthYear = 1997;

        myCar.manufacturingYear = 2021;
        myCar.color = "Black";
        myCar.manufacturer = "Honda";
        myCar.model = "HR-V";
        myCar.owner = person;

        System.out.println("-------------------------------");
        System.out.println("My car");
        System.out.println("-------------------------------");
        System.out.printf("Model: %s%n", myCar.model);
        System.out.printf("Year: %d%n", myCar.manufacturingYear);

        System.out.println("-------------------------------");
        System.out.println("OWNER");
        System.out.println("-------------------------------");
        System.out.printf("Name: %s%n", person.name);
        System.out.printf("CPF: %s%n", person.cpf);
        System.out.printf("Birth Year: %s%n", person.birthYear);

        System.out.println();
    }
}
