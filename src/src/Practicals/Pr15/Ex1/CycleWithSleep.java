package Practicals.Pr15.Ex1;

public class CycleWithSleep {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
