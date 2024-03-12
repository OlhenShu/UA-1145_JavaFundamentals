package edu04.HomeWork05;


public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobikus", 2, Breed.LABRADOR);
        Dog dog2 = new Dog("Sharikus", 4, Breed.GERMAN_SHEPHERD);
        Dog dog3 = new Dog("Tuzikus", 1, Breed.GOLDEN_RETRIEVER);

        //Check if there are no two dogs with the same name;
        if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog2.name.equals(dog3.name))
            System.out.println("There are dogs with the same name");
        else System.out.println("All dog's names are different.");

        //Oldest dog's age verification
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        System.out.println("Oldest dog is: " + oldestDog.name + ". Oldest dog's breed is " + oldestDog.getBreed().getReadableName());
    }
}
