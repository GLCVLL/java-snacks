package org.lessons.java;

public class Snack9 {
	
	public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Creo due array separati per numeri pari e dispari
        int[] even = new int[numbers.length];
        int[] odd = new int[numbers.length];

        
        int iEven = 0;
        int iOdd = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            // Verificare se il numero è pari o dispari 
            if (numbers[i] % 2 == 0) {
               
            	even[iEven] = numbers[i];
            	iEven++;
            } else {
               
            	odd[iOdd] = numbers[i];
            	iOdd++;
            }
        }
        // Stampare gli array risultanti
        System.out.print("Numeri pari: ");
        for (int i = 0; i < iEven; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.print("Numeri dispari: ");
        for (int i = 0; i < iOdd; i++) {
            System.out.print(odd[i] + " ");
        }
    
	}
}
