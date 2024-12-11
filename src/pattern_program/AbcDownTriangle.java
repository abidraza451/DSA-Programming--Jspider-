package pattern_program;
//A A A A A 
//  B B B B 
//    C C C 
//      D D 
//        E 



public class AbcDownTriangle {
	public static void main(String [] args) {
		int space=0;
		int star=5;
		char c='A';
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print(c+" ");
			}
			space++;
			star--;
			c++;
			System.out.println();
			
		}
	}

}
