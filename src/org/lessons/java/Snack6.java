package org.lessons.java;

public class Snack6 {
	
	public static void main(String[] args) {
		   String numberString = "1996";

	        int result = convertToInteger(numberString);

	        System.out.println("Il numero convertito è: " + result);
	};
	
    private static int convertToInteger(String numberString) {
        int length = numberString.length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            char character = numberString.charAt(i);

            // Verifico se il carattere è un numero
            if (character >= '0' && character <= '9') {
                int numericValue = character - '0';
                result = result * 10 + numericValue;
            }
        }

        return result;
    }
	

}
