package edu06.Task1;

public class Kiwi extends NonFlyingBird {

    private final String name = "Kiwi";


    private final String food = "Fruits";

    private final String color = "brown";


    public String getFood() {
        return food;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void getPersonInfo() {
        System.out.println("It's " + getName() + ". \n" +
                getName() + " likes to eat " + getFood() + " and it's color is " + getColor());
    }


}




