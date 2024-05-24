package Practicals.Pr14.Ex2;

public class TwoMassages {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Bye, bye");

    }
}
