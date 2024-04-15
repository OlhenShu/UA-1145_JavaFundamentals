package HomeWork06.Task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(true, true),
                new Kiwi(true, true),
        };
        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.feathers);
            System.out.println("LayEggs: " + bird.layEggs);
            System.out.println(" ");
        }
    }
}
