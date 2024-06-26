package JavaExercicio;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.println("Entre com o primeiro numero");
		int n1 = valor.nextInt();
		
		System.out.println("Entre com o segundo numero");
		int n2 = valor.nextInt();
		
		System.out.println("A soma dos numeros é"+ (n1 + n2));
		System.out.println("A subtração dos numeros é:"+ (n1-n2));
		System.out.println("A multiplicação dos numeros é:"+ (n1 * n2));
		System.out.println("A divisão dos numeros é:"+ (n1 / n2));
		valor.close();

	}

}
