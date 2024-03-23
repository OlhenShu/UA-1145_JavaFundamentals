package homeWork1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class NameAndAddress {
    private String name;
    private String address;
    private Scanner scanner = new Scanner(System.in);
    public void greeting(){
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Where do you live, "+ name + " ?");
        address = scanner.nextLine();
        System.out.println(name + " lives on " + address);
    }



}
