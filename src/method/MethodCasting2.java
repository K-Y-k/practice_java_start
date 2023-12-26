package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;

        printNumber(number); // double형 매개변수에 int형 인수를 넣는 것은 더 범위가 큰 그릇에 넣는 것이므로
                             // 자동 형변환이 가능하다.
        // 즉, 메서드를 호출할 때는 전달하는 인수 타입과 매개변수의 타입이 맞아야 한다.
        // 단, 타입이 달라도 자동 형변환이 가능하면 호출할 수 있다.
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
