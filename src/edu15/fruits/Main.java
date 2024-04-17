package edu15.fruits;

class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        new Producer(basket);
        new Consumer(basket);
    }
}