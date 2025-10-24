import java.util.Scanner;

public class FindMissing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
        int n = arr.length+1;
        int expectedSum = n*(n+1)/2;
        int totalSum =0;
        for(int i=0;i<n-1;i++){
            totalSum+=arr[i];
        }
        int missingNumber = expectedSum-totalSum;
        System.out.println("Missing Number: "+ missingNumber);
    }
}