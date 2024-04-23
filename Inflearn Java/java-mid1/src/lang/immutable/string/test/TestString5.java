package lang.immutable.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        String fileName = str.substring(0, str.indexOf(ext));
        System.out.println("filename = " + fileName);
        System.out.println("extName = " + ext);
    }
}
