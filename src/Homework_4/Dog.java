package Homework_4;

// Task 5


public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }



    public static void theOldest (Dog dog1, Dog dog2, Dog dog3) {
        int oldest = dog1.age;
        Dog oldestDog = dog1;
        if (dog2.age > dog1.age) {
            oldest = dog2.age;
            oldestDog = dog2;
        }
        if (dog3.age > oldest) {
            oldest = dog3.age;
            oldestDog = dog3;
        }

        System.out.println("The oldest dog is " + oldestDog.name + ", breed " + oldestDog.breed);
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby", Breed.BOXER, 12);
        Dog dog2 = new Dog("Oreo", Breed.BEAGLE, 7);
        Dog dog3 = new Dog("Funny", Breed.POODLE, 3);

        if (dog1.equals(dog2)) {
            System.out.println(dog1.breed.toString() + " and " + dog2.breed.toString() + " have same names");
        } else if ((dog3.equals(dog2))) {
            System.out.println(dog3.breed.toString() + " and " + dog2.breed.toString() + " have same names");
        } else if ((dog3.equals(dog1))) {
            System.out.println(dog3.breed.toString() + " and " + dog1.breed.toString() + " have same names");
        } else {
            System.out.println("All dogs have different names");
        }

        theOldest(dog1, dog2, dog3);
    }
}

enum Breed {
    BULLDOG, POODLE, BOXER, ROTTWEILER, BEAGLE, HUSKY;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }
}
