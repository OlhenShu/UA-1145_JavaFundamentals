package homework.hw4.dog;

public class DogMain {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jerry", Breed.SIBERIAN_HUSKY, 2);
        Dog d2 = new Dog("Netty", Breed.MALINOIS, 8);
        Dog d3 = new Dog("Jerry", Breed.BORDER_COLLIE, 5);

        System.out.println(sameDogNameChecker(d1, d2, d3));
        System.out.println(getTheOldestDog(d1, d2, d3));
    }

    public static boolean sameDogNameChecker(Dog d1, Dog d2, Dog d3) {
        return d1.equals(d2) || d2.equals(d3) || d1.equals(d3);
    }

    public static Dog getTheOldestDog(Dog d1, Dog d2, Dog d3) {
        if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
            return d1;
        } else if (d2.getAge() > d1.getAge() && d2.getAge() > d3.getAge()) {
            return d2;
        } else {
            return d3;
        }
    }
}
