package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        int sum = 0;
        int count = 0;
        int num = 0;

//        while (true) {
//            num = input.nextInt();
//
//            if (num == -1) {
//                break;
//            }
//            else {
//                sum += num;
//                count++;
//            }
//        }

        // 축약한 더 좋은 코드
        while ((num = input.nextInt()) != -1) { // 입력한 숫자가 -1이 아닐 때까지 반복
            sum += num;
            count++;
        }

        double avg = (double) sum / count; // int형끼리의 게산은 int형의 값이 나오므로 명시적 타입변환을 해야한다.
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
