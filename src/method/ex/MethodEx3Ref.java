package method.ex;

public class MethodEx3Ref {
    // - 메서드 추출 리팩토링
    // 기능에 따른 메서드를 활용하여
    // 메인의 코드를 줄여주어 구조적으로 가독성을 높여주는 것도 중요하다.
    // 메서드로 명확하게 분리되었기 때문에 변경 사항이 발생하면 관련된 메서드만 수정하면 된다. (유지보수가 좋아짐)
    public static void main(String[] args) {
        int balance = 10000;

        // 입금
        balance = deposit(balance, 1000);

        // 출금
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
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