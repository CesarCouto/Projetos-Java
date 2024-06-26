package JavaExercicio;
import java.util.Scanner;
public class somass {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        int somaDasIdades = 0;
		        int numeroDePessoas = 20;

		        // Lendo a idade de 20 pessoas e calculando a soma das idades
		        for (int i = 1; i <= numeroDePessoas; i++) {
		            System.out.print("Digite a idade da pessoa " + i + ": ");
		            int idade = scanner.nextInt();
		            somaDasIdades += idade;
		        }

		        // Exibindo a soma das idades
		        System.out.println("A soma das idades das 20 pessoas é: " + somaDasIdades);

		        scanner.close();
		    }
		}

	}

}
