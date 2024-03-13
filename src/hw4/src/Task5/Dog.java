package Task5;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;
    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    public static void dogsWithSameName(Dog dog1, Dog dog2, Dog dog3) {
        if(dog1.getName().toLowerCase().equals(dog2.getName().toLowerCase())
                || dog2.getName().toLowerCase().equals(dog3.getName().toLowerCase())
                || dog3.getName().toLowerCase().equals(dog1.getName().toLowerCase())) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("There aren`t two dogs with the same name");
        }
        System.out.println(" ");
    }

    public static void theOldestDog(Dog dog1, Dog dog2, Dog dog3) {
       Dog oldestDog = dog1;
        if(oldestDog.getAge() < dog2.getAge()) {
            oldestDog = dog2;
        } if(oldestDog.getAge() < dog3.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("The oldest dog`s name is " + oldestDog.getName() +
                ". \nIts breed is " + oldestDog.getBreed().name.toLowerCase() +
                ". \nIts age is " + oldestDog.getAge());
    }
}
