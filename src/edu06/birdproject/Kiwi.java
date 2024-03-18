package edu06.birdproject;

class Kiwi extends NonFlyingBird {
    Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am kiwi. I can not fly.");
    }
}