package JavaExercicio;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual seu salario bruto?");
		double bruto = valor.nextDouble();
		
		double liquido = bruto * 0.95;
		
		System.out.println("Seu salario liquido é: " + liquido);
		
		valor.close();

	}

}
