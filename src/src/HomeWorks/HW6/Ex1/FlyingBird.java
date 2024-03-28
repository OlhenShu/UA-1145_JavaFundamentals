package HomeWorks.HW6.Ex1;

import java.util.ArrayList;

public abstract class FlyingBird extends Bird {

    public static ArrayList<FlyingBird> flyingBirdList = new ArrayList<>();

    public FlyingBird(String featherColor, int layEggs) {
        super(featherColor, layEggs);

        Bird.birdList.add(this);
        flyingBirdList.add(this);
    }
}
