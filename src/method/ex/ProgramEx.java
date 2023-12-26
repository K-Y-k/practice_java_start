package method.ex;

import java.util.Scanner;

public class ProgramEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-------------------------------");

            System.out.print("선택: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositPrice = input.nextInt();
                    balance = deposit(balance, depositPrice);
                    break;
                case 2:
                        System.out.print("출금액을 입력하세요: ");
                        int withdrawPrice = input.nextInt();

                        balance = withdraw(balance, withdrawPrice);
                        break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return; // while 무한반복 안에 있으므로 return으로 프로그램 자체를 종료해야한다.
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }

//        while (true) {
//            System.out.println("-------------------------------");
//            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
//            System.out.println("-------------------------------");
//
//            System.out.print("선택: ");
//            int menu = input.nextInt();
//            input.nextLine();
//
//            if (menu == 1) {
//                System.out.print("입금액을 입력하세요: ");
//                int depositPrice = input.nextInt();
//                balance += depositPrice;
//                System.out.print(depositPrice + "원을 입력하였습니다. 현재 잔액: " + balance);
//            } else if (menu == 2) {
//                System.out.print("출금액을 입력하세요: ");
//                int withdrawPrice = input.nextInt();
//
//                if (balance - withdrawPrice < 0) {
//                    System.out.println(withdrawPrice + "원을 출금하려 했으나 잔액이 부족합니다.");
//                } else {
//                    balance -= withdrawPrice;
//                    System.out.print(withdrawPrice + "원을 출금하였습니다. 현재 잔액: " + balance);
//                }
//            } else if (menu == 3) {
//                System.out.println("현재 잔액: " + balance + "원");
//            } else if (menu == 4) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            } else {
//                System.out.println("메뉴를 잘못 입력하셨습니다.");
//            }
//        }
    }


    // 입금 메서드
    private static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    // 출금 메서드
    private static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
