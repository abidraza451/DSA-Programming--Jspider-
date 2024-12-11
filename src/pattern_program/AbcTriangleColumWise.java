package pattern_program;

//A B C D E
//  B C D E
//    C D E
//      D E
//        E


public class AbcTriangleColumWise {
	public static void main(String [] args) {
		int space=0;
		int star=5;
		
		for(int i=1; i<=5; i++) {
			char c='A';
			for(int j=1; j<=space; i++) {
				System.out.print("  ");
			    	
			}
			
			for(int j=1; j<=star; j++) {
				System.out.print(c+" ");
				c++;
			}
			
			space++;
			star--;
		}
		
	}

}
