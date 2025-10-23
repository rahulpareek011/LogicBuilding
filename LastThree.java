import java.util.Scanner;

public class LastThree {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        n = sc.nextInt();
        int tempN = n;

        System.out.println(n);
        int count = 0;
        for(int i=0;i<n;i++){
            count++;
            n/=10;
        }
        if(count<3) System.out.println("Enter number bigger than 3 digits");

        int sum = 0;
        if(count>=3){
            for(int i=0;i<3;i++){
                int temp = tempN%10;
                sum = sum + temp;
                tempN=tempN/10;
            }
            System.out.println(sum);
        }
        
    }
}
