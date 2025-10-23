import java.util.*;
public class pairOddEven {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element u want: ");
        n= sc.nextInt(); //taking total elements
        int arr[] = new int[n];
        int even[] = new int[n/2];
        int odd[] = new int[n/2];

        int e=0;//even index count
        int o =0;//odd index count
        
        //storing n element
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //sorting in increasing order
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[e++] = arr[i];
            } else{
                odd[o++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        for(int i=0;i<n/2;i++){
            System.out.println(even[i] + " " + odd[i]);
        }
    }
}
