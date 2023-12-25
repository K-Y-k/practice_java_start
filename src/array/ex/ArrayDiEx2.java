package array.ex;

import java.util.Scanner;

public class ArrayDiEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int count = input.nextInt();

        int[][] scores = new int[count][3];
        String[] subject = {"국어", "수학", "영어"};


        for (int i = 0; i < count; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수: ");
                scores[i][j] = input.nextInt();
            }
        }


        for (int i = 0; i < count; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }

            double avg = (double)total / count;

            System.out.println(i+1 + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
