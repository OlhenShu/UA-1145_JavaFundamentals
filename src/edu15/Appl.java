package edu15;

public class Appl {
    static int sum = 0;
    private final static Object LOCK_SUM = new Object();

    // think about thread-safe
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                synchronized (LOCK_SUM) {
                    sum++;
                }
            }
        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                synchronized (LOCK_SUM) {
                    sum--;
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Sum is = " + sum);
    }
}

class DeadLock {
    public synchronized static void main(String[] args) throws InterruptedException {
        System.out.println("Starting");
        var t = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                main(null);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );
        t.start();
        t.join();
    }

}