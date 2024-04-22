package edu15.task1;

public class Main {
    public static void main(String[] args) {
        Thread first = new MyThread();
        Thread second = new MyThread();
        Thread third = new MyThread();

        first.start();
        second.start();

        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        third.start();
    }
}