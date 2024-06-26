package JavaExercicio;
import java.util.Scanner;
public class Atividade40 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade40 cesar
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int contador = 1;
	        while (contador <= 10) {
	            System.out.println(numero + " x " + contador + " = " + (numero * contador));
	            contador++;
	        }
	        scanner.close();
	    }
	}


