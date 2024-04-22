public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1", 5));
        Thread thread2 = new Thread(new MyRunnable("Thread 2", 5));
        Thread thread3 = new Thread(new MyRunnable("Thread 3", 5));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
    }

    static class MyRunnable implements Runnable {
        private String message;
        private int times;

        public MyRunnable(String message, int times) {
            this.message = message;
            this.times = times;
        }

        @Override
        public void run() {
            for (int i = 0; i < times; i++) {
                System.out.println(message + ": " + (i + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
