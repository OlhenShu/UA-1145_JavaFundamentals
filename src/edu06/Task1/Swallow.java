package edu06.Task1;

public class Swallow extends FlyingBird {

    private final String name = "Swallow";
    private final String typeOfFood = "grains";
    private final int size = 15;

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
