package pattern_program;

public class LeftTriangle {
//	we have to find relation in * and space and number of row always.
	public static void main(String [] args) {
		int star=1;
		int space=5-star;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space;j++) {
				System.out.print("  ");
			}
			
			for(int j=1; j<=star; j++)
				System.out.print("* ");
		star++;
		space--;
		System.out.println();
		}
	}

}
