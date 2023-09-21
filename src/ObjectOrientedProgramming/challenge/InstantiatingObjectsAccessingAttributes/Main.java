package ObjectOrientedProgramming.challenge.InstantiatingObjectsAccessingAttributes;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Bob";
        dog1.gender = "Macho";
        dog1.age = 11;
        dog1.race = "pitbull";

        dog2.name = "Bob 2";
        dog2.gender = "Macho";
        dog2.age = 11;
        dog2.race = "Poodle";

        System.out.println("name: " + dog1.name);
        System.out.println("gender: " + dog1.gender);
        System.out.println("age: " + dog1.age);
        System.out.println("race: " + dog1.race);
        System.out.println("-----------------------------");

        System.out.println("name: " + dog2.name);
        System.out.println("gender: " + dog2.gender);
        System.out.println("age: " + dog1.age);
        System.out.println("race: " + dog1.race);
    }
}
