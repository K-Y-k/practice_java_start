package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 일일히 직접 대입 대신 초기화 방식으로 리펙토링
//        int[][] arr = new int[2][3]; // 행2, 열3
        int[][] arr = new int[][]{
            {1,2,3},  // 0행
            {4,5,6}   // 1행
        };

        // for문으로 출력방식 리펙토링
        // 배열 길이로 리펙토링
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
