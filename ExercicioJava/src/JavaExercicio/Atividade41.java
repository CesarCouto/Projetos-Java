package JavaExercicio;
import java.util.Scanner;
public class Atividade41 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade41 cesar
	        System.out.print("Digite um n�mero inteiro positivo: ");
	        int numero = scanner.nextInt();
	        int divisor = 1;
	        while (divisor <= numero) {
	            if (numero % divisor == 0) {
	                System.out.println(divisor);
	            }
	            divisor++;
	        }
	        scanner.close();
	    }
	}


