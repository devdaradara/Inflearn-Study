package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 (0을 입력하면 프로그램을 종료): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println("입력한 정수의 합은 " + sum);
    }
}
