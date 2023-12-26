package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산1
        int sum1  = add(5, 10); // 메서드로 넘기는 파라미터의 타입이 맞아야 한다.
        System.out.println("결과1 출력: " + sum1);

        System.out.println();

        // 계산2
        int sum2  = add(15, 20);
        System.out.println("결과2 출력: " + sum2);


        // 반환을 할 수 있지만 반환은 필요없고 연산만 진행하고 싶을 때
        add(15, 20); // 꼭 반환 값을 안받아도 된다. (반환 값 무시)
    }

    // 위 반복되는 코드를 메서드화
    public static int add(int a, int b) { // 메서드 선언 : 제어자 반환타입 메서드이름(매개변수) 형식
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
