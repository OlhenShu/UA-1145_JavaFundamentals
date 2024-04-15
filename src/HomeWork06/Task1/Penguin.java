package HomeWork06.Task1;

public class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly(){
        super.fly();
        System.out.println("It's Penguin");
    }
}
