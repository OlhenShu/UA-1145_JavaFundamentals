package edu06.task01;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    //Full name of the most common species.
    private String fullName;

    public Bird(boolean feathers, boolean layEggs, String fullName) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.fullName = fullName;
    }

    abstract void fly();

    @Override
    public String toString() {
        return "Bird[" +
                "feathers= " + feathers +
                ", can lay eggs= " + layEggs +
                ", full name= '" + fullName + '\'' +
                ']';
    }
}
