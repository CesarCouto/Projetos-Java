package JavaExercicio;

import java.util.Scanner;

public class Salarios {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double SalarioMinimo = 1212.00;
		
		System.out.println("Qual o seu salario?");
		double SalarioUser = teclado.nextDouble();
		
		 double SalarioFinal = (SalarioUser / SalarioMinimo);
		
		 System.out.println("Você recebe " + SalarioFinal + " salários mínimos");
		
		teclado.close();

	}

}
