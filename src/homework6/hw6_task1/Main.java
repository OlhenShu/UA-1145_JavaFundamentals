package homework6.hw6_task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Так","Так"),
                new Swallow("Так","Так"),
                new Penguin("Так","Так"),
                new Kiwi("Так","Так"),
        };
        for(Bird bird : birds){
            System.out.println(bird.getClass().getSimpleName());
            System.out.println("Чи існують пір'я: "+bird.feathers+"\nЧи існують яйця: "+bird.layEggs);
            bird.fly();
            System.out.println("|-|".repeat(15));
        }
    }
}
