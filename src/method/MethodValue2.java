package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5

        changeNumber(number); // 인수 값 number의 값을 복사해서 메서드의 매개변수 number에 대입한 것!

        // 메서드에 number을 넣었다고 기존 number이 변경되는 것이 아니다!
        // 그저 매개변수로 보내준 값일 뿐이기 때문이다!
        System.out.println("4. changeNumber 호출 후, number: " + number); // 5
    }

    // 메서드의 매개변수의 number와 기존 인수로 보낸 number는 완전 다른 변수이다!
    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number); // 10
    }
}
