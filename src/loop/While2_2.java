package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // i변수를 활용하여 변경에 용이해졌지만 반복의 문제점
        sum += i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum += i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        
        sum += i;
        System.out.println("i=" + i + " sum=" + sum);
    }
}
