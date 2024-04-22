package denys.serdiuk.homework14Threads;

class MessagePrinter implements Runnable {
	private String message;

	public MessagePrinter(String message) {
		this.message = message;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(message + ": Message " + (i + 1));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}