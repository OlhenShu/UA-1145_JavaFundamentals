package task3;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public enum Breed {
        TERRIER,
        POODLE,
        SHPITZ
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Sarah", Breed.POODLE, 20);
        Dog dog2 = new Dog("Leon", Breed.SHPITZ, 6);
        Dog dog3 = new Dog("Dinara", Breed.TERRIER, 2);

        // Check if any dogs have the same name
        if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog2.name.equals(dog3.name)) {
            System.out.println("At least two dogs have the same name.");
        }

        // Find the oldest dog
        Dog theOldestDog = dog1;
        if (theOldestDog.age < dog2.age) {
            theOldestDog = dog2;
        }
        if (theOldestDog.age < dog3.age) {
            theOldestDog = dog3;
        }

        System.out.println("The oldest dog is: " + theOldestDog.name + " the breed is: " + theOldestDog.breed);
    }
}
