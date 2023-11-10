package org.lessons.java;

public class Snack2 {
	
	public static void main(String[] args) {
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria",
				         "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari",
				            "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
        System.out.println("Lista falsa di invitati:");
        for (int i = 0; i < 10; i++) {
            String nome = nomi[i % nomi.length];
            String cognome = cognomi[i % cognomi.length];

            System.out.println((i + 1) + ". " + nome + " " + cognome);
        }
	}

}
