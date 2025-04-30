package date_and_timeAPI;

import java.time.LocalDate;

public class PreviousDates {
    public static void main(String[] args) {
        LocalDate loc = LocalDate.now();
        LocalDate yesterday = loc.minusDays(1);
        LocalDate lastmonth = loc.minusMonths(1);
        LocalDate year = loc.minusYears(1);
        LocalDate week = loc.minusWeeks(1);

        System.out.println(yesterday);
        System.out.println(lastmonth);
        System.out.println(year);
        System.out.println(week);
    }
}
