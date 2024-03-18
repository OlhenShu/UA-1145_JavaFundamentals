package edu06.birdproject;

class Swallow extends FlyingBird {
    Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am swallow bird. I can fly high in the sky");
    }
}