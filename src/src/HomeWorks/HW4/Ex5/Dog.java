package HomeWorks.HW4.Ex5;

import java.util.ArrayList;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void checkSameName(ArrayList<Dog> list) {
        boolean is_differentNames = true;

        for (int i = 0; i < list.size() - 1; i++) {
            Dog tempDog1 = list.get(i);
            String tempDogName1 = tempDog1.getName();
            Dog tempDog2 = list.get(i + 1);
            String tempDogName2 = tempDog1.getName();
            if (!tempDogName1.equals(tempDogName2)) {
                is_differentNames = false;
                break;
            }
        }
        if (is_differentNames){
            System.out.println("All dogs names are different!");
        }
        else {
            System.out.println("There are several identical dogs names!");
        }

    }

    public static Dog findTheOldestDog (ArrayList<Dog> list){
        Dog theOldestDog = list.get(0);
        int maxAge = theOldestDog.getAge();

        for (int i = 0; i < list.size(); i++) {
            Dog tempDog1 = list.get(i);
            int tempAge = tempDog1.getAge();
            if (tempAge > maxAge){
                theOldestDog = tempDog1;
            }
        }
        return theOldestDog;
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
}
