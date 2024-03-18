package edu06.birdproject;

// Abstract class Bird to represent birds
abstract class Bird {
    boolean hasFeathers;
    boolean laysEggs;

    // Constructor for Bird class
    Bird(boolean hasFeathers, boolean laysEggs) {
        this.hasFeathers = hasFeathers;
        this.laysEggs = laysEggs;
    }

    // Abstract method fly that must be implemented in subclasses
    public abstract void fly();
}
