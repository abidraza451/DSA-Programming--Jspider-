package number_based_program;
import java.util.Scanner;

public class PerfectNumber {

    

    public static boolean perfectNo(int n){
        int oldn=n;
        int sum=0;
        for(int i=1; i<=n/2;i++){
            if(n%i==0){
                sum =sum+i;

            }
        }
        return sum==oldn;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number to check Perfect Number");
        int n=sc.nextInt();
        if(perfectNo(n)){
            System.out.println("it's a perfect number");
        }
        else{
            System.out.println("it's not an perfect number");
        }
    }

    
}
