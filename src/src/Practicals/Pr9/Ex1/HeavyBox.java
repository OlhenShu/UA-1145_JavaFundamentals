package Practicals.Pr9.Ex1;

import java.util.ArrayList;

public class HeavyBox {

    private int weight;
    private String contents;

    public static ArrayList<HeavyBox> boxesList = new ArrayList<>();

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;

        boxesList.add(this);
    }

    public static void printInfo() {
        for (HeavyBox i : HeavyBox.boxesList) {
            System.out.println(i.contents);
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
