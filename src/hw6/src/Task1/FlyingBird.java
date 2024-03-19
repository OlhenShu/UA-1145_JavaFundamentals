package Task1;

public class FlyingBird extends Bird{

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly! Congratulations!");
    }

    @Override
    public void output() {
    }

}
