package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;  // int형의 최고값
        long maxIntOver = 2147483648L; // int형의 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 값이 int형 범위라서 형변환 가능
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 값이 int형 범위를 초과한 값을 형변환하면 오버플로우 발생
        System.out.println("maxIntOver casting = " + intValue); // 초과한 만큼 다시 표현범위에 돌아가서 잘못된 -2147483648이 나옴
        
        // 해결법 : 초과할 경우 더 큰 범위의 타입으로 바꾸자
    }
}
