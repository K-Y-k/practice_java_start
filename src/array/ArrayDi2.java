package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        // 배열에 순서대로 1씩 증가한 값을 넣기
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        // 출력
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
