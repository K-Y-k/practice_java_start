package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        // 여러 개 한번에 선언 가능
        // 하지만 구분하기 불편하고 초기식에 쓰는 곳은 증감변수만 적용하는 곳이기에 이 방식은 권장 안함
        for (int num = 2, count = 1; count <= 10; count++, num += 2) {
            System.out.println(num);
        }

        // 적합한 방법
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}
