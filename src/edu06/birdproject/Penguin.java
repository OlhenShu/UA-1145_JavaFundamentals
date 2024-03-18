package edu06.birdproject;

class Penguin extends NonFlyingBird {
    Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am penguin. I can not fly.");
    }
}