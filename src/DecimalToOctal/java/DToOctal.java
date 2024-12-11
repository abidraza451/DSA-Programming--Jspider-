package DecimalToOctal.java;

import java.util.Scanner;

public class DToOctal {
	
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		
		String result = ConDecimalToOctal(n);
		System.out.println(result);
		
	}
	
	public static String ConDecimalToOctal(int n) {
		String oct =" ";
		while(n>0) {
			int num =n%2;
			oct =num+oct;
			n=n/2;
		}
		return oct;
	}

}
