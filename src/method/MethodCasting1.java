package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;

//        printNumber(number);     // int형인 매개변수에 double형을 넣을 수 없다.
        printNumber((int) number); // 명시적 형변환으로 int로 바꾸고 넣어야한다.
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
