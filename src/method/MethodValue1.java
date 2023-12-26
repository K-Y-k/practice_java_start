package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);

        changeNumber(num1); // 인수 값 num1의 값을 복사해서 메서드의 매개변수 num1에 대입한 것!

        // 메서드에 num1을 넣었다고 기존 num1이 변경되는 것이 아니다!
        // 그저 매개변수로 보내준 값일 뿐이기 때문이다.
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
    }

    // 메서드의 매개변수의 num1와 기존 인수로 보낸 num1은 완전 다른 변수이다!
    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }
}
