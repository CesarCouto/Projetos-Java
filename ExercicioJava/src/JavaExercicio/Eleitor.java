package JavaExercicio;

import java.util.Scanner;

public class Eleitor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		double idade = scanner.nextDouble();
		
		if(idade <= 15) {
			System.out.println("Não eleitor");
		}else if(idade <= 17) {
			System.out.println("Voto facultativo");
		} else if(idade <= 65) {
			System.out.println("Voto obrigatorio");
		}else {
			System.out.println("Voto facultativo");
		}
		

	}

}
