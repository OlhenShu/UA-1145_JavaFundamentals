package HW4;

import java.util.*;

// Dog class
public class Dog {

    enum Breed {
        LABRADOR,
        GERMAN_SHEPHERD,
        BEAGLE
    }
    String name;
    Breed breed;
    int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        // Create three instances of type Dog
        Dog dog1 = new Dog("Buddy", Breed.LABRADOR, 3);
        Dog dog2 = new Dog("Max", Breed.GERMAN_SHEPHERD, 5);
        Dog dog3 = new Dog("Bella", Breed.BEAGLE, 4);

        if (checkUniqueNames(dog1, dog2, dog3)) {
            System.out.println("All dogs have unique names.");
        } else {
            System.out.println("There are two or more dogs with the same name.");
        }

        Dog oldestDog = findOldestDog(dog1, dog2, dog3);
        if (oldestDog != null) {
            int length=oldestDog.breed.toString().length();
            System.out.println("Oldest dog: " + oldestDog.name + ", Breed: " + oldestDog.breed.toString().charAt(0) + oldestDog.breed.toString().substring(1,length).toLowerCase().replace('_', ' '));
        } else {
            System.out.println("No dogs to determine the oldest.");
        }
    }

    private static boolean checkUniqueNames(Dog... dogs) {
        Set<String> uniqueNames = new HashSet<>();
        for (Dog dog : dogs) {
            if (!uniqueNames.add(dog.name)) {
                return false;
            }
        }
        return true;
    }

    private static Dog findOldestDog(Dog... dogs) {
        if (dogs.length == 0) {
            return null;
        }

        Dog oldestDog = dogs[0];
        for (Dog dog : dogs) {
            if (dog.age > oldestDog.age) {
                oldestDog = dog;
            }
        }
        return oldestDog;
    }
}