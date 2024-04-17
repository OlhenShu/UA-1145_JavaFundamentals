package edu15;

public class Example {
    public static void main(String[] args) {
        var thread1 = new MyThread();
        thread1.run();
        System.out.println("*****");
        thread1.start();
        System.out.println("*****");
        var t2 = new Thread(new ThreadTask("task1"));
        t2.start();

        var t3 = new Thread(() -> {
            System.out.println("This code is running by: " + Thread.currentThread().getName());
        });
        t3.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is thread with name " + currentThread().getName());
        System.out.println("This code is running by: " + currentThread().getName());
    }
}

class ThreadTask implements Runnable {
    String task;

    public ThreadTask(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("This is task: " + task);
        System.out.println("This code is running by: " + Thread.currentThread().getName());
    }
}
