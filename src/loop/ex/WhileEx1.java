package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        // 나의 풀이
        int count = 0;
        while (count < 10) {
            count += 1;
            System.out.println(count);
        }

        // 정답
        int count1 = 1;
        while (count1 <= 10) {
            System.out.println(count1);
            count1++;
        }
    }
}
