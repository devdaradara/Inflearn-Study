package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, World!";
        printMessage(3, message);
        printMessage(5, message);
        printMessage(7, message);
    }

    public static void printMessage(int num, String message) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
        System.out.println();
    }
}
