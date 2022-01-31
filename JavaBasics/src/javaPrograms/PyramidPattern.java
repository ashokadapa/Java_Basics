package javaPrograms;

public class PyramidPattern {

	public static void main(String[] args) {
		 int row=6;
		 // for outer loop
		 for (int i=0;i<row;i++) {
			 
			 //inner loop for space
			 for(int j=row-i;j>=0;j--) {
				 System.out.print(" ");
			 }
		// for inner loop
			 for(int k=0;k<=i;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

	}

}