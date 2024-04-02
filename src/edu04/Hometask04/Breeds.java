package edu04.Hometask04;

public enum Breeds {
    POODLE,
    CANE_CORSO,
    BOXER,
    MALAMUTE,
    BEAGLE,
    CHIHUAHUA,
    GERMAN_SHEPHERD;

}
class Dog{
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Spanky", Breeds.CHIHUAHUA.toString(), 1);
        Dog dog2 = new Dog("Spanky", Breeds.BEAGLE.toString(), 3);
        Dog dog3 = new Dog("Lucky", Breeds.BOXER.toString(), 7);

        if (dog1.name ==dog2.name) {
            System.out.println("There are two dogs with the same name! This name is " +
                    dog1.name);
        } else if (dog1.name ==dog3.name) {
            System.out.println("There are two dogs with the same name! This name is " +
                    dog1.name);
        } else if (dog2.name == dog3.name) {
            System.out.println("There are two dogs with the same name! This name is " +
                    dog2.name);
        } else {
            System.out.println("All dogs have unique names.");
        }

        Dog theOldest = dog1;
        if (dog2.getAge() > theOldest.getAge()) {
            theOldest = dog2;
        }
        if (dog3.getAge() >  theOldest.getAge()) {
            theOldest = dog3;
        }
        System.out.println("The oldest dog are " + theOldest.getAge() +
                " years old, its name is " + theOldest.getName());
    }
}
