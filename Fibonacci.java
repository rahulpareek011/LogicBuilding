import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        //default starting value
        int num1 = 0;
        int num2 = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //always printing value
        System.out.print(num1+" "+num2);

        //loop from 2
        for(int i=2;i<n;i++){
            int num3 = num1+num2;//num 3 for next number
            System.out.print(" "+num3); //printing fibonacci

            num1 = num2;//num 2 going to num 1
            num2 = num3;//num 3 going to num2
        }
    }
}