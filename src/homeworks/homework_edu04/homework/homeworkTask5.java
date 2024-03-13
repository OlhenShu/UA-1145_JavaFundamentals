package homework_edu04.homework;

public class homeworkTask5 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Daisy", Dog.Breed.POODLE, 15);
        Dog dog2 = new Dog("Lili", Dog.Breed.BEAGLE, 1);
        Dog dog3 = new Dog("Coco", Dog.Breed.LABRADOR, 5);


        Dog theOldestDog = dog1;
        if (dog2.getAge() > theOldestDog.getAge()) {
            theOldestDog = dog2;
        }
        if (dog3.getAge() > theOldestDog.getAge()) {
            theOldestDog = dog3;
        }
        System.out.println("The oldest dog is: " + theOldestDog.getName() + ", with age: " + theOldestDog.getAge());


        Dog[] dogs = {dog1, dog2, dog3};
        if (checkingForUniqueness(dogs)) {
            System.out.println("Two dogs cannot have the same name");
        }
    }

    private static boolean checkingForUniqueness(Dog[] dogs) {
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    return true;
                }
            }
        }

        return false;

    }

}

class Dog {
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

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public enum Breed {
        BULLDOG,
        LABRADOR,
        POODLE,
        BEAGLE,
        PUGS;
    }

}
