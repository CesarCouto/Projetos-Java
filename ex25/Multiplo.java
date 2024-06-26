package JavaExercicio;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira o primero numero");
		int n1 = valor.nextInt();
		
		System.out.println("Insira o segundo numero");
		int n2 = valor.nextInt();
		
		if(n1 % n2 == 0) {
			System.out.println("Os numeros " + n1 + "  " + n2 + " São multiplos");
		}else {
			System.out.println("Os numeros " + n1 + "  " + n2 + " Não são multiplos");
		}

	}

}
