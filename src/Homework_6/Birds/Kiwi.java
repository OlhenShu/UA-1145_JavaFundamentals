package Homework_6.Birds;

public class Kiwi extends NonflyingBird{
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Kiwi() {
    }

    @Override
    public void fly() {
        System.out.println("Kiwi is not flying");
    }

    @Override
    public String toString() {
        return "Kiwi {" +
                "feathers = " + isFeathers() +
                ", layEggs = " + isLayEggs() +
                '}';
    }
}
