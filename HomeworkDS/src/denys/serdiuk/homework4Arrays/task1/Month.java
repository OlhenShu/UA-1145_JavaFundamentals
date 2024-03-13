package denys.serdiuk.homework4Arrays.task1;

public enum Month {
    JANUARY("January", 1, 31),
    FEBRUARY("February", 2, 28),
    MARCH("March", 3, 31),
    APRIL("April", 4, 30),
    MAY("May", 5, 31),
    JUNE("June", 6, 30),
    JULY("July", 7, 31),
    AUGUST("August", 8, 30),
    SEPTEMBER("September", 9, 31),
    OCTOBER("October", 10, 30),
    NOVEMBER("November", 11, 31),
    DECEMBER("December", 12, 30);
    
    private final String name;
    private final int position;
    private final int numDays;
    
    Month(String name, int position, int numDays) {
        this.name = name;
        this.position = position;
        this.numDays = numDays;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPosition() {
        return position;
    }
    
    public int getNumDays() {
        return numDays;
    }
}