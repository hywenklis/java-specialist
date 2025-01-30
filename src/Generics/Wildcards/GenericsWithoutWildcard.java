package Generics.Wildcards;

import java.util.List;

public class GenericsWithoutWildcard {
    public static void printAnimalsWithoutWildcard(List<Animal> animals) {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        List<Animal> animals = List.of(cat, dog);
        System.out.println("List of Animals:");
        printAnimalsWithoutWildcard(animals);

        List<Cat> cats = List.of(new Cat(), new Cat());
        System.out.println("List of Cats:");
//        printAnimalsWithoutWildcard(cats);  error

        List<Dog> dogs = List.of(new Dog(), new Dog());
        System.out.println("List of Dogs:");
//        printAnimalsWithoutWildcard(dogs);  error
    }
}
