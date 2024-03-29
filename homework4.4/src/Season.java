enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}