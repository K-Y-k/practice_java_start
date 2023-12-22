package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; ; i++) {  // for문의 무한 반복이지만 증감식을 여기에 넣어 코드 깔끔하게
            sum += i;

            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;           // 현재 반복문 즉시 종료
            }
        }
    }
}
