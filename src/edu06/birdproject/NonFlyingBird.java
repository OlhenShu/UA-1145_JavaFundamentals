package edu06.birdproject;

// Abstract class NonFlyingBird for non-flying birds
abstract class NonFlyingBird extends Bird {
    NonFlyingBird(boolean hasFeathers, boolean laysEggs) {
        super(hasFeathers, laysEggs);
    }

    // Override the fly method for non-flying birds
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
