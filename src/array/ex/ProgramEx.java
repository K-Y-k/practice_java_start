package array.ex;

import java.util.Scanner;

public class ProgramEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];

        int productCount = 0;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int menu = input.nextInt();
            input.nextLine();              // 위 숫자 + 엔터를 쳤기에 숫자는 위에서 저장됐지만 \n인 개행 문자가 내려오므로 여기서 처리해줌
            
            if (menu == 1) {
                if (productCount == maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = input.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = input.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

        
    }
}
