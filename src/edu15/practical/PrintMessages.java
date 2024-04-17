package edu15.practical;

public class PrintMessages {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");

            try {
                Thread.sleep(2000); // 2 seconds interval
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Peace in the peace");

            try {
                Thread.sleep(3000); // 3 seconds interval
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("My name is Olha");
    }
}
