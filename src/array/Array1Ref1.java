package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        // 배열은 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것이다.
        // 즉, 같은 타입의 변수를 반복해서 선언하고 사용하는 문제를 해결해준다.

        int[] students;         // 1.배열 변수 선언
        students = new int[5];  // 2.배열 생성 및 변수의 개수도 선언 (여기서는 5개)

        System.out.println(students); // 배열을 생성하면 자바는 메모리에 이 배열에 접근할 수 있는 참조값(주소)을 반환한다.
                                      // I@16b98e56에서 I은 int형을 뜻하고 @뒤의 16b98e56이 참조값이다.


        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);

    }
}
