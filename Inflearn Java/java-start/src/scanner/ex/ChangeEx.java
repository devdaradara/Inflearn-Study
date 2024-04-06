package scanner.ex;

public class ChangeEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int tmp;

        tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
