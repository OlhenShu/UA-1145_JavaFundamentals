package edu06.Task1;

public class Penguin extends NonFlyingBird {

    private final String name = "Penguin";

    private final String food = "fish";
    private final String color = "black&white";

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getColor() {
        return color;
    }

    public void getPersonInfo() {
        System.out.println("It's " + getName() + ". \n" +
                getName() + " likes to eat " + getFood() + " and it's color is " + getColor());
    }
}

