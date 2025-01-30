package Generics.Wildcards;

import java.util.List;

public class GenericsWithWildcard {
    public static void printAnimalsWithWildcard(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        List<Animal> animals = List.of(cat, dog);
        System.out.println("List of Animals:");
        printAnimalsWithWildcard(animals);

        List<Cat> cats = List.of(new Cat(), new Cat());
        System.out.println("List of Cats:");
        printAnimalsWithWildcard(cats);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        System.out.println("List of Dogs:");
        printAnimalsWithWildcard(dogs);
    }
}
