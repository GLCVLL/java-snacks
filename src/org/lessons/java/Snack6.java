package org.lessons.java;

public class Snack6 {
	
	public static void main(String[] args) {
		   String numberString = "1996";
		   
		   int length = numberString.length();
		   
		   int result = 0;
		   
		   for (int x = 0; x < length; x++) {
			   char n = numberString.charAt(x);
			   
			   if(n >= '0' && n <= '9') {
				   int number = n - '0';
				   result = result * 10 + number;
			   }
		   }
		   
		   System.out.println("Integer: " + result);
		   System.out.println("String: " + numberString);
		   
	
	}
	

}
