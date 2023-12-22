package Cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        // if만 활용하면 불필요한 조건도 계속 검사를 해야한다.
        // 중복 체크로 인해 코드의 효율성이 떨어진다.
        if (age <= 7) {
            System.out.println("미취학");
        }
        if (8 <= age && age <= 13) {
            System.out.println("초등학생");
        }
        if (14 <= age && age <= 16) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}
