package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        // 조건 상관없이 최초 한번은 실행한다.
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);
    }
}
