package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(1);
        System.out.println(result);
    }

    // 반환타입이 있고 매개변수가 있는 경우
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
        return false; // 반환타입으로 무조건 반환되게 해야한다.
    }
}
