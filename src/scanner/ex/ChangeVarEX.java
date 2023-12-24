package scanner.ex;

public class ChangeVarEX {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;    // 먼저 임시 변수에 보관해야한다.
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
