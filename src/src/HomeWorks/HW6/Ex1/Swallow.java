package src.HomeWorks.HW6.Ex1;

public class Swallow extends FlyingBird {


    public Swallow(String featherColor, int layEggs) {
        super("Black", layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallow can fly");
    }
}
