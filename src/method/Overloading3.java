package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    // 매개변수의 타입이 다른 오버로딩
    public static int add(int a, int b) {         // 이 메서드를 지워도 자동 형변환이 가능하여 아래 double형 메서드에서 가능하다.
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) { // 반환타입이 다른 것은 오버로딩과 상관없다.
        System.out.println("2번 호출");
        return a + b;
    }
}
