import java.util.Arrays;
import java.util.Scanner;

public class MatrixSquare {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(Arrays.deepToString(arr));
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        int[][] squareArr = new int[3][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                squareArr[i][j] = arr[i][j]*arr[i][j];
            }
        }
        System.out.println("Matrix square elements: "+ Arrays.deepToString(squareArr));
    }
}
