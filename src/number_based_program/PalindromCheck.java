package number_based_program;
import java.util.*;
public class PalindromCheck {
    public static boolean getPalindrom(int n){
        int oldn=n;
        int reverse=0;
        while(n>0){           
            int rem =n%10;
            reverse= reverse*10 + rem  ;
            n=n/10;
        }
        
        return(oldn==reverse);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to Check weather it is Palindrom or not!!");
        int n=sc.nextInt();
        if(getPalindrom(n)){
            System.out.println("True");
        }
        else{
            System.out.println("Flase");
        }
    }
    
}
