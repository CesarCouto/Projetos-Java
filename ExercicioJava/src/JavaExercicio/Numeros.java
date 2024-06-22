package JavaExercicio;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Entre com o primeiro numero");
		 int n1 = teclado.nextInt();
		 
		 System.out.println("Entre com o segundo numero");
		 int n2 = teclado.nextInt();
		 
		 int temp = n1;
		 
		 
		 System.out.println("O valor do primero numero é:" + (n1 = n2));
		 System.out.println("O valor do segundo numero é:" + (n2 = temp));
		 
		 teclado.close();

	}

}
