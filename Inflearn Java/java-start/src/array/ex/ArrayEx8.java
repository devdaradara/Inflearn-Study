package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생수를 입력하세요: ");
        int cnt = scanner.nextInt();

        double[][] students = new double[cnt][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int row = 0; row < cnt; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요: ");
            for (int column = 0; column < subjects.length; column++) {
                System.out.print(subjects[column] + " 점수: ");
                students[row][column] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < students[i].length; j++) {
                total += students[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
