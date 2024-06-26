package JavaExercicio;
import java.util.Scanner;
public class Atividade49 {

	// Atividade49 cesar
	public class Fatorial {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int fatorial = 1;
	        int contador = 1;
	        while (contador <= numero) {
	            fatorial *= contador;
	            contador++;
	        }
	        System.out.println("O fatorial de " + numero + " �: " + fatorial);
	        scanner.close();
	    }
	}

}
