package homework6.hw6_task1;

import homework6.hw6_task1.Bird;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Цей птах може літати");
    }
}
