package JavaExercicio;
import java.util.Scanner;
public class Atividade42 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade42 cesar
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int divisor = 2;
	        boolean ehPrimo = true;
	        while (divisor < numero) {
	            if (numero % divisor == 0) {
	                ehPrimo = false;
	                break;
	            }
	            divisor++;
	        }
	        if (ehPrimo) {
	            System.out.println("O n�mero " + numero + " � primo.");
	        } else {
	            System.out.println("O n�mero " + numero + " n�o � primo.");
	        }
	        scanner.close();
	    }
	}


