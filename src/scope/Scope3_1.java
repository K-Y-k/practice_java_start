package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;    // temp가 if문 코드 블록에서만 사용되는데 여기서 선언하는 것은
                         // 생존 범위가 넓어져 1.메모리 사용이 비효율적이다. 2.코드 복잡성이 증가한다.

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }

        System.out.println("m = " + m);
    }
}
