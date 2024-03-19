package homework.hw4.facultyAndSeason;

public enum Season {
    WINTER("winter exams"),
    SPRING("second semester"),
    SUMMER("summer vacation"),
    AUTUMN("first semester");
    private final String season;

    public String getSeason() {
        return season;
    }

    public static void showAllSeasons() {
        for (int i = 0; i < Season.values().length; i++) {
            System.out.println((i + 1) + ". " + Season.values()[i]);
        }
    }

    Season(String currentSeason) {
        this.season = currentSeason;
    }
}
