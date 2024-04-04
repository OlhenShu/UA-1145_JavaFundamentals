package Practicals.Pr9.Ex1;

public class RunnerHeavyBox {

    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(2, "Cookies");
        HeavyBox box2 = new HeavyBox(5, "Candies");
        HeavyBox box3 = new HeavyBox(4, "Apples");
        HeavyBox box4 = new HeavyBox(10, "Pears");

        System.out.println("Before changing:");
        HeavyBox.printInfo();

        System.out.println();
        System.out.println("After changing:");

        HeavyBox.boxesList.get(0).setWeight(1);
        HeavyBox.boxesList.get(0).setContents("Apricots");
        HeavyBox.boxesList.remove(HeavyBox.boxesList.size() - 1);
        HeavyBox.printInfo();


    }
}
