package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2020, 1, 1, 14, 40, 59);
        System.out.println("Year = " + dt.get(ChronoField.YEAR));
        System.out.println("Mont_of_year = " + dt.get(ChronoField.MONTH_OF_YEAR));

        System.out.println("편의 메서드 사용");
        System.out.println("Year = " + dt.getYear());
    }
}
