package Homework_6.Birds;

public class FlyingBird extends Bird{

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

}
