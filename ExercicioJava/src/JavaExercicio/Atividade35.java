package JavaExercicio;
import java.util.Scanner;
public class Atividade35 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();

	        System.out.print("Digite o terceiro número: ");
	        int numero3 = scanner.nextInt();

	        double media = (numero1 + numero2 + numero3) / 3.0;

	        System.out.printf("A média aritmética é: %.2f\n", media);

	        if (media >= 7) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }

	        scanner.close();
	    }
	}

}
