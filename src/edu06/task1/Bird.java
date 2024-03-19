package edu06.task1;

abstract class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public String getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }
}


//Task 1
//Create abstract class called Bird  by scheme with attributes feathers and layEggs and an abstract fly() method.
//Create classes FlyingBird and NonFlyingBird.
//Create classes Eagle, Swallow, Penguin and Kiwi.
//        In main() method create an array Bird and add different birds to it. Call fly() method for all of it.
//        Output the information about each type of created bird.
