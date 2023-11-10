package org.lessons.java;

import java.util.Scanner;

public class Snack7 {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il numero di secondi: ");
		
		int second = in.nextInt();
		
        // Calcolo ore, minuti e secondi
        int hours = second / 3600;
        int minutes = (second % 3600) / 60;
        int seconds = second % 60;

        // Formatto l'output come "hh:mm:ss"
        String result = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        // Mostro il risultato
        System.out.println("Il tempo convertito è: " + result);
	}

}
