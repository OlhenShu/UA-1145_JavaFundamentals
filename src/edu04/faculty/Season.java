package edu04.faculty;

public enum Season {
    WINTER("\"The period of winter exams.\""),
    SPRING("The second semester"),
    SUMMER("The vacation period."),
    AUTUMN("The first semester");
    private final String description;

    public String getDescription() {
        return description;
    }

    Season(String description) {
        this.description = description;
    }

    public static String getSeason(String s) {
        return switch (s) {
            case "DECEMBER", "JANUARY", "FEBRUARY" -> WINTER.getDescription();
            case "MARCH", "APRIL", "MAY" -> SPRING.getDescription();
            case "JUNE", "JULY", "AUGUST" -> SUMMER.getDescription();
            case "SEPTEMBER", "OCTOBER", "NOVEMBER" -> AUTUMN.getDescription();
            default -> throw new IllegalArgumentException("\"The period does not exist.\";");

        };
    }
}