package edu06.birdproject;

// Abstract class FlyingBird for flying birds
abstract class FlyingBird extends Bird {
    FlyingBird(boolean hasFeathers, boolean laysEggs) {
        super(hasFeathers, laysEggs);
    }

    // Override the fly method for flying birds
    @Override
    public void fly() {
        System.out.println("I can fly high in the sky");
    }
}
