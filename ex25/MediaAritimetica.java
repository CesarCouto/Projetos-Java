package JavaExercicio;

import java.util.Scanner;

public class MediaAritimetica {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero");
		double n1 = valor.nextDouble();
		
		System.out.println("Insira o segundo numero");
		double n2 = valor.nextDouble();
		
		System.out.println("Insira o terceiro numero");
		double n3 = valor.nextDouble();
		
		double media = (n1 + n2 + n3) / 3;
		
		System.out.println("A media aritimetica dos numeros " + n1 + "  ," + n2 + "  ," + n3 + " é: " + media);

	}

}
