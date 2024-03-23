package homeworks.homework_edu06.Homework.Task1;

public class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("This is penguin");
    }
}
