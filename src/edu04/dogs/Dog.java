package edu04.dogs;

public class Dog {
    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    private String name;
    private Breed breed;
    private int age;

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Pochi", Breed.HOUND, 2);
        Dog dog2 = new Dog("Tama", Breed.TERRIER, 5);
        Dog dog3 = new Dog("Utah", Breed.LABRADOR, 10);
        //здається що equals переробляти не треба?

        //провіряємо чи є однакові імена
        if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog2.name.equals(dog3.name)) {
            System.out.println("There are two dogs with the same name.");
        } else {
            System.out.println("None of the dogs has the same name.");
        }
// Порівнюємо dog2 і oldest
        Dog oldest = dog1;
        if (dog2.age > oldest.age) {
            oldest = dog2;
        }
        if (dog3.age > oldest.age) {
            oldest = dog3;
        }
        System.out.println("The oldest dog is " + oldest);
    }
}



