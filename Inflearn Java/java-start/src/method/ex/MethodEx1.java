package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        getAverage(1, 2, 3);
        getAverage(15, 25, 35);
    }

    public static void getAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
