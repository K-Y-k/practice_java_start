package method;

public class Method1 {
    public static void main(String[] args) {
        // 계산1
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " 연산 수행");

        int sum1 = a + b;
        System.out.println("결과1 출력: " + sum1);


        System.out.println();


        // 계산2
        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " 연산 수행");

        int sum2 = x + y;
        System.out.println("결과2 출력: " + sum2);

        
        // 둘 다 같은 변수와 같은 연산이 수행되는 모습이다.
    }
}
