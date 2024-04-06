package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력(exit는 종료) : ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println("입력하신 문자는 " + str);
        }
    }
}
