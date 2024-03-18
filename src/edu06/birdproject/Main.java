package edu06.birdproject;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(false, true),
                new Kiwi(false, true)};

        for (Bird iterator : birds) {
            System.out.print("Class: " + iterator.getClass().getName() + "\nFeathers: " + iterator.hasFeathers + "\nLay eggs: " + iterator.laysEggs + '\n');
            iterator.fly();
            System.out.print("\n----------------------------------------\n");
            System.out.println();
        }
    }

}