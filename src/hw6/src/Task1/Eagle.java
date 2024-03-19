package Task1;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println(" ");
        System.out.println("Information about object Eagle: ");
        System.out.println("Eagle`s feathers are " + getFeathers().toLowerCase());
        System.out.println("Can eagles lay eggs? " + isLayEggs());
    }
}
