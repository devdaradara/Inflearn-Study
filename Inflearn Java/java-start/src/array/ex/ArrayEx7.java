package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] score = new double[4][2];

        for (int row = 0; row < score.length; row++) {
            int sum = 0;
            double average = 0;

            System.out.println((row+1)+"번 학생의 성적을 입력하세요: ");
            System.out.print("국어 점수: ");
            sum += scanner.nextInt();
            System.out.print("영어 점수: ");
            sum += scanner.nextInt();
            System.out.print("수학 점수: ");
            sum += scanner.nextInt();

            score[row][0] = sum;
            score[row][1] = (double) sum / 3;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + score[i][0] + ", 평균: " + score[i][1]);
        }
    }
}
