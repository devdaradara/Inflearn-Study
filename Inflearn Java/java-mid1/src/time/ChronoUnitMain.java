package time;

import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.duration" + ChronoUnit.HOURS.getDuration().getSeconds());

    }
}
