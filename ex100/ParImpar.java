package JavaExercicio;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Escolha um numero");
		float num = valor.nextFloat();
		
		if(num % 2 == 0) {
			System.out.println(num + " Este numero é PAR");
		}else {
			System.out.println(num + " Este numero é IMPAR");
		}
		

	}

}
