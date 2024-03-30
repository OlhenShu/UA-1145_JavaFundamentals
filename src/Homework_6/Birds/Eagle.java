package Homework_6.Birds;

public class Eagle extends FlyingBird{

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public String toString() {
        return "Eagle {" +
                "feathers = " + isFeathers() +
                ", layEggs = " + isLayEggs() +
                '}';
    }

}
