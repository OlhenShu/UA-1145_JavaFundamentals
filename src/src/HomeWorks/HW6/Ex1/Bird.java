package src.HomeWorks.HW6.Ex1;

import java.util.ArrayList;

public abstract class Bird {
    private String featherColor;
    private int layEggs;

    public static ArrayList<Bird> birdList = new ArrayList<>();

    public Bird(String featherColor, int layEggs) {
        this.featherColor = featherColor;
        this.layEggs = layEggs;

    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
