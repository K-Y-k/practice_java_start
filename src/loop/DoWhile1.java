package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // 조건이 처음부터 성립하지 않아 처음부터 실행되지 않는다.
        while (i < 3) {
            System.out.println("현재 숫자는: " + i);
            i++;
        }
    }
}
