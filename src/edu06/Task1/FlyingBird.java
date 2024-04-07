package edu06.Task1;

public class FlyingBird extends Bird {

    private int flightSpeed;
    private int wingspan;


    public void setInfo(int flightSpeed, int wingspan, boolean feathers, boolean layEggs) {

        setFlightSpeed(flightSpeed);
        setWingspan(wingspan);
        setFeathers(feathers);
        setLayEggs(layEggs);

    }

    public void getFlyingInfo() {
        System.out.println(
                "It can reach speed near " + getFlightSpeed() + "miles per hour" + ".\n"
                        + "I's wing is about " + getWingspan() + " cm. " + IsLayEggs() + ".\n"
                        + haveItFeather());

    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }


    @Override
    public void fly() {
        System.out.println("I can fly");
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
