package edu06.task1;

class Eagle extends FlyingBird {
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void displayInfo() {
        System.out.println("Eagle:");
        System.out.println("Feathers: " + getFeathers());
        System.out.println("Lays Eggs: " + isLayEggs());
    }
}
