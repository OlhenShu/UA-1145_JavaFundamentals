package homeworks.homework_edu06.Homework.Task1;

public class Eagle extends FlyingBird {
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("This is eagle");
    }
}
