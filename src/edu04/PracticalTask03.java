package edu04;

import java.util.Scanner;

public class PracticalTask03 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter country name: ");
        String country = SCANNER.nextLine();
        Continent continent = Continent.getForCountry(country);
        System.out.println("Country name " + country + " belongs to " + continent);
    }
}

enum Continent {
    ASIA, EUROPE, AMERICA, AFRICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static Continent getForCountry(String country) {
        return switch (country) {
            case "Ukraine", "Germany", "France" -> EUROPE;
            case "USA", "Canada" -> AMERICA;
            default -> throw new IllegalArgumentException("Unknown country " + country);
        };
    }
}
