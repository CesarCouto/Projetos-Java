package JavaExercicio;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num = teclado.nextInt();
		
		int sucessor = (num + 1);
		
		int antecessor = (num - 1);
		
		System.out.println("O numero �:" + num + " Seu sucessor �:" + sucessor + " Seu antecessor �: " + antecessor);

	}

}
