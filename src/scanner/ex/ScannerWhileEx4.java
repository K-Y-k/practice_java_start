package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine(); // 위 숫자 입력은 엔터를 입력한 \n이 내려오므로 이 개행 문자 처리

                System.out.print("상품명을 입력하세요: ");
                String name = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();

                System.out.println("상품명:" + name + " 가격:" + price + " 수량:" + quantity + " 합계:" + price * quantity);
                total += price * quantity;
            } else if (option == 2) {
                System.out.println("총 비용: " + total);
                total = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
