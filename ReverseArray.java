import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //elements size in array
        System.out.println("Enter total elements you want in array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" Elements");
        //creating a array of size elements
        for(int i=0;i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array: "+Arrays.toString(arr));

        int high = arr.length-1;

        //Reversing Array
            for(int i=0;i<high;i++){
                int temp = arr[i];
                arr[i] = arr[high];
                arr[high] = temp;
                high--;
            }
            
        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
}
