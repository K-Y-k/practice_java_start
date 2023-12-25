package array;

public class Array1Ref3 {
    public static void main(String[] args) {
//        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 변수 선언과 배열 생성과 값 초기화
        int[] students = {90, 80, 70, 60, 50};            // 편의성 최적화, 단 이 방식은 선언과 동시에 초기화 해야 한다.

        // 변수 값 대입 대신 위에서 초기화로 리펙토링
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

    }
}
