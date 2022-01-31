package javaPrograms;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Z=" ";
String x="Ashok";
for(int i=x.length()-1;i>=0;i--) {
	char y=x.charAt(i);
	Z=Z+y;
}
System.out.println(Z);
	}

}
