package edu04.Practical;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

enum Continent {
    ASIA, EUROPE, AMERICA, AFRICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }


    public static Continent getForContinent(String country) {
        return switch (country.toUpperCase()) {
            case "UKRAINE", "GERMANY", "FRANCE" -> EUROPE;
            case "USA", "CANADA", "MEXICAN" -> AMERICA;
            case "PAR", "IRAN", "EGYPT", "TURKEY" -> AFRICA;
            case "CHINA", "JAPAN", "KOREA" -> ASIA;
            default -> throw new IllegalArgumentException("Unknown country " + country);

        };
    }
}

public class PrTask3 {
    private static final Scanner SCANNER = new Scanner(System.in) ;
    public static void main(String[] args) {
        System.out.println("Enter country name: ");
        String country = SCANNER.nextLine();
        Continent continent = Continent.getForContinent(country);
        System.out.println("Country named '" + country + "' belongs to " + continent);
    }
}
