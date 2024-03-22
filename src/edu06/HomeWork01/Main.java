package edu06.HomeWork01;

public class Main {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName());
            bird.fly();
            System.out.println("Is this bird feathered? " + (bird.isFeathers() ? "Yes" : "No"));
            System.out.println("Is this bird lays eggs? " + (bird.isLayEggs() ? "Yes" : "No"));
            System.out.println("=".repeat(40));
        }

    }
}

