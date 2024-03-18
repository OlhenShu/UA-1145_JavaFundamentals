package edu06.task1;

class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void displayInfo() {
        System.out.println("Kiwi:");
        System.out.println("Feathers: " + getFeathers());
        System.out.println("Lays Eggs: " + isLayEggs());
    }
}