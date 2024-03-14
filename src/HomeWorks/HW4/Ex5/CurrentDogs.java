package HomeWorks.HW4.Ex5;

import java.util.ArrayList;

public class CurrentDogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Happy", Breed.BEAGLES, 2);
        Dog dog2 = new Dog("Sunny", Breed.GERMAN_SHEPHERD_DOGS, 5);
        Dog dog3 = new Dog("Lucky", Breed.DACHSHUNDS, 8);

        ArrayList <Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        Dog theOldestDog = Dog.findTheOldestDog(dogList);
        System.out.println("The oldest dog`s name is " + theOldestDog.getName());

        Dog.checkSameName(dogList);



    }
}
