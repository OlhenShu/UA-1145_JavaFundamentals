package homeWork4;

public class WeekLocalization {

    public void printDayOfTheWeek(int number) {
        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.getDayOfTheWeek(number);
        System.out.println("This number corresponds to the following day of the week " +
                dayOfTheWeek.engLanguage + " " + dayOfTheWeek.ukrLanguage);
    }

    enum DayOfTheWeek {
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четвер"),
        FRIDAY("Friday", "П'ятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");

        public final String engLanguage;
        public final String ukrLanguage;

        DayOfTheWeek(String eng, String ukr) {
            this.engLanguage = eng;
            this.ukrLanguage = ukr;
        }

        public static DayOfTheWeek getDayOfTheWeek(int number) {
            return switch (number) {
                case 1 -> MONDAY;
                case 2 -> TUESDAY;
                case 3 -> WEDNESDAY;
                case 4 -> THURSDAY;
                case 5 -> FRIDAY;
                case 6 -> SATURDAY;
                case 7 -> SUNDAY;
                default -> throw new IllegalArgumentException("Invalid number, allowed range 1-7.");
            };
        }
    }

}

class RunWeekLocalization {
    public static void main(String[] args) {
        WeekLocalization weekLocalization = new WeekLocalization();
        weekLocalization.printDayOfTheWeek(5);
    }
}
