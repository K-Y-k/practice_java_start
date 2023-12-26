package method;

public class MethodValue3 {
    // 기존 변수의 값에도 적용하고 싶었던 MethodValue2의 문제 해결법
    // -> 반환 값을 활용하자!
    
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);    // 5

        num1 = changeNumber(num1); // 반환된 값을 기존 변수에 대입하여 적용!

        System.out.println("4. changeNumber 호출 후, num1: " + num1);    // 10
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
