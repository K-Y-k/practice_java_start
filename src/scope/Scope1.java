package scope;

public class Scope1 {
    // 변수는 선언한 위치에 따라
    // 지역 변수, 멤버 변수(클래스 변수, 인스턴스 변수)로 분류합니다.

    public static void main(String[] args) {
        // 지역 변수는 선언된 특정 지역에서만 사용할 수 있는 변수
        int m = 10; // 지역 변수 m 생존 시작
        
        if (true) {
            int x = 20; // 지역 변수 x 생존 시작
            System.out.println("if m = " + m);  // 블록 내부에서는 블록 외부의 지역 변수도 접근 가능
            System.out.println("if x = " + x);
        }              // x 생존 종료

//        System.out.println("main x = " + x);  // 오류, x 생존 종료로 접근 불가
        System.out.println("main m = " + m);
    }  // m 생존 종료
}
