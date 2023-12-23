package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        if (m > 0) {
            int temp = m * 2; // 스코프 범위를 필요한 범위에 맞게 잘 활용해야 효율적입니다.
            System.out.println("temp = " + temp);
        }

        System.out.println("m = " + m);
    }
}
