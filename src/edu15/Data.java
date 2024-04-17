package edu15;

public class Data {
    private final int[] buffer = new int[10];
    private int count = 0;

    public synchronized void add(int value) {
        while (count == buffer.length) {
            try {
                // Чекаємо, поки споживач не звільнить місце
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        buffer[count++] = value;
        // Сповіщаємо споживача, що є дані для читання
        notify();
    }

    public synchronized int get() {
        while (count == 0) {
            try {
                // Чекаємо, поки виробник не додасть щось у масив
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }
        int value = buffer[--count];
        // Сповіщаємо виробника, що є вільне місце
        notify();
        return value;
    }
}

class Producer implements Runnable {
    private final Data data;

    public Producer(Data data) {
        this.data = data;
    }

    public void run() {
        int value = 0;
        while (true) {
            data.add(value++);
            try {
                Thread.sleep(1000); // Припустимо виробництво триває 1 секунду
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class Consumer implements Runnable {
    private final Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            int value = data.get();
            System.out.println("Consumed: " + value);
            try {
                Thread.sleep(1000); // Читання триває 1 секунду
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread producerThread = new Thread(new Producer(data));
        Thread consumerThread = new Thread(new Consumer(data));
        producerThread.start();
        consumerThread.start();
    }
}
