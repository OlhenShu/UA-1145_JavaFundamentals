package edu06.task1;

class Penguin extends NonFlyingBird {
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void displayInfo() {
        System.out.println("Penguin:");
        System.out.println("Feathers: " + getFeathers());
        System.out.println("Lays Eggs: " + isLayEggs());
    }
}