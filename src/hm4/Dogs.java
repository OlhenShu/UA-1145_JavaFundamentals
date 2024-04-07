package hm4;

import java.util.Objects;

public class Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Klaus", Breed.FOXHOUND.toString(), 3);
        Dog dog2 = new Dog("Klaus", Breed.BEAGLE.toString(), 2);
        Dog dog3 = new Dog("Duke", Breed.SPANIEL.toString(), 4);

        if (Objects.equals(dog1.getName(), dog2.getName())){
            System.out.println("Дві собаки мають однакове ім'я - " + dog1.getName());
        } else if (Objects.equals(dog1.getName(), dog3.getName())) {
            System.out.println("Дві собаки мають однакове ім'я - " + dog2.getName());
        } else if (Objects.equals(dog2.getName(), dog3.getName())) {
            System.out.println("Дві собаки мають однакове ім'я - " + dog1.getName());
        } else {
            System.out.println("У всіх собак різні імена");
        }

        Dog TheOldestDog = dog1;
        if (dog2.getAge() > TheOldestDog.getAge()){
            TheOldestDog = dog2;
        } else if (dog3.getAge() > TheOldestDog.getAge()) {
            TheOldestDog = dog3;
        }

        System.out.println("Найстаріша собака:");
        System.out.println(TheOldestDog.getName() + " " + TheOldestDog.getBreed());
    }
}

enum Breed {
    BEAGLE, FOXHOUND, SPANIEL,
}

class Dog {
    private final String name;
    private final String breed;
    private final int age;

    public Dog (String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
}

