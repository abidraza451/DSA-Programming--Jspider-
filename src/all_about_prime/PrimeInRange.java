package all_about_prime;
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ypur lower limit");
        int llimit =sc.nextInt();
        System.out.println("Enter your upper limit");
        int ulimit =sc.nextInt();
        int count=0;
        for(int i=llimit; i<ulimit; i++){
            if(CheckPrime.getPrime(i)){
                count++;
                System.out.println(i);

            }
        }
        System.out.println("Total Number of the Prime Number in range is: "+count);
        
    }
}
