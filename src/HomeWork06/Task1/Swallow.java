package HomeWork06.Task1;

public class Swallow extends FlyingBird{
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly(){
        super.fly();
        System.out.println("It's Swallow");
    }
}
