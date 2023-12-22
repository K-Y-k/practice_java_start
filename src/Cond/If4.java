package Cond;

public class If4 {
    public static void main(String[] args) {
        int age = 14;

        // else를 활용하여 중복 검사를 피하므로 효율성 향상
        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) { // 위에서 7살이하까지 체크했으므로 8 <= age && age <= 13와 같다.
            System.out.println("초등학생");
        } else if (age <= 16) { // 위에서 13살이하까지 체크했으므로 14 <= age && age <= 16와 같다.
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
