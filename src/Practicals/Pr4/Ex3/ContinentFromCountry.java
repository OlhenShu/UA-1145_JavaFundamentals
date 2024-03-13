package Practicals.Pr4.Ex3;

import java.util.Locale;
import java.util.Scanner;

public class ContinentFromCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a country");
        String country = scanner.nextLine();

        System.out.println(country + " is in " + getContinent(country));
    }

    public static Continents getContinent (String country){
        String temp = country.toLowerCase(Locale.ROOT);

        // я занадто лінива, щоб вставляти всі 300 країн світу

        switch (temp) {
            case "nigeria", "ethiopia", "egypt", "tanzania", "kenya" -> {
                return Continents.AFRICA;
            }
            case "india", "china", "indonesia", "pakistan", "japan" -> {
                return Continents.ASIA;
            }
            case "germany", "france", "italy", "spain", "ukraine" -> {
                return Continents.EUROPE;
            }
            case "brazil", "colombia", "argentina", "peru", "chile" -> {
                return Continents.SOUTH_AMERICA;
            }
            case "u.s.a.", "usa", "haiti", "canada" -> {
                return Continents.NORTH_AMERICA;
            }
            case "australia", "fiji", "papua new guinea", "new zealand" -> {
                return Continents.AUSTRALIA;
            }
            case "none" -> {
                return Continents.ANTARCTICA;
            }
        }
        return null; // Чи могла я тут повертати щось інше?
    }
}
