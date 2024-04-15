package HomeWork06.Task1;

public class Eagle extends FlyingBird {
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        super.fly();
        System.out.println("It's Eagle");
    }

}
