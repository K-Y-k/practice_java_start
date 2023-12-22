package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예시
        int a = 1;
        int b = 0;

        b = ++a; // a값을 먼저 증가시킨 후, 그 결과를 b에 대입
        System.out.println("a = " + a + " b = " + b);


        // 후위 증감 연산자 사용 예시
        a = 1;
        b = 0;

        b = a++; // a값을 먼저 b에 대입후, a값을 증가 시킴
        System.out.println("a = " + a + " b = " + b);
    }
}
