package edu06.Task1;

public class NonFlyingBird extends Bird {

    String name;
    String food;
    String color;
    private boolean feathers;
    private int speedOfMovement;
    private int wingSize;

    public int getSpeedOfMovement(int speedOfMovement) {
        return this.speedOfMovement;
    }

    public void setSpeedOfMovement(int speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    public int getWingSize(int wingSize) {
        return this.wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public void setInfo(int speedOfMovement, int wingSize, boolean feathers, boolean layEggs) {
        setSpeedOfMovement(speedOfMovement);
        setWingSize(wingSize);
        setFeathers(feathers);
        setLayEggs(layEggs);

    }

    @Override
    public void fly() {
        System.out.println("This bird can't fly");
    }

    public void getNonFlyingInfo() {
        System.out.println(
                "It can reach speed near " + getSpeedOfMovement(speedOfMovement) + "miles per hour" + ".\n"
                        + "I's wing is about " + getWingSize(wingSize) + " cm. " + IsLayEggs() + ".\n"
                        + haveItFeather());

    }

    public String IsLayEggs() {
        if (!isLayEggs()) {
            return "It doesn't lay eggs";
        } else {
            return "It lay eggs";
        }
    }

    public String haveItFeather() {
        if (!isLayEggs()) {
            return "It hasn't feather";
        } else {
            return "It has feather";
        }

    }

}




