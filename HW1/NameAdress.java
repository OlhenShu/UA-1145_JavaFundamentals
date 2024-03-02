import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
	String address;
        
	Scanner scanner = new Scanner(System.in);
        
	System.out.println("What is your name?");
        name = scanner.nextLine();
        
	System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();
	
	scanner.close();
        
	System.out.println("Name: " + name + '\n' + "Adress: " + address);
    }
}