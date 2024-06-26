package JavaExercicio;
import java.util.Scanner;
public class Atividade61 {
	
	// Atividade61 cesar
	public class SomaParesDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int soma = 0;
	        int contador = 1;
	        do {
	            if (contador % 2 == 0) {
	                soma += contador;
	            }
	            contador++;
	        } while (contador <= numero);
	        System.out.println("A soma dos n�meros pares entre 1 e " + numero + " �: " + soma);
	        scanner.close();
	    }
	}

}
