package date_and_timeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoEra;


public class CurrentTime {
    public static void main(String[] args) {
        LocalDate currentdate = LocalDate.now();
        LocalDate custom = LocalDate.of(1997,7,10);
        /*System.out.println(currentdate);
        System.out.println(custom);*/

        int day =currentdate.getDayOfMonth();
        Month mon = currentdate.getMonth();
        int year = currentdate.getYear();
        IsoEra era = currentdate.getEra();
        System.out.println(day);
        System.out.println(mon);
        System.out.println(year);
        System.out.println(era);
    }
}
