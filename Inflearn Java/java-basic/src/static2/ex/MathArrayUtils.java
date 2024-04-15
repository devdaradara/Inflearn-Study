package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {

    }

    public static int sum(int[] array) {
        int num = 0;
        for (int i : array) {
            num += i;
        }
        return num;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int num = array[0];
        for (int i : array) {
            if (num > i) {
                num = i;
            }
        }
        return num;
    }

    public static int max(int[] array) {
        int num = array[0];
        for (int i : array) {
            if (num < i) {
                num = i;
            }
        }
        return num;
    }
}
