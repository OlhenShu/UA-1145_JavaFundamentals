package edu15.task3;

public class Main {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Thread number one is starting thread number 2");
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number 2");
                }
                System.out.println("Thread number two is starting thread number 3");
                Thread three = new Thread(() -> {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Thread number 3");
                    }
                });
                three.start();
                try {
                    three.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        one.start();
    }
}
