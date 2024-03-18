package edu06.task1;

class Swallow extends FlyingBird {
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void displayInfo() {
        System.out.println("Swallow:");
        System.out.println("Feathers: " + getFeathers());
        System.out.println("Lays Eggs: " + isLayEggs());
    }
}