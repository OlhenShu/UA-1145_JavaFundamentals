package Homework_6.Birds;

public class NonflyingBird extends Bird{

    public NonflyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public NonflyingBird() {
    }

    @Override
    public void fly() {
        System.out.println("Bird is not flying");
    }
}
