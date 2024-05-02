package src.HomeWorks.HW6.Ex1;

public class Penguin extends NonFlyingBird {


    public Penguin(String featherColor, int layEggs) {
        super("Black and white", layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Penguin can't fly");
    }
}
