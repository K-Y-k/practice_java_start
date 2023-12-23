package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // 자동 형변환
        longValue = (long)intValue;      // long이 int보다 표현 범위가 더 넓기에 변환가능
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;          // double이 int보다 표현 범위가 더 넓기에 변환가능
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 2000000000L;       // double이 long보다 표현 범위가 더 넓기에 변환가능
        System.out.println("doubleValue = " + doubleValue);
    }
}
