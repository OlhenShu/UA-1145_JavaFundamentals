package edu06.HomeWork01;

abstract class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("This bird can fly");
    }
}

