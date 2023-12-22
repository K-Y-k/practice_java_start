package Cond;

public class Switch2 {
    // switch문은 if문을 조금 더 편리하게 사용할 수 있는 기능
    // switch문은 논리 조건이 아닌 정확한 값(문자 or 숫자)만 넣을 수 있다.

    public static void main(String[] args) {
        int grade = 1;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰: " + coupon);
    }
}
