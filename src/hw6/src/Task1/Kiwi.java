package Task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println(" ");
        System.out.println("Information about object Kiwi: ");
        System.out.println("Kiwi`s feathers are " + getFeathers().toLowerCase());
        System.out.println("Can kiwi lay eggs? " + isLayEggs());
    }
}
