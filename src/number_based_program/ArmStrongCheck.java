package number_based_program;
import java.util.*;
public class ArmStrongCheck {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check weather it is  Armstrong or not!! ");
        int n=sc.nextInt();
        if(checkArmstrong(n)){
            System.out.println("yes your number "+n+" is armstrong number");

        }
        else{
            System.out.println("your number "+n+" is not a armstrong number");
        }
        
    }
    
    public static boolean checkArmstrong(int n){
        int noOfDigit=getCountDigit(n);
        int oldn=n;
        int sum=0;
        while(n>0){
            int rem =n%10;
            sum=sum+getCalPower(rem,noOfDigit);
            n/=10;
        }
        return(sum==oldn);
    }
    public static  int getCountDigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }
        return count;
    }

    public static int getCalPower(int a, int b){
        int power=1;
        for (int i = 1; i <=b; i++) {
            power=power*a;
            
        }
        return power;
    }
}