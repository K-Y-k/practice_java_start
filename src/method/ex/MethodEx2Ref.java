package method.ex;

public class MethodEx2Ref {
    // 중복되는 코드를 메서드로 리팩토링
    
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    private static void printMessage(String message, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(message);
        }
    }

}