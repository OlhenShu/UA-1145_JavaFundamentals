public class Main {
    public static void main(String[] args) {
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());
        Thread three = new Thread(new ThreadThree());

        one.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            System.out.println("Starting thread two");
            Thread two = new Thread(new ThreadTwo());
            two.start();
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            System.out.println("Starting thread three");
            Thread three = new Thread(new ThreadThree());
            three.start();
        }
    }

    static class ThreadThree implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }
    }
}
