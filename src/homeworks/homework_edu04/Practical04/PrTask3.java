package homework_edu04.Practical04;

import java.util.Scanner;

public class PrTask3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter country name: ");
        String country = SCANNER.nextLine();
        Continent continent = Continent.getForContinent(country);
        System.out.println("Country named " + country + " belongs to " + continent);
    }

}

enum Continent {
    EUROPE,
    ASIA,
    AFRICA,
    AMERICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static Continent getForContinent(String country) {
        return switch (country.toUpperCase()) {
            case "GERMANY", "FRANCE", "SPAIN" -> EUROPE;
            case "CHINA", "JAPAN", "INDIA" -> ASIA;
            case "NIGERIA", "EGYPT", "GHANA" -> AFRICA;
            case "USA", "BRAZIL", "CANADA" -> AMERICA;
            default -> throw new IllegalArgumentException("Nothing found");
        };
    }

    ;
}