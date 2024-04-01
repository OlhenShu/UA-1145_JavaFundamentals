package src.edu04.Task5;


public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Pusya", 5, Breed.AKITA);
        Dog dog2 = new Dog("Kuzya", 10, Breed.RETRIEVER);
        Dog dog3 = new Dog("Bobik", 8, Breed.LABRADOR);

        if ((dog1.name.equals(dog2.name)) | (dog2.name.equals(dog3.name)) | (dog1.name.equals(dog3.name))) {
            System.out.println("Names are equal.");

        } else {
            System.out.println("Names are not equal");
        }


        if ((dog1.age > dog3.age) & (dog1.age > dog2.age)) {
            System.out.println(dog1);
        }
        if ((dog2.age > dog1.age) & (dog2.age > dog3.age)) {
            {
                System.out.println(dog2);
            }
        }
        if ((dog3.age > dog1.age) & (dog3.age > dog2.age)) {
            System.out.println(dog3);
        }
    }


    @Override
    public String toString() {
        return "The oldest dog name ='" + name + '\'' +
                ", breed = " + breed.name();
    }
}





