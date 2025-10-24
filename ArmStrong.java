import java.util.Scanner;

public class ArmStrong {

    public static void check(int n){
        int temp = n;
        int compareN = n;

        int totDigit =0;
        while(temp>0){
            totDigit++;
            temp/=10;
        }
        System.out.println(totDigit);

        double sum =0;
        for(int i=0; i<totDigit;i++){
            int singleDigit = n%10;
            sum += Math.pow(singleDigit, totDigit);
            n/=10;
        }
        if(sum == compareN){
            System.out.println(compareN+ " Number is armStrong no.");
        } else{
            System.out.println(compareN+ " Number is not armStrong no.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = sc.nextInt();
        check(number);
    }
}
