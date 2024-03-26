package edu09.practical;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    int weight;
    String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }
}

class HeavyBoxDemo {
    public static void main(String[] args) {
        List<HeavyBox> boxList = new ArrayList<>();
        boxList.add(new HeavyBox(2, "Computers"));
        boxList.add(new HeavyBox(5, "Books"));
        boxList.add(new HeavyBox(10, "Electronics"));
        boxList.add(new HeavyBox(1, "Tablet"));

        System.out.println("Our objects");
        for (HeavyBox boxes : boxList) {
            System.out.println(boxes);
        }

        boxList.get(0).weight += 1;
        System.out.println("After modification");

        for (HeavyBox boxes : boxList) {
            System.out.println(boxes);
        }
        boxList.remove(boxList.size() - 1);

        System.out.println("After modification");
        for (HeavyBox boxes : boxList) {
            System.out.println(boxes);
        }
    }
}
