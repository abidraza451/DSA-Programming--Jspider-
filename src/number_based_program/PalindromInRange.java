package number_based_program;
import java.util.*;
public class PalindromInRange {
            public static void inRangePalindrom(int l,int u){
                int count=0;
                for(int i=l; i<=u; i++){
                    if(PalindromCheck.getPalindrom(i)){
                        count++;
                        System.out.println(i+" is a Palindrom Number");
                    }
                }
                System.out.println("Total Number of Palindrom in your range is "+count);
            }

            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter your Lower Limit:");
                int lLimit=sc.nextInt();
                System.out.println("Enter your Upper Limit:");
                int Ulimit=sc.nextInt();
                inRangePalindrom(lLimit, Ulimit);
            }
}
