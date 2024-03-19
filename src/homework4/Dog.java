package homework4;

import java.util.Scanner;

public class Dog {
    static public final Scanner SCANNER = new Scanner(System.in);
    private String name;
    private String breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public static void promptParameters(Dog dog) {
        System.out.println("Input dog name:");
        String name = SCANNER.nextLine();
        dog.setName(name);
        System.out.println("Input dog breed:");
        String breed = SCANNER.nextLine();
        dog.setBreed(breed);
        System.out.println("Input age for the '" +
                dog.getName() +", "+ dog.getBreed() + "':");
        int age = SCANNER.nextInt();
        SCANNER.nextLine();
        dog.setAge(age);
    }
    public enum dogBreeds{
        SHEPHERD("Shepherd"),
        POODLE("Poodle"),
        ROTTWEILER("Rottweiler");
        public final String breed;

        dogBreeds(String breed) {
            this.breed = breed;
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
