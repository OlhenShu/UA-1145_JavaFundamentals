package edu06.Task1;

public class Eagle extends FlyingBird {

    private final String name = "Eagle";
    private final String typeOfFood = "meat";
    private final int size = 90;

    public String getName() {
        return name;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public int getSize() {
        return size;
    }

    public void personalInfo() {
        System.out.println("This is " + getName() + "\n" +
                getName() + "'s type of food is " + getTypeOfFood() + ". \n" +
                "It's size is " + getSize());
    }
}
