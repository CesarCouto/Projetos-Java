package JavaExercicio;

import java.util.Scanner;

public class Deposito {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual o valor do dep�sito mensal?");
		double deposito = valor.nextDouble();
		
		System.out.println("Qual a taxa de juros mensal?");
		double taxa = valor.nextDouble() / 100; 
		
		double montante = 0;
		 
		for (int i = 0; i < 12; i++) {
	        montante += deposito;
	        montante *= (1 + taxa);
	    }

	    System.out.println("Montante ap�s 12 meses: " + montante);
	    
	    valor.close(); 
	}

}