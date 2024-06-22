package JavaExercicio;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = valor.nextInt();
		
		if(numero > 0) {
			System.out.println("Numero positivo");
		}else if(numero < 0) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("O numero é zero");
		}
	}

}
