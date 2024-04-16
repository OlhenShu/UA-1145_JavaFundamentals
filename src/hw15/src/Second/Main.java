package Second;

public class Main {
    public synchronized static void main(String[] args) throws InterruptedException {
        Thread deadlock = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName()  + " is working");
                main(null);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        deadlock.start();
        deadlock.join();
    }
}
