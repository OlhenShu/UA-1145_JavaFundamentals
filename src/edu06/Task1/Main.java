package edu06.Task1;

public class Main {
    public static void main(String[] args) {
        Kiwi kiwi = new Kiwi();
        kiwi.setInfo(12, 5, true, true);
        Penguin penguin = new Penguin();
        penguin.setInfo(22, 4, false, true);
        Eagle eagle = new Eagle();
        eagle.setInfo(120, 2, true, true);
        Swallow swallow = new Swallow();
        swallow.setInfo(20, 3, true, true);

        Bird[] birds = {kiwi, penguin, eagle, swallow};
        for (Bird bird : birds) {
            if (bird == kiwi) {
                kiwi.getPersonInfo();
                kiwi.getNonFlyingInfo();
                kiwi.fly();
                System.out.println("-----------------------------");
            }
            if (bird == penguin) {
                penguin.getPersonInfo();
                penguin.getNonFlyingInfo();
                penguin.fly();
                System.out.println("-----------------------------");
            }
            if (bird == eagle) {
                eagle.personalInfo();
                eagle.getFlyingInfo();
                eagle.fly();
                System.out.println("-----------------------------");
            }
            if (bird == swallow) {
                swallow.personalInfo();
                swallow.getFlyingInfo();
                swallow.fly();
                System.out.println("-----------------------------");
            }
        }
    }
}

