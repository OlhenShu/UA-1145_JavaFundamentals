package Task4;

public enum Season {
    AUTUMN("autumn", "the first semester"),
    WINTER("winter","winter exams"),
    SPRING("spring", "the second semester"),
    SUMMER("summer","vacation period");

    public final String name;
    public final String period;
    Season(String name, String period) {
        this.name = name;
        this.period = period;
    }
}
