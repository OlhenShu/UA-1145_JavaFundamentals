public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(true, true),
                new Kiwi(true, true)
        };

        for (Bird bird : birds) {
            System.out.println("Feathers: " + bird.hasFeathers() + ", Lays eggs: " + bird.laysEggs());
            bird.fly();
            System.out.println();
        }
    }
}