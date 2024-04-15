package edu13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTime {
    public static void main(String[] args) {
//        var zones = ZoneId.getAvailableZoneIds();
//        System.out.println(zones.size());
//      //  zones.forEach(System.out :: println);
//        var zone = ZoneId.of("Europe/Kyiv");
//        System.out.println(zone.getRules());
//        LocalDateTime currentTime = LocalDateTime.now();
//        String dayOfWeek = LocalDate.now()
//                .getDayOfWeek()
//                .getDisplayName(TextStyle.FULL, new Locale("uk","UA"));
//        System.out.println(dayOfWeek);
//        System.out.println(currentTime);
//        LocalDate feature = LocalDate.now().plusMonths(2)
//                .plus(3, ChronoUnit.DAYS);
//        System.out.println(feature);

        LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);
        TemporalAdjuster firstMonday = TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY);
        LocalDate firstDayMonday = firstDayOfMonth.with(firstMonday);
        System.out.println(firstDayMonday);
    }
}
