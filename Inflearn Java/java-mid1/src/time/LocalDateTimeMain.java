package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2001, 7, 9, 1, 2, 2);
        System.out.println("현재 시간 = " + nowDt);
        System.out.println("지정 시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정날짜 + 1000d " + ofDtPlus);
        LocalDateTime ofDtYear = ofDt.plusYears(1);
        System.out.println("지정날짜 + 1y " + ofDtYear);

        // 비교
        System.out.println("현재 날짜시간이 지정 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 시간과 같은가? " + nowDt.isEqual(ofDt));

    }
}
