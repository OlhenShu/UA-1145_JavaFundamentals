package Task1;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println(" ");
        System.out.println("Information about object Penguin: ");
        System.out.println("Penguin`s feathers are " + getFeathers().toLowerCase());
        System.out.println("Can penguins lay eggs? " + isLayEggs());
    }
}
