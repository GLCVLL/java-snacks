package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
        while (true) {
            System.out.print("Inserisci una stringa (inserisci 0 per terminare): ");
            String string = in.nextLine();

            if (string.equals("0")) {
                System.out.println("Programma terminato.");
                break;
            }

            int charAlfa = 0;
            int numbers = 0;
            int charNotAlfa = 0;

            for (int i = 0; i < string.length(); i++) {
                char character = string.charAt(i);

                if (Character.isLetter(character)) {
                	charAlfa++;
                } else if (Character.isDigit(character)) {
                	numbers++;
                } else {
                	charNotAlfa++;
                }
            }

            System.out.println("Caratteri alfabetici: " + charAlfa);
            System.out.println("Numeri: " + numbers);
            System.out.println("Simboli non alfanumerici: " + charNotAlfa);
        }
	}

}
