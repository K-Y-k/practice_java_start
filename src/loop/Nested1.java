package loop;

public class Nested1 {
    public static void main(String[] args) {
        // 중첩 반복문
        // 3중첩 이상은 거의 있을 수 없으므로 3중첩 이상이 될 경우 다시 생각해보자
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i: " + i);

            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + "-" + j);
            }

            System.out.println("외부 for 종료 i: " + i);
            System.out.println();
        }
    }
}
