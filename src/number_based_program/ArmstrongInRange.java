package number_based_program;
import java.util.*;
public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your range in check and count Armstrong number");
        System.out.println("enter your starting number of range");
        int lowerLimit=sc.nextInt();
        System.out.println("Enter your last number of range");
        int highestLimit=sc.nextInt();

        int count=0;
        System.out.println("Amrstrong Number in your range:");
        for(int i=lowerLimit; i<=highestLimit; i++){
            if(ArmStrongCheck.checkArmstrong(i)){
                count++;
                System.out.println(i);
            }

        }
        System.out.println("Total number of Armstrong number is:"+count);
    }

    
}
