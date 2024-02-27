import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is you name?");
        String name = scanner.nextLine();
        System.out.println("Were do you live, " + name + "?");
        String adress = scanner.nextLine();


        System.out.print("Hello " + name);
        ;
        System.out.println(" from " + adress + "!");
    }


};
