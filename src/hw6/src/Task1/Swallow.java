package Task1;

public class Swallow  extends FlyingBird{
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println(" ");
        System.out.println("Information about object Swallow: ");
        System.out.println("Swallow`s feathers are " + getFeathers().toLowerCase());
        System.out.println("Can swallows lay eggs? " + isLayEggs());
    }
}
