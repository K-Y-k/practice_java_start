package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students;        // 1.배열 변수 선언
        students = new int[5]; // 2.배열 생성 및 변수의 개수도 선언 (여기서는 5개)
        
        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        // 기존 반복 코드 -> for문으로 리펙토링
//        System.out.println("학생1 점수: " + students[0]);
//        System.out.println("학생2 점수: " + students[1]);
//        System.out.println("학생3 점수: " + students[2]);
//        System.out.println("학생4 점수: " + students[3]);
//        System.out.println("학생5 점수: " + students[4]);

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

    }
}
