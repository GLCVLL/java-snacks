package org.lessons.java;

import java.util.Scanner;

public class Snack8 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digita una parola che contiene le lettere a e o: ");
		
		String word = in.nextLine();
		
        
        String result = "";

        // Itero attraverso ogni carattere della stringa
        for (int i = 0; i < word.length(); i++) {
            // Ottieni il carattere corrente
            char c = word.charAt(i);

            // Verifico se il carattere è 'a' e sostituisco con 'o' o viceversa
            if (c == 'a') {
                result += 'o';
            } else if (c == 'o') {
                result += 'a';
            } else {
                // Se il carattere non è 'a' o 'o', aggiungo alla stringa risultato senza modifiche
                result += c;
            }
        }

        // Stampo la nuova stringa risultato
        System.out.println("Risultato: " + result);
	}
}
