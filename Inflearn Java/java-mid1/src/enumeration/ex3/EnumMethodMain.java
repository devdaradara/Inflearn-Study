package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("Values = "+ Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinary = " + value.ordinal());
        }

        // String -> ENUM
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}