package HM3;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, Breed breed, int age) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String checkNamesake(Dog[] dogs) {
        for (int i = 0; i < dogs.length - 1; i++) {
            if (dogs[i].getName().equals(dogs[i + 1].getName())) {
                return "We have dogs with the same name " + dogs[i].getName();
            }
        }
        return "All dogs have different names";
    }

    public static Dog findTheOldestDog(Dog[] dogs) {
        Dog oldest = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > oldest.getAge()) {
                oldest = dogs[i];
            }
        }
        return oldest;
    }

    enum Breed {
        Spaniel,
        Doberman,
        Haski,
        Borzaya,
        Rottweiler;
    }
}

class AllClientsofOurClinics {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Baron", Dog.Breed.Rottweiler, 5);
        Dog dog2 = new Dog("Kora", Dog.Breed.Spaniel, 15);
        Dog dog3 = new Dog("Kora", Dog.Breed.Rottweiler, 10);
        Dog[] dogs = {dog1, dog2, dog3};

        System.out.println("The oldest dog is " + Dog.findTheOldestDog(dogs).getName());
        String namesake = Dog.checkNamesake(dogs);
        System.out.println(namesake);

    }
}
