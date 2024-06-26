package JavaExercicio;
import java.util.Scanner;

public class Atividade56 {
	// Atividade56 cesar
	public class DivisoresDoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero inteiro positivo: ");
	        int numero = scanner.nextInt();
	        int divisor = 1;
	        do {
	            if (numero % divisor == 0) {
	                System.out.println(divisor);
	            }
	            divisor++;
	        } while (divisor <= numero);
	        scanner.close();
	    }
	}

}
