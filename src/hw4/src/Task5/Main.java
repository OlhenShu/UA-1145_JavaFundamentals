package Task5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rocky", Breed.Labrador, 24);
        Dog dog2 = new Dog("Jack", Breed.Bulldog,  4);
        Dog dog3 = new Dog("Jack", Breed.Shepherd, 5);

       Dog.dogsWithSameName(dog1, dog2, dog3);
       Dog.theOldestDog(dog1, dog2, dog3);
    }
}
