package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printerFooter();
    }

    // 반환타입이 없고 매개변수가 없는 경우
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        // 모든 메서드는 return 해줘야 하는데 void만 return은 생략한다.
    }

    public static void printerFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        return;
    }
}
