package edu04.task5;

public class Dog {
    private String name;
    private String breed;
    private int age;


    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public enum Breed {
        LABRADOR, BULLDOG, POODLE
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Lambo", "Labrador", 5);
        Dog dog2 = new Dog("Bulka", "Bulldog", 2);
        Dog dog3 = new Dog("Dame", "Poodle", 7);

        Dog oldest = dog1;
        if (dog2.getAge() > oldest.getAge()) {
            oldest = dog2;
        }
        if (dog3.getAge() > oldest.getAge()) {
            oldest = dog3;
        }
        System.out.println("The oldest dog is:\n" +
                "name = " + oldest.getName() + "\n" +
                "breed = " + oldest.getBreed());

        if (dog1.getName().equals(dog2.getName()) && dog1.getName().equals(dog3.getName()) && dog2.getName().equals(dog3.getName())) {
            System.out.println("There are no two dogs with the same name.");
        } else {
            System.out.println("There are two dogs with the same name.");
        }
    }
}