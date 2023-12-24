package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료 입력하면 종료)");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.print("나이를 입력하세요: ");
                int age = input.nextInt();
                input.nextLine(); // 위 숫자를 입력할 때 엔터를 치면서 \n까지 오는데 nextInt는 숫자만 가져와서 \n을 처리하기 위해 이 문장을 넣어야 정상적으로 줄바꿈 처리가 된다.

                System.out.println("입력한 이름: " + name + ", 나이: " + age);
            }
        }
    }
}
