package Practicals.Pr4.Ex2;

public enum DayOfWeek {
    MONDAY ("Monday", "Понеділок"),
    TUESDAY ("Tuesday", "Вівторок"),
    WEDNESDAY ("Wednesday", "Середа"),
    THURSDAY ("Thursday", "Четвер"),
    FRIDAY ("Friday", "П'ятниця"),
    SATURDAY ("Saturday", "Субота"),
    SUNDAY ("Sunday ", "Неділя");

    private final String en;
    private final String ua;

    DayOfWeek(String dayEn, String dayUa) {
        this.en = dayEn;
        this.ua = dayUa;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }
}
