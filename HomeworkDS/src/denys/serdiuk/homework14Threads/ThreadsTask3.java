package denys.serdiuk.homework14Threads;

public class ThreadsTask3 {
	public static void main(String[] args) {
		Thread one = new Thread(() -> {
			System.out.println("Thread one started");
			Thread two = new Thread(() -> {
				System.out.println("Thread two started");
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread number two");
				}
				System.out.println("Thread two finished");
			});

			Thread three = new Thread(() -> {
				System.out.println("Thread three started");
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number three");
				}
				System.out.println("Thread three finished");
			});

			two.start();
			try {
				two.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			three.start();
			try {
				three.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Thread one finished");
		});

		one.start();
	}
}
