package edu06.task01;


public class Main {


    public Bird[] birds = {
            new Eagle(true, true, "Bald Eagle"),
            new Swallow(true, true, "Barn Swallow"),
            new Penguin(true, true, "King penguin"),
            new Kiwi(true, true, "Kiwi")
    };

    public static void main(String[] args) {


        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true, "Bald Eagle");
        birds[1] = new Swallow(true, true, "Barn Swallow");
        birds[2] = new Penguin(true, true, "King penguin");
        birds[3] = new Kiwi(true, true, "Kiwi");


        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName());

            System.out.println(bird);
            bird.fly();
            System.out.println("=".repeat(40));
        }
    }

}
