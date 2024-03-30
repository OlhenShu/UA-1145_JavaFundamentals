package Practicals.Pr7.Ex1;

import java.util.ArrayList;

public class Cat extends Animal implements AnimalVoice, AnimalFeed {

    private String name;
    private int age;

    public static ArrayList<Cat> catList = new ArrayList<>();

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        animalList.add(this);
        catList.add(this);
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Cat eats fish");
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
