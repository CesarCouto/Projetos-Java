package JavaExercicio;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.println("Entre com o primeiro numero");
		int n1 = valor.nextInt();
		
		System.out.println("Entre com o segundo numero");
		int n2 = valor.nextInt();
		
		System.out.println("A soma dos numeros �"+ (n1 + n2));
		System.out.println("A subtra��o dos numeros �:"+ (n1-n2));
		System.out.println("A multiplica��o dos numeros �:"+ (n1 * n2));
		System.out.println("A divis�o dos numeros �:"+ (n1 / n2));
		valor.close();

	}

}
