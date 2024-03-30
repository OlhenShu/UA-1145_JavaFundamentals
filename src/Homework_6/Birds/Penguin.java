package Homework_6.Birds;

public class Penguin extends NonflyingBird{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Penguin() {
    }

    @Override
    public void fly() {
        System.out.println("Penguin is not flying");
    }

    @Override
    public String toString() {
        return "Penguin {" +
                "feathers = " + isFeathers() +
                ", layEggs = " + isLayEggs() +
                '}';
    }
}
