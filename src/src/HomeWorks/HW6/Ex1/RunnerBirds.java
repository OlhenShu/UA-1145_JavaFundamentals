package src.HomeWorks.HW6.Ex1;

public class RunnerBirds {
    public static void main(String[] args) {
        //why you didn't use an array? like this
        Bird[] birds = {new Eagle("Brown", 2),
                new Swallow("Black", 1),
                new Kiwi("Brown", 1),
                new Penguin("Black and white", 2),
        };

        Eagle eagle1 = new Eagle("Brown", 2);
        Eagle eagle2 = new Eagle("Brown", 3);
        Eagle eagle3 = new Eagle("Brown", 5);
        Kiwi kiwi1 = new Kiwi("Brown", 1);
        Kiwi kiwi2 = new Kiwi("Brown", 2);
        Swallow swallow1 = new Swallow("Black", 1);
        Swallow swallow2 = new Swallow("Black", 2);
        Swallow swallow3 = new Swallow("Black", 0);
        Penguin penguin1 = new Penguin("Black and white", 1);
        Penguin penguin2 = new Penguin("Black and white", 2);


//        for (Bird bird : birds) {
//            bird.fly();
//        }// you can

        eagle1.fly();
        swallow1.fly();
        kiwi1.fly();
        penguin1.fly();

        System.out.println();

        System.out.println("Total number of birds: " + Bird.birdList.size()
                + ". Total number of flying birds: " + FlyingBird.flyingBirdList.size()
                + ". Total number of non-flying birds: " + NonFlyingBird.nonFlyingBirdList.size());

        System.out.println();
        System.out.println(FlyingBird.flyingBirdList.toString());
        System.out.println(NonFlyingBird.nonFlyingBirdList.toString());
    }


}
