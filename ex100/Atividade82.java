package JavaExercicio;
import java.util.Scanner;
public class Atividade82 {
	
	// Atividade82 cesar
	public class SomaDezNumerosFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite um n�mero: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	        }
	        System.out.println("A soma dos n�meros �: " + soma);
	        scanner.close();
	    }
	}

}
