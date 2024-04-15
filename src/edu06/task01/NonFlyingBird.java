package edu06.task01;

abstract class NonFlyingBird extends Bird {


    public NonFlyingBird(boolean feathers, boolean layEggs, String fullName) {
        super(feathers, layEggs, fullName);
    }

    @Override
    public void fly() {
        System.out.println("This bird cannot fly");

    }
}
