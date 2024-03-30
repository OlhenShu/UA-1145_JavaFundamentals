package Practicals.Pr7.Ex1;

import java.util.ArrayList;

public class Dog extends Animal implements AnimalVoice, AnimalFeed {

    private String name;
    private int age;
    public static ArrayList<Dog> dogList = new ArrayList<>();

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        animalList.add(this);
        dogList.add(this);
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog eats meat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

