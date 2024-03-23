package homeWork4;

public class Dog {
    private String name;
    private Breed breed;
    private int age;


    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static String areDogNamesUnique(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    // Found two dogs with the same name
                    return "There are at least 2 dogs with the name " + dogs[i].getName() + ".";
                }
            }
        }
        return "All dog names are unique."; // If the loop completes without finding duplicates
    }


    public static Dog findOldestDog(Dog[] dogs) {
        Dog oldest = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > oldest.getAge()) {
                oldest = dogs[i];
            }
        }
        return oldest;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    enum Breed {
        LABRADOR_RETRIEVER,
        GERMAN_SHEPHERD,
        GOLDEN_RETRIEVER,
        BEAGLE,
        BULLDOG;
    }
}

class RunDog {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Stacy", Dog.Breed.BEAGLE, 5);
        Dog dog2 = new Dog("Star", Dog.Breed.GERMAN_SHEPHERD, 8);
        Dog dog3 = new Dog("Amy", Dog.Breed.BULLDOG, 1);
        Dog dog4 = new Dog("Stacy", Dog.Breed.BULLDOG, 1);

        Dog[] dogs = {dog1, dog2, dog3, dog4};

        String uniquenessResult = Dog.areDogNamesUnique(dogs);
        System.out.println(uniquenessResult);

        Dog oldestDog = Dog.findOldestDog(dogs);
        System.out.println("The oldest dog is " + oldestDog.getName() + " and is a " + oldestDog.getAge());


    }
}
