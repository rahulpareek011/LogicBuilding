import java.util.Arrays;
import java.util.Scanner;

public class TotFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, for that you want its all factor: ");
        int n = sc.nextInt();

        int count=0;

        //finding the total factors
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);

        //giving array the size of tot factors
        int[] Totalfactor = new int[count];
        int tf = 0;

        //writing all factor of n element in array
        for(int i=1;i<=n;i++){
            if(n%i==0){
                Totalfactor[tf++] = i;
            }
        }
        System.out.println(Arrays.toString(Totalfactor));
    }
}
