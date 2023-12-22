package loop;

public class While1_2 {
    // while문은 조건에 따라 코드를 반복해서 실행할 때 사용한다.

    public static void main(String[] args) {
        int count = 0;

        while (count < 3) { // 주어진 조건이 성립하지 않을 때까지 반복한다.
            count += 1;
            System.out.println("현재 숫자는: " + count);
        }
    }
}
