package JavaExercicio;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Qual o preço do produto?");
	        double valor = teclado.nextDouble();
	        
	        System.out.println("Qual a quantidade comprada?");
	        double quantidade = teclado.nextDouble();
	        
	        double valor2 = valor * quantidade;
	        
	        double valor3;
	        
	        if (quantidade > 10) {
	            valor3 = valor2 * 0.90; 
	        } else {
	            valor3 = valor2; 
	        }

	        System.out.println("O valor final é: " + valor3);
	        
	        teclado.close();


	}

}
