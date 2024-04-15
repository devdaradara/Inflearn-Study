package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;//최초 한 번만 할당 가능
//        data1 = 20;

        final int data2 = 10;
        method(10);
    }

    private static void method(final int i) {
//        i = 20;
    }
}
