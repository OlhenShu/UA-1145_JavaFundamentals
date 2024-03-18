package edu06.birdproject;

class Eagle extends FlyingBird {
    Eagle(boolean hasFeathers, boolean laysEggs) {
        super(hasFeathers, laysEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am eagle. I can fly high in the sky");
    }
}
