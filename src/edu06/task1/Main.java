package edu06.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("Golden", true);
        birds[1] = new Swallow("Black", true);
        birds[2] = new Penguin("Black and White", true);
        birds[3] = new Kiwi("Brown", true);

        for (Bird bird : birds) {
            bird.fly();
            if (bird instanceof Eagle) {
                ((Eagle) bird).displayInfo();
            } else if (bird instanceof Swallow) {
                ((Swallow) bird).displayInfo();
            } else if (bird instanceof Penguin) {
                ((Penguin) bird).displayInfo();
            } else if (bird instanceof Kiwi) {
                ((Kiwi) bird).displayInfo();
            }
            System.out.println();
        }
    }
}