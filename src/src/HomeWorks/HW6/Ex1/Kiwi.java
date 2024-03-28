package HomeWorks.HW6.Ex1;

public class Kiwi extends NonFlyingBird {
    public Kiwi(String featherColor, int layEggs) {
        super("Brown", layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi can't fly");
    }
}
