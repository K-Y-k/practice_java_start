package array.ex;

import java.util.Scanner;

import static java.lang.Math.min;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = input.nextInt();
        int[] numArr = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            numArr[i] = input.nextInt();
        }

        int min_num = numArr[0];
        int max_num = numArr[0];

        for (int n : numArr) {
            min_num = min(min_num, n);

            if (n > max_num) {
                max_num = n;
            }
        }

        System.out.println("가장 작은 정수: " + min_num);
        System.out.println("가장 큰 정수: " + max_num);
    }
}
