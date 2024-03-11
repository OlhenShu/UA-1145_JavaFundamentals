import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c1, c2, c3;//its bad to use single letter variables and write variables in one line
        int t1, t2, t3;//the same here
        //it would be better to write it like this
        //double cost1;
        //double cost2;
        //double cost3;
        //int time1;
        //int time2;
        //int time3;


        System.out.println("There were 3 calls, how long were they?");
        t1 = scanner.nextInt();
        t2 = scanner.nextInt();
        t3 = scanner.nextInt();
        System.out.println("And what was the cost per minute of the first one?");
        c1 = scanner.nextInt();
        System.out.println("The second one");
        c2 = scanner.nextInt();
        System.out.println("and third one");
        c3 = scanner.nextInt();
        System.out.println("So the first call was " + t1 + " minutes long and costs" + c1 + "UAH per minute \n" +
                "Second one was " + t2 + " minutes long and costs" + c2 + "UAH per minute \n"
                + "And third one was" + t3 + " minutes long and costs" + c3 + "UAH per minute \n");
        double totalCost1 = c1 * t1;
        double totalCost2 = c2 * t2;
        double totalCost3 = c3 * t3;
        double totalCostOveall = totalCost1 + totalCost2 + totalCost3;
        System.out.println("The first one costs " + totalCost1 +
                "\nThe second one costs " + totalCost2 +
                "\nThe third one costs " + totalCost3
                + "\nAnd that sums up to " + totalCostOveall);
    }
}