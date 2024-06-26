package JavaExercicio;
import java.util.Scanner;
public class Atividade79 {
	
	// Atividade79 cesar
	public class FatorialFor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int fatorial = 1;
	        for (int contador = 1; contador <= numero; contador++) {
	            fatorial *= contador;
	        }
	        System.out.println("O fatorial de " + numero + " �: " + fatorial);
	        scanner.close();
	    }
	}

}
