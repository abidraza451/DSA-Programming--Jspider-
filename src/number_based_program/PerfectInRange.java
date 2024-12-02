package number_based_program;
import java.util.Scanner;

public class PerfectInRange {
    public static void inRangePerfect(int l,int u){
        int count=0;
        for(int i=l; i<=u; i++){
           if(PerfectNumber.perfectNo(i)){
            count++;
            System.out.println(i);
           }
        }
        System.out.println("Total Number of the perfect in your range is: "+count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lower limit");
        int l=sc.nextInt();
        System.out.println("Enter your upper limit");
        int u=sc.nextInt();
        inRangePerfect(l, u);
    }
    
}
