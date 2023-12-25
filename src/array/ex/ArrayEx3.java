package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numArr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numArr[i] = input.nextInt();
        }

        // 역순 출력하기
        System.out.println("출력");
        for (int i = numArr.length-1; i >= 0; i--) {
            System.out.print(numArr[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
