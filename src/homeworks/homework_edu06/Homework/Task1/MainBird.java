package homeworks.homework_edu06.Homework.Task1;

public class MainBird {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(true, true),
                new Kiwi(true, true),
        };


        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Fathers: " + bird.feathers);
            System.out.println("Fathers: " + bird.layEggs);
            System.out.println(" ");


        }
    }


}
