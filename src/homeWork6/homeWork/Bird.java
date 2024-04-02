package homeWork6.homeWork;

abstract class Bird {
    String feathers;
    boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return " this bird: " +
                " feathers is '" + feathers + '\'' +
                ", and it layEggs= " + layEggs +
               " .";
    }

    abstract void fly();
}

class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can fly.");
    }
}

class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird does not fly.");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super("Brown and white", true);
    }
}

class Swallow extends FlyingBird {

    public Swallow() {
        super("Brown", true);
    }
}

class Penguin extends NonFlyingBird {

    public Penguin(){
        super("Black and white",true);
    }
}

class Kiwi extends NonFlyingBird {

    public Kiwi(){
        super("Brown",true);
    }
}

class RunBird{
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };
        for(Bird bird:birds){
            System.out.println(bird.getClass().getSimpleName() + ": " + bird);
            bird.fly();
        }
    }

}
