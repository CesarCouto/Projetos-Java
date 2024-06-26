package JavaExercicio;

import java.util.Scanner;

public class Taboada {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int taboada = valor.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int res = taboada * i; 
			System.out.println(taboada + "x" + i + "=" + res);
			
		}
		valor.close();

	}

}
