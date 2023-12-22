package Cond.ex;

public class CondEx4 {
    public static void main(String[] args) {
        double rating = 7.1;

        // 내가 푼 방식 : 틀림..
        if (rating >= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        } else if (rating >= 8){
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이 스토리'를 추천합니다.");
        } else {
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이 스토리'를 추천합니다.");
            System.out.println("'고질라'를 추천합니다.");
        }

        System.out.println();

        // 좀 더 코드 가독성과 효율성이 높은 방식
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8){
            System.out.println("'토이 스토리'를 추천합니다.");
        }

        if (rating <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
