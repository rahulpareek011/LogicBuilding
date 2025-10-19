import java.util.Scanner;

public class Hcf {
    public static void main(String[] args){
        //HCF- largest positive integer that divides both numbers completely
        //without leaving a remainder
        //question-> Implement a Java program to read two integer values
        //and return GCD of two numbers
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter one more number: ");
        int n2 = sc.nextInt();
        int lowest;
        if(n1>n2){
            lowest = n2;
        } else{
            lowest = n1;
        }
        int hcf = 0;

        for(int i=1;i<=lowest;i++){
            if(n1%i==0 && n2%i==0){
                hcf = i;
            }
        }

        System.out.println("HCF of "+n1+" and "+n2+ " is: "+hcf);

    }
}
