package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

        // 일일히 값을 변경해야하는 문제점
        sum += 1;
        System.out.println("i=" + 1 + " sum=" + sum);

        sum += 2;
        System.out.println("i=" + 2 + " sum=" + sum);

        sum += 3;
        System.out.println("i=" + 3 + " sum=" + sum);
    }
}
