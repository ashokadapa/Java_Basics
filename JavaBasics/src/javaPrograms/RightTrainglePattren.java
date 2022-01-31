package javaPrograms;

public class RightTrainglePattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =6;
		// for outer loop
		for(int i=0;i<row;i++) {
			
			// inner loop
			 for (int j=0;j<=i ;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		}
	}

}
