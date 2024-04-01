package practical_tasks.pt4.countries_and_continent;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Continent {
    AFRICA("Africa"),
    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    OCEANIA("Oceania");

    private final String CONTINENT_NAME;
}
