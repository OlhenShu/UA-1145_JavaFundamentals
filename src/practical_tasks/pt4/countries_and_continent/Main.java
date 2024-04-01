package practical_tasks.pt4.countries_and_continent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country: ");
        switch (scanner.nextLine()) {
            case "Algeria", "Cabo Verde", "Cameroon" -> System.out.println(Continent.AFRICA.getCONTINENT_NAME());
            case "Bangladesh", "Bhutan", "Brunei" -> System.out.println(Continent.ASIA.getCONTINENT_NAME());
            case "Germany", "Greece", "Hungary" -> System.out.println(Continent.EUROPE.getCONTINENT_NAME());
            case "Canada", "Costa Rica", "Cuba" -> System.out.println(Continent.NORTH_AMERICA.getCONTINENT_NAME());
            case "Brazil", "Chile", "Colombia" -> System.out.println(Continent.SOUTH_AMERICA.getCONTINENT_NAME());
            default -> throw new IllegalStateException("Unexpected value");
        }
    }
}
