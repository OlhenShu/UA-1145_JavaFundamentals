package Homework_6.Birds;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public Bird() {

    }

    public abstract void fly();

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                " feathers = " + feathers +
                ", layEggs = " + layEggs +
                '}';
    }
}
