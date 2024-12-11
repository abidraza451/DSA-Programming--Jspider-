package pattern_program;

//        A 
//      B B 
//    C C C 
//  D D D D 
//E E E E E 


public class AbcTriangle {
	public static void main(String[] args) {
		
		int space =4;
		int star =1;
		char c='A';
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++) {
				System.out.print(c+" ");
			}
			c++;
			star++;
			space--;
			System.out.println();
			
		}
	}

}
