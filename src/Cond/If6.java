package Cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // else로 묶으면 위의 조건이 맞으면 아래조건들은 검사없이 넘어가므로 잘못된 구현
        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("10살 이하, 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        // 코드가 한줄일 때는 코드블록 {}을 생략가능
        // 하지만 가독성 유지보수성을 생각하면 {}을 사용하는 것을 권장한다.
        if (true)
            System.out.println("if문에서 실행됨");

    }
}
