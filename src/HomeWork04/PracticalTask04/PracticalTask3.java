package HomeWork04.PracticalTask04;

import java.util.Scanner;

import static java.lang.System.in;

public class PracticalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter country name: ");
        String country = scanner.nextLine();
        Continent continent = Continent.getForCountry(country);
        System.out.println("Country named " + country + " " + "belongs to " + continent);
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

    public static Continent getForCountry(String country) {
        return switch (country.toUpperCase()) {
            case "FRANCE", "GERMANY", "UKRAINE" -> EUROPE;
            case "KENYA", "ALGERIA", "ETHIOPIA" -> AFRICA;
            case "JAPAN", "INDIA", "THAILAND" -> AFRICA;
            case "UNITED STATES", "BRAZIL", "CANADA" -> AMERICA;

            default -> throw new IllegalStateException("Unknown country: " + country);
        };
    }
}
