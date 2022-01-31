package javaPrograms;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		int row =6;
		// for outer loop
		for(int i=0;i<row;i++) {
			
		// inner loop for space
			for(int j=2*(row-i);j>=0;j--) {
				System.out.print(" ");
			}
		//inner loop for columns
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
