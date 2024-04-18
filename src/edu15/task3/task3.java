package edu15.task3;

public class task3 {

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Thread number one started");
            Thread two = new Thread(() -> {
                System.out.println("Thread number two started");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread number two ended");
            });
            two.start();

            try {
                two.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread three = new Thread(() -> {
                System.out.println("Thread number three started");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread number three ended");
            });
            three.start();
        });

        one.start();
    }
}

