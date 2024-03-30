package Homework_6.Birds;

public class Swallow extends FlyingBird{
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying");
    }

    @Override
    public String toString() {
        return "Swallow {" +
                "feathers = " + isFeathers() +
                ", layEggs = " + isLayEggs() +
                '}';
    }

}
