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
// Recommendation for code improvement:
// Extracting the logic for checking the uniqueness of dog names
// and determining the oldest dog into separate methods
// can significantly enhance the readability and organization of the code in the main method.
// It also allows for the reuse of these methods in other parts of the program,
// improving modularity and testability of the code.

// Possible enhancements include:
// 1. Adding methods directly to the Dog class as static methods that accept an array or list of dogs.
//    This approach is suitable if the logic is closely related to the concept of a dog.

// 2. Calling these methods in main to check for name uniqueness and determine the oldest dog
//    makes the main code more readable and concise.

// This approach ensures a better structure of the code, facilitates its understanding, and contributes to a higher quality of the program.
