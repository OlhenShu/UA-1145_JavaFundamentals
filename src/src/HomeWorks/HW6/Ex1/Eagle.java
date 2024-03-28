package HomeWorks.HW6.Ex1;

public class Eagle extends FlyingBird {


    public Eagle(String featherColor, int layEggs) {
        super("Brown", layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}
