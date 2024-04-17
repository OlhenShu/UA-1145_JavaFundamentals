package edu15;

public class ThreadEx extends Thread {
    private int number;
    private int pause;

    public ThreadEx(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread " + number);
        }
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadEx(1, 100);
        Thread t2 = new ThreadEx(2, 250);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("It's main");
    }
}
