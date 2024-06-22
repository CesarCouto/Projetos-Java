package JavaExercicio;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Entre com a sua altura");
		float altura = valor.nextFloat();
		
		System.out.println("Entre com seu peso");
		float peso = valor.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if(imc >= 40) {
			System.out.println("obesidade grau 3 ou morbida");
		}else if(imc >= 35) {
			System.out.println("obesidade grau 2");
		}else if(imc >= 30) {
			System.out.println("obesidade grau 1");
		}else if(imc >= 25) {
			System.out.println("sobrepeso");
		}else if(imc >= 18.5) {
			System.out.println("peso normal");
		}else {
			System.out.println("acima do peso");
		}

	}

}
