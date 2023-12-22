package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            int multi = num * count;
            System.out.println(multi);
            count++;
        }

        // 정답
        int num1 = 2;
        int count1 = 1;

        while (count1 <= 10) {
            System.out.println(num1);
            num1 += 2;
            count1++;
        }
    }
}
