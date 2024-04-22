package denys.serdiuk.homework14Threads;

public class ThreadsMain {
	public static void main(String[] args) {

		Thread thread1 = new Thread(new MessagePrinter("Thread 1"));
		Thread thread2 = new Thread(new MessagePrinter("Thread 2"));

		thread1.start();
		thread2.start();

		try {

			thread1.join();

			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread thread3 = new Thread(new MessagePrinter("Thread 3"));
		thread3.start();
	}
}
