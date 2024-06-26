package JavaExercicio;
import java.util.Scanner;
public class Atividade64 {
	
	// Atividade64 cesar
	public class FatorialDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int fatorial = 1;
	        int contador = 1;
	        do {
	            fatorial *= contador;
	            contador++;
	        } while (contador <= numero);
	        System.out.println("O fatorial de " + numero + " �: " + fatorial);
	        scanner.close();
	    }
	}

}
