package homeWork4;

public class Continents {
    public static Continent checkCountryContinent(String country) {
        return switch (country.toUpperCase()) {
            case "EGYPT" -> Continent.AFRICA;
            case "CHINA" -> Continent.ASIA;
            case "UKRAINE" -> Continent.EUROPE;
            default -> throw new IllegalArgumentException("Unexpected value, " + country +
                    " please enter Ukraine, China or Egypt.");
        };
    }

    public void getCountryContinent(String country) {
        System.out.println("The continent of the " + country + " is ->> " + checkCountryContinent(country));
    }

    enum Continent {
        AFRICA,
        ASIA,
        EUROPE;
    }

}

class RunContinents {
    public static void main(String[] args) {
        Continents continents = new Continents();
        continents.getCountryContinent("Ukraine");
    }
}
