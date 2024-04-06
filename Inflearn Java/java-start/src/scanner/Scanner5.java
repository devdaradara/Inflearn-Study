package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수와 두 번째 수 모두 0을 입력하면 프로그램을 종료합니다.");
        while (true) {
            System.out.print("첫 번째 수를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 수를 입력하세요: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 수의 합은 " + sum);
        }

    }
}
