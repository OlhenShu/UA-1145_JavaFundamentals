package Practicals.Pr12.Ex2;

public class Runner {

    public static void main(String[] args) {
        try {
            Plant pl = new Plant("rose", "blue", 5);
            System.out.println(pl);
        } catch (Plant.ColorException | Plant.TypeException e) {
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }

        try {
            Plant pl = new Plant("dandelion", "blue", 5);
            System.out.println(pl);
        } catch (Plant.ColorException | Plant.TypeException e) {
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }

    }
}