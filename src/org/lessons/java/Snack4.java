package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Scrivi una parola: ");
		String word = in.nextLine();
		
        int length = word.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }
	}

}
