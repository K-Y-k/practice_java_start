package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);  // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈 (주의: 수학은 0으로 나누는 것은 허용하지 않기에 에러)
        int div = a / b;
        System.out.println("a / b = " + div); // 하지만 int형은 정수형이라서 소수점 표현은 안되고 정수 2만 나온다.

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
