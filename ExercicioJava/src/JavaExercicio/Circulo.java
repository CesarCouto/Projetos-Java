package JavaExercicio;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual � o raio do seu circulo?");
		double raio = valor.nextDouble();
		
		double area = Math.PI * (raio * raio);
		System.out.println("A area do seu circulo �: " + area);
		
		double perimetro = 2 * Math.PI * raio;
		System.out.println("O perimetro do seu circulo �: " + perimetro);
		

	}

}
