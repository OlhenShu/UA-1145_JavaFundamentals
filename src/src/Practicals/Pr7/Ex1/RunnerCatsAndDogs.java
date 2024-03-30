package Practicals.Pr7.Ex1;

public class RunnerCatsAndDogs {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Tom", 3);
        Cat cat3 = new Cat("Kuzia", 8);
        Dog dog = new Dog("Bobik", 2);
        Dog dog2 = new Dog("Sharik", 4);
        Dog dog3 = new Dog("Rex", 7);

        cat.voice();
        cat.feed();
        dog.voice();
        dog.feed();
    }
}
