package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numArr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numArr[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numArr.length; i++) {
            if (i ==  numArr.length - 1) {
                System.out.print(numArr[i]);
            } else {
                System.out.print(numArr[i] + ", ");
            }
        }
//        for (int num : numArr) {
//            System.out.print(num + ", ");
//        }
    }
}
