package Cond;

public class CondOp2 {
    // 삼항 연산자는 단순히 참과 거짓에 따라 특정 값을 구하는 경우 사용한다.
    // 이러한 상황인 경우 if문 보다 코드를 간결히 만들어준다.

    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " status = " + status);
    }
}
