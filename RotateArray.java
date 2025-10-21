import java.util.Arrays;

public class RotateArray {

    public static void reverse(int num[] , int start , int end){
        for(;start<end;start++){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            end--;
        }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k =3;

        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

        for (int num : arr) {
            System.out.println(num);
        }
    }

}
