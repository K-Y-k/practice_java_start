package method;

public class MethodValue0 {
    // 자바의 중요한 대원칙
    // 자바는 항상 변수의 값을 복사해서 대입한다.
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // num2 변수에 대입하기 전에 num1의 값을 복사해와서 그 변수의 값을 num2에 대입하는 것이다.
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
