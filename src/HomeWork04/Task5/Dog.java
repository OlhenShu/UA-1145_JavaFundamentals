package HomeWork04.Task5;

import java.util.Objects;

public class Dog {
    private String name;
    private final FieldBreedOfDogs breed;
    private int age;

    public Dog(String name, FieldBreedOfDogs breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public FieldBreedOfDogs getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", FieldBreedOfDogs.LABRADOR_RETRIEVER, 2);
        Dog dog2 = new Dog("Bob", FieldBreedOfDogs.GERMAN_SHEPHERD, 5);
        Dog dog3 = new Dog("Mike", FieldBreedOfDogs.GOLDEN_RETRIEVER, 7);

        if (Objects.equals(dog1.getName(), dog2.getName()) ||
                Objects.equals(dog1.getName(), dog3.getName()) ||
                Objects.equals(dog2.getName(), dog3.getName())) {
            System.out.println("Error: Two or more dogs have the same name.");
        }
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("Name of oldest dog is " + oldestDog.getName() +
                " " + "It's " + oldestDog.getBreed());
    }
}

