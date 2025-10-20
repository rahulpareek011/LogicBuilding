import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix you want: ");
        int matrix = sc.nextInt();
        int[][] arr = new int[matrix][matrix];

        System.out.println("Enter "+matrix+"x"+matrix+ " Elements: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //3x3 matrix
        System.out.println(Arrays.deepToString(arr));
        System.out.println();

        //only diagonal elements from matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j) System.out.println(arr[i][j]);
            }
        }
    }
}
