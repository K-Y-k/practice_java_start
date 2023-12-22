package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        // 내가 푼 방식
        int rows = 2;
        String s = "*";

        for (int i = 1; i <= rows; i++) {
            System.out.println(s);
            s += "*";
        }

        System.out.println();

        // 정답
        int rows1 = 2;

        for (int i = 1; i <= rows1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
