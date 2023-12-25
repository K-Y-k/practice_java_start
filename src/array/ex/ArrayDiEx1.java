package array.ex;

import java.util.Scanner;

public class ArrayDiEx1 {
    public static void main(String[] args) {
        // 1차원 배열로 푼 방식
        int[] kor = new int[4];
        int[] math = new int[4];
        int[] eng = new int[4];
        int[] sum = new int[4];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수: ");
            kor[i] = input.nextInt();

            System.out.print("수학 점수: ");
            math[i] = input.nextInt();

            System.out.print("영어 점수: ");
            eng[i] = input.nextInt();

            sum[i] = kor[i] + math[i] + eng[i];
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + "번 학생의 총점: " + sum[i] + ", 평균: " + (double)sum[i] / 3);
        }


        // 2차원 배열로 푼 방식
        int[][] scores = new int[4][3];
        String[] subject = {"국어", "수학", "영어"};

        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수: ");
                scores[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }

            double avg = (double)total / 3;

            System.out.println(i+1 + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
