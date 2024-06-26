package JavaExercicio;
import java.util.Scanner;
public class Atividade57 {
	
	// Atividade57 cesar
	public class NumeroPrimoDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();
	        int divisor = 2;
	        boolean ehPrimo = true;
	        do {
	            if (numero % divisor == 0) {
	                ehPrimo = false;
	                break;
	            }
	            divisor++;
	        } while (divisor < numero);
	        if (ehPrimo) {
	            System.out.println("O n�mero " + numero + " � primo.");
	        } else {
	            System.out.println("O n�mero " + numero + " n�o � primo.");
	        }
	        scanner.close();
	    }
	}

}
