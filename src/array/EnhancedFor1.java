package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // 향상된 for문은 각각의 요소를 탐색한다는 의미로 for-each문이라고도 많이 부른다.

        int[] numbers = {1,2,3,4,5};

        // 일반 for문
        // 인덱스를 선언하고 인덱스로 접근해야한다.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 for문(for-each문)
        // 인덱스 선언 조건이 모두 숨겨져 있어 편리하게 작성 가능하고 가독성도 좋다.
        // 배열을 처음부터 탐색할 때 이 for문을 사용하자.
        // 단축키 : iter
        for (int number : numbers){ // 배열을 넣고 배열의 값을 처음부터 조회한다.
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우 : 증가하는 인덱스 값이 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

        // 카운터 변수를 따로 선언해서 사용할 수는 있지만,
        // 스코프 범위가 넓은 문제로 좋지 않은 코드다.
        int i = 0;
        for (int number : numbers) {
            System.out.println("number" + i + "번의 결과는: " + number);
            i++;
        }
    }
}
