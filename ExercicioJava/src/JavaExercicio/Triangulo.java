package JavaExercicio;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Entre com a base do seu triangulo");
		double base = valor.nextDouble();
		
		System.out.println("Entre com a altura do seu triangulo");
		double altura = valor.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A area do seu triangulo é: " + area);
		
	}

}
