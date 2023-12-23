package casting;

public class Casting4 {
    public static void main(String[] args) {
        // 형변환은 계산하면서 형변환이 발생할 수 있다.
        // 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        // 2. 서로 다른 타입의 계산은 더 큰 범위로 자동 형변환이 일어난다.

        int div1 = 3 / 2;                         // int / int
        System.out.println("div1 = " + div1);     // 1,   1.5이어야하지만 손실 발생

        double div2 = 3 / 2;                      // int / int     : int끼리의 계산이라 1.0이 나온 것
        System.out.println("div2 = " + div2);     // 1.0

        double div3 = 3.0 / 2;                    // double / int  : double이 더 큰 범위라서 int를 double로 형변환 후 계산해줌
        System.out.println("div3 = " + div3);     // 1.5

        double div4 = (double) 3.0 / 2;           // double / int
        System.out.println("div4 = " + div4);     // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;           // double 형변환 후 / int -> double이 더 큰 범위라서 int를 double로 형변환 후 계산해줌
        System.out.println("result = " + result); // 1.5
    }
}
