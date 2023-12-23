package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) { // 지역 변수 i 생존 시작
            System.out.println("for m = " + m);        // 블록 내부에서는 블록 외부의 지역 변수도 접근 가능
            System.out.println("for i = " + i);
        }                             // i 생존 종료

        //        System.out.println("main x = " + i); // 오류, i 생존 종료로 접근 불가
        System.out.println("main m = " + m);
    }
}
