package HomeWork06.Task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly(){
        super.fly();
        System.out.println("It's Kiwi");
    }
}
