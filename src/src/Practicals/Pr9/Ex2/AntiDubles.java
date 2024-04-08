package Practicals.Pr9.Ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AntiDubles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        String str = "1, 66, 66, 2, 5, 5, 66, 98, 6, 5, 2";
        ArrayList<Integer> list = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");

        while (stringTokenizer.hasMoreTokens()) {
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                stringBuilder.append(list.get(i));
                stringBuilder.append(", ");
            } else {
                stringBuilder.append(list.get(i));
            }
        }

        String result = String.valueOf(stringBuilder);
        System.out.println(result);

        scanner.close();
    }
}
