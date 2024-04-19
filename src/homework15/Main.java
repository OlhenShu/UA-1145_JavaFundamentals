package homework15;

public class Main {
    private static final Object deadlockFirst = new Object();
    private static final Object deadlockSecond = new Object();
    public static void main(String[] args) {
        //task1
        ThreadTask firstThread = new ThreadTask("Hello",5);
        ThreadTask secondThread = new ThreadTask("Good morning",5);
        ThreadTask thirdThread = new ThreadTask("Goodbye",5);
        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException excep) {
            throw new RuntimeException(excep);
        }
        thirdThread.start();
        //task2
        Thread thread1 = new Thread(()->{
            synchronized (deadlockFirst){
                System.out.println("First lock");
                try {
                    Thread.sleep(150);
                    System.out.println("Thread is asleep for 150 millis");
                } catch (InterruptedException excep) {
                    throw new RuntimeException(excep);
                }synchronized (deadlockSecond){
                    System.out.println("Second lock");
                }
            }
        });
        Thread thread2 = new Thread(()->{
            synchronized (deadlockSecond){
                System.out.println("Second lock");
                try {
                    Thread.sleep(50);
                    System.out.println("Thread is asleep for 50 millis");
                } catch (InterruptedException excep) {
                    throw new RuntimeException(excep);
                }synchronized (deadlockFirst){
                    System.out.println("First lock");
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException excep) {
            throw new RuntimeException(excep);
        }
        //task3
        ThreadTask threadOne = new ThreadTask("First",1);
        ThreadTask threadTwo = new ThreadTask("Two",3);
        ThreadTask threadThree = new ThreadTask("Three",5);
        threadOne.start();
        try {
            threadOne.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadTwo.start();
        threadThree.start();
    }
}
