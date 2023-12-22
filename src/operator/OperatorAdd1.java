package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); // 1

        a = a + 1;
        System.out.println("a = " + a); // 2

        ++a;   // 증감 연산자(전위)
        System.out.println("a = " + a); // 3

        a--;   // 증감 연산자(후위)
        System.out.println("a = " + a); // 2
    }
}
