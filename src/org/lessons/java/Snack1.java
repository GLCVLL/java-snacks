package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int number = in.nextInt();
		int nextnumber = number + 1;
		
		if(number %2 == 0) {
			System.out.println("Il numero è pari: " + number);
		} else {
			System.out.println("Il numero è dispari, il successivo è " + nextnumber);
		}
			
	}

}
