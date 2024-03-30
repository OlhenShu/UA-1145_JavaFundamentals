package Homework_6.Birds;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Kiwi(true, true);
        birds[3] = new Penguin(true, true);

        System.out.println("Method 'fly' using: ");
        for (var bird : birds) {
            bird.fly();
        }

        System.out.println("\nBirds info: ");
        for (var bird : birds) {
            System.out.println(bird);
        }
    }
}
