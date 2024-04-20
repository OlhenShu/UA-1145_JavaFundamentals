package HM6;

public class AbstractBird {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };
        for (Bird bird : birds) {
            System.out.println("Type of bird: " + bird.getClass().getSimpleName() + "\n" + bird);
            bird.fly();

        }
    }

}

abstract class Bird {
    private String feathers;
    private boolean layEggs;

    public String getFeathers() {
        return feathers;
    }

    public boolean getLayEggs() {
        return layEggs;
    }

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String toString() {
        return " this bird: " + "\n" +
                " feathers is: " + feathers + "\n" +
                " layEggs:  " + layEggs;

    }

    abstract void fly();
}

class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can fly");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can't fly");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super("Brown", true);
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super("Blue", true);
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Black and white ", true);
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Brown", true);
    }
}