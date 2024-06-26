package JavaExercicio;
import java.util.Scanner;
public class Atividade35 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade35 cesar
	        System.out.print("Digite o primeiro n�mero: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo n�mero: ");
	        int numero2 = scanner.nextInt();

	        System.out.print("Digite o terceiro n�mero: ");
	        int numero3 = scanner.nextInt();

	        double media = (numero1 + numero2 + numero3) / 3.0;

	        System.out.printf("A m�dia aritm�tica �: %.2f\n", media);

	        if (media >= 7) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }

	        scanner.close();
	    }
	}


