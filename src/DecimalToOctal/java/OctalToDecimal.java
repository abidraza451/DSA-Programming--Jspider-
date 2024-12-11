package DecimalToOctal.java;
import java.util.*;

public class OctalToDecimal {
	
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		
		String result = OToDecimal(n);
		System.out.println(result);
		
	}
	
		public static String OToDecimal(int n) {
			int dec =0;
			int eightmul=1;
			while(n>0) {
				int rem =n%10;
				if(rem>=0 && rem <=7) {
					dec =dec+eightmul*rem;
				}
				else {
					return "input is invalid";
				}
				n=n/10;
				eightmul*=8;
			}
			return "the decimal value is"+dec;
		}
	
	
	

}
