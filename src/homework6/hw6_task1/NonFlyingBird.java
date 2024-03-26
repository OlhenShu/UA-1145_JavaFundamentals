package homework6.hw6_task1;

import homework6.hw6_task1.Bird;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Цей птах не може літати");
    }
}
