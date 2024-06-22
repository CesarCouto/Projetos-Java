package JavaExercicio;

import java.util.Scanner;

public class Ipi {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o IPI");
		double ipi = teclado.nextDouble();

		System.out.println("Qual o codigo da peça 1");
		int cod1 = teclado.nextInt();
		
		System.out.println("Qual o valor da peça 1");
		double valor1 = teclado.nextDouble();
		
		System.out.println("Qual a quantidade da peça 1");
		int quant1 = teclado.nextInt();
		
		
		
		System.out.println("Qual o codigo da peça 2");
		int cod2 = teclado.nextInt();
		
		System.out.println("Qual o valor da peça 2");
		double valor2 = teclado.nextDouble();
		
		System.out.println("Qual a quantidade da peça 2");
		int quant2 = teclado.nextInt();
		
		
		double calculo = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
		
		System.out.println("O valor total a ser pago é: " + calculo);
		
	}

}
