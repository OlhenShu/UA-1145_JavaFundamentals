package HomeWorks.HW4.Ex4;

public enum Season {
    WINTER ("Winter"),
    SPRING ("Spring"),
    SUMMER ("Summer"),
    FALL ("Fall");

    private final String season;

    Season(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public static void findSemester (Season season){
        switch (season){
            case WINTER -> System.out.println("It's time of winter exams!");
            case SPRING -> System.out.println("It's the second semester!");
            case SUMMER -> System.out.println("It's time for your vacation!");
            case FALL -> System.out.println("It's the first semester!");
        }
    }
}
