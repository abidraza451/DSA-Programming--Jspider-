package all_about_prime;
import java.util.*;

public class PrimeSumOfDigitPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ypur lower limit");
        int llimit =sc.nextInt();
        System.out.println("Enter your upper limit");
        int ulimit =sc.nextInt();
        int count=0;
        for(int i=llimit; i<ulimit; i++){
            if(CheckPrime.getPrime(i)){
                int temp=sumOfDigit(i);
                if(CheckPrime.getPrime(temp)){
                    count ++;
                    System.out.println(temp);
                }
                

            }
        }
        
        System.out.println("Total Number of the Prime Number in range is: "+count);
        
    }
    public static int sumOfDigit(int n){
        int sum =0;
        while(n>0){
            int rem=n%10;
            sum =sum+rem;
            n=n/10;
        }
        return sum;

    }

    
}
