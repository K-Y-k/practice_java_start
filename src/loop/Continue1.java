package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 현재 실행단계를 건너뛴다.
            }

            System.out.println(i);
            i++;
        }
    }
}
