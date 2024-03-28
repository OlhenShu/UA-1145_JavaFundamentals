package HomeWorks.HW6.Ex1;

import java.util.ArrayList;

public abstract class NonFlyingBird extends Bird {

    public static ArrayList<NonFlyingBird> nonFlyingBirdList = new ArrayList<>();

    public NonFlyingBird(String featherColor, int layEggs) {
        super(featherColor, layEggs);

        Bird.birdList.add(this);
        nonFlyingBirdList.add(this);
    }
}
