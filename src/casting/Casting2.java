package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 큰 범위의 값을 작은 범위 형에 넣을 경우 컴파일 오류 발생
        intValue = (int) doubleValue; // 일부 값이 누락되도 강제 형변환(명시적 형변환) 방법

        System.out.println(intValue); // 1, 소수 값 손실 발생

        int z =(int) 10.5;
        System.out.println(z);
    }
}
