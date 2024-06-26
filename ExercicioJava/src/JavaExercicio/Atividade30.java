package JavaExercicio;
import java.util.Scanner;
public class Atividade30 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			// Atividade30 cesar
	        System.out.print("Digite o n�mero de ma��s compradas: ");
	        int quantidade = scanner.nextInt();

	        double precoPorMaca;
	        if (quantidade < 12) {
	            precoPorMaca = 0.50;
	        } else {
	            precoPorMaca = 0.40;
	        }

	        double valorTotal = quantidade * precoPorMaca;
	        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

	        scanner.close();
	    }
	}


