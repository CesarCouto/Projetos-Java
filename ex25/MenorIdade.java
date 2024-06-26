package JavaExercicio;
import java.util.Scanner;
public class MenorIdade {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int numeroDePessoas = 20;
		        int contadorMaioresDeIdade = 0;

		        // Lendo a idade de 20 pessoas e contando quantas são maiores de idade
		        for (int i = 1; i <= numeroDePessoas; i++) {
		            System.out.print("Digite a idade da pessoa " + i + ": ");
		            int idade = scanner.nextInt();
		            if (idade >= 18) {
		                contadorMaioresDeIdade++;
		            }
		        }

		        // Exibindo a quantidade de pessoas maiores de idade
		        System.out.println("O número de pessoas maiores de idade é: " + contadorMaioresDeIdade);

		        scanner.close();
		    }
		}


	}

}
