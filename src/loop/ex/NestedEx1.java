package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        // 1 * 1 = 1
        // 1 * 2 = 1
        // ...
        // 9 * 8 = 72
        // 9 * 9 = 81

        int multi;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                multi = i * j;
                System.out.println(i + " * " + j + " = " + multi);
            }
        }
    }
}
