package edu15.fruits;

public class Producer implements Runnable {
    Basket basket;
    String[] fruits = {"Apple", "Orange", "Lemon", "Cherry", "Banana"};

    public Producer(Basket basket) {
        this.basket = basket;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            basket.putFruit(fruits[i]);
        }
    }
}
