package edu04.HomeWork04;

enum Season {
    AUTUMN("First semester"),
    WINTER("Winter exams"),
    SPRING("Second semester"),
    SUMMER("Vacation period");

    private final String readableName;

    Season(String readableName) {
        this.readableName = readableName;
    }
    public String getReadableName() {
        return this.readableName;
    }
}
