package JavaExercicio;
import java.util.Scanner;

public class Atividade76 {
	
	public class SomaParesFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int soma = 0;
	        for (int contador = 1; contador <= numero; contador++) {
	            if (contador % 2 == 0) {
	                soma += contador;
	            }
	        }
			// Atividade76 cesar
	        System.out.println("A soma dos n�meros pares entre 1 e " + numero + " �: " + soma);
	        scanner.close();
	    }
	}

}
