package edu06.task01;

abstract class FlyingBird extends Bird {


    public FlyingBird(boolean feathers, boolean layEggs, String fullName) {
        super(feathers, layEggs, fullName);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly");

    }
}
